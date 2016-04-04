package br.com.fatec.jdbc.testes;

import br.com.fatec.jdbc.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {        
        Connection con = new ConnectionFactory().getConnection();
        System.out.println("conectado");
        con.close();
        System.err.println("conexão fechada");
    }    
}
