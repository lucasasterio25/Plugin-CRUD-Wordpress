package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.dao.ProdutospedidosDAO;
import br.com.fatec.jdbc.modelo.Produtospedidos;
import java.sql.SQLException;

public class TestaAdiciona {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Produtospedidos c1 = new Produtospedidos();
        c1.setCodigo_produtos(3);
        c1.setCodigo_pedidos(4);
        ProdutospedidosDAO dao = new ProdutospedidosDAO();
        dao.inseri(c1);
    }
}
