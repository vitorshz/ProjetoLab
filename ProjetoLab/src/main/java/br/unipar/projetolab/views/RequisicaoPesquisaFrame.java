
package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.GuiaDAO;
import br.unipar.projetolab.dao.GuiaDAOImp;
import br.unipar.projetolab.interfaces.GuiaListener;
import br.unipar.projetolab.models.Guia;
import br.unipar.projetolab.tablemodels.GuiaTableModel;
import br.unipar.projetolab.utils.EntityManagerUtil;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class RequisicaoPesquisaFrame extends javax.swing.JFrame {
    private GuiaTableModel tableModel; // Modelo para exibição das guias
    private GuiaListener guiaListener;

   
    public RequisicaoPesquisaFrame(GuiaListener guiaListener) {
        initComponents();
        this.guiaListener = guiaListener;
        tableModel = new GuiaTableModel(new ArrayList<>());
        jTable1.setModel(tableModel); // Configura a tabela com o modelo\
        carregarGuias();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        selecionarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cancelarBtn = new javax.swing.JButton();
        pesquisaBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.setText("Insira o nome do paciente aqui");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        selecionarBtn.setBackground(new java.awt.Color(243, 255, 229));
        selecionarBtn.setForeground(new java.awt.Color(0, 0, 0));
        selecionarBtn.setText("Selecionar");
        selecionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data Nasc.", "Endereco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        cancelarBtn.setBackground(new java.awt.Color(243, 255, 229));
        cancelarBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        pesquisaBtn.setBackground(new java.awt.Color(243, 255, 229));
        pesquisaBtn.setForeground(new java.awt.Color(0, 0, 0));
        pesquisaBtn.setText("Pesquisar");
        pesquisaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Pesquisar Guia");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisa-usuario.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancelarBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selecionarBtn)
                            .addComponent(pesquisaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pesquisaBtn)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecionarBtn)
                    .addComponent(cancelarBtn))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if(jTextField1.getText().equals("Insira o nome do paciente aqui")){
            jTextField1.setText("");
            jTextField1.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().equals("")) {
            jTextField1.setText("Insira o nome do paciente aqui");
            jTextField1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void selecionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarBtnActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma guia na tabela.");
            return;
        }

        Guia guiaSelecionada = tableModel.getGuiaAt(selectedRow);

        if (guiaListener != null) {
            guiaListener.onGuiaSelecionada(guiaSelecionada); // Notifica o listener
        }

        this.dispose(); // Fecha o frame de pesquisa
    }//GEN-LAST:event_selecionarBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        this.dispose(); // Fecha a tela de pesquisa
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void pesquisaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaBtnActionPerformed
        String nomePaciente = jTextField1.getText().trim();

        if (nomePaciente.isEmpty() || nomePaciente.equals("Insira o nome do paciente aqui")) {
            JOptionPane.showMessageDialog(this, "Por favor, insira o nome do paciente para realizar a pesquisa.");
            return;
        }

        try {
            GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());
            List<Guia> guiasEncontradas = guiaDAO.findByNomePaciente(nomePaciente);

            if (guiasEncontradas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhuma guia encontrada para o paciente: " + nomePaciente);
            } else {
                tableModel.setGuias(guiasEncontradas); // Atualiza a tabela com os resultados
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar guias: " + e.getMessage());
        }
    }//GEN-LAST:event_pesquisaBtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton pesquisaBtn;
    private javax.swing.JButton selecionarBtn;
    // End of variables declaration//GEN-END:variables


    private void carregarGuias() {
        GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());
        List<Guia> guias = guiaDAO.findAll();
        tableModel = new GuiaTableModel(guias);
        jTable1.setModel(tableModel);
    }
}
