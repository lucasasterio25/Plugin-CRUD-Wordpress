/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc.dao;

import br.com.fatec.jdbc.modelo.Produto;
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
public class ProdutoDAO {
    private Connection c;
    
    public ProdutoDAO() throws SQLException, ClassNotFoundException{
        this.c = new ConnectionFactory().getConnection();
    }
    
    public void inseri(Produto produto) throws SQLException{
        String sql = "insert into produto" + " (nome, preco)" + " values (?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);

        // seta os valores
        stmt.setString(1,produto.getNome());
        stmt.setString(2,produto.getPreco());

        // executa
        stmt.execute();
        stmt.close();
    }
    
    public void exclui(Produto produto) throws SQLException{
        String sql = "delete from produto WHERE codigo = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,produto.getCodigo());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
    }
    
  
     public Produto busca(Produto produto) throws SQLException{

         String sql = "select * from produto where nome like ? '%' ";
        // prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,produto.getNome());
        // executa
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Contato
            produto.setCodigo(rs.getInt("Codigo"));
            produto.setNome(rs.getString("Nome"));
            produto.setPreco(rs.getString("Preco"));
            // adiciona o contato à lista de contatos
        }
        rs.close();
        stmt.close();
        return produto;
  
    }
     
   /* 
     public Produto busca(Produto produto) throws SQLException{
        String sql = "select * from produto where nome like ? '%' ";
        // prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,produto.getNome());
        // executa
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {      
            // criando o objeto Contato
            produto.setCodigo(rs.getInt("Codigo"));
            produto.setNome(rs.getString("Nome"));
            produto.setPreco(rs.getString("Preco"));
            // adiciona o contato à lista de contatos
        }
        
        stmt.close();
        return produto;
    }
     */
    
    public Produto altera(Produto adm) throws SQLException{
        String sql = "UPDATE produto SET nome = ?, preco = ? WHERE codigo = ?";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,adm.getNome());
            stmt.setString(2,adm.getPreco());
            stmt.setInt(3,adm.getCodigo());
            
            // executa
            stmt.execute();
        }
        return adm;
    }

    
    public List<Produto> lista() throws SQLException{
         // clientes: array armazena a lista de registros

        List<Produto> produto = new ArrayList<Produto>();
        
        PreparedStatement stmt = this.c.prepareStatement("select * from produto");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Cliente
            Produto produtos = new Produto();
            produtos.setCodigo(rs.getInt("Codigo"));
            produtos.setNome(rs.getString("Nome"));
            produtos.setPreco(rs.getString("Preco"));
 
            // adiciona o contato à lista 
            produto.add(produtos);
        }
        
        rs.close();
        stmt.close();
        return produto;
        
    }
    
    public Produto busca2(Produto produto) throws SQLException{
        String sql = "select * from produto WHERE codigo = ?";
        // prepared statement 
        
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,produto.getCodigo());
        // executa
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {      
            // criando o objeto Contato
            produto.setNome(rs.getString("Nome"));
            produto.setPreco(rs.getString("Preco"));
            
            // adiciona o contato à lista de contatos
        }
        
        stmt.close();
        return produto;
    }


    
}