package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.EstruturaExameDAO;
import br.unipar.projetolab.dao.EstruturaExameDAOImp;
import br.unipar.projetolab.dao.ExameDAO;
import br.unipar.projetolab.dao.ExameDAOImp;
import br.unipar.projetolab.interfaces.ExameSelecionadoListener;
import br.unipar.projetolab.models.EstruturaExame;
import br.unipar.projetolab.models.EstruturaExameLinha;
import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.tablemodels.EstruturaExameTableModel;
import br.unipar.projetolab.utils.EntityManagerUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class EstruturaExameFrame extends javax.swing.JFrame implements ExameSelecionadoListener{
    
    private EstruturaExame estruturaExameAtual;
    private Exame exameAtual;
    
    public EstruturaExameFrame() {
        initComponents();
        
        configurarTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        codigoField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        selecionaExamebtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tipoMaterialField = new javax.swing.JTextField();
        metodoField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        novaLinhabtn = new javax.swing.JButton();
        excluirLinhaBtn = new javax.swing.JButton();
        salvarBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        novoBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        fecharBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));

        jPanel1.setBackground(new java.awt.Color(228, 228, 228));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Estrutura do Exame");

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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Exame", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Abreviação*:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Nome*:");
        jLabel14.setToolTipText("");

        nomeField.setEditable(false);
        nomeField.setBackground(new java.awt.Color(204, 204, 204));
        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });

        selecionaExamebtn.setText("Selecionar Exame");
        selecionaExamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaExamebtnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Tipo Material");

        tipoMaterialField.setEditable(false);
        tipoMaterialField.setBackground(new java.awt.Color(204, 204, 204));

        metodoField.setEditable(false);
        metodoField.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Método");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecionaExamebtn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addComponent(metodoField))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(10, 10, 10)
                        .addComponent(tipoMaterialField))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(470, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selecionaExamebtn)))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(tipoMaterialField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(metodoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        novaLinhabtn.setBackground(new java.awt.Color(243, 255, 229));
        novaLinhabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo-documento.png"))); // NOI18N
        novaLinhabtn.setText("Nova Linha");
        novaLinhabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaLinhabtnActionPerformed(evt);
            }
        });

        excluirLinhaBtn.setBackground(new java.awt.Color(243, 255, 229));
        excluirLinhaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir 1.png"))); // NOI18N
        excluirLinhaBtn.setText("Excluir Linha");
        excluirLinhaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirLinhaBtnActionPerformed(evt);
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

        editBtn.setBackground(new java.awt.Color(243, 255, 229));
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        editBtn.setText("Editar");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
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

        excluirBtn.setBackground(new java.awt.Color(243, 255, 229));
        excluirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir 1.png"))); // NOI18N
        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        fecharBtn.setBackground(new java.awt.Color(243, 255, 229));
        fecharBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-excluir 1.png"))); // NOI18N
        fecharBtn.setText("Fechar");
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(excluirLinhaBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novaLinhabtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(fecharBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvarBtn)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaLinhabtn)
                    .addComponent(excluirLinhaBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarBtn)
                    .addComponent(editBtn)
                    .addComponent(novoBtn)
                    .addComponent(excluirBtn)
                    .addComponent(fecharBtn))
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void novaLinhabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaLinhabtnActionPerformed
        ((EstruturaExameTableModel) jTable1.getModel()).adicionarLinha();
    }//GEN-LAST:event_novaLinhabtnActionPerformed

    private void excluirLinhaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirLinhaBtnActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            ((EstruturaExameTableModel) jTable1.getModel()).removerLinha(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para remover.");
        }
    }//GEN-LAST:event_excluirLinhaBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        try {
            if (exameAtual == null) {
                JOptionPane.showMessageDialog(this, "Selecione um exame antes de salvar.");
                return;
            }

            // Update basic exam data from the fields
            exameAtual.setAbreviacao(codigoField.getText());
            exameAtual.setNome(nomeField.getText());
            exameAtual.setTipoMaterial(tipoMaterialField.getText());
            exameAtual.setMetodo(metodoField.getText());

            // Create ExameDAO instance
            ExameDAO exameDAO = new ExameDAOImp(EntityManagerUtil.getManager());

            // Save or update the Exame
            if (exameAtual.getId() == null) {
                // Exame is new, save it first
                exameDAO.save(exameAtual); // This will assign an ID to exameAtual
                JOptionPane.showMessageDialog(this, "Exame salvo com sucesso!");
                System.out.println("Exame ID after saving: " + exameAtual.getId());

            } else {
                // Exame exists, update it
                exameDAO.update(exameAtual);
                System.out.println("Exame ID after saving: " + exameAtual.getId());

                JOptionPane.showMessageDialog(this, "Exame atualizado com sucesso!");
            }

            // Get and validate EstruturaExame entries
            EstruturaExameTableModel tableModel = (EstruturaExameTableModel) jTable1.getModel();
            List<EstruturaExame> novasEstruturas = tableModel.getLinhas();

            if (!validarEstruturas(novasEstruturas)) {
                return;
            }

            // Clear existing estruturas and add new ones
            exameAtual.getEstruturas().clear();
            for (int i = 0; i < novasEstruturas.size(); i++) {
                EstruturaExame estrutura = novasEstruturas.get(i);

                // Set required fields
                estrutura.setExame(exameAtual); // Associate with the saved Exame
                if (estrutura.getOrdem() == null) {
                    estrutura.setOrdem(i + 1);
                }
                if (estrutura.getTipo() == null) {
                    JOptionPane.showMessageDialog(this, "O campo 'tipo' não pode ser nulo.");
                    return;
                }

                // Add to the Exame's estruturas list
                exameAtual.getEstruturas().add(estrutura);
            }

            // Now update the Exame to save the associated EstruturaExame entities
            exameDAO.update(exameAtual);
            JOptionPane.showMessageDialog(this, "Estrutura do exame atualizada com sucesso!");
            
            limparCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar a estrutura do exame: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_salvarBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        ExamePesquisaFrame pesquisaFrame = new ExamePesquisaFrame(this,false);
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void novoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtnActionPerformed
        
    }//GEN-LAST:event_novoBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        ExamePesquisaFrame pesquisaFrame = new ExamePesquisaFrame(this, true); // 'true' indica que estamos em modo de exclusão/inativação
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void selecionaExamebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaExamebtnActionPerformed
        ExamePesquisaFrame pesquisaFrame = new ExamePesquisaFrame(this, false); // 'true' indica que estamos em modo de exclusão/inativação
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_selecionaExamebtnActionPerformed

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
            java.util.logging.Logger.getLogger(EstruturaExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstruturaExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstruturaExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstruturaExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstruturaExameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoField;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JButton excluirLinhaBtn;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField metodoField;
    private javax.swing.JTextField nomeField;
    private javax.swing.JButton novaLinhabtn;
    private javax.swing.JButton novoBtn;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JButton selecionaExamebtn;
    private javax.swing.JTextField tipoMaterialField;
    // End of variables declaration//GEN-END:variables

    private void configurarTabela() {
        EstruturaExameTableModel tableModel = new EstruturaExameTableModel();
        jTable1.setModel(tableModel);

        JComboBox<String> tipoComboBox = new JComboBox<>(tableModel.getTipos());
        jTable1.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(tipoComboBox));

        jTable1.getModel().addTableModelListener(e -> {
            int row = e.getFirstRow();
            int column = e.getColumn();

            if (column == 2) { // Coluna "Tipo"
                String tipoSelecionado = (String) jTable1.getValueAt(row, column);
                EstruturaExame linha = ((EstruturaExameTableModel) jTable1.getModel()).getLinhas().get(row);
                ((EstruturaExameTableModel) jTable1.getModel()).configurarColunasPorTipo(linha);
                jTable1.repaint();
            }
        });
    }

    // Atualiza os campos do frame com os dados do exame atual
    private void atualizarCamposExame() {
        if (exameAtual != null) {
            codigoField.setText(exameAtual.getAbreviacao());
            nomeField.setText(exameAtual.getNome());
            tipoMaterialField.setText(exameAtual.getTipoMaterial());
            metodoField.setText(exameAtual.getMetodo());
        }
    }

    // Método para carregar as estruturas do exame ao selecionar o exame
    @Override
    public void receberExame(Exame exame) {
        if (exame != null) {
            this.exameAtual = exame;
            atualizarCamposExame();       
            carregarEstruturaExame();    
        }
    }

// Carrega as estruturas do exame selecionado para a tabela
    private void carregarEstruturaExame() {
        if (exameAtual != null && exameAtual.getEstruturas() != null) {
            EstruturaExameTableModel tableModel = (EstruturaExameTableModel) jTable1.getModel();
            tableModel.setLinhas(new ArrayList<>(exameAtual.getEstruturas()));
        }
    }
    
     private void limparCampos() {
        codigoField.setText("");
        nomeField.setText("");
        tipoMaterialField.setText("");
        metodoField.setText("");
        exameAtual = null;

        EstruturaExameTableModel tableModel = (EstruturaExameTableModel) jTable1.getModel();
        tableModel.limparTabela();
    }

    private boolean validarEstruturas(List<EstruturaExame> estruturas) {
        for (EstruturaExame estrutura : estruturas) {
            if (estrutura.getOrdem() == null) {
                JOptionPane.showMessageDialog(this, "A ordem não pode ser nula em uma das linhas.");
                return false;
            }
            if (estrutura.getTipo() == null || estrutura.getTipo().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo 'Tipo' não pode estar vazio.");
                return false;
            }
            if (estrutura.getTexto() == null || estrutura.getTexto().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo 'Texto' não pode estar vazio.");
                return false;
            }
            if ("Lista de Opções".equals(estrutura.getTipo()) && (estrutura.getTexto() == null || !estrutura.getTexto().contains(","))) {
                JOptionPane.showMessageDialog(null, "O campo 'Texto' deve conter pelo menos duas opções separadas por vírgula para listas.");
                return false;
            }
        }
        return true;
    }

}
