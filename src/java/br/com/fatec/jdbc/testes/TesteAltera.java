/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fatec.jdbc.testes;
import br.com.fatec.jdbc.dao.AdmDAO;
import br.com.fatec.jdbc.modelo.Adm;        
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class TesteAltera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Adm c1 = new Adm();
        c1.setLogin("Lucas55");
        c1.setSenha("ValorAlterado");
        c1.setEndereco("ValorAlterado");
        c1.setEmail("ValorAlterado");
        AdmDAO dao = new AdmDAO();
        dao.altera(c1);

    }
    
}
