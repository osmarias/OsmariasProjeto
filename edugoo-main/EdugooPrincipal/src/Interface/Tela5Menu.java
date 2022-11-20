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
        btnBuscarOportunidades = new javax.swing.JButton();
        btnContato = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
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

        btnBuscarOportunidades.setBackground(new java.awt.Color(22, 53, 88));
        btnBuscarOportunidades.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBuscarOportunidades.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarOportunidades.setText("Pesquisa");
        btnBuscarOportunidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarOportunidadesActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarOportunidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, -1));

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

        btnInserir.setBackground(new java.awt.Color(22, 53, 88));
        btnInserir.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(255, 255, 255));
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 110, -1));

        btnAjuda.setBackground(new java.awt.Color(22, 53, 88));
        btnAjuda.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnAjuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAjuda.setText("Ajuda");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 110, -1));

        btnEditar.setBackground(new java.awt.Color(22, 53, 88));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELAMENU1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMeuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeuPerfilActionPerformed
        Tela4Perfil telaMeuPerfil = new Tela4Perfil();
        telaMeuPerfil.recebeUsuarioOn(usuario);
        telaMeuPerfil.setVisible(true);
    }//GEN-LAST:event_btnMeuPerfilActionPerformed

    private void btnBuscarOportunidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarOportunidadesActionPerformed
        Tela6Pesquisa telaPesquisa = new Tela6Pesquisa();
        telaPesquisa.recebeUsuarioOn(usuario);
        telaPesquisa.setVisible(true);
    }//GEN-LAST:event_btnBuscarOportunidadesActionPerformed

    private void btnContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContatoActionPerformed
        Tela9Contato telaContato = new Tela9Contato();
        telaContato.setVisible(true);
        telaContato.recebeUsuarioOn(usuario);
    }//GEN-LAST:event_btnContatoActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        JOptionPane.showMessageDialog(null, "Ministério da Mulher, da Família e dos Direitos Humanos - Ligue 180 WhatsApp (61-99656-5008) Atendimento 24h");
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Tela4CadastroPerfil telaMeuPerfil = new Tela4CadastroPerfil();
        telaMeuPerfil.recebeUsuarioOn(usuario);
        telaMeuPerfil.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Tela7InserirOportunidade telaOportunidade = new Tela7InserirOportunidade();
        telaOportunidade.setVisible(true);
        telaOportunidade.recebeUsuarioOn(usuario);
    }//GEN-LAST:event_btnInserirActionPerformed

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
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnBuscarOportunidades;
    private javax.swing.JButton btnContato;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnMeuPerfil;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables


    public void recebeUsuarioOn(ObjUsuario usuAtual){
        this.usuario = usuAtual;
    }
}
