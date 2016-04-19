/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fatec.jdbc.dao;

import br.com.fatec.jdbc.modelo.Produtospedidos;
import br.com.fatec.jdbc.modelo.Produto;
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
public class ProdutospedidosDAO {
    
    private Connection c;
    private ProdutoDAO pr ;
    private PedidoDAO pe ;
    private Object cont;
    
    public ProdutospedidosDAO() throws SQLException, ClassNotFoundException{
        this.c = new ConnectionFactory().getConnection();
        this.pr = new ProdutoDAO();
        this.pe = new PedidoDAO();
    }
    
    public void inseri(Produtospedidos adm) throws SQLException{
        String sql = "insert into produtospedidos" + " (codigo_produtos, codigo_pedidos)" + " values (?,?)";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,adm.getCodigo_produtos());
            stmt.setInt(2,adm.getCodigo_pedidos());

            
            // executa
            stmt.execute();
        }
    }
    
    
    public List<Produtospedidos> lista() throws SQLException{
        

        List<Produtospedidos> prepe = new ArrayList<Produtospedidos>();
        
        try (PreparedStatement stmt = this.c.prepareStatement("select * from produtospedidos inner JOIN pedido on codigo_pedido = codigo_pedidos inner JOIN produto on codigo = codigo_produtos"); 
                ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                // criando o objeto
                
                Produtospedidos prepe1 = new Produtospedidos();
                
                prepe1.setCodigo_produtos(rs.getInt("Codigo_produtos"));
                prepe1.setCodigo_pedidos(rs.getInt("Codigo_pedidos"));
                
                Pedido p1 = new Pedido();
                p1.setCodigo_pedido(rs.getInt("Codigo_pedido"));
                p1.setValor(rs.getInt("Valor"));
                p1.setData(rs.getString("Data"));
                
                
                Produto c1 = new Produto();
                c1.setCodigo(rs.getInt("Codigo"));
                c1.setNome(rs.getString("Nome"));
                c1.setPreco(rs.getString("Preco"));
                
                // adiciona à lista de
                prepe.add(prepe1);
            }
        }
        return prepe;
        
    }
    
    
    
   public List<Produtospedidos> listasimples() throws SQLException, ClassNotFoundException{

        List<Produtospedidos> produtospedidos = new ArrayList<Produtospedidos>();
        
        try (PreparedStatement stmt = this.c.prepareStatement("SELECT * FROM produtospedidos ")) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                

                Produtospedidos prepe = new Produtospedidos();
                
                prepe.setCodigo_produtos(rs.getInt("Codigo_produtos"));
                prepe.setCodigo_pedidos(rs.getInt("Codigo_pedidos"));
                
                produtospedidos.add(prepe);
            }
            
            rs.close();
        }
        return produtospedidos;
        
    }
    
}
