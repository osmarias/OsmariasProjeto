package Interface;

import Conexoes.MySQL;
import Objetos.ObjContato;
import Objetos.ObjUsuario;
import javax.swing.JOptionPane;

public class Tela9Contato extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    ObjUsuario usuario = new ObjUsuario();
    ObjContato novoContato = new  ObjContato();
    
    public Tela9Contato() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtOqdeseja = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        btnTermos = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoOqdeseja = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOqdeseja.setForeground(new java.awt.Color(255, 255, 255));
        txtOqdeseja.setText("O que deseja?");
        getContentPane().add(txtOqdeseja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("Email");
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setText("Nome");
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        btnTermos.setText("Termos de Uso");
        btnTermos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTermosActionPerformed(evt);
            }
        });
        getContentPane().add(btnTermos, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 420, 140, -1));

        campoNome.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 170, -1));

        campoEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 280, -1));

        campoOqdeseja.setColumns(20);
        campoOqdeseja.setRows(5);
        jScrollPane1.setViewportView(campoOqdeseja);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 280, -1));

        btnEnviar.setBackground(new java.awt.Color(161, 211, 199));
        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 90, -1));

        btnVoltar.setBackground(new java.awt.Color(161, 211, 199));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGUINHO.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 50, 40));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELASUPORTE.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTermosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTermosActionPerformed
    JOptionPane.showMessageDialog(null, "Obrigado pelo seu feedback!");
    }//GEN-LAST:event_btnTermosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        campoNome.setText(usuario.getUsuarioNome());
        campoEmail.setText(usuario.getUsuarioEmail());
    }//GEN-LAST:event_formWindowActivated

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        enviar();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Tela5Menu tela = new Tela5Menu();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela9Contato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela9Contato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela9Contato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela9Contato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Tela9Contato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnTermos;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextArea campoOqdeseja;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtOqdeseja;
    // End of variables declaration//GEN-END:variables

    private void enviar(){
        
        if (campoNome.getText().equals("") || campoEmail.getText().equals("")
                || campoOqdeseja.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos os Campos sao Obrigatorios!!");
        } else if (!campoEmail.getText().contains("@hotmail.com") && !campoEmail.getText().contains("@gmail.com")){
            JOptionPane.showMessageDialog(null, "Email Invalido!!");
        } else {
            
            this.conectar.conectaBanco();

            
            novoContato.setContatoNomeUser(campoNome.getText());
            novoContato.setContatoEmailUser(campoEmail.getText());
            novoContato.setContatoPergunta(campoOqdeseja.getText());
            novoContato.setContatoUsuarioId(usuario.getUsuarioId());
            
            try {

                this.conectar.insertSQL("INSERT INTO contatos ("
                    + "contatos_nome_user,"
                    + "contatos_email_user,"
                    + "contatos_pergunta,"
                    + "contatos_usuario_id"
                    + ") VALUES ("
                    + "'" + novoContato.getContatoNomeUser() + "',"
                    + "'" + novoContato.getContatoEmailUser() + "',"
                    + "'" + novoContato.getContatoPergunta() + "',"
                    + "'" + novoContato.getContatoUsuarioId() + "'"
                    + ");");

            } catch (Exception e) {

                System.out.println("Erro ao enviar " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao enviar");

            } finally {
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Enviado com Sucesso!");
            }
        }
    }
    
    public void recebeUsuarioOn(ObjUsuario usuAtual){
        this.usuario = usuAtual;
    }

}
