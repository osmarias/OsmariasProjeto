package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;
import Conexoes.MySQL;
import Objetos.ObjUsuario;
import java.awt.Font;
import java.sql.Connection;

public class Tela2Login extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();
    ObjUsuario objUsuario = new ObjUsuario();

    private Connection conn;
 
    public Tela2Login() {
        initComponents();
        fundo.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoUsuario = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        campoSenha = new javax.swing.JPasswordField();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoUsuario.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        campoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        campoUsuario.setText("Usuário");
        campoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoUsuarioFocusLost(evt);
            }
        });
        getContentPane().add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 200, -1));

        btnCadastrar.setBackground(new java.awt.Color(22, 53, 88));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 120, -1));

        btnEntrar.setBackground(new java.awt.Color(161, 211, 199));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(22, 53, 88));
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 120, -1));

        campoSenha.setForeground(new java.awt.Color(204, 204, 204));
        campoSenha.setText("***************");
        campoSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoSenhaFocusLost(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, -1));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELALOGIN2.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Tela3CadastroUsuario tela = new Tela3CadastroUsuario();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       if(campoUsuario.getText().equals("Usuário") || campoSenha.getText().equals("***************")){
           JOptionPane.showMessageDialog(null, "Todos os Campos sao necessarios!!");
       } else {
           Logar(objUsuario.BuscarUsuario(campoUsuario.getText(), campoSenha.getText()));
       }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void campoUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoUsuarioFocusLost
        if (campoUsuario.getText().equals("")) {
            campoUsuario.setText("Usuário");
            campoUsuario.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_campoUsuarioFocusLost

    private void campoSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusGained
        if (campoSenha.getText().equals("***************")) {
            campoSenha.setText("");
            campoSenha.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_campoSenhaFocusGained

    private void campoUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoUsuarioFocusGained
        if (campoUsuario.getText().equals("Usuário")) {
            campoUsuario.setText("");
            campoUsuario.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_campoUsuarioFocusGained

    private void campoSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusLost
        if (campoSenha.getText().equals("")) {
            campoSenha.setText("***************");
            campoSenha.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_campoSenhaFocusLost


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
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel fundo;
    // End of variables declaration//GEN-END:variables

    
    private void Logar(ObjUsuario objUsuario){
        
        if (objUsuario == null) {
            JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorretos!");
        } else {
            if(objUsuario.getUsuarioPerfilExist() == 0){
                Tela4CadastroPerfil telaCadPerfil = new Tela4CadastroPerfil();
                telaCadPerfil.setVisible(true);
                telaCadPerfil.recebeUsuarioOn(objUsuario);
                dispose();
            } else {
                Tela5Menu telaFeed = new Tela5Menu();
                telaFeed.setVisible(true);
                telaFeed.recebeUsuarioOn(objUsuario);
                dispose();
            }
        }
    }
}
