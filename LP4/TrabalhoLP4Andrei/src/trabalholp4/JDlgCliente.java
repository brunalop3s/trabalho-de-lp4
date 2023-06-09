/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholp4;

/**
 *
 * @author andre
 */
public class JDlgCliente extends javax.swing.JDialog {

    /**
     * Creates new form JDlgCliente
     */
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        desabilitar();
        habilitar();
    }
    
     public void habilitar(){
         jTxtIdcliente.setEnabled(true);
         jTxrNome.setEnabled(true);
         JFmtCpf.setEnabled(true);
         jTxtEmail.setEnabled(true);
         jFmtDataNascimento.setEditable(true);
         jChbAtivo.setEnabled(true);
         jTxrApelido.setEnabled(true);
         jTxtSexo.setEnabled(true);  
         JFmtCelular.setEnabled(true);        
         JFmtTelefone.setEnabled(true);        
         JFmtUF.setEnabled(true);
         jTxtCep.setEnabled(true);        
         jTxtEndereco.setEnabled(true);        
         jTxtBairro.setEnabled(true);     
         jTxtCidade.setEnabled(true);        
         
         jBtnConfirmar.setEnabled(true);
         jBtnCancelar.setEnabled(true);
         
   
         
         jBtnIncluir.setEnabled(false);
         jBtnAlterar.setEnabled(false);
         jBtnExcluir.setEnabled(false);
         jBtnPesquisar.setEnabled(false);
    }
    
    public void desabilitar(){
         jTxtIdcliente.setEnabled(false);
         jTxrNome.setEnabled(false);
         JFmtCpf.setEnabled(false);
         jTxtEmail.setEnabled(false);
         jFmtDataNascimento.setEditable(false);
         jChbAtivo.setEnabled(false);
         jTxrApelido.setEnabled(false);
         jTxtSexo.setEnabled(false);  
         JFmtCelular.setEnabled(false);        
         JFmtTelefone.setEnabled(false);        
         JFmtUF.setEnabled(false);
         jTxtCep.setEnabled(false);        
         jTxtEndereco.setEnabled(false);        
         jTxtBairro.setEnabled(false);     
         jTxtCidade.setEnabled(false);    
         
         jBtnConfirmar.setEnabled(false);
         jBtnCancelar.setEnabled(false);
         
         
         
         jBtnIncluir.setEnabled(true);
         jBtnAlterar.setEnabled(true);
         jBtnExcluir.setEnabled(true);
         jBtnPesquisar.setEnabled(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtIdcliente = new javax.swing.JTextField();
        jTxrNome = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtBairro = new javax.swing.JTextField();
        jTxtCep = new javax.swing.JTextField();
        jTxtEndereco = new javax.swing.JTextField();
        jTxtSexo = new javax.swing.JTextField();
        jTxtCidade = new javax.swing.JTextField();
        jTxrApelido = new javax.swing.JTextField();
        JFmtUF = new javax.swing.JFormattedTextField();
        JFmtTelefone = new javax.swing.JFormattedTextField();
        jFmtDataNascimento = new javax.swing.JFormattedTextField();
        JFmtCpf = new javax.swing.JFormattedTextField();
        JFmtCelular = new javax.swing.JFormattedTextField();
        jrxtIdusuario = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JLabel();
        jtxtCpf = new javax.swing.JLabel();
        jrxtSexo = new javax.swing.JLabel();
        jtxtDataNascimento = new javax.swing.JLabel();
        jtxtCelular = new javax.swing.JLabel();
        jtxtTelefone = new javax.swing.JLabel();
        jrxtCep = new javax.swing.JLabel();
        jtxtEndereco = new javax.swing.JLabel();
        jtxtBairro = new javax.swing.JLabel();
        jtxtCidade = new javax.swing.JLabel();
        jtxtApelido = new javax.swing.JLabel();
        jtxtUf = new javax.swing.JLabel();
        jChbAtivo = new javax.swing.JCheckBox();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTxrNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxrNomeActionPerformed(evt);
            }
        });

        jTxtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtBairroActionPerformed(evt);
            }
        });

        jTxtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCepActionPerformed(evt);
            }
        });

        jTxtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEnderecoActionPerformed(evt);
            }
        });

        jTxtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSexoActionPerformed(evt);
            }
        });

        jTxtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCidadeActionPerformed(evt);
            }
        });

        jTxrApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxrApelidoActionPerformed(evt);
            }
        });

        JFmtUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFmtUFActionPerformed(evt);
            }
        });

        JFmtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFmtTelefoneActionPerformed(evt);
            }
        });

        jFmtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDataNascimentoActionPerformed(evt);
            }
        });

        JFmtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFmtCpfActionPerformed(evt);
            }
        });

        JFmtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFmtCelularActionPerformed(evt);
            }
        });

        jrxtIdusuario.setText("Id Cliente");

        jtxtNome.setText("Nome");

        jtxtEmail.setText("E-mail");

        jtxtCpf.setText("Cpf");

        jrxtSexo.setText("Sexo");

        jtxtDataNascimento.setText("Data de Nascimento");

        jtxtCelular.setText("Celular");

        jtxtTelefone.setText("Telefone");

        jrxtCep.setText("Cep");

        jtxtEndereco.setText("Endereço");

        jtxtBairro.setText("Bairro");

        jtxtCidade.setText("Cidade");

        jtxtApelido.setText("Apelido");

        jtxtUf.setText("Uf");

        jChbAtivo.setText("Ativo");
        jChbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChbAtivoActionPerformed(evt);
            }
        });

        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");

        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTxtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                                .addComponent(jTxtIdcliente, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTxrNome))
                                            .addGap(87, 87, 87))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrxtIdusuario)
                                                .addComponent(jtxtEmail)
                                                .addComponent(jtxtCpf))
                                            .addGap(168, 168, 168)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxtNome)
                                        .addGap(187, 187, 187)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(87, 87, 87)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtApelido)
                                    .addComponent(jTxrApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jrxtSexo)
                                        .addComponent(JFmtUF)
                                        .addComponent(jtxtDataNascimento)
                                        .addComponent(jFmtDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addComponent(jtxtCelular)
                                        .addComponent(jtxtTelefone)
                                        .addComponent(jTxtSexo)
                                        .addComponent(JFmtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addComponent(JFmtCelular))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jBtnConfirmar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtnCancelar)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTxtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .addComponent(jTxtBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrxtCep, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jChbAtivo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtCep)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtnPesquisar)))
                                .addContainerGap(26, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtUf)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluir)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrxtIdusuario)
                    .addComponent(jrxtSexo)
                    .addComponent(jrxtCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtIdcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNome)
                    .addComponent(jtxtDataNascimento)
                    .addComponent(jtxtEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxrNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtEmail)
                    .addComponent(jtxtCelular)
                    .addComponent(jtxtBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFmtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCpf)
                    .addComponent(jtxtTelefone)
                    .addComponent(jtxtCidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtApelido)
                    .addComponent(jtxtUf))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxrApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFmtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChbAtivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxrNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxrNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxrNomeActionPerformed

    private void JFmtUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFmtUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFmtUFActionPerformed

    private void jTxtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtBairroActionPerformed

    private void jFmtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDataNascimentoActionPerformed

    private void JFmtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFmtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFmtCpfActionPerformed

    private void JFmtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFmtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFmtTelefoneActionPerformed

    private void jTxtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCepActionPerformed

    private void jTxtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEnderecoActionPerformed

    private void jTxtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSexoActionPerformed

    private void jTxtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCidadeActionPerformed

    private void jTxrApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxrApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxrApelidoActionPerformed

    private void JFmtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFmtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFmtCelularActionPerformed

    private void jChbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChbAtivoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jChbAtivoActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        habilitar();
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        habilitar();
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        desabilitar();
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        desabilitar();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField JFmtCelular;
    private javax.swing.JFormattedTextField JFmtCpf;
    private javax.swing.JFormattedTextField JFmtTelefone;
    private javax.swing.JFormattedTextField JFmtUF;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JCheckBox jChbAtivo;
    private javax.swing.JFormattedTextField jFmtDataNascimento;
    private javax.swing.JTextField jTxrApelido;
    private javax.swing.JTextField jTxrNome;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtIdcliente;
    private javax.swing.JTextField jTxtSexo;
    private javax.swing.JLabel jrxtCep;
    private javax.swing.JLabel jrxtIdusuario;
    private javax.swing.JLabel jrxtSexo;
    private javax.swing.JLabel jtxtApelido;
    private javax.swing.JLabel jtxtBairro;
    private javax.swing.JLabel jtxtCelular;
    private javax.swing.JLabel jtxtCidade;
    private javax.swing.JLabel jtxtCpf;
    private javax.swing.JLabel jtxtDataNascimento;
    private javax.swing.JLabel jtxtEmail;
    private javax.swing.JLabel jtxtEndereco;
    private javax.swing.JLabel jtxtNome;
    private javax.swing.JLabel jtxtTelefone;
    private javax.swing.JLabel jtxtUf;
    // End of variables declaration//GEN-END:variables
}
