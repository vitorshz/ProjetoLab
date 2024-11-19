
package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.PacienteDAOImp;
import br.unipar.projetolab.interfaces.PacienteSelecionadoListener;
import br.unipar.projetolab.models.Paciente;
import br.unipar.projetolab.tablemodels.PacienteTableModel;
import br.unipar.projetolab.utils.EntityManagerUtil;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PacientePesquisaFrame extends javax.swing.JFrame {

    private PacienteTableModel tableModel;
    private final PacienteSelecionadoListener listener;
    private boolean modoExclusao;  

    
    public PacientePesquisaFrame(PacienteSelecionadoListener listener) {
        this.listener = listener;
        initComponents();
        setLocationRelativeTo(null); // Centraliza a janela
        carregarDados();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        selecionarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pesquisaPacienteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        selecionarBtn.setBackground(new java.awt.Color(243, 255, 229));
        selecionarBtn.setForeground(new java.awt.Color(0, 0, 0));
        selecionarBtn.setText("Selecionar");
        selecionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setBackground(new java.awt.Color(243, 255, 229));
        cancelarBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        jTextField1.setText("Insira o nome do paciente aqui");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        pesquisaPacienteBtn.setBackground(new java.awt.Color(243, 255, 229));
        pesquisaPacienteBtn.setForeground(new java.awt.Color(0, 0, 0));
        pesquisaPacienteBtn.setText("Pesquisar");
        pesquisaPacienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaPacienteBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Pesquisar Paciente");

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
                            .addComponent(pesquisaPacienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pesquisaPacienteBtn)
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

    private void selecionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarBtnActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            Paciente pacienteSelecionado = tableModel.getPacienteAt(selectedRow); // Obtém o paciente selecionado
            if (listener != null) {
                listener.receberPaciente(pacienteSelecionado); // Envia o paciente de volta
            }
            this.dispose(); // Fecha o frame
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um paciente.");
        }
    
    }//GEN-LAST:event_selecionarBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        this.dispose(); // Fecha a tela de pesquisa
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void pesquisaPacienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaPacienteBtnActionPerformed
        String nome = jTextField1.getText();
        if (nome.isEmpty() || nome.equals("Insira o nome do paciente aqui")) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um nome para a pesquisa.");
            return;
        }

        PacienteDAOImp pacienteDAO = new PacienteDAOImp(EntityManagerUtil.getManager());
        List<Paciente> pacientesEncontrados = pacienteDAO.findByName(nome);

        if (pacientesEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum paciente encontrado com o nome: " + nome);
        } else {
            tableModel = new PacienteTableModel(pacientesEncontrados);
            jTable1.setModel(tableModel);
        }
    }//GEN-LAST:event_pesquisaPacienteBtnActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton pesquisaPacienteBtn;
    private javax.swing.JButton selecionarBtn;
    // End of variables declaration//GEN-END:variables

    private void carregarDados() {
        PacienteDAOImp pacienteDAO = new PacienteDAOImp(EntityManagerUtil.getManager());
        List<Paciente> pacientes = pacienteDAO.findAllAtivos();
        tableModel = new PacienteTableModel(pacientes);
        jTable1.setModel(tableModel);
    }

}
