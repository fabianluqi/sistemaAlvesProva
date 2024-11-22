/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

public class JFrmMain extends javax.swing.JFrame {

    public JFrmMain() {
        initComponents();
        setTitle("Sistema de pedidos, e cadastramento de clientes e produtos para a loja Joja");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnuCategorias = new javax.swing.JMenuItem();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuProdutos = new javax.swing.JMenuItem();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuSair = new javax.swing.JMenuItem();
        jMnuVendasProdutos = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setMnemonic('c');
        jMenu1.setText("Cadastros");

        jMnuCategorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-categories-15.png"))); // NOI18N
        jMnuCategorias.setText("Categorias");
        jMnuCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCategoriasActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuCategorias);

        jMnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-users-15.png"))); // NOI18N
        jMnuClientes.setText("Clientes");
        jMnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuClientes);

        jMnuProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-bens-de-consumo-rápido-15.png"))); // NOI18N
        jMnuProdutos.setText("Produtos");
        jMnuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuProdutos);

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-gestão-de-cliente-15.png"))); // NOI18N
        jMnuUsuarios.setText("Usuarios");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuUsuarios);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-saída-de-incêndio-15.png"))); // NOI18N
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuSair);

        jMenuBar1.add(jMenu1);

        jMnuVendasProdutos.setMnemonic('m');
        jMnuVendasProdutos.setText("Movimento");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        jMnuVendasProdutos.add(jMnuVendas);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Vendas Produtos");
        jMnuVendasProdutos.add(jMenuItem1);

        jMenuBar1.add(jMnuVendasProdutos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutosActionPerformed
        JDlgProdutos jDlgP = new JDlgProdutos(this, true);
        jDlgP.setVisible(true);
    }//GEN-LAST:event_jMnuProdutosActionPerformed

    private void jMnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientesActionPerformed
        JDlgClientes jDlgC = new JDlgClientes(this, true);
        jDlgC.setVisible(true);
    }//GEN-LAST:event_jMnuClientesActionPerformed

    private void jMnuCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCategoriasActionPerformed
        JDlgCategorias jDlgT = new JDlgCategorias(this, true);
        jDlgT.setVisible(true);
    }//GEN-LAST:event_jMnuCategoriasActionPerformed

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        JDlgUsuarios jDlgU = new JDlgUsuarios(this, true);
        jDlgU.setVisible(true);
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuVendasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMnuCategorias;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenuItem jMnuProdutos;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JMenu jMnuVendasProdutos;
    // End of variables declaration//GEN-END:variables
}
