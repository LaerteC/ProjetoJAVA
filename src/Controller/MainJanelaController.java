/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author laert
 */
public class MainJanelaController {
    
     public void initView(){
        java.awt.EventQueue.invokeLater(() -> {
            new View.MainjanelaView().setVisible(true);
        });
    }
}
