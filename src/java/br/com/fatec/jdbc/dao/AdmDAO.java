/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.jdbc.dao;

import br.com.fatec.jdbc.modelo.Adm;
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
public class AdmDAO {
    private Connection c;
    
    public AdmDAO() throws SQLException, ClassNotFoundException{
        this.c = new ConnectionFactory().getConnection();
    }
    
    public void inseri(Adm adm) throws SQLException{
        String sql = "insert into adm" + " (login, senha, email, endereco)" + " values (?,?,?,?)";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,adm.getLogin());
            stmt.setString(2,adm.getSenha());
            stmt.setString(3,adm.getEmail());
            stmt.setString(4,adm.getEndereco());
            
            // executa
            stmt.execute();
        }
    }
    
    public void exclui(Adm adm) throws SQLException{
        String sql = "delete from adm WHERE login = ?";
        
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        
        // seta os valores
        stmt.setString(1,adm.getLogin());
        
        // executa
        stmt.execute();
        stmt.close();
        c.close();
    }

    

    
public Adm altera(Adm adm) throws SQLException{
        String sql = "UPDATE adm SET senha = ?, endereco = ?, email = ? WHERE login = ?";
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
    public List<Adm> lista() throws SQLException{
         // clientes: array armazena a lista de registros

        List<Adm> adm = new ArrayList<Adm>();
        
        PreparedStatement stmt = this.c.prepareStatement("select * from adm");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Cliente
            Adm adms = new Adm();
            adms.setLogin(rs.getString("Login"));
            adms.setSenha(rs.getString("Senha"));
            adms.setEmail(rs.getString("Email"));
            adms.setEndereco(rs.getString("Endereco"));
            // adiciona o contato à lista de contatos
            adm.add(adms);
        }
        
        rs.close();
        stmt.close();
        return adm;
        
    }
    
    public boolean validaLogin(Adm usu) throws SQLException{
        String sql = "select * from adm WHERE login = ? AND senha = ?";
        // prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement(sql);
        
        
        
        // seta os valores
        stmt.setString(1,usu.getLogin());
        stmt.setString(2,usu.getSenha());
        // executa
        ResultSet rs = stmt.executeQuery();
        
        if (rs==null){
        return false;
        
        }else{
        return true;
        }        
        
    }

    public List<Adm> busca() throws SQLException{
        
        List<Adm> adm = new ArrayList<Adm>();
        Adm adms = new Adm();
        String sql = "select * from adm where login like ? '%' ";
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,adms.getLogin());
            // executa
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                adms.setLogin(rs.getString("login"));
                adms.setSenha(rs.getString("senha"));
                adms.setEmail(rs.getString("email"));
                adms.setEndereco(rs.getString("endereco"));
                // adiciona o contato à lista de contatos
            }
        }
        return adm;
    }
}