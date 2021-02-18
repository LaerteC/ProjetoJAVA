/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.ContaDAO;
import Models.ContaCorrente;
import Models.ContaInvestimento;
import View.ContaView;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author laert
 */
public class ContaController {
    
      public void prepareInsertContaCorrente(ContaCorrente cc, ContaView cv) throws SQLException {       
         try {
             ContaDAO cd = new ContaDAO();
             cd.insertContaCorrente(cc);
             /*Contact contato = view.getContact();   
             dao.insert(contato);
             model.adicionaContato(contato);*/
         } catch (SQLException e) {
            if (e.getMessage().contains("uk"))
                JOptionPane.showMessageDialog(cv, "Esse cliente já possui uma Conta Corrente");
         }
    }
    
    public void prepareInsertContaInvestimento(ContaInvestimento ci, ContaView cv) throws SQLException{
        try{
            ContaDAO cd = new ContaDAO();
            cd.insertContaInvestimento(ci);
        } catch (SQLException e) {           
            if (e.getMessage().contains("uk"))
                JOptionPane.showMessageDialog(cv, "Esse cliente já possui uma Conta Investimento");
        }
        
    }
}
