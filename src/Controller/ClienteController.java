/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.ClienteDAO;
import Models.Cliente;
import View.ClienteView;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author laert
 */
public class ClienteController {
    
        private ClienteView cv;
    public ClienteController(ClienteView cv){
        this.cv = cv;
    }
    

    
    public void prepareInsert(Cliente cliente) {
        try {
            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.insert(cliente);
        } catch (SQLException e) {
            if (e.getMessage().contains("pk"))
                JOptionPane.showMessageDialog(cv, "Esse cpf já foi cadastrado!");
        }
    }

    public void prepareDelete(Cliente cliente) {
        try {
            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.delete(cliente);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Cliente> prepareFilter(String filtro, int ordenarPor) {
        try {
            ClienteDAO clienteDao = new ClienteDAO();
            List<Cliente> clientes = clienteDao.lista(filtro, ordenarPor);
            Collections.sort(clientes);
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void prepareUpdate(Cliente cliente) {
        try {
            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.update(cliente);
        } catch (SQLException e) {
            if (e.getMessage().contains("pk"))
                JOptionPane.showMessageDialog(cv, "Esse cpf já foi cadastrado!");
        }
    }
    
    public ClienteController(){
        
    }
}
