/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;

/**
 *
 * @author Madara
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        desablibitarMenus();
        DesabilitarBotaoLogin();

    }

    public void desablibitarMenus() {
        Menu1.setEnabled(false);
        Menu2.setEnabled(false);
        Menu3.setEnabled(false);

    }

    public void habilitarMenus() {
        Menu1.setEnabled(true);
        Menu2.setEnabled(true);
        Menu3.setEnabled(true);
    }

    public void DesabilitarBotaoLogin() {
        Login.setVisible(false);
    }

    public void habilitarBotaoLogin() {
        Login.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu1 = new javax.swing.JMenu();
        MenuA = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Menu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        Menu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cólegio LC do Saber");
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jInternalFrame1.setTitle("Entrada ");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jInternalFrame1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jInternalFrame1.getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome");
        jInternalFrame1.getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 60, 40, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Senha");
        jInternalFrame1.getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 140, 50, 20);
        jInternalFrame1.getContentPane().add(txtNome);
        txtNome.setBounds(90, 80, 290, 30);
        jInternalFrame1.getContentPane().add(txtSenha);
        txtSenha.setBounds(90, 160, 290, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tick.png"))); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton1);
        jButton1.setBounds(70, 250, 140, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Exit.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton2);
        jButton2.setBounds(290, 250, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/3D_HD (195).jpg"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 350);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(330, 190, 500, 370);

        Login.setText("Login");
        Login.setToolTipText("Entrar");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(480, 322, 150, 50);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/3D_HD (195).jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1160, 830);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        Menu1.setText("Arquivos");

        MenuA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MenuA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Add_1.png"))); // NOI18N
        MenuA.setText("Cadastrar alunos");
        MenuA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAActionPerformed(evt);
            }
        });
        Menu1.add(MenuA);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Add.png"))); // NOI18N
        jMenuItem2.setText("Cadastrar professores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Menu1.add(jMenuItem2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/database.png"))); // NOI18N
        jMenu6.setText("Relatório");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder-horizontal.png"))); // NOI18N
        jMenuItem5.setText("Lista de Alunos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder-horizontal.png"))); // NOI18N
        jMenuItem6.setText("Saida");
        jMenu6.add(jMenuItem6);

        Menu1.add(jMenu6);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Exit.png"))); // NOI18N
        jMenuItem3.setText("Sair do sistema");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Menu1.add(jMenuItem3);

        jMenuBar1.add(Menu1);

        Menu2.setText("Ajuda");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Info.png"))); // NOI18N
        jMenuItem7.setText("Como usar o sistema");
        Menu2.add(jMenuItem7);

        jMenuBar1.add(Menu2);

        Menu3.setText("Sobre ");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Info.png"))); // NOI18N
        jMenuItem4.setText("Sobre nós");
        Menu3.add(jMenuItem4);

        jMenuBar1.add(Menu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1167, 824));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void MenuAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAActionPerformed
        TelaAluno a = new TelaAluno();
        fundo.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_MenuAActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        tabelaAlunos tabela = new tabelaAlunos();
        fundo.add(tabela);
        tabela.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         txtNome.requestFocus();
        if (txtNome.getText().equals("Jacob") && txtSenha.getText().equals("1234")) {
            JOptionPane.showMessageDialog(null, "Seja bem vindo","Boas vindas",1);
            habilitarMenus();
            DesabilitarBotaoLogin();
            jInternalFrame1.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Dados inválido", "Aviso",0);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int Play = JOptionPane.showConfirmDialog(null, "Deseja cancelar a entrada?", "Cancelar a entrada", JOptionPane.YES_OPTION);
        if (Play == JOptionPane.YES_OPTION) {
            jInternalFrame1.dispose();
            desablibitarMenus();
            habilitarBotaoLogin();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
     
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        jInternalFrame1.setVisible(true);
        Login.setVisible(false);
    }//GEN-LAST:event_LoginActionPerformed

    private void jInternalFrame1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jInternalFrame1AncestorAdded

    }//GEN-LAST:event_jInternalFrame1AncestorAdded

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JMenu Menu1;
    private javax.swing.JMenu Menu2;
    private javax.swing.JMenu Menu3;
    private javax.swing.JMenuItem MenuA;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
