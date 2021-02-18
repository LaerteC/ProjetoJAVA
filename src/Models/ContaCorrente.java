/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author laert
 */
public class ContaCorrente extends Conta {
    
    
     public double limite;
    public int numeroConta;
    
     @Override
    public double getDepositoInicial() {
        return depositoInicial;
    }

     @Override
    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    
    @Override
    public boolean saca(double valor) {
        return valor <= this.limite;
    }
    
    @Override
    public void remunera() {
        this.saldo *= 1.1;
    }
}
