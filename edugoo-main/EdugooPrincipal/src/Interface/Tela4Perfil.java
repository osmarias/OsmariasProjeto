package Interface;

import Conexoes.MySQL;
import Objetos.ObjPerfilUsuario;
import Objetos.ObjUsuario;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tela4Perfil extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    ObjUsuario usuario = new ObjUsuario();
    ObjPerfilUsuario perfilUser = new ObjPerfilUsuario();
    
    public Tela4Perfil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        campoNomePerfil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoInfo = new javax.swing.JTextArea();
        cbStatus = new javax.swing.JComboBox<>();
        campoInteresse1 = new javax.swing.JTextField();
        txtInteresses = new javax.swing.JLabel();
        txtInfo = new javax.swing.JLabel();
        campoInteresse2 = new javax.swing.JTextField();
        dataNasc = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGUINHO.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 40));
        getContentPane().add(campoNomePerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 150, 40));

        campoInfo.setColumns(20);
        campoInfo.setRows(5);
        jScrollPane1.setViewportView(campoInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 280, 90));

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A disposição", "Trabalhando", "Estagiando", "Se profissionalizando", "Desempregada", "Buscando conhecimento" }));
        cbStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbStatusItemStateChanged(evt);
            }
        });
        getContentPane().add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 280, -1));
        getContentPane().add(campoInteresse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 280, -1));

        txtInteresses.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtInteresses.setText("INTERESSES");
        getContentPane().add(txtInteresses, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        txtInfo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtInfo.setText("Mais informações");
        getContentPane().add(txtInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        getContentPane().add(campoInteresse2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 280, -1));
        getContentPane().add(dataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELAPERFILCADASTRADO.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        carregarPerfilUser(usuario);
        campoNomePerfil.setDisabledTextColor(Color.BLACK);
        campoNomePerfil.setEnabled(false);
        campoInfo.setDisabledTextColor(Color.BLACK);
        campoInfo.setEnabled(false);
        campoInteresse1.setDisabledTextColor(Color.BLACK);
        campoInteresse1.setEnabled(false);
        campoInteresse2.setDisabledTextColor(Color.BLACK);
        campoInteresse2.setEnabled(false);
    }//GEN-LAST:event_formWindowActivated

    private void cbStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbStatusItemStateChanged
        cbStatus.getModel().setSelectedItem(perfilUser.getPerfilStatusMercado());
    }//GEN-LAST:event_cbStatusItemStateChanged

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
            java.util.logging.Logger.getLogger(Tela4Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela4Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela4Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela4Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela4Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JTextArea campoInfo;
    private javax.swing.JTextField campoInteresse1;
    private javax.swing.JTextField campoInteresse2;
    private javax.swing.JTextField campoNomePerfil;
    private javax.swing.JComboBox<String> cbStatus;
    private com.toedter.calendar.JDateChooser dataNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtInfo;
    private javax.swing.JLabel txtInteresses;
    // End of variables declaration//GEN-END:variables

    public void recebeUsuarioOn(ObjUsuario usuAtual){
        this.usuario = usuAtual;
    }

    private void carregarPerfilUser(ObjUsuario usuarioAtual){
        
        SimpleDateFormat sdfBr = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
                this.conectar.conectaBanco();

                this.conectar.executarSQL(
                        "SELECT "
                        + "*"
                        + " FROM"
                        + " perfilUsuario"
                        + " WHERE "
                        + "perfil_usuario_id = '" + usuarioAtual.getUsuarioId() + "'"
                        + ";"
                );

                while (this.conectar.getResultSet().next()) {

                    perfilUser.setPerfilId(this.conectar.getResultSet().getInt(1));
                    perfilUser.setPerfilNome(this.conectar.getResultSet().getString(2));
                    perfilUser.setPerfilDataNasc((String)this.conectar.getResultSet().getString(3));
                    perfilUser.setPerfilSobreMim(this.conectar.getResultSet().getString(4));
                    perfilUser.setPerfilInteresse1(this.conectar.getResultSet().getString(5));
                    perfilUser.setPerfilInteresse2(this.conectar.getResultSet().getString(6));
                    perfilUser.setPerfilStatusMercado(this.conectar.getResultSet().getString(7));
                    perfilUser.setPerfilUsuarioId(this.conectar.getResultSet().getInt(8));

                }

                Date date = sdf.parse(perfilUser.getPerfilDataNasc());
                String dateSbr = sdfBr.format(date);
                perfilUser.setPerfilDataNasc(dateSbr);

            } catch (Exception e) {
                System.out.println("Erro ao consultar" + e.getMessage());

            } finally {

                campoNomePerfil.setText(usuarioAtual.getUsuarioNome());
                try {
                    dataNasc.setDate(sdfBr.parse(perfilUser.getPerfilDataNasc()));
                } catch (ParseException ex) {
                    Logger.getLogger(Tela4CadastroPerfil.class.getName()).log(Level.SEVERE, null, ex);
                }
                campoInfo.setText(perfilUser.getPerfilSobreMim());
                campoInteresse1.setText(perfilUser.getPerfilInteresse1());
                campoInteresse2.setText(perfilUser.getPerfilInteresse2());
                cbStatus.getModel().setSelectedItem(perfilUser.getPerfilStatusMercado());

                this.conectar.fechaBanco();
            }
        
    }
    
}
