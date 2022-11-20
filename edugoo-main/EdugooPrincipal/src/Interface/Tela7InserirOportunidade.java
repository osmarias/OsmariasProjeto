
package Interface;

import Conexoes.MySQL;
import Objetos.ObjUsuario;
import Objetos.ObjOportunidade;
import javax.swing.JOptionPane;

public class Tela7InserirOportunidade extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    ObjUsuario usuario = new ObjUsuario();
    ObjOportunidade oportunidade = new ObjOportunidade();
    
    public Tela7InserirOportunidade() {
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
        btnFeed = new javax.swing.JButton();
        campoInfo = new javax.swing.JScrollPane();
        campoTxtInfo = new javax.swing.JTextArea();
        btnSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setText("Título");
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        cbAreaAtua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administração, negócios e serviços", "Artes e Design", "Ciências Biológicas e da Terra", "Análise e Desenvolvimento de Sistemas", "Ciências Sociais e Humanas", "Comunicação e Informação", "Engenharia e Produção", "Saúde e Bem-estar" }));
        getContentPane().add(cbAreaAtua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 280, 40));
        getContentPane().add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 280, 40));

        txtAreaAtua.setText("Área de atuação");
        getContentPane().add(txtAreaAtua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtInfo.setText("Informações");
        getContentPane().add(txtInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 30));

        btnFeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGUINHO.png"))); // NOI18N
        btnFeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedActionPerformed(evt);
            }
        });
        getContentPane().add(btnFeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 40));

        campoTxtInfo.setColumns(20);
        campoTxtInfo.setRows(5);
        campoInfo.setViewportView(campoTxtInfo);

        getContentPane().add(campoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 333, 280, 100));

        btnSalvar.setBackground(new java.awt.Color(161, 211, 199));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 100, -1));

        jLabel2.setText("Tipo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Vagas de Emprego", "Curso", "Serviços" }));
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 280, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELANOVAOPO.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedActionPerformed
        dispose();
    }//GEN-LAST:event_btnFeedActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        SalvarOportunidade(oportunidade);
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela7InserirOportunidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela7InserirOportunidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela7InserirOportunidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela7InserirOportunidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela7InserirOportunidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFeed;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane campoInfo;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JTextArea campoTxtInfo;
    private javax.swing.JComboBox<String> cbAreaAtua;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtAreaAtua;
    private javax.swing.JLabel txtInfo;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables

    public void recebeUsuarioOn(ObjUsuario usuAtual) {
        this.usuario = usuAtual;
    }
    
    private void SalvarOportunidade(ObjOportunidade novaOportunidade) {
        
        if (cbTipo.getSelectedItem().toString().equals("Selecione") || campoTitulo.getText().equals("") 
                || cbAreaAtua.getSelectedItem().toString().equals("Selecione") || campoTxtInfo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos os Campos sao Obrigatorios!!");
        } else {
            
            this.conectar.conectaBanco();

            novaOportunidade.setOportunidadeTipo((String)cbTipo.getSelectedItem());
            novaOportunidade.setOportunidadeTitulo(campoTitulo.getText());
            novaOportunidade.setOportunidadeAreaAtuacao((String)cbAreaAtua.getSelectedItem());
            novaOportunidade.setOportunidadeInfo(campoTxtInfo.getText());
            novaOportunidade.setOportunidadeUsuarioId(usuario.getUsuarioId());
            
            try {

                this.conectar.insertSQL("INSERT INTO oportunidades ("
                    + "oportunidade_tipo,"
                    + "oportunidade_titulo,"
                    + "oportunidade_areaatuacao,"
                    + "oportunidade_informacoes,"
                    + "oportunidade_usuario_id"
                    + ") VALUES ("
                    + "'" + novaOportunidade.getOportunidadeTipo() + "',"
                    + "'" + novaOportunidade.getOportunidadeTitulo() + "',"
                    + "'" + novaOportunidade.getOportunidadeAreaAtuacao() + "',"
                    + "'" + novaOportunidade.getOportunidadeInfo() + "',"
                    + "'" + novaOportunidade.getOportunidadeUsuarioId() + "'"
                    + ");");

            } catch (Exception e) {

                System.out.println("Erro ao salvar oportunidade " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao salvar oportunidade");

            } finally {
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
            }
        }
    }
}
