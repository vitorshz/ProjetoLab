package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.ExameDAO;
import br.unipar.projetolab.dao.ExameDAOImp;
import br.unipar.projetolab.interfaces.ExameSelecionadoListener;
import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.utils.EntityManagerUtil;
import javax.swing.JOptionPane;


public class ExameFrame extends javax.swing.JFrame implements ExameSelecionadoListener{
    
    private Exame exameAtual;
    
    public ExameFrame() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precoField = new javax.swing.JTextField();
        nomeField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        amostraField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tipoMaterialField = new javax.swing.JTextField();
        metodoField = new javax.swing.JTextField();
        codigoField = new javax.swing.JTextField();
        fecharBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        novoBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        salvarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));

        jPanel1.setBackground(new java.awt.Color(228, 228, 228));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Exames");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exame-64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(228, 228, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Preço padrão:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Abreviação*:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, -1));

        precoField.setEditable(false);
        precoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoFieldActionPerformed(evt);
            }
        });
        jPanel3.add(precoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 120, -1));

        nomeField.setEditable(false);
        jPanel3.add(nomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 510, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Nome*:");
        jLabel14.setToolTipText("");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Tipo Material");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        amostraField.setEditable(false);
        jPanel3.add(amostraField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 510, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Método");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Amostra:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        tipoMaterialField.setEditable(false);
        jPanel3.add(tipoMaterialField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 510, -1));

        metodoField.setEditable(false);
        jPanel3.add(metodoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 510, -1));

        codigoField.setEditable(false);
        jPanel3.add(codigoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, -1));

        fecharBtn.setBackground(new java.awt.Color(243, 255, 229));
        fecharBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-excluir 1.png"))); // NOI18N
        fecharBtn.setText("Fechar");
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        excluirBtn.setBackground(new java.awt.Color(243, 255, 229));
        excluirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir 1.png"))); // NOI18N
        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        novoBtn.setBackground(new java.awt.Color(243, 255, 229));
        novoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo-documento.png"))); // NOI18N
        novoBtn.setText("Novo");
        novoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(243, 255, 229));
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        editBtn.setText("Editar");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        salvarBtn.setBackground(new java.awt.Color(243, 255, 229));
        salvarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/disquete.png"))); // NOI18N
        salvarBtn.setText("Salvar");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecharBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluirBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarBtn)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarBtn)
                    .addComponent(editBtn)
                    .addComponent(novoBtn)
                    .addComponent(excluirBtn)
                    .addComponent(fecharBtn))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoFieldActionPerformed

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        ExamePesquisaFrame pesquisaFrame = new ExamePesquisaFrame(this, true); // 'true' indica que estamos em modo de exclusão/inativação
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void novoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtnActionPerformed
        novoExame();
    }//GEN-LAST:event_novoBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        ExamePesquisaFrame pesquisaFrame = new ExamePesquisaFrame(this,false);
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        if (validarCampos()) {
            ExameDAO exameDAO = new ExameDAOImp(EntityManagerUtil.getManager());
            if (exameAtual == null) {
                exameAtual = new Exame();
            }

            exameAtual.setAbreviacao(codigoField.getText());
            exameAtual.setNome(nomeField.getText());
            exameAtual.setPrecoPadrao(Double.parseDouble(precoField.getText()));
            exameAtual.setTipoMaterial(tipoMaterialField.getText());
            exameAtual.setMetodo(metodoField.getText());
            exameAtual.setAmostra(amostraField.getText());

            try {
                if (exameAtual.getId() == null) {
                    exameDAO.save(exameAtual);
                    JOptionPane.showMessageDialog(this, "Exame salvo com sucesso!");
                } else {
                    exameDAO.update(exameAtual);
                    JOptionPane.showMessageDialog(this, "Exame atualizado com sucesso!");
                }
                limparCampos();
                desabilitarCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar exame: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_salvarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amostraField;
    private javax.swing.JTextField codigoField;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField metodoField;
    private javax.swing.JTextField nomeField;
    private javax.swing.JButton novoBtn;
    private javax.swing.JTextField precoField;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JTextField tipoMaterialField;
    // End of variables declaration//GEN-END:variables

    private void novoExame() {
        limparCampos();
        habilitarCampos(true);
        exameAtual = null;
    }
    

    private void excluirExame() {
        if (exameAtual != null) {
            int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o exame?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                try {
                    ExameDAO exameDAO = new ExameDAOImp(EntityManagerUtil.getManager());
                    exameDAO.delete(exameAtual);
                    JOptionPane.showMessageDialog(this, "Exame excluído com sucesso!");
                    limparCampos();
                    desabilitarCampos();
                    exameAtual = null;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir exame: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum exame selecionado para exclusão.");
        }
    }

    private void habilitarEdicao() {
        if (exameAtual != null) {
            habilitarCampos(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum exame selecionado para edição.");
        }
    }

    private boolean validarCampos() {
        if (codigoField.getText().isEmpty() || nomeField.getText().isEmpty() || precoField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios.");
            return false;
        }
        try {
            Double.parseDouble(precoField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O campo 'Preço Padrão' deve ser um número válido.");
            return false;
        }
        return true;
    }

    private void limparCampos() {
        codigoField.setText("");
        nomeField.setText("");
        precoField.setText("");
        tipoMaterialField.setText("");
        metodoField.setText("");
        amostraField.setText("");
    }

    private void habilitarCampos(boolean habilitar) {
        codigoField.setEditable(habilitar);
        nomeField.setEditable(habilitar);
        precoField.setEditable(habilitar);
        tipoMaterialField.setEditable(habilitar);
        metodoField.setEditable(habilitar);
        amostraField.setEditable(habilitar);
    }

    private void desabilitarCampos() {
        habilitarCampos(false);
    }

    // Método para carregar exame em edição
    public void carregarExame(Exame exame) {
        this.exameAtual = exame;
        codigoField.setText(exame.getAbreviacao());
        nomeField.setText(exame.getNome());
        precoField.setText(String.valueOf(exame.getPrecoPadrao()));
        tipoMaterialField.setText(exame.getTipoMaterial());
        metodoField.setText(exame.getMetodo());
        amostraField.setText(exame.getAmostra());

        habilitarCampos(true);
    }


    public void receberExameParaInativar(Exame exameSelecionado) {
        if (exameSelecionado != null) {
            // Exibe um diálogo de confirmação
            int confirmacao = JOptionPane.showConfirmDialog(this,
                    "Tem certeza que deseja inativar o Exame: " + exameSelecionado.getNome() + "?",
                    "Confirmar Inativação", JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_OPTION) {
                // Se confirmado, inativa o paciente
                try {
                    ExameDAO exameDAO = new ExameDAOImp(EntityManagerUtil.getManager());
                    exameSelecionado.setAtivo(false);  // Marca o paciente como inativo
                    exameDAO.update(exameSelecionado);  // Atualiza o paciente no banco
                    JOptionPane.showMessageDialog(this, "Exame inativado com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inativar o Exame: " + ex.getMessage());
                }
            }
        }
    }    

    @Override
    public void receberExame(Exame exame) {
        if (exame != null) {
            carregarExame(exame);
        }
    }
}
