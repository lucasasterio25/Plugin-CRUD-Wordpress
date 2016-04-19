/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fatec.jdbc.testes;
import br.com.fatec.jdbc.modelo.Adm;
import br.com.fatec.jdbc.dao.AdmDAO;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class TesteLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {{
        Adm c1 = new Adm();
        c1.setLogin("geisa");
        c1.setSenha("geisa");
        
        AdmDAO dao = new AdmDAO();
        
        boolean a = dao.validaLogin(c1);
        
        if(a=true){
            System.out.println("True");
                }
        
        else{
            System.out.println("False");
                }
        
        
    }
    
}
}
