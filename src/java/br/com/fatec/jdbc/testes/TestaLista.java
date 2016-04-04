package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.dao.ProdutoDAO;
import br.com.fatec.jdbc.modelo.Produto;
import java.sql.SQLException;
import java.util.List;

public class TestaLista {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        ProdutoDAO dao = new ProdutoDAO();

        List<Produto> adm = dao.lista() ;

        for (Produto adms : adm) {
            System.out.println("Nome: " + adms.getNome());
            System.out.println("Preco: " + adms.getPreco());
            System.out.println("Codigo: " + adms.getCodigo());
            System.out.println("");
        }   
    }
}