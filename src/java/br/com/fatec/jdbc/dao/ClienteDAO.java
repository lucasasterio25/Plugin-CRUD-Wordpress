/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc.dao;

import br.com.fatec.jdbc.modelo.Cliente;
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
public class ClienteDAO {
    private Connection c;
    
    public ClienteDAO() throws SQLException, ClassNotFoundException{
        this.c = new ConnectionFactory().getConnection();
    }
    
    public void inseri(Cliente cliente) throws SQLException{
        String sql = "insert into cliente" + " (login, senha, email, endereco)" + " values (?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);

        // seta os valores
        stmt.setString(1,cliente.getLogin());
        stmt.setString(2,cliente.getSenha());
        stmt.setString(3,cliente.getEmail());
        stmt.setString(4,cliente.getEndereco());

        // executa
        stmt.execute();
        stmt.close();
    }
    
    public void exclui(Cliente cliente) throws SQLException{
        String sql = "delete from cliente WHERE login = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,cliente.getLogin());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
    }

    public Cliente busca(Cliente cliente) throws SQLException{
        String sql = "select * from cliente WHERE login = ?";
        // prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement("select * from cliente WHERE login = ?");
        // seta os valores
        stmt.setString(1,cliente.getLogin());
        // executa
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {      
            // criando o objeto Contato
            cliente.setLogin(rs.getString("login"));
            cliente.setSenha(rs.getString("senha"));
            cliente.setEmail(rs.getString("email"));
            cliente.setEndereco(rs.getString("endereco"));
            // adiciona o contato à lista de contatos
        }
        
        stmt.close();
        return cliente;
    }

    public Cliente altera(Cliente adm) throws SQLException{
        String sql = "UPDATE cliente SET senha = ?, endereco = ?, email = ? WHERE login = ?";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,adm.getSenha());
            stmt.setString(2,adm.getEndereco());
            stmt.setString(3,adm.getEmail());
            stmt.setString(4,adm.getLogin());
            
            // executa
            stmt.execute();
        }
        return adm;
    }
  
    public List<Cliente> lista() throws SQLException{
         // clientes: array armazena a lista de registros

        List<Cliente> cliente = new ArrayList<Cliente>();
        
        PreparedStatement stmt = this.c.prepareStatement("select * from cliente");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Cliente
            Cliente clientes = new Cliente();
            clientes.setLogin(rs.getString("Login"));
            clientes.setSenha(rs.getString("Senha"));
            clientes.setEmail(rs.getString("Email"));
            clientes.setEndereco(rs.getString("Endereco"));
            // adiciona o contato à lista de contatos
            cliente.add(clientes);
        }
        
        rs.close();
        stmt.close();
        return cliente;
        
    }
    public Cliente validaLogin(Cliente usu) throws SQLException{
        String sql = "select * from cliente WHERE login = ? AND senha = ?";
        // prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,usu.getLogin());
        stmt.setString(2,usu.getSenha());
        // executa
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {      
            // criando o objeto Usuario
            usu.setLogin(rs.getString(2));
            usu.setSenha(rs.getString(3));
            usu.setEndereco(rs.getString(4));
            usu.setEmail(rs.getString(5));
            // adiciona o usu à lista de usus
        }
        
        stmt.close();
        return usu;
    }
    
}