package Interface;

import Conexoes.MySQL;
import Objetos.ObjPerfilUsuario;
import Objetos.ObjUsuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Tela4CadastroPerfil extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    ObjUsuario usuario = new ObjUsuario();
    ObjPerfilUsuario perfilUser = new ObjPerfilUsuario();

    public Tela4CadastroPerfil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        btnFoto = new javax.swing.JButton();
        campoNomePerfil = new javax.swing.JTextField();
        dataNasc = new com.toedter.calendar.JDateChooser();
        txtDataNasc = new javax.swing.JLabel();
        txtSobreMim = new javax.swing.JLabel();
        txtInteresses = new javax.swing.JLabel();
        btnSalvarPerfil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbInteresse1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoSobreMim = new javax.swing.JTextArea();
        cbStatusMerc = new javax.swing.JComboBox<>();
        cbInteresse2 = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFoto.setBackground(new java.awt.Color(161, 211, 199));
        btnFoto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnFoto.setText("Carregar Foto");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, -1));

        campoNomePerfil.setEnabled(false);
        getContentPane().add(campoNomePerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 160, -1));
        getContentPane().add(dataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 140, -1));

        txtDataNasc.setText("Data de Nascimento");
        getContentPane().add(txtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        txtSobreMim.setText("Sobre mim");
        getContentPane().add(txtSobreMim, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtInteresses.setText("Interesses");
        getContentPane().add(txtInteresses, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        btnSalvarPerfil.setBackground(new java.awt.Color(161, 66, 105));
        btnSalvarPerfil.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnSalvarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarPerfil.setText("Salvar");
        btnSalvarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jLabel5.setText("Status no Mercado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        cbInteresse1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administração", "Arquitetura", "Biomedicina", "Design", "Design de Interiores", "Design de Produto", "Dentista", "Direito", "Economia", "Enfermagem", "Engenharia Civil", "Engenharia Elétrica", "Engenharia Mecânica", "Engenharia de Minas", "Engenharia de Produção", "Estética", "Farmácia", "Fisioterapia", "Fonoaudiologia", "Gastronomia", "Logística", "Medicina", "Nutrição", "Odontologia", "Paisagismo", "Pedagogia", "Psicologia", "Radiologia", "Recursos Humanos", "Rede de Computadores", "Relações Internacionais", "Serviços Gerais", "Sistemas da Informação", "Sistemas para Internet", "Tecnologia da Informação", "Terapias Integrativas e Complementares" }));
        getContentPane().add(cbInteresse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 140, -1));

        campoSobreMim.setColumns(20);
        campoSobreMim.setRows(5);
        jScrollPane1.setViewportView(campoSobreMim);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 300, 70));

        cbStatusMerc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A disposição", "Trabalhando", "Estagiando", "Se profissionalizando", "Desempregada", "Buscando conhecimento" }));
        getContentPane().add(cbStatusMerc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 300, -1));

        cbInteresse2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administração", "Arquitetura", "Biomedicina", "Design", "Design de Interiores", "Design de Produto", "Dentista", "Direito", "Economia", "Enfermagem", "Engenharia Civil", "Engenharia Elétrica", "Engenharia Mecânica", "Engenharia de Minas", "Engenharia de Produção", "Estética", "Farmácia", "Fisioterapia", "Fonoaudiologia", "Gastronomia", "Logística", "Medicina", "Nutrição", "Odontologia", "Paisagismo", "Pedagogia", "Psicologia", "Radiologia", "Recursos Humanos", "Rede de Computadores", "Relações Internacionais", "Serviços Gerais", "Sistemas da Informação", "Sistemas para Internet", "Tecnologia da Informação", "Terapias Integrativas e Complementares" }));
        getContentPane().add(cbInteresse2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 140, -1));

        btnVoltar.setBackground(new java.awt.Color(161, 66, 105));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELACADASTROPERFIL.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed

    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnSalvarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPerfilActionPerformed
        if (usuario.getUsuarioPerfilExist() == 0) {
            cadastraPerfilUser(usuario);
        } else {
            editarPerfilUser(usuario);
        };
    }//GEN-LAST:event_btnSalvarPerfilActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(usuario.getUsuarioPerfilExist() == 0){
            btnVoltar.setVisible(false);
        } else {
            dataNasc.setEnabled(false);
        }
        carregarPerfilUser(usuario);
    }//GEN-LAST:event_formWindowActivated

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Tela3CadastroUsuario tela = new Tela3CadastroUsuario();
        tela.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela4CadastroPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela4CadastroPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela4CadastroPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela4CadastroPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Tela4CadastroPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnSalvarPerfil;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoNomePerfil;
    private javax.swing.JTextArea campoSobreMim;
    private javax.swing.JComboBox<String> cbInteresse1;
    private javax.swing.JComboBox<String> cbInteresse2;
    private javax.swing.JComboBox<String> cbStatusMerc;
    private com.toedter.calendar.JDateChooser dataNasc;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtDataNasc;
    private javax.swing.JLabel txtInteresses;
    private javax.swing.JLabel txtSobreMim;
    // End of variables declaration//GEN-END:variables

    public void recebeUsuarioOn(ObjUsuario usuAtual) {
        this.usuario = usuAtual;
    }

    private void cadastraPerfilUser(ObjUsuario usuarioAtual) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateNasc = sdf.format(dataNasc.getDate());

            if (dateNasc.equals("")) {
                JOptionPane.showMessageDialog(null, "Data de Nascimento é Obrigatorio!!");

            } else {
                this.conectar.conectaBanco();

                perfilUser.setPerfilNome(campoNomePerfil.getText());
                perfilUser.setPerfilDataNasc(dateNasc);
                perfilUser.setPerfilSobreMim(campoSobreMim.getText());
                perfilUser.setPerfilInteresse1((String) cbInteresse1.getSelectedItem());
                perfilUser.setPerfilInteresse2((String) cbInteresse2.getSelectedItem());
                perfilUser.setPerfilStatusMercado((String) cbStatusMerc.getSelectedItem());
                perfilUser.setPerfilUsuarioId(usuarioAtual.getUsuarioId());

                try {

                    this.conectar.insertSQL("INSERT INTO perfilUsuario ("
                            + "perfil_nome,"
                            + "perfil_data,"
                            + "perfil_sobremim,"
                            + "perfil_interesse1,"
                            + "perfil_interesse2,"
                            + "perfil_statusmercado,"
                            + "perfil_usuario_id"
                            + ") VALUES ("
                            + "'" + perfilUser.getPerfilNome() + "',"
                            + "'" + perfilUser.getPerfilDataNasc() + "',"
                            + "'" + perfilUser.getPerfilSobreMim() + "',"
                            + "'" + perfilUser.getPerfilInteresse1() + "',"
                            + "'" + perfilUser.getPerfilInteresse2() + "',"
                            + "'" + perfilUser.getPerfilStatusMercado() + "',"
                            + "'" + perfilUser.getPerfilUsuarioId() + "'"
                            + ");");

                } catch (Exception e) {

                    System.out.println("Erro ao cadastrar perfil do usuario " + e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro ao Salvar Perfil");

                } finally {
                    this.conectar.fechaBanco();
                    JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
                    Tela5Menu telaFeed = new Tela5Menu();
                    usuarioAtual.setUsuarioPerfilExist(1);
                    atualizarUsuario(usuarioAtual);
                    telaFeed.recebeUsuarioOn(usuarioAtual);
                    telaFeed.setVisible(true);
                    dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campo data de nascimento é Obrigatorio!!");
        }
    }

    private void atualizarUsuario(ObjUsuario usuario) {
        this.conectar.conectaBanco();

        try {
            this.conectar.insertSQL("UPDATE usuarios SET "
                    + "usuario_perfilexist = 1"
                    + " WHERE "
                    + "usuario_id = '" + usuario.getUsuarioId() + "'"
                    + ";");

        } catch (Exception e) {

            System.out.println("Erro ao Atualizar: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Usuario");

        } finally {
            conectar.fechaBanco();
        }
    }

    private void editarPerfilUser(ObjUsuario usuarioAtual) {
        this.conectar.conectaBanco();

        try {

            this.conectar.insertSQL("UPDATE perfilUsuario SET "
                    + "perfil_sobremim = '" + campoSobreMim.getText() + "',"
                    + "perfil_interesse1 = '" + ((String)cbInteresse1.getSelectedItem()) + "',"
                    + "perfil_interesse2 = '" + ((String)cbInteresse2.getSelectedItem()) + "',"
                    + "perfil_statusmercado = '" + ((String)cbStatusMerc.getSelectedItem()) + "'"
                    + " WHERE "
                    + "perfil_usuario_id = '" + usuarioAtual.getUsuarioId() + "'"
                    + ";");

        } catch (Exception e) {

            System.out.println("Erro ao Atualizar: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Perfil de Usuario");

        } finally {
            conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Atualização Realizada!");
            carregarPerfilUser(usuarioAtual);
        }
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
                    perfilUser.setPerfilId(this.conectar.getResultSet().getInt(8));

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
                campoSobreMim.setText(perfilUser.getPerfilSobreMim());
                cbInteresse1.getModel().setSelectedItem(perfilUser.getPerfilInteresse1());
                cbInteresse2.getModel().setSelectedItem(perfilUser.getPerfilInteresse2());
                cbStatusMerc.getModel().setSelectedItem(perfilUser.getPerfilStatusMercado());

                this.conectar.fechaBanco();
            }
        
    }
    
}
