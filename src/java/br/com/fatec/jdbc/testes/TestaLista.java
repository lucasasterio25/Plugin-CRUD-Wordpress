package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.dao.ProdutospedidosDAO;
import br.com.fatec.jdbc.modelo.Produtospedidos;
import br.com.fatec.jdbc.dao.PedidoDAO;
import br.com.fatec.jdbc.dao.ProdutoDAO;
import br.com.fatec.jdbc.modelo.Pedido;
import br.com.fatec.jdbc.modelo.Produto;
import java.sql.SQLException;
import java.util.List;

public class TestaLista {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        ProdutospedidosDAO dao = new ProdutospedidosDAO();
        List<Produtospedidos> adm = dao.lista() ;       
        
        for (Produtospedidos adms : adm) {
            System.out.println("DADOS");
            System.out.println("Codigo pedidos: " + adms.getCodigo_pedidos());
            System.out.println("Codigo produtos: " + adms.getCodigo_produtos());  
            
            
            System.out.println("DADOS PEDIDO");            
            PedidoDAO dao1 = new PedidoDAO();
            Pedido c1 = new Pedido();
            c1.setCodigo_pedido(adms.getCodigo_pedidos());
            dao1.busca2(c1);
            
            System.out.println("Codigo do pedido: " + c1.getCodigo_pedido());
            System.out.println("Valor pedido: " + c1.getValor() + " R$");
            System.out.println("Data pedido: " + c1.getData());
            
            System.out.println("DADOS PRODUTO");
            
            
            ProdutoDAO dao2 = new ProdutoDAO();
            Produto p1 = new Produto();
            p1.setCodigo(adms.getCodigo_produtos());
            dao2.busca2(p1);
            System.out.println("Codigo do produto: " + p1.getCodigo()); 
            System.out.println("Nome Produto: " + p1.getNome() + " R$");
            System.out.println("Preço Produto: " + p1.getPreco());  
            
            
            System.out.println("");
 
        }   
     }
    }

