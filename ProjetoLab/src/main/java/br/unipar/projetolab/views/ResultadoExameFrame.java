package br.unipar.projetolab.views;

import br.unipar.projetolab.cellrenderer.ExameListCellRenderer;
import br.unipar.projetolab.dao.CampoResultadoDAO;
import br.unipar.projetolab.dao.CampoResultadoDAOImp;
import br.unipar.projetolab.models.CampoResultadoExame;
import br.unipar.projetolab.models.EstruturaExame;
import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.models.Guia;
import br.unipar.projetolab.models.GuiaExame;
import br.unipar.projetolab.models.ResultadoExame;
import br.unipar.projetolab.utils.EntityManagerUtil;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ResultadoExameFrame extends javax.swing.JFrame {


    public ResultadoExameFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        codigoField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        selecionarGuiabtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        medicoCodigoField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        medicoNomeField = new javax.swing.JTextField();
        convenioCodigoField = new javax.swing.JTextField();
        convenioNomeField = new javax.swing.JTextField();
        exameCodigoField = new javax.swing.JTextField();
        exameNomeField = new javax.swing.JTextField();
        nascField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        exameNomeField1 = new javax.swing.JTextField();
        panelExame = new javax.swing.JPanel();
        fecharBtn = new javax.swing.JButton();
        panelBtnSelecionarExames = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examesList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 228, 228));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Inclusão de Exames");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_26.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(228, 228, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Exame", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        codigoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoFieldKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Requisição*:");

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

        selecionarGuiabtn.setText("Pesquisar");
        selecionarGuiabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarGuiabtnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Convenio:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Material");

        medicoCodigoField.setEditable(false);
        medicoCodigoField.setBackground(new java.awt.Color(204, 204, 204));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Médico");

        medicoNomeField.setEditable(false);
        medicoNomeField.setBackground(new java.awt.Color(204, 204, 204));
        medicoNomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicoNomeFieldActionPerformed(evt);
            }
        });

        convenioCodigoField.setEditable(false);
        convenioCodigoField.setBackground(new java.awt.Color(204, 204, 204));

        convenioNomeField.setEditable(false);
        convenioNomeField.setBackground(new java.awt.Color(204, 204, 204));
        convenioNomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convenioNomeFieldActionPerformed(evt);
            }
        });

        exameCodigoField.setEditable(false);
        exameCodigoField.setBackground(new java.awt.Color(204, 204, 204));

        exameNomeField.setEditable(false);
        exameNomeField.setBackground(new java.awt.Color(204, 204, 204));
        exameNomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exameNomeFieldActionPerformed(evt);
            }
        });

        nascField.setEditable(false);
        nascField.setBackground(new java.awt.Color(204, 204, 204));
        nascField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascFieldActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Nasc*:");
        jLabel17.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Exame");

        exameNomeField1.setEditable(false);
        exameNomeField1.setBackground(new java.awt.Color(204, 204, 204));
        exameNomeField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exameNomeField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecionarGuiabtn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nascField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(medicoCodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(medicoNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(convenioCodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(convenioNomeField))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(exameCodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exameNomeField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exameNomeField1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selecionarGuiabtn)))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(nascField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(medicoCodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(exameNomeField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(medicoNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(convenioCodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(convenioNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exameCodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exameNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelExame.setLayout(new java.awt.BorderLayout());

        fecharBtn.setBackground(new java.awt.Color(243, 255, 229));
        fecharBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-excluir 1.png"))); // NOI18N
        fecharBtn.setText("Fechar");
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        panelBtnSelecionarExames.setLayout(new java.awt.BorderLayout());

        examesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(examesList);

        panelBtnSelecionarExames.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(fecharBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelBtnSelecionarExames, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelExame, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBtnSelecionarExames, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addComponent(panelExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fecharBtn)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        resetarTela();
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void exameNomeField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exameNomeField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exameNomeField1ActionPerformed

    private void nascFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascFieldActionPerformed

    private void exameNomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exameNomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exameNomeFieldActionPerformed

    private void convenioNomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convenioNomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convenioNomeFieldActionPerformed

    private void medicoNomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicoNomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicoNomeFieldActionPerformed

    private void selecionarGuiabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarGuiabtnActionPerformed
        resetarTela();
        // Abre o frame de pesquisa de requisições para edição
        RequisicaoPesquisaFrame pesquisaFrame = new RequisicaoPesquisaFrame(guia -> {
            if (guia != null) {
                carregarGuia(guia); // Carrega os dados da guia selecionada no formulário
            }
        });
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_selecionarGuiabtnActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void codigoFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoFieldKeyPressed
        
    }//GEN-LAST:event_codigoFieldKeyPressed

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
            java.util.logging.Logger.getLogger(ResultadoExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadoExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadoExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadoExameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultadoExameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoField;
    private javax.swing.JTextField convenioCodigoField;
    private javax.swing.JTextField convenioNomeField;
    private javax.swing.JTextField exameCodigoField;
    private javax.swing.JTextField exameNomeField;
    private javax.swing.JTextField exameNomeField1;
    private javax.swing.JList<String> examesList;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medicoCodigoField;
    private javax.swing.JTextField medicoNomeField;
    private javax.swing.JTextField nascField;
    private javax.swing.JTextField nomeField;
    private javax.swing.JPanel panelBtnSelecionarExames;
    private javax.swing.JPanel panelExame;
    private javax.swing.JButton selecionarGuiabtn;
    // End of variables declaration//GEN-END:variables

    private void carregarGuia(Guia guia) {
        // Limpar campos existentes
        resetarTela();

        // Preencher campos do cabeçalho com informações da nova guia
        codigoField.setText(String.valueOf(guia.getId()));
        nomeField.setText(guia.getPaciente().getNome());
        nascField.setText(guia.getPaciente().getDataNascimento().toString());
        medicoCodigoField.setText(String.valueOf(guia.getMedico().getId()));
        medicoNomeField.setText(guia.getMedico().getNome());
        convenioCodigoField.setText(guia.getConvenio() != null ? String.valueOf(guia.getConvenio().getId()) : "Particular");
        convenioNomeField.setText(guia.getConvenio() != null ? guia.getConvenio().getNome() : "Particular");

        // Exibir os exames associados à nova guia
        mostrarExames(guia.getExames());
    }




    private void mostrarExames(List<GuiaExame> exames) {
        if (exames.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há exames associados a esta guia.");
            return;
        }

        // Cria um modelo para a JList
        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        // Preenche o modelo com os nomes dos exames e seus status
        for (GuiaExame guiaExame : exames) {
            String status = guiaExame.getStatus().equals("Incluído") ? "Incluído" : "Sem resultado";
            modeloLista.addElement("<html><b>" + guiaExame.getExame().getNome() + "</b><br><i>Status: " + status + "</i></html>");
        }

        // Configura a lista de exames
        examesList.setModel(modeloLista);
        examesList.setCellRenderer(new ExameListCellRenderer());
        examesList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = examesList.getSelectedIndex();
                if (selectedIndex != -1) {
                    GuiaExame exameSelecionado = exames.get(selectedIndex);
                    mostrarDetalhesExame(exameSelecionado);
                }
            }
        });

        panelBtnSelecionarExames.revalidate();
        panelBtnSelecionarExames.repaint();
    }

    private void mostrarDetalhesExame(GuiaExame guiaExame) {
        panelExame.removeAll(); // Limpa o painel antes de adicionar novos detalhes

        // Garantir que estamos lidando com a guia correta
        Exame exame = guiaExame.getExame();

        // Painel com informações detalhadas do exame
        JPanel detalhesPanel = criarPainelExame(exame, guiaExame);

        // Adiciona o painel de detalhes no panelExame
        panelExame.add(detalhesPanel);

        panelExame.revalidate();
        panelExame.repaint();
    }

    private void resetarTela() {
        // Limpar campos de texto
        codigoField.setText("");
        nomeField.setText("");
        nascField.setText("");
        medicoCodigoField.setText("");
        medicoNomeField.setText("");
        convenioCodigoField.setText("");
        convenioNomeField.setText("");

        // Limpar lista de exames
        examesList.setModel(new DefaultListModel<>());

        // Limpar painel de exames
        panelExame.removeAll();

        // Revalidar e repintar os componentes para garantir que a interface seja atualizada
        panelExame.revalidate();
        panelExame.repaint();

        panelBtnSelecionarExames.revalidate();
        panelBtnSelecionarExames.repaint();
    }

    private JPanel criarPainelExame(Exame exame, GuiaExame guiaExame) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBackground(new Color(245, 245, 220));

        // Título do exame
        JLabel tituloLabel = new JLabel(exame.getNome());
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 24));
        tituloLabel.setBounds(20, 10, 400, 30);
        panel.add(tituloLabel);

        // Material
        JLabel materialLabel = new JLabel("Material: " + exame.getTipoMaterial());
        materialLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        materialLabel.setBounds(20, 50, 200, 20);
        panel.add(materialLabel);

        // Método
        JLabel metodoLabel = new JLabel("Método: " + exame.getMetodo());
        metodoLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        metodoLabel.setBounds(20, 70, 300, 20);
        panel.add(metodoLabel);

        // Valores de referência
        String referencias = exame.getEstruturas().isEmpty()
                ? "Sem valores de referência"
                : exame.getEstruturas().get(0).getReferencias();

        JLabel referenciaLabel = new JLabel("<html>Valores de Referência:<br>" + referencias + "</html>");
        referenciaLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        referenciaLabel.setBounds(400, 10, 200, 60);
        referenciaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(referenciaLabel);

        // Painel para campos de resultado
        JPanel camposResultadoPanel = new JPanel();
        camposResultadoPanel.setLayout(null);
        camposResultadoPanel.setBounds(20, 100, 600, 300);
        camposResultadoPanel.setBackground(new Color(245, 245, 220));
        panel.add(camposResultadoPanel);

        // Recarregar resultados salvos
        EntityManager em = EntityManagerUtil.getManager();
        List<CampoResultadoExame> resultadosSalvos = new ArrayList<>();
        try {
            resultadosSalvos = em.createQuery(
                    "SELECT c FROM CampoResultadoExame c WHERE c.resultadoExame.exame.id = :exameId AND c.resultadoExame.guia.id = :guiaId",
                    CampoResultadoExame.class)
                    .setParameter("exameId", exame.getId())
                    .setParameter("guiaId", guiaExame.getGuia().getId())
                    .getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            em.close();
        }

        int yOffset = 0; // Posição inicial para os campos
        for (EstruturaExame estrutura : exame.getEstruturas()) {
            CampoResultadoExame resultadoSalvo = resultadosSalvos.stream()
                    .filter(r -> r.getEstruturaExame().getId().equals(estrutura.getId()))
                    .findFirst()
                    .orElse(null);

            if (resultadoSalvo != null) {
                JLabel label = new JLabel(estrutura.getTexto() + ": " + resultadoSalvo.getValor());
                label.setFont(new Font("Arial", Font.PLAIN, 14));
                label.setBounds(0, yOffset, 450, 25);
                label.putClientProperty("estrutura", estrutura);
                camposResultadoPanel.add(label);
            } else {
                // Criar componentes com base no tipo
                switch (estrutura.getTipo()) {
                    case "Texto": {
                        JTextField textField = new JTextField(estrutura.getValorPadrao());
                        textField.setBounds(160, yOffset, 300, 30);
                        textField.putClientProperty("estrutura", estrutura);
                        camposResultadoPanel.add(textField);
                        break;
                    }
                    case "Número": {
                        JTextField numeroField = new JTextField(estrutura.getValorPadrao());
                        numeroField.setBounds(160, yOffset, 300, 30);
                        numeroField.putClientProperty("estrutura", estrutura);
                        numeroField.addKeyListener(new KeyAdapter() {
                            @Override
                            public void keyTyped(KeyEvent e) {
                                char c = e.getKeyChar();
                                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                                    e.consume();
                                }
                            }
                        });
                        camposResultadoPanel.add(numeroField);
                        break;
                    }
                    case "Lista de Opções": {
                        String[] opcoes = estrutura.getTexto().split(",");
                        JComboBox<String> comboBox = new JComboBox<>(opcoes);
                        comboBox.setBounds(160, yOffset, 300, 30);
                        comboBox.putClientProperty("estrutura", estrutura);
                        camposResultadoPanel.add(comboBox);
                        break;
                    }
                    default: {
                        JTextField textField = new JTextField(estrutura.getValorPadrao());
                        textField.setBounds(160, yOffset, 300, 30);
                        textField.putClientProperty("estrutura", estrutura);
                        camposResultadoPanel.add(textField);
                        break;
                    }
                }
            }
            yOffset += 40; // Incremento para o próximo campo
        }

        // Botões
        JButton salvarButton = new JButton("Salvar Resultados");
        salvarButton.setBounds(20, yOffset + 10, 200, 30);
        salvarButton.setVisible(false);
        camposResultadoPanel.add(salvarButton);

        JButton editarButton = new JButton("Editar Resultados");
        editarButton.setBounds(240, yOffset + 10, 200, 30);
        camposResultadoPanel.add(editarButton);

        editarButton.addActionListener(e -> {
            editarResultados(camposResultadoPanel);
            salvarButton.setVisible(true);
            editarButton.setVisible(false);
        });

        salvarButton.addActionListener(e -> {
            salvarResultadosExame(guiaExame, camposResultadoPanel);
            salvarButton.setVisible(false);
            editarButton.setVisible(true);
        });

        panel.setPreferredSize(new Dimension(700, yOffset + 60));
        return panel;
    }

    
    private List<CampoResultadoExame> consultarResultados(Long exameId, Long guiaId) {
        EntityManager em = EntityManagerUtil.getManager();
        List<CampoResultadoExame> resultadosSalvos = new ArrayList<>();
        try {
            resultadosSalvos = em.createQuery(
                    "SELECT c FROM CampoResultadoExame c WHERE c.resultadoExame.exame.id = :exameId AND c.resultadoExame.guia.id = :guiaId",
                    CampoResultadoExame.class)
                    .setParameter("exameId", exameId)
                    .setParameter("guiaId", guiaId)
                    .getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            em.close();
        }
        return resultadosSalvos;
    }


    private void editarResultados(JPanel camposResultadoPanel) {
        for (Component comp : camposResultadoPanel.getComponents()) {
            if (comp instanceof JLabel) {
                JLabel label = (JLabel) comp;
                EstruturaExame estrutura = (EstruturaExame) label.getClientProperty("estrutura");

                if (estrutura != null) {
                    String texto = label.getText();
                    String valor = "";

                    // Verifica se o texto contém ": " e extrai o valor após ele
                    if (texto.contains(": ")) {
                        valor = texto.split(": ", 2)[1]; // Divide no máximo em 2 partes
                    } else {
                        System.err.println("Texto da JLabel não está no formato esperado: " + texto);
                    }

                    // Substituir JLabel pelo componente correspondente
                    switch (estrutura.getTipo()) {
                        case "Texto": {
                            JTextField textField = new JTextField(valor);
                            textField.setBounds(label.getBounds());
                            textField.putClientProperty("estrutura", estrutura);
                            camposResultadoPanel.add(textField);
                            break;
                        }
                        case "Número": {
                            JTextField numeroField = new JTextField(valor);
                            numeroField.setBounds(label.getBounds());
                            numeroField.putClientProperty("estrutura", estrutura);

                            // Adiciona validador para aceitar apenas números
                            numeroField.addKeyListener(new KeyAdapter() {
                                @Override
                                public void keyTyped(KeyEvent e) {
                                    char c = e.getKeyChar();
                                    if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                                        e.consume();
                                    }
                                }
                            });

                            camposResultadoPanel.add(numeroField);
                            break;
                        }
                        case "Lista de Opções": {
                            String[] opcoes = estrutura.getTexto() != null ? estrutura.getTexto().split(",") : new String[]{};
                            JComboBox<String> comboBox = new JComboBox<>(opcoes);
                            comboBox.setBounds(label.getBounds());
                            comboBox.putClientProperty("estrutura", estrutura);

                            // Seleciona o valor atual, se existir
                            if (!valor.isEmpty()) {
                                comboBox.setSelectedItem(valor);
                            }

                            camposResultadoPanel.add(comboBox);
                            break;
                        }
                        default: {
                            JTextField textField = new JTextField(valor);
                            textField.setBounds(label.getBounds());
                            textField.putClientProperty("estrutura", estrutura);
                            camposResultadoPanel.add(textField);
                            break;
                        }
                    }

                    // Remove o JLabel após substituir
                    camposResultadoPanel.remove(label);
                }
            }
        }

        // Atualiza o painel após modificar os componentes
        camposResultadoPanel.revalidate();
        camposResultadoPanel.repaint();
    }

    
    private void salvarResultadosExame(GuiaExame guiaExame, JPanel camposResultadoPanel) {
        CampoResultadoDAO campoResultadoDAO = new CampoResultadoDAOImp(EntityManagerUtil.getManager());
        try {
            // Busca ou cria o ResultadoExame
            ResultadoExame resultadoExame = campoResultadoDAO.criarOuBuscarResultadoExame(
                    guiaExame.getExame().getId(),
                    guiaExame.getGuia().getId()
            );

            // Itera pelos componentes do painel para salvar os resultados
            for (Component comp : camposResultadoPanel.getComponents()) {
                if (comp instanceof JComponent) {
                    JComponent inputField = (JComponent) comp;
                    String valor = null;
                    EstruturaExame estrutura = (EstruturaExame) inputField.getClientProperty("estrutura");

                    if (estrutura == null) {
                        continue;
                    }

                    // Captura o valor baseado no tipo do componente
                    if (inputField instanceof JTextField) {
                        valor = ((JTextField) inputField).getText();
                    } else if (inputField instanceof JComboBox) {
                        valor = ((JComboBox<?>) inputField).getSelectedItem() != null
                                ? ((JComboBox<?>) inputField).getSelectedItem().toString()
                                : "";
                    }

                    if (valor == null || valor.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Preencha todos os campos antes de salvar.");
                        return;
                    }

                    // Busca ou cria o CampoResultadoExame
                    CampoResultadoExame campoResultado = campoResultadoDAO.buscarPorEstruturaEResultado(
                            estrutura.getId(), resultadoExame.getId()
                    );

                    if (campoResultado == null) {
                        campoResultado = new CampoResultadoExame();
                        campoResultado.setEstruturaExame(estrutura);
                        campoResultado.setResultadoExame(resultadoExame);
                    }
                    campoResultado.setValor(valor);

                    // Salva o resultado
                    campoResultadoDAO.salvar(campoResultado);
                }
            }

            // Atualiza o status do exame para "Incluído"
            guiaExame.setStatus("Incluído");
            JOptionPane.showMessageDialog(this, "Resultados salvos com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao salvar resultados: " + e.getMessage());
        }
    }










}
