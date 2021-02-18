/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import Models.Cliente;
import Models.ClienteTableModel;

/**
 *
 * @author rfabini
 */
public class ClienteView extends javax.swing.JPanel {

    ClienteTableModel tableModel = new ClienteTableModel();
    
    /**
     * Creates new form ClientesView
     */
    public ClienteView() {
        initComponents();
        
        tableCliente.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        sobrenome = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        lblFiltro = new javax.swing.JLabel();
        filtro = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        lblOrdernarPor = new javax.swing.JLabel();
        ordenarPor = new javax.swing.JComboBox<>();
        lblSalario = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        lblNome.setText("Nome");

        lblSobrenome.setText("Sobrenome");

        lblRg.setText("RG");

        lblCpf.setText("CPF");

        lblEndereco.setText("Endereço");

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCliente);

        lblFiltro.setText("Filtro:");

        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
            }
        });

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        lblOrdernarPor.setText("Ordenar por:");

        ordenarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Sobrenome", "Salário" }));
        ordenarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorActionPerformed(evt);
            }
        });

        lblSalario.setText("Salário");

        salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnFiltrar)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblOrdernarPor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ordenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblRg)
                                        .addComponent(lblCpf)
                                        .addComponent(lblNome)
                                        .addComponent(lblEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblFiltro)
                                    .addComponent(lblSalario))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnIncluir)
                                        .addGap(24, 24, 24)
                                        .addComponent(btnAtualizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExcluir))
                                    .addComponent(nome)
                                    .addComponent(sobrenome)
                                    .addComponent(rg)
                                    .addComponent(cpf)
                                    .addComponent(endereco)
                                    .addComponent(filtro, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(salario))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSobrenome)
                    .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRg)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFiltro)
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrdernarPor)
                    .addComponent(ordenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrar)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean validaNomeSizeMax() {
        if (nome.getText().length() > 30) {
            JOptionPane.showOptionDialog(
                null, 
                "Tamanho do Nome deve ser menor que 31", 
                "Tamanho Nome Maior que Permitido", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validaSobrenomeSizeMax() {
        if (sobrenome.getText().length() > 50) {
            JOptionPane.showOptionDialog(
                null, 
                "Tamanho do Nome deve ser menor que 51", 
                "Tamanho Nome Maior que Permitido", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validaSalario() {
        try {
            Double.parseDouble(salario.getText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showOptionDialog(
                    null, 
                    "O salário está em um formato incorreto", 
                    "Salário em Formato Incorreto", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.WARNING_MESSAGE,
                    null, 
                    null, 
                    null
            );
            return false;
        }
        
        if (new BigDecimal((salario.getText())).compareTo(new BigDecimal(9999999.99)) == 1) {
            JOptionPane.showOptionDialog(
                null, 
                "Valor do Salário deve ser menor que 10000000", 
                "Valor Salário Maior que Permitido", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validaRG() {
        try {
            Long rgInt = Long.valueOf(rg.getText());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showOptionDialog(
                    null, 
                    "O RG está em um formato incorreto", 
                    "RG em Formato Incorreto", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.WARNING_MESSAGE,
                    null, 
                    null, 
                    null
            );
            return false;
        }
        
        if (rg.getText().length() > 10) {
            JOptionPane.showOptionDialog(
                null, 
                "Tamanho do RG deve ser menor que 11", 
                "Tamanho RG Maior que Permitido", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validaCPF() {
        try {
            Long cpfInt = Long.valueOf(cpf.getText());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showOptionDialog(
                    null, 
                    "O CPF está em um formato incorreto", 
                    "CPF em Formato Incorreto", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.WARNING_MESSAGE,
                    null, 
                    null, 
                    null
            );
            return false;
        }
        
        if (cpf.getText().length() > 11) {
            JOptionPane.showOptionDialog(
                null, 
                "Tamanho do CPF deve ser menor que 12", 
                "Tamanho CPF Maior que Permitido", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validaNomeSizeMin() {
        if (nome.getText().length() == 0) {
            JOptionPane.showOptionDialog(
                null, 
                "Tamanho do Nome deve ser maior que 0", 
                "Tamanho Nome deve ser maior", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validaSobrenomeSizeMin() {
        if (sobrenome.getText().length() == 0) {
            JOptionPane.showOptionDialog(
                null, 
                "Tamanho do Sobrenome deve ser maior que 0", 
                "Tamanho Sobrenome deve ser maior", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validaRGSizeMin() {
        if (rg.getText().length() == 0) {
            JOptionPane.showOptionDialog(
                null, 
                "Tamanho do RG deve ser maior que 0", 
                "Tamanho RG deve ser maior", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validaCPFSizeMin() {
        if (cpf.getText().length() == 0) {
            JOptionPane.showOptionDialog(
                null, 
                "Tamanho do CPF deve ser maior que 0", 
                "Tamanho CPF deve ser maior", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validaEnderecoSizeMin() {
        if (endereco.getText().length() == 0) {
            JOptionPane.showOptionDialog(
                null, 
                "Tamanho do Endereço deve ser maior que 0", 
                "Tamanho Endereço deve ser maior", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validaEnderecoSizeMax() {
        if (endereco.getText().length() > 150) {
            JOptionPane.showOptionDialog(
                null, 
                "Tamanho do Endereço deve ser menor que 150", 
                "Tamanho Endereço Maior que Permitido", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validaSalarioSizeMin() {
        if (salario.getText().length() == 0) {
            JOptionPane.showOptionDialog(
                null, 
                "Tamanho do Salário deve ser maior que 0", 
                "Tamanho Salário deve ser maior", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                null, 
                null, 
                null
            );
            return false;
        }
        return true;
    }
    
    private boolean validacoes () {
        boolean nome = false, sobrenome = false, rg = false, cpf = false, endereco = false, salario = false;
        
        if (nome = validaNomeSizeMin())
            nome = validaNomeSizeMax();
        if (sobrenome = validaSobrenomeSizeMin())
            sobrenome = validaSobrenomeSizeMax();
        if (rg = validaRGSizeMin())
            rg =validaRG();
        if (cpf = validaCPFSizeMin())
            cpf = validaCPF();
        if (endereco = validaEnderecoSizeMin())
            endereco = validaEnderecoSizeMax();
        if (salario = validaSalarioSizeMin())
            salario = validaSalario();
        
        if (nome && sobrenome && rg && cpf && endereco && salario)
            return true;
        else
            return false;
    }
    
    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        if (!validacoes())
            return;

        ClienteController clienteController = new ClienteController(this);
        Cliente cliente = new Cliente(nome.getText(), sobrenome.getText(), rg.getText(), cpf.getText(), endereco.getText(), Double.parseDouble(salario.getText()));
        clienteController.prepareInsert(cliente);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        while (tableModel.getRowCount() > 0) {
            tableModel.removeLinha(0);
        }
        
        ClienteController clienteController = new ClienteController(this);
        List<Cliente> clientes = clienteController.prepareFilter(filtro.getText(), ordenarPor.getSelectedIndex());
        
        Collections.sort(clientes);
        
        for (Cliente cliente : clientes) {
            tableModel.addLinha(cliente);
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void ordenarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPorActionPerformed
        
    }//GEN-LAST:event_ordenarPorActionPerformed

    private void salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioActionPerformed
        
    }//GEN-LAST:event_salarioActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tableCliente.getSelectedRow();
        if (tableCliente.getSelectedRow() != -1) {
            Object[] options = { "Confirmar", "Cancelar" };

            int selecionado = JOptionPane.showOptionDialog(
                    null, 
                    "Se excluir o usuário, todas as suas contas serão excluídas junto", 
                    "Exclusão de usuário", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.WARNING_MESSAGE,
                    null, 
                    options, 
                    options[1]);

            if (selecionado == 0)
                tableModel.removeCliente(linhaSelecionada);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
            
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        int linhaSelecionada = tableCliente.getSelectedRow();
        if (tableCliente.getSelectedRow() != -1) {
            if (!validacoes())
                return;
            tableModel.setValueAt(nome.getText(), linhaSelecionada, 0);
            tableModel.setValueAt(sobrenome.getText(), linhaSelecionada, 1);
            tableModel.setValueAt(rg.getText(), linhaSelecionada, 2);
            tableModel.setValueAt(cpf.getText(), linhaSelecionada, 3);
            tableModel.setValueAt(endereco.getText(), linhaSelecionada, 4);
            tableModel.setValueAt(salario.getText(), linhaSelecionada, 5);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClienteMouseClicked
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        String cpf = (String) source.getModel().getValueAt(row, 3);
        
        ClienteController clienteController = new ClienteController(this);
        List<Cliente> clientes = clienteController.prepareFilter(cpf, ordenarPor.getSelectedIndex());
        Cliente cliente = clientes.get(0);
        this.nome.setText("");
        this.sobrenome.setText("");
        this.rg.setText("");
        this.cpf.setText("");
        this.endereco.setText("");
        this.salario.setText("");        
        
        this.nome.setText(cliente.getNome());
        this.sobrenome.setText(cliente.getSobrenome());
        this.rg.setText(cliente.getRg());
        this.cpf.setText(cliente.getCpf());
        this.endereco.setText(cliente.getEndereco());
        String salarioStr = String.valueOf(cliente.getSalario());
        this.salario.setText(salarioStr);        
    }//GEN-LAST:event_tableClienteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField filtro;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOrdernarPor;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JTextField nome;
    private javax.swing.JComboBox<String> ordenarPor;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField sobrenome;
    private javax.swing.JTable tableCliente;
    // End of variables declaration//GEN-END:variables
}
