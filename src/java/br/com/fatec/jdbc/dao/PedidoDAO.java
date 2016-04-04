/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc.dao;

import br.com.fatec.jdbc.modelo.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Lucas
 */
public class PedidoDAO {
    private Connection c;
    
    public PedidoDAO() throws SQLException, ClassNotFoundException{
        this.c = new ConnectionFactory().getConnection();
    }
    
    public void inseri(Pedido pedido) throws SQLException{
        String sql = "insert into pedido" + " (valor, data, id_produto)" + " values (?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);

        // seta os valores
        stmt.setInt(1,pedido.getValor());
        stmt.setString(2,pedido.getData());
        stmt.setInt(3,pedido.getId_produto());

        // executa
        stmt.execute();
        stmt.close();
    }
    
    public void exclui(Pedido pedido) throws SQLException{
        String sql = "delete from pedido WHERE codigo_pedido = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,pedido.getCodigo_pedido());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
    }

    public Pedido busca(Pedido pedido) throws SQLException{
        String sql = "select * from pedido WHERE codigo_pedido = ?";
        // prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement("select * from pedido WHERE codigo_pedido = ?");
        // seta os valores
        stmt.setInt(1,pedido.getCodigo_pedido());
        // executa
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {      
            // criando o objeto Contato
            pedido.setCodigo_pedido(rs.getInt("Codigo do pedido"));
            pedido.setValor(rs.getInt("Valor"));
            pedido.setData(rs.getString("Data"));
            pedido.setId_produto(rs.getInt("Id do produto"));
            // adiciona o contato à lista de contatos
        }
        
        stmt.close();
        return pedido;
    }

    public Pedido altera(Pedido adm) throws SQLException{
        String sql = "UPDATE pedido SET valor = ?, data = ?, id_produto = ? WHERE codigo_pedido = ?";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,adm.getValor());
            stmt.setString(2,adm.getData());
            stmt.setInt(3,adm.getId_produto());
            stmt.setInt(4,adm.getCodigo_pedido());
            
            // executa
            stmt.execute();
        }
        return adm;
    }

    public List<Pedido> lista() throws SQLException{
         // clientes: array armazena a lista de registros

        List<Pedido> pedido = new ArrayList<Pedido>();
        
        PreparedStatement stmt = this.c.prepareStatement("select * from pedido");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Cliente
            Pedido pedidos = new Pedido();
            pedidos.setCodigo_pedido(rs.getInt("Codigo_pedido"));
            pedidos.setValor(rs.getInt("Valor"));
            pedidos.setData(rs.getString("Data"));
            pedidos.setId_produto(rs.getInt("Id_produto"));
            // adiciona o contato à lista 
            pedido.add(pedidos);
        }
        
        rs.close();
        stmt.close();
        return pedido;
        
    }
    
}