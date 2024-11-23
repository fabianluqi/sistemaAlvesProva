/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import pesquisar.JDlgClientesPesquisar;
import tools.Util;

public class JDlgClientes extends javax.swing.JDialog {

    public JDlgClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Clientes");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtApelido, jTxtApelido, jTxtCpf, jTxtNascimento, jTxtSenha,
                jTxtEmail, jTxtCelular, jTxtEndereco, jTxtCep, jTxtCidade, jTxtBairro, jTxtNumero, jCboNivel, jChAtivo,
                jBtnConfirmar, jBtnCancelar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtApelido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtCpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtNascimento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtSenha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtCelular = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTxtCep = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTxtBairro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTxtNumero = new javax.swing.JTextField();
        jCboNivel = new javax.swing.JComboBox<>();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jChAtivo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Nome");

        jLabel3.setText("Apelido");

        jLabel4.setText("CPF");

        jLabel5.setText("Data de Nascimento");

        jLabel6.setText("Senha");

        jLabel7.setText("Nivel");

        jLabel9.setText("Email");

        jLabel10.setText("Celular");

        jLabel11.setText("Endereço");

        jLabel12.setText("CEP");

        jLabel13.setText("Cidade");

        jLabel14.setText("Bairro");

        jLabel15.setText("Número");

        jCboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Funcionário", "Usuario" }));

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-mais-15.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-substituir-15.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-remover-15.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-selecionado-15.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cancelar-15.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pesquisar-15.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jChAtivo.setText("Ativo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTxtCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCelular, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGap(93, 93, 93)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jTxtNome)
                            .addComponent(jTxtApelido)
                            .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTxtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                                .addComponent(jTxtCpf)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(194, 194, 194)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jChAtivo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jTxtNascimento)
                                        .addComponent(jLabel7)
                                        .addComponent(jCboNivel, 0, 158, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAlterar)
                .addGap(16, 16, 16)
                .addComponent(jBtnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnPesquisar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jChAtivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        jTxtCodigo.grabFocus();
        Util.habilitar(true, jTxtCodigo, jTxtNome, jTxtApelido, jTxtApelido, jTxtCpf, jTxtNascimento, jTxtSenha,
                jTxtEmail, jTxtCelular, jTxtEndereco, jTxtCep, jTxtCidade, jTxtBairro, jTxtNumero, jCboNivel, jChAtivo,
                jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        Util.habilitar(true, jTxtCodigo, jTxtNome, jTxtApelido, jTxtApelido, jTxtCpf, jTxtNascimento, jTxtSenha,
                jTxtEmail, jTxtCelular, jTxtEndereco, jTxtCep, jTxtCidade, jTxtBairro, jTxtNumero, jCboNivel, jChAtivo,
                jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        JOptionPane.showMessageDialog(null, "Exclusão realizada");
        Util.limpar(jTxtCodigo, jTxtNome, jTxtApelido, jTxtApelido, jTxtCpf, jTxtNascimento, jTxtSenha,
                jTxtEmail, jTxtCelular, jTxtEndereco, jTxtCep, jTxtCidade, jTxtBairro, jTxtNumero, jCboNivel, jChAtivo);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtApelido, jTxtApelido, jTxtCpf, jTxtNascimento, jTxtSenha,
                jTxtEmail, jTxtCelular, jTxtEndereco, jTxtCep, jTxtCidade, jTxtBairro, jTxtNumero, jCboNivel, jChAtivo,
                jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtApelido, jTxtApelido, jTxtCpf, jTxtNascimento, jTxtSenha,
                jTxtEmail, jTxtCelular, jTxtEndereco, jTxtCep, jTxtCidade, jTxtBairro, jTxtNumero, jCboNivel, jChAtivo,
                jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        JDlgClientesPesquisar jDlgCliPesq = new JDlgClientesPesquisar(null, true);
        jDlgCliPesq.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgClientes dialog = new JDlgClientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboNivel;
    private javax.swing.JCheckBox jChAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtApelido;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCelular;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtCpf;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtNascimento;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextField jTxtSenha;
    // End of variables declaration//GEN-END:variables
}
