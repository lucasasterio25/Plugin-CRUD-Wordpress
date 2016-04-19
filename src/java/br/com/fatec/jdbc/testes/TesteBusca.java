/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.dao.ProdutoDAO;
import br.com.fatec.jdbc.modelo.Produto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class TesteBusca {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        ProdutoDAO dao = new ProdutoDAO();
        Produto p1 = new Produto();

       
        p1.setNome("o");
        
        dao.busca(p1);     
       
        System.out.println("Cdogigo Produto: " + p1.getCodigo());    
        System.out.println("Nome Produto: " + p1.getNome());
        System.out.println("Preco Produto: " + p1.getPreco() + " R$");
        
    
    }

}
        
         

