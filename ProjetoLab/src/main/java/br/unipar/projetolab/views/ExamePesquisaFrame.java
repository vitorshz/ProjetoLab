package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.ExameDAO;
import br.unipar.projetolab.dao.ExameDAOImp;
import br.unipar.projetolab.interfaces.ExameSelecionadoListener;
import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.tablemodels.ExameTableModel;
import br.unipar.projetolab.utils.EntityManagerUtil;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExamePesquisaFrame extends javax.swing.JFrame {

    private ExameTableModel tableModel;
    private ExameSelecionadoListener listener;
    private boolean modoExclusao;
    
    public ExamePesquisaFrame(ExameSelecionadoListener listener, boolean modoExclusao) {
        FlatLightLaf.setup();
        this.listener = listener;
        this.modoExclusao = modoExclusao;  
        initComponents();
        carregarExames();
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pesquisaBtn = new javax.swing.JButton();
        selecionarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examesTable = new javax.swing.JTable();
        cancelarBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        pesquisaBtn.setBackground(new java.awt.Color(243, 255, 229));
        pesquisaBtn.setForeground(new java.awt.Color(0, 0, 0));
        pesquisaBtn.setText("Pesquisar");
        pesquisaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaBtnActionPerformed(evt);
            }
        });

        selecionarBtn.setBackground(new java.awt.Color(243, 255, 229));
        selecionarBtn.setForeground(new java.awt.Color(0, 0, 0));
        selecionarBtn.setText("Selecionar");
        selecionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Pesquisa de Exames");

        examesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Abreviacao", "Nome", "Preco Padrao", "Metodo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        examesTable.setColumnSelectionAllowed(true);
        examesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(examesTable);
        examesTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        cancelarBtn.setBackground(new java.awt.Color(243, 255, 229));
        cancelarBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exame-64px.png"))); // NOI18N

        jTextField1.setText("Insira o nome do exame aqui");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

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

    private void pesquisaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaBtnActionPerformed
        String nome = jTextField1.getText();
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um nome para a pesquisa.");
            return;
        }
        ExameDAOImp exameDAO = new ExameDAOImp(EntityManagerUtil.getManager());
        List<Exame> examesEncontrados = exameDAO.findByName(nome);

        if (examesEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum exame encontrado com o nome: " + nome);
        } else {
            tableModel = new ExameTableModel(examesEncontrados);
            examesTable.setModel(tableModel);
        }
    }//GEN-LAST:event_pesquisaBtnActionPerformed

    private void selecionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarBtnActionPerformed
        int selectedRow = examesTable.getSelectedRow();
        if (selectedRow != -1) {
            Exame exameSelecionado = tableModel.getExameAt(selectedRow); // Obtém o exame selecionado do modelo
            if (modoExclusao) {
                inativarExame(exameSelecionado); // Inativa o exame se estiver no modo de exclusão
            } else if (listener != null) {
                listener.receberExame(exameSelecionado); // Passa o exame selecionado para o listener
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um exame antes de continuar.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_selecionarBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if(jTextField1.getText().equals("Insira o nome do exame aqui")){
            jTextField1.setText("");
            jTextField1.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().isEmpty()) {
            jTextField1.setText("Insira o nome do exame aqui");
            jTextField1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextField1FocusLost

    
    private void carregarExames() {
        ExameDAOImp exameDAO = new ExameDAOImp(EntityManagerUtil.getManager());
        List<Exame> exames = exameDAO.findAllAtivos();
        tableModel = new ExameTableModel(exames);
        examesTable.setModel(tableModel);
    }
    private void inativarExame(Exame exameSelecionado) {
        // Confirmar antes de inativar
        int confirm = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja inativar este Exame?",
                "Confirmar Inativação", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            exameSelecionado.setAtivo(false);  // Inativa o convênio

            ExameDAO exameDAO = new ExameDAOImp(EntityManagerUtil.getManager());
            exameDAO.save(exameSelecionado);  // Atualiza o status no banco

            JOptionPane.showMessageDialog(this, "Exame inativado com sucesso.");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTable examesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton pesquisaBtn;
    private javax.swing.JButton selecionarBtn;
    // End of variables declaration//GEN-END:variables

}
