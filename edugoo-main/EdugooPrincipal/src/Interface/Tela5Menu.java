
package Interface;

import Objetos.ObjUsuario;
import javax.swing.JOptionPane;

public class Tela5Menu extends javax.swing.JFrame {

    ObjUsuario usuario = new ObjUsuario();
    
    public Tela5Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btnMeuPerfil = new javax.swing.JButton();
        btnBuscarVagas = new javax.swing.JButton();
        btnContato = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMeuPerfil.setBackground(new java.awt.Color(22, 53, 88));
        btnMeuPerfil.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnMeuPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnMeuPerfil.setText("Perfil");
        btnMeuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeuPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnMeuPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, -1));

        btnBuscarVagas.setBackground(new java.awt.Color(22, 53, 88));
        btnBuscarVagas.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBuscarVagas.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVagas.setText("Pesquisa");
        btnBuscarVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVagasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarVagas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, -1));

        btnContato.setBackground(new java.awt.Color(22, 53, 88));
        btnContato.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnContato.setForeground(new java.awt.Color(255, 255, 255));
        btnContato.setText("Contato");
        btnContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContatoActionPerformed(evt);
            }
        });
        getContentPane().add(btnContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 110, -1));

        jButton1.setBackground(new java.awt.Color(22, 53, 88));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Trabalho");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 110, -1));

        jButton2.setBackground(new java.awt.Color(22, 53, 88));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ajuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 110, -1));

        jButton3.setBackground(new java.awt.Color(22, 53, 88));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Editar");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELAMENU1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMeuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeuPerfilActionPerformed
        Tela4CadastroPerfil telaMeuPerfil = new Tela4CadastroPerfil();
        telaMeuPerfil.recebeUsuarioOn(usuario);
        telaMeuPerfil.setVisible(true);
    }//GEN-LAST:event_btnMeuPerfilActionPerformed

    private void btnBuscarVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVagasActionPerformed
        Tela6Vagas telaVagas = new Tela6Vagas();
        telaVagas.setVisible(true);
        telaVagas.recebeUsuarioOn(usuario);
    }//GEN-LAST:event_btnBuscarVagasActionPerformed

    private void btnContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContatoActionPerformed
        Tela9Contato telaContato = new Tela9Contato();
        telaContato.setVisible(true);
        telaContato.recebeUsuarioOn(usuario);
    }//GEN-LAST:event_btnContatoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    JOptionPane.showMessageDialog(null, "Ministério da Mulher, da Família e dos Direitos Humanos - Ligue 180 WhatsApp (61-99656-5008) Atendimento 24h");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela5Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela5Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela5Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela5Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela5Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVagas;
    private javax.swing.JButton btnContato;
    private javax.swing.JButton btnMeuPerfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables


    public void recebeUsuarioOn(ObjUsuario usuAtual){
        this.usuario = usuAtual;
    }
}
