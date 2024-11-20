package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.ConvenioDAO;
import br.unipar.projetolab.dao.ConvenioDAOImp;
import br.unipar.projetolab.interfaces.ConvenioListener;
import br.unipar.projetolab.models.Convenio;
import br.unipar.projetolab.tablemodels.ConvenioTableModel;
import br.unipar.projetolab.utils.EntityManagerUtil;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;


public class ConvenioPesquisaFrame extends javax.swing.JFrame {
    
    private ConvenioTableModel tableModel;
    private ConvenioListener convenioListener; // Listener para comunicação
    private boolean modoInativacao; // Define se o frame está no modo inativação
    
    public ConvenioPesquisaFrame(ConvenioListener convenioListener) {
        this.convenioListener = convenioListener;
        initComponents();
        carregarConvenios();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pesquisaPacienteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selecionarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        conveniosTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/convenio-icon.png"))); // NOI18N

        pesquisaPacienteBtn.setBackground(new java.awt.Color(243, 255, 229));
        pesquisaPacienteBtn.setForeground(new java.awt.Color(0, 0, 0));
        pesquisaPacienteBtn.setText("Pesquisar");
        pesquisaPacienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaPacienteBtnActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Pesquisar Convenio");

        cancelarBtn.setBackground(new java.awt.Color(243, 255, 229));
        cancelarBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        jTextField1.setText("Insira o nome do convenio aqui");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        conveniosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        conveniosTable.setColumnSelectionAllowed(true);
        conveniosTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(conveniosTable);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void pesquisaPacienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaPacienteBtnActionPerformed
        String nome = jTextField1.getText();
        if (nome.isEmpty() || nome.equals("Insira o nome do convênio aqui")) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um nome para a pesquisa.");
            return;
        }

        ConvenioDAOImp convenioDAO = new ConvenioDAOImp(EntityManagerUtil.getManager());
        List<Convenio> convenios = convenioDAO.findByName(nome);

        if (convenios.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum convênio encontrado com o nome: " + nome);
        } else {
            tableModel = new ConvenioTableModel(convenios);
            conveniosTable.setModel(tableModel);
        }
    }//GEN-LAST:event_pesquisaPacienteBtnActionPerformed

    private void selecionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarBtnActionPerformed
        int selectedRow = conveniosTable.getSelectedRow();
        if (selectedRow != -1) {
            Convenio convenioSelecionado = tableModel.getConvenioAt(selectedRow);

            if (convenioListener != null) {
                if (modoInativacao) {
                    inativarConvenio(convenioSelecionado); // Inativar
                } else {
                    convenioListener.onConvenioSelecionado(convenioSelecionado); // Editar
                }
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um convênio.");
        }
    }//GEN-LAST:event_selecionarBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if(jTextField1.getText().equals("Insira o nome do convenio aqui")){
            jTextField1.setText("");
            jTextField1.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().equals("")) {
            jTextField1.setText("Insira o nome do convenio aqui");
            jTextField1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextField1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTable conveniosTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton pesquisaPacienteBtn;
    private javax.swing.JButton selecionarBtn;
    // End of variables declaration//GEN-END:variables

    private void carregarConvenios() {
        ConvenioDAOImp convenioDAO = new ConvenioDAOImp(EntityManagerUtil.getManager());
        List<Convenio> convenios = convenioDAO.findAll();
        tableModel = new ConvenioTableModel(convenios);
        conveniosTable.setModel(tableModel);
    }

    private void inativarConvenio(Convenio convenioSelecionado) {
        int confirm = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja inativar este convênio?",
                "Confirmar Inativação", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            convenioSelecionado.setAtivo(false);
            ConvenioDAOImp convenioDAO = new ConvenioDAOImp(EntityManagerUtil.getManager());
            convenioDAO.inativarConvenio(convenioSelecionado);

            JOptionPane.showMessageDialog(this, "Convênio inativado com sucesso!");
            carregarConvenios();
        }
    }
    public void setModoExclusao(boolean modoInativacao) {
        this.modoInativacao = modoInativacao;
    }
}
