package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.ExameDAOImp;
import br.unipar.projetolab.dao.GuiaDAO;
import br.unipar.projetolab.dao.GuiaDAOImp;
import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.models.GuiaExame;
import br.unipar.projetolab.models.RequisicaoModel;
import br.unipar.projetolab.tablemodels.ExameTableModel;
import br.unipar.projetolab.utils.EntityManagerUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RequisicaoExamesPanel extends javax.swing.JPanel {
    private javax.swing.JPanel telaPrincipal;
    private RequisicaoModel requisicaoModel;
    private ExameTableModel exameTableModel;
    
    public RequisicaoExamesPanel(javax.swing.JPanel telaPrincipal, RequisicaoModel requisicaoModel) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
        this.requisicaoModel = requisicaoModel;
        this.exameTableModel = new ExameTableModel(new ArrayList<>());
        configurarTabela(); // Configura o modelo da tabela
        carregarDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Anteriobtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        ExmeFild = new javax.swing.JTextField();
        NoexFild = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        OKbTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MaterialBOX = new javax.swing.JTextField();
        fecharBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        novoBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        salvarBtn = new javax.swing.JButton();
        ProxiBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        InfoExmeFild1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        HoraPreFild = new javax.swing.JTextField();
        DataPreFild = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(228, 228, 228));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Requisição");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/requisitos 1.png"))); // NOI18N

        jLabel3.setText("Cadastro de requisições de solicitções de exames");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(871, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        Anteriobtn.setBackground(new java.awt.Color(243, 255, 229));
        Anteriobtn.setText("Anterior");
        Anteriobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriobtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(228, 228, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exames", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Material");
        jLabel16.setToolTipText("");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 60, -1));

        ExmeFild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExmeFildActionPerformed(evt);
            }
        });
        jPanel3.add(ExmeFild, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, -1));

        NoexFild.setEditable(false);
        jPanel3.add(NoexFild, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 530, -1));

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Exame:");
        jLabel17.setToolTipText("");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        OKbTN.setBackground(new java.awt.Color(243, 255, 229));
        OKbTN.setText("Adicionar");
        OKbTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbTNActionPerformed(evt);
            }
        });
        jPanel3.add(OKbTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 100, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "Código", "Exame", "Material", "Coleta", "Entrega"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 990, 210));
        jPanel3.add(MaterialBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 70, -1));

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

        ProxiBtn.setBackground(new java.awt.Color(243, 255, 229));
        ProxiBtn.setText("Proximo");
        ProxiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProxiBtnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InfoExmeFild1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InfoExmeFild1)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrega"));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Hora Prevista");
        jLabel18.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Data Prevista");
        jLabel19.setToolTipText("");

        HoraPreFild.setEditable(false);
        HoraPreFild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraPreFildActionPerformed(evt);
            }
        });

        DataPreFild.setEditable(false);
        DataPreFild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPreFildActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoraPreFild, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataPreFild, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataPreFild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HoraPreFild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(fecharBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(excluirBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(novoBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editBtn))
                                    .addComponent(Anteriobtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salvarBtn)
                                    .addComponent(ProxiBtn)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anteriobtn)
                    .addComponent(ProxiBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarBtn)
                    .addComponent(editBtn)
                    .addComponent(novoBtn)
                    .addComponent(excluirBtn)
                    .addComponent(fecharBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AnteriobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriobtnActionPerformed
        RequisicaoCadPanel requisicaoCadPanel = new RequisicaoCadPanel(telaPrincipal, requisicaoModel);
        telaPrincipal.removeAll();
        telaPrincipal.add(requisicaoCadPanel, java.awt.BorderLayout.CENTER);
        telaPrincipal.revalidate();
        telaPrincipal.repaint();
    }//GEN-LAST:event_AnteriobtnActionPerformed

    private void OKbTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbTNActionPerformed
        if (ExmeFild.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite a abreviação do exame ou pesquise antes de confirmar.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Exame exame = new ExameDAOImp(EntityManagerUtil.getManager()).findByAbreviacao(ExmeFild.getText().trim());
        if (exame != null) {
            GuiaExame guiaExame = new GuiaExame(null, exame, exame.getPrecoPadrao(), "Sem Resultado");
            requisicaoModel.getExames().add(guiaExame);
            carregarDados(); // Atualiza a tabela com os novos dados
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Exame não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OKbTNActionPerformed

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed

    }//GEN-LAST:event_fecharBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            requisicaoModel.getExames().remove(selectedRow);
            carregarDados();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um exame para excluir.", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void novoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtnActionPerformed

    }//GEN-LAST:event_novoBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed

    }//GEN-LAST:event_editBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        try {
            GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());

            // Adiciona os exames selecionados à guia
            List<GuiaExame> exames = requisicaoModel.getExames();
            for (GuiaExame guiaExame : exames) {
                guiaExame.setGuia(requisicaoModel.getGuiaselecionada());
            }

            // Atualiza a guia com os exames
            requisicaoModel.getGuiaselecionada().setExames(exames);

            // Salva ou atualiza a guia no banco
            guiaDAO.update(requisicaoModel.getGuiaselecionada());

            // Verifica se é particular para avançar para a tela de pagamento
            if (requisicaoModel.getGuiaselecionada().isParticular()) {
                RequisicaocaixaPanel requisicaoCaixaPanel = new RequisicaocaixaPanel(telaPrincipal, requisicaoModel);
                telaPrincipal.removeAll();
                telaPrincipal.add(requisicaoCaixaPanel, java.awt.BorderLayout.CENTER);
                telaPrincipal.revalidate();
                telaPrincipal.repaint();
            } else {
                // Exibe mensagem de sucesso
                JOptionPane.showMessageDialog(this, "Guia salva com sucesso! Número da Guia: "
                        + requisicaoModel.getGuiaselecionada().getId(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                int resposta = JOptionPane.showConfirmDialog(this, "Deseja cadastrar outra guia?",
                        "Nova Guia", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    // Redireciona para a tela inicial
                    RequisicaoCadPanel requisicaoCadPanel = new RequisicaoCadPanel(telaPrincipal, new RequisicaoModel());
                    telaPrincipal.removeAll();
                    telaPrincipal.add(requisicaoCadPanel, java.awt.BorderLayout.CENTER);
                    telaPrincipal.revalidate();
                    telaPrincipal.repaint();
                } else {
                    // Fecha a aplicação ou volta ao menu principal
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar os exames: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_salvarBtnActionPerformed

    private void ProxiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProxiBtnActionPerformed
       RequisicaocaixaPanel telaProxima = new RequisicaocaixaPanel(telaPrincipal, requisicaoModel);

        // Trocar o conteúdo do painel principal
        telaPrincipal.removeAll();
        telaPrincipal.add(telaProxima, java.awt.BorderLayout.CENTER);
        telaPrincipal.revalidate();
        telaPrincipal.repaint();
    }//GEN-LAST:event_ProxiBtnActionPerformed

    private void HoraPreFildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraPreFildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraPreFildActionPerformed

    private void DataPreFildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPreFildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataPreFildActionPerformed

    private void ExmeFildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExmeFildActionPerformed
        String abreviacao = ExmeFild.getText().trim();
        if (!abreviacao.isEmpty()) {
            buscarExamePorAbreviacao(abreviacao);
        } else {
            JOptionPane.showMessageDialog(this, "Digite a abreviação do exame.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ExmeFildActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ExamePesquisaFrame pesquisaFrame = new ExamePesquisaFrame(exame -> {
            preencherDadosExame(exame); // Implementa a lógica de preenchimento no painel
        }, false);
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anteriobtn;
    private javax.swing.JTextField DataPreFild;
    private javax.swing.JTextField ExmeFild;
    private javax.swing.JTextField HoraPreFild;
    private javax.swing.JTextField InfoExmeFild1;
    private javax.swing.JTextField MaterialBOX;
    private javax.swing.JTextField NoexFild;
    private javax.swing.JButton OKbTN;
    private javax.swing.JButton ProxiBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton novoBtn;
    private javax.swing.JButton salvarBtn;
    // End of variables declaration//GEN-END:variables

    private void configurarTabela() {

        List<Exame> exames = requisicaoModel.getExames()
                                    .stream()
                                    .map(GuiaExame::getExame)
                                    .toList();

        exameTableModel.setExames(new ArrayList<>(exames)); // Passa uma lista mutável
        jTable1.setModel(exameTableModel);

    }
    
    private void carregarDados() {
        List<Exame> exames = requisicaoModel.getExames().stream()
                .map(GuiaExame::getExame)
                .toList();
        exameTableModel.setExames(exames);
    }

    private void buscarExamePorAbreviacao(String abreviacao) {
        // Simulação de busca no banco de dados
        Exame exame = new ExameDAOImp(EntityManagerUtil.getManager()).findByAbreviacao(abreviacao);

        if (exame != null) {
            preencherDadosExame(exame);
        } else {
            JOptionPane.showMessageDialog(this, "Exame não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preencherDadosExame(Exame exame) {
        ExmeFild.setText(exame.getAbreviacao());
        NoexFild.setText(exame.getNome());
        MaterialBOX.setText(exame.getTipoMaterial());
    }

    private void limparCampos() {
        ExmeFild.setText("");
        NoexFild.setText("");
        MaterialBOX.setText(null);
    }




}
