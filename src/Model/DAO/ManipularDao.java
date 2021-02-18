/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Models.Conta;
import Models.ContaCorrente;
import Models.ContaInvestimento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author laert
 */
public class ManipularDao {
    
    
      String sql ="";
    
    public Conta getContaByCpf(String cpf) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;              
        try {
            Conta conta = new Conta();
            con = Conexao.getConnection();
            sql = "select * from conta inner join cliente on conta.idcliente = cliente.idcliente where cpf = ?";
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);
            
            ResultSet rst = stmt.executeQuery();    
            
            if (rst.next()) {
                if (rst.getString("tipo").equals("CC")) {
                    ContaCorrente cc = new ContaCorrente();
                    cc.setNumConta(rst.getInt("num_conta"));
                    cc.setSaldo(rst.getDouble("saldo"));
                    cc.setTipo(rst.getString("tipo"));
                    cc.setLimite(rst.getDouble("limite"));
                    conta = cc;
                } else {
                    ContaInvestimento ci = new ContaInvestimento();
                    ci.setNumConta(rst.getInt("num_conta"));
                    ci.setSaldo(rst.getDouble("saldo"));
                    ci.setTipo(rst.getString("tipo"));
                    ci.setDepositoMinimo(rst.getDouble("deposito_min"));
                    ci.setMontanteMinimo(rst.getDouble("montante_min"));
                    conta = ci;
                }
            }

            return conta;
        } catch(SQLException e) {
             throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            con.close();
        }
    }
    
    public void updateSaldo(Conta conta) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = Conexao.getConnection();
            sql = "update conta set saldo = ? where num_conta = ?";
            stmt = con.prepareStatement(sql);
            stmt.setDouble(1, conta.getSaldo());
            stmt.setInt(2, conta.getNumero());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
        }
    }
}
