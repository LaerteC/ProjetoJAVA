/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ManipularController;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import Models.Conta;

/**
 *
 * @author rfabini
 */
public class ManipularView extends javax.swing.JPanel {

    /**
     * Creates new form ManipularView
     */
    public ManipularView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCpf = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        saque = new javax.swing.JButton();
        deposito = new javax.swing.JButton();
        verSaldo = new javax.swing.JButton();
        remunera = new javax.swing.JButton();

        lblCpf.setText("CPF:");

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        lblValor.setText("Valor:");

        saque.setText("Saque");
        saque.setEnabled(false);
        saque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saqueActionPerformed(evt);
            }
        });

        deposito.setText("Depósito");
        deposito.setEnabled(false);
        deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoActionPerformed(evt);
            }
        });

        verSaldo.setText("Ver Saldo");
        verSaldo.setToolTipText("");
        verSaldo.setEnabled(false);
        verSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSaldoActionPerformed(evt);
            }
        });

        remunera.setText("Remunera");
        remunera.setEnabled(false);
        remunera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remuneraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValor)
                                .addGap(18, 18, 18)
                                .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCpf)
                                .addGap(27, 27, 27)
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(btnFiltrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(saque)
                        .addGap(18, 18, 18)
                        .addComponent(deposito)
                        .addGap(12, 12, 12)
                        .addComponent(verSaldo)
                        .addGap(18, 18, 18)
                        .addComponent(remunera)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saque)
                    .addComponent(deposito)
                    .addComponent(verSaldo)
                    .addComponent(remunera))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    Conta conta = new Conta();
    
    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        ManipularController manipularController = new ManipularController();
        conta = manipularController.prepareGetContaByCpf(cpf.getText());
        if (conta.getNumero() > 0) {
            JOptionPane.showOptionDialog(
                    null, 
                    "Usuário encontrado!", 
                    "Usuário", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, 
                    null, 
                    null
                );
            saque.setEnabled(true);
            deposito.setEnabled(true);
            verSaldo.setEnabled(true);
            remunera.setEnabled(true);
        }
        else {
            JOptionPane.showOptionDialog(
                    null, 
                    "Usuário inexistente!", 
                    "Usuário", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, 
                    null, 
                    null
                );
            saque.setEnabled(false);
            deposito.setEnabled(false);
            verSaldo.setEnabled(false);
            remunera.setEnabled(false);
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void remuneraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remuneraActionPerformed
        ManipularController manipularController = new ManipularController();        
        manipularController.doRemuneracao(conta);
        JOptionPane.showOptionDialog(
                null, 
                "Usuário Remunerado!", 
                "Remuneração", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE,
                null, 
                null, 
                null
            );
    }//GEN-LAST:event_remuneraActionPerformed

    private void verSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSaldoActionPerformed
        JOptionPane.showOptionDialog(
                null, 
                "Saldo: " + new DecimalFormat("#.##").format(conta.getSaldo()), 
                "Saldo", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE,
                null, 
                null, 
                null
            );
    }//GEN-LAST:event_verSaldoActionPerformed

    private void saqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saqueActionPerformed
        try {
            ManipularController manipularController = new ManipularController();        
            boolean result = manipularController.doSaque(conta, Double.parseDouble(valor.getText()));
            if (result)
                JOptionPane.showOptionDialog(
                    null, 
                    "Saque Realizado!", 
                    "Saque", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, 
                    null, 
                    null
                );
            else if (conta.getTipo().equals("CC"))
                JOptionPane.showOptionDialog(
                    null, 
                    "Não foi possível realizar o saque!. Valor de Saque ultrapassa o limite da conta!", 
                    "Saque", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, 
                    null, 
                    null
                );
            else
                JOptionPane.showOptionDialog(
                    null, 
                    "Não foi possível realizar o saque!. O saldo ficaria menor que o montante mínimo após realizar o saque!", 
                    "Saque", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, 
                    null, 
                    null
                );
        } catch (NumberFormatException nfex) {
            if (valor.getText() instanceof String && !valor.getText().equals(""))
                JOptionPane.showOptionDialog(
                    null, 
                    "O campo Valor está um formato incorreto!", 
                    "Formato incorreto", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.ERROR_MESSAGE,
                    null, 
                    null, 
                    null
                );
            else
                JOptionPane.showOptionDialog(
                    null, 
                    "O campo Valor está vazio!", 
                    "Campo Vazio", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.ERROR_MESSAGE,
                    null, 
                    null, 
                    null
                );
        }
    }//GEN-LAST:event_saqueActionPerformed

    private void depositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoActionPerformed
        try {
            ManipularController manipularController = new ManipularController();        
            boolean result = manipularController.doDeposito(conta, Double.parseDouble(valor.getText()));
            if (result)
                JOptionPane.showOptionDialog(
                    null, 
                    "Depósito Realizado!", 
                    "Depósito", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, 
                    null, 
                    null
                );
            else if (conta.getTipo().equals("CC"))
                JOptionPane.showOptionDialog(
                    null, 
                    "Não foi possível realizar o depósito!. Valor de Depósito não pode ser negativo!", 
                    "Depósito", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, 
                    null, 
                    null
                );
            else
                JOptionPane.showOptionDialog(
                    null, 
                    "Não foi possível realizar o depósito!. Valor de Depósito é menor que o depósito mínimo!", 
                    "Depósito", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, 
                    null, 
                    null
                );
        } catch (NumberFormatException nfex) {
            if (valor.getText() instanceof String && !valor.getText().equals(""))
                JOptionPane.showOptionDialog(
                    null, 
                    "O campo Valor está um formato incorreto!", 
                    "Formato incorreto", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.ERROR_MESSAGE,
                    null, 
                    null, 
                    null
                );
            else
                JOptionPane.showOptionDialog(
                    null, 
                    "O campo Valor está vazio!", 
                    "Campo Vazio", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.ERROR_MESSAGE,
                    null, 
                    null, 
                    null
                );
        }
    }//GEN-LAST:event_depositoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JTextField cpf;
    private javax.swing.JButton deposito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblValor;
    private javax.swing.JButton remunera;
    private javax.swing.JButton saque;
    private javax.swing.JTextField valor;
    private javax.swing.JButton verSaldo;
    // End of variables declaration//GEN-END:variables
}
