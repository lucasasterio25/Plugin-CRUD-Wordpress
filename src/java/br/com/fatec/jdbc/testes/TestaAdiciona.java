package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.dao.ProdutoDAO;
import br.com.fatec.jdbc.modelo.Produto;
import java.sql.SQLException;

public class TestaAdiciona {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Produto c1 = new Produto();
        c1.setNome("1545");
        c1.setPreco("15");
        ProdutoDAO dao = new ProdutoDAO();
        dao.inseri(c1);
    }
}
