/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Models.Cliente;
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
public class ContaDAO {
    
    
     String sql ="";
    
    public ContaCorrente getContaCorrente(long numeroConta) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;              
        try {
            ContaCorrente cc = new ContaCorrente();
            
            con = Conexao.getConnection();
            sql = "select * from conta inner join cliente on conta.idcliente = cliente.idcliente where num_conta = ?";
            
            stmt = con.prepareStatement(sql);
            stmt.setLong(1, numeroConta);
            
            ResultSet rst = stmt.executeQuery();    
            
            if (rst.next()) {
                cc.setDepositoInicial(rst.getDouble("deposito_inicial"));
                cc.setLimite(rst.getDouble("limite"));
                cc.setCliente( new Cliente(rst.getString("nome"), rst.getString("sobrenome"), rst.getString("rg"), rst.getString("cpf"), rst.getString("endereco"), rst.getDouble("salario")));
                cc.setNumConta(rst.getInt("num_conta"));
                cc.setTipo(rst.getString("tipo"));
                cc.setSaldo(rst.getDouble("saldo"));
            }
            
            return cc;
        } catch(SQLException e) {
             throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            con.close();
        }
    }

    public void insertContaCorrente(ContaCorrente cc) throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = Conexao.getConnection();
            sql = "insert into conta (idcliente , saldo, tipo , deposito_inicial, limite) values (?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cc.getCliente().getIdCliente());
            stmt.setDouble(2, cc.getSaldo());
            stmt.setString(3, "CC");
            stmt.setDouble(4, cc.getDepositoInicial());
            stmt.setDouble(5, cc.getLimite());
            stmt.execute();
        } finally {
            stmt.close();
            con.close();
        }
    }
    
    public void insertContaInvestimento(ContaInvestimento ci) throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = Conexao.getConnection();
            sql = "insert into conta (idcliente , saldo, tipo , deposito_inicial, montante_min, deposito_min ) values (?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, ci.getCliente().getIdCliente());
            stmt.setDouble(2, ci.getSaldo());
            stmt.setString(3, "INV");
            stmt.setDouble(4, ci.getDepositoInicial());
            stmt.setDouble(5, ci.getMontanteMinimo());
            stmt.setDouble(6, ci.getDepositoMinimo());
            stmt.execute();
        }finally {
            stmt.close();
            con.close();
        }
    }
    
    public void update(Conta conta) throws SQLException {
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
    
    public void delete(Conta conta) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = Conexao.getConnection();
            int numConta = conta.getNumero();
            sql = "delete from conta where num_conta  = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, numConta);
            stmt.executeUpdate();

        } catch(SQLException e) {
             throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
        }
    }
    
    public int getNumConta(int idCliente) throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        int numConta = 0;
        try{
            con = Conexao.getConnection();
            sql= "SELECT num_conta FROM conta WHERE tipo = ? AND idcliente = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "CC");
            stmt.setInt(2, idCliente);
            ResultSet rs = stmt.executeQuery();
            rs = stmt.executeQuery();
            while(rs.next()){
                numConta = rs.getInt("num_conta");
            }
            return numConta;
        } catch(SQLException e) {
             throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
        }
    }
}
