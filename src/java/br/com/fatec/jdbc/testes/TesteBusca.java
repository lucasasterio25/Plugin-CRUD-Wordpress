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
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProdutoDAO dao = new ProdutoDAO();
        Produto c1 = new Produto();
        c1.setNome("ovo");

        
        List<Produto> adm = dao.busca(c1) ;

        for (Produto adms : adm) {
            System.out.println("Nome: " + adms.getNome());
            System.out.println("Preco: " + adms.getPreco());
            System.out.println("Codigo: " + adms.getCodigo());
            System.out.println("");
        }   
    }

}
        
         

