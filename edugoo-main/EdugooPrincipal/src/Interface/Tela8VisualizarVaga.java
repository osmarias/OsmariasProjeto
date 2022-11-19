
package Interface;

import Conexoes.MySQL;
import Objetos.ObjUsuario;
import Objetos.ObjVaga;
import javax.swing.JOptionPane;

public class Tela8VisualizarVaga extends javax.swing.JFrame {

    ObjVaga vaga = new ObjVaga();
    
    public Tela8VisualizarVaga() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        cbAreaAtua = new javax.swing.JComboBox<>();
        campoTitulo = new javax.swing.JTextField();
        txtAreaAtua = new javax.swing.JLabel();
        txtInfo = new javax.swing.JLabel();
        campoInfo = new javax.swing.JScrollPane();
        campoTxtInfo = new javax.swing.JTextArea();
        btnVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setText("Título ");
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        cbAreaAtua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administração, negócios e serviços", "Artes e Design", "Ciências Biológicas e da Terra", "Análise e Desenvolvimento de Sistemas", "Ciências Sociais e Humanas", "Comunicação e Informação", "Engenharia e Produção", "Saúde e Bem-estar" }));
        cbAreaAtua.setEnabled(false);
        cbAreaAtua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaAtuaActionPerformed(evt);
            }
        });
        getContentPane().add(cbAreaAtua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 280, 40));

        campoTitulo.setEnabled(false);
        getContentPane().add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 280, 40));

        txtAreaAtua.setText("Área de atuação");
        getContentPane().add(txtAreaAtua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtInfo.setText("Informações");
        getContentPane().add(txtInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 30));

        campoTxtInfo.setColumns(20);
        campoTxtInfo.setRows(5);
        campoTxtInfo.setEnabled(false);
        campoInfo.setViewportView(campoTxtInfo);

        getContentPane().add(campoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 280, 100));

        btnVoltar.setBackground(new java.awt.Color(161, 211, 199));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 120, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGUINHO.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 40));

        cbTipo.setBackground(new java.awt.Color(242, 242, 242));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Vagas de Emprego", "Curso", "Serviços" }));
        cbTipo.setEnabled(false);
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 280, 40));

        jLabel2.setText("Tipo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELAOPODISP.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
      Tela7InserirVaga tela = new Tela7InserirVaga();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        vizualizaVaga(vaga);
        System.out.println(vaga.getVagaId());
        System.out.println(vaga.getVagaTitulo());
        System.out.println(vaga.getVagaAreaAtuacao());
        System.out.println(vaga.getVagaInfo());
        System.out.println(vaga.getVagaUsuarioId());
        
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Tela5Menu tela = new Tela5Menu();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbAreaAtuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaAtuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAreaAtuaActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela8VisualizarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela8VisualizarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela8VisualizarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela8VisualizarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela8VisualizarVaga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane campoInfo;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JTextArea campoTxtInfo;
    private javax.swing.JComboBox<String> cbAreaAtua;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtAreaAtua;
    private javax.swing.JLabel txtInfo;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables

    public void recebeVaga(ObjVaga vagaAtual) {
        this.vaga = vagaAtual;
    }
    
    private void vizualizaVaga(ObjVaga vagaVizu){
        campoTitulo.setText(vagaVizu.getVagaTitulo());
        cbAreaAtua.getModel().setSelectedItem(vagaVizu.getVagaAreaAtuacao());
        campoTxtInfo.setText(vagaVizu.getVagaInfo());
    }
    
}
