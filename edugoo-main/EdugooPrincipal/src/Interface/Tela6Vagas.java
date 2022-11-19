package Interface;

import Conexoes.MySQL;
import Objetos.ObjUsuario;
import Objetos.ObjVaga;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tela6Vagas extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    ObjUsuario usuario = new ObjUsuario();

    public Tela6Vagas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFeed = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtSelectAreaAtua = new javax.swing.JLabel();
        txtEntreContato = new javax.swing.JLabel();
        txtEntreContatop2 = new javax.swing.JLabel();
        cbAreaAtua = new javax.swing.JComboBox<>();
        btnInsVaga = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVagas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGUINHO.png"))); // NOI18N
        btnFeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedActionPerformed(evt);
            }
        });
        getContentPane().add(btnFeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 40));

        btnBuscar.setBackground(new java.awt.Color(161, 211, 199));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 130, 40));

        txtSelectAreaAtua.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtSelectAreaAtua.setText("Selecione a área de atuação");
        getContentPane().add(txtSelectAreaAtua, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        txtEntreContato.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtEntreContato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEntreContato.setText("Entre em contato para garantir ");
        getContentPane().add(txtEntreContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 240, 30));

        txtEntreContatop2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtEntreContatop2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEntreContatop2.setText("sua participação no processo seletivo");
        getContentPane().add(txtEntreContatop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 280, -1));

        cbAreaAtua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração, negócios e serviços", "Artes e Design", "Ciências Biológicas e da Terra", "Análise e Desenvolvimento de Sistemas", "Ciências Sociais e Humanas", "Comunicação e Informação", "Engenharia e Produção", "Saúde e Bem-estar" }));
        getContentPane().add(cbAreaAtua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, -1));

        btnInsVaga.setBackground(new java.awt.Color(22, 53, 88));
        btnInsVaga.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnInsVaga.setForeground(new java.awt.Color(255, 255, 255));
        btnInsVaga.setText("Inserir Nova");
        btnInsVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsVagaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsVaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 130, 40));

        tbVagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Titulo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbVagas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbVagas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVagasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbVagas);
        if (tbVagas.getColumnModel().getColumnCount() > 0) {
            tbVagas.getColumnModel().getColumn(0).setResizable(false);
            tbVagas.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbVagas.getColumnModel().getColumn(1).setResizable(false);
            tbVagas.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELANOVO.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedActionPerformed
     Tela5Menu tela = new Tela5Menu();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFeedActionPerformed

    private void btnInsVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsVagaActionPerformed
        Tela7InserirVaga tela = new Tela7InserirVaga();
        tela.setVisible(true);
        tela.recebeUsuarioOn(usuario);
        dispose();
    }//GEN-LAST:event_btnInsVagaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarTabela();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbVagasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVagasMouseClicked
        Tela8VisualizarVaga telaVizu = new Tela8VisualizarVaga();
        telaVizu.setVisible(true);
        telaVizu.recebeVaga(getVagaSelecionada());
    }//GEN-LAST:event_tbVagasMouseClicked

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
            java.util.logging.Logger.getLogger(Tela6Vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela6Vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela6Vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela6Vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela6Vagas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFeed;
    private javax.swing.JButton btnInsVaga;
    private javax.swing.JComboBox<String> cbAreaAtua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbVagas;
    private javax.swing.JLabel txtEntreContato;
    private javax.swing.JLabel txtEntreContatop2;
    private javax.swing.JLabel txtSelectAreaAtua;
    // End of variables declaration//GEN-END:variables

    public void recebeUsuarioOn(ObjUsuario usuAtual) {
        this.usuario = usuAtual;
    }

    private List<ObjVaga> getDados() {

        List<ObjVaga> lstVagas = new ArrayList<ObjVaga>();

        try {
            this.conectar.conectaBanco();

            this.conectar.executarSQL(
                    "SELECT *"
                    + " FROM"
                    + " vagas"
                    + " WHERE "
                    + "vagas_areaatuacao = '" + cbAreaAtua.getSelectedItem().toString() + "'"
                    + ";"
            );

            while (this.conectar.getResultSet().next()) {

                ObjVaga vagaAtual = new ObjVaga();

                vagaAtual.setVagaId(this.conectar.getResultSet().getInt(1));
                vagaAtual.setVagaTitulo(this.conectar.getResultSet().getString(2));
                vagaAtual.setVagaAreaAtuacao(this.conectar.getResultSet().getString(3));
                vagaAtual.setVagaInfo(this.conectar.getResultSet().getString(4));
                vagaAtual.setVagaUsuarioId(this.conectar.getResultSet().getInt(5));

                lstVagas.add(vagaAtual);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar" + e.getMessage());

        } finally {
            this.conectar.fechaBanco();
        }
        return lstVagas;
    }
    
    private void buscarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tbVagas.getModel();
        modelo.setNumRows(0);
        
        for (ObjVaga vagaAtual : getDados()) {
            
            modelo.addRow(new Object[]{
                vagaAtual.getVagaId(),
                vagaAtual.getVagaTitulo()
            });
            
        }
    }
    
    private ObjVaga getVagaSelecionada(){
    
        ObjVaga vagaSelecionada = new ObjVaga();
        
        int idx = tbVagas.getSelectedRow();
        
        vagaSelecionada = getDados().get(idx);
        
        return vagaSelecionada;
    }
}
