/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Model.DAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author laert
 */
public class Logar {
    
      PreparedStatement ps;
     ResultSet rs;
    
     Cliente client = new Cliente();
     
     Connection conn;
     
      public Cliente ValidarCliente(String nome,String cpf){
        String sql = "select * from cliente where cpf=? and nome=?";
        
        try{
            conn= Conexao.getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,cpf);
            ps.setString(2,nome);
            
            rs=ps.executeQuery();
            while(rs.next()){
                
                client.setIdCliente(rs.getInt(1));
                client.setNome(rs.getString(2));
                client.setSobrenome(rs.getString(3));
                client.setRg(rs.getString(4));
                client.setCpf(rs.getString(5));
                client.setEndereco(rs.getString(6));
               
                
            }
        }catch(SQLException ex){
            
        }
        return client;
    } 
}
