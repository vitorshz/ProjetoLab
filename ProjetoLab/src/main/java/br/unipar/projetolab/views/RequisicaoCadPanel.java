package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.GuiaDAO;
import br.unipar.projetolab.dao.GuiaDAOImp;
import br.unipar.projetolab.interfaces.ConvenioListener;
import br.unipar.projetolab.interfaces.MedicoListener;
import br.unipar.projetolab.interfaces.PacienteSelecionadoListener;
import br.unipar.projetolab.models.Convenio;
import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.models.Guia;
import br.unipar.projetolab.models.GuiaExame;
import br.unipar.projetolab.models.Medico;
import br.unipar.projetolab.models.Paciente;
import br.unipar.projetolab.models.RequisicaoModel;
import br.unipar.projetolab.utils.EntityManagerUtil;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;


public class RequisicaoCadPanel extends javax.swing.JPanel {
    
    private Guia guiaAtual; // Representa a guia em edição ou criação
    private List<GuiaExame> examesDaGuia; // Lista de exames associados à guia
    private Paciente pacienteSelecionado; // Paciente selecionado
    private Medico medicoSelecionado; // Médico selecionado
    private Convenio convenioSelecionado; // Convênio selecionado
    private javax.swing.JPanel telaPrincipal;
    private RequisicaoModel requisicaoModel;
    private MaskFormatter  mfcelular;
    
    public RequisicaoCadPanel(javax.swing.JPanel telaPrincipal, RequisicaoModel requisicaoModel) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
        this.requisicaoModel = requisicaoModel;
        carregarDados();
        
        try {
            MaskFormatter mfcelular = new MaskFormatter("(##) #####-####");

        } catch (Exception e) {
            System.out.println("Erro ao criar a mascara");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        excluirBtn = new javax.swing.JButton();
        novoBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        salvarBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        PacinomeGFild = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Sexofild = new javax.swing.JTextField();
        PaciCodGFild = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ReqFild2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        NasciFild = new javax.swing.JTextField();
        idadeFild = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Conveniofild = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        medicoNomeField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        MatriFild = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        guiafild = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        CarSusfild = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        datafild = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        faturafild = new javax.swing.JTextField();
        ProcedimenFild = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        pesquisaMédicobtn = new javax.swing.JButton();
        pesquisaPacientebtn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        SituFild1 = new javax.swing.JTextField();
        pesquisaConveniobtn1 = new javax.swing.JButton();
        medicoCRM = new javax.swing.JTextField();
        medicoCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        telefoneField = new javax.swing.JFormattedTextField(mfcelular);
        fecharBtn = new javax.swing.JButton();
        Anteriobtn = new javax.swing.JButton();
        ProxiBtn = new javax.swing.JButton();

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

        jPanel3.setBackground(new java.awt.Color(228, 228, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informações da requisição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Paciente*:");
        jLabel14.setToolTipText("");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, -1));

        PacinomeGFild.setEditable(false);
        PacinomeGFild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacinomeGFildActionPerformed(evt);
            }
        });
        jPanel3.add(PacinomeGFild, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 340, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Sexo:");
        jLabel15.setToolTipText("");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 50, -1));

        Sexofild.setEditable(false);
        jPanel3.add(Sexofild, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 120, -1));

        PaciCodGFild.setEditable(false);
        jPanel3.add(PaciCodGFild, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 70, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Req..*:");
        jLabel16.setToolTipText("");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, -1));

        ReqFild2.setEditable(false);
        jPanel3.add(ReqFild2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 70, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Situação:");
        jLabel17.setToolTipText("");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 70, -1));

        NasciFild.setEditable(false);
        jPanel3.add(NasciFild, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 120, -1));

        idadeFild.setEditable(false);
        jPanel3.add(idadeFild, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 120, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Idade:");
        jLabel18.setToolTipText("");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 50, -1));

        Conveniofild.setEditable(false);
        jPanel3.add(Conveniofild, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 110, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Nasc..:");
        jLabel19.setToolTipText("");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, -1));

        medicoNomeField.setEditable(false);
        jPanel3.add(medicoNomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 210, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Guia:");
        jLabel20.setToolTipText("");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 50, -1));

        MatriFild.setEditable(false);
        jPanel3.add(MatriFild, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 110, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Convênio*:");
        jLabel21.setToolTipText("");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, -1));

        guiafild.setEditable(false);
        jPanel3.add(guiafild, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 120, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Procedimento:*");
        jLabel22.setToolTipText("");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        CarSusfild.setEditable(false);
        jPanel3.add(CarSusfild, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 300, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Matricula:");
        jLabel23.setToolTipText("");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, -1));

        datafild.setEditable(false);
        datafild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datafildActionPerformed(evt);
            }
        });
        jPanel3.add(datafild, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 120, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Cartão SUS:");
        jLabel24.setToolTipText("");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Data:");
        jLabel25.setToolTipText("");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, -1));

        faturafild.setEditable(false);
        jPanel3.add(faturafild, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 120, -1));

        ProcedimenFild.setEditable(false);
        jPanel3.add(ProcedimenFild, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 560, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Fatura:");
        jLabel26.setToolTipText("");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, -1));

        pesquisaMédicobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        pesquisaMédicobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaMédicobtnActionPerformed(evt);
            }
        });
        jPanel3.add(pesquisaMédicobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 30, -1));

        pesquisaPacientebtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        pesquisaPacientebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaPacientebtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(pesquisaPacientebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 30, -1));

        jLabel4.setText("CRM:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        SituFild1.setEditable(false);
        jPanel3.add(SituFild1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 120, -1));

        pesquisaConveniobtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        pesquisaConveniobtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaConveniobtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(pesquisaConveniobtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 30, -1));

        medicoCRM.setEditable(false);
        medicoCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicoCRMActionPerformed(evt);
            }
        });
        jPanel3.add(medicoCRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 90, -1));

        medicoCodigo.setEditable(false);
        medicoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicoCodigoActionPerformed(evt);
            }
        });
        jPanel3.add(medicoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 90, -1));

        jLabel5.setText("Médico*:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Sexo:");
        jLabel27.setToolTipText("");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 50, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Telefone:");
        jLabel28.setToolTipText("");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 60, -1));
        jPanel3.add(telefoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 60, 170, -1));

        fecharBtn.setBackground(new java.awt.Color(243, 255, 229));
        fecharBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-excluir 1.png"))); // NOI18N
        fecharBtn.setText("Fechar");
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        Anteriobtn.setBackground(new java.awt.Color(243, 255, 229));
        Anteriobtn.setText("Anterior");
        Anteriobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriobtnActionPerformed(evt);
            }
        });

        ProxiBtn.setBackground(new java.awt.Color(243, 255, 229));
        ProxiBtn.setText("Proximo");
        ProxiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProxiBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fecharBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(novoBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBtn))
                            .addComponent(Anteriobtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProxiBtn)
                            .addComponent(salvarBtn))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProxiBtn)
                    .addComponent(Anteriobtn))
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

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
//        RequisicaoPesquisaFrame pesquisaFrame = new RequisicaoPesquisaFrame(guia -> {
//            if (guia != null) {
//                excluirGuia(guia); // Inativa a guia selecionada
//            }
//        });
//        pesquisaFrame.setVisible(true);
//        
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void novoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtnActionPerformed
        guiaAtual = new Guia();
        examesDaGuia = new ArrayList<>();
        habilitarCamposParaNovo();
    }//GEN-LAST:event_novoBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // Abre o frame de pesquisa de requisições para edição
        RequisicaoPesquisaFrame pesquisaFrame = new RequisicaoPesquisaFrame(guia -> {
            if (guia != null) {
                carregarGuia(guia); // Carrega os dados da guia selecionada no formulário
            }
        });
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        try {
            // Validações
            if (pacienteSelecionado == null) {
                JOptionPane.showMessageDialog(this, "Selecione um paciente.");
                return;
            }

            if (medicoSelecionado == null) {
                JOptionPane.showMessageDialog(this, "Selecione um médico.");
                return;
            }

            if (convenioSelecionado == null) {
                JOptionPane.showMessageDialog(this, "Selecione um convênio.");
                return;
            }

            if (examesDaGuia.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Adicione pelo menos um exame à guia.");
                return;
            }

            // Configurar a guia
            guiaAtual.setPaciente(pacienteSelecionado);
            guiaAtual.setMedico(medicoSelecionado);
            guiaAtual.setConvenio(convenioSelecionado);
            guiaAtual.setDataCadastro(LocalDateTime.now());
            guiaAtual.setExames(examesDaGuia);

            // Calcular valores, se necessário
            if ("Particular".equalsIgnoreCase(convenioSelecionado.getNome())) {
                double total = examesDaGuia.stream().mapToDouble(GuiaExame::getPreco).sum();
                double valorPago = Double.parseDouble(faturafild.getText());
                guiaAtual.setValorTotal(total);
                guiaAtual.setValorPago(valorPago);
                guiaAtual.setValorDevido(total - valorPago);
            }

            // Salvar no banco
            GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());
            if (guiaAtual.getId() == null) {
                guiaDAO.save(guiaAtual);
                JOptionPane.showMessageDialog(this, "Guia salva com sucesso!");
            } else {
                guiaDAO.update(guiaAtual);
                JOptionPane.showMessageDialog(this, "Guia atualizada com sucesso!");
            }

            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar a guia: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_salvarBtnActionPerformed

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed

    }//GEN-LAST:event_fecharBtnActionPerformed

    private void AnteriobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnteriobtnActionPerformed

    private void ProxiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProxiBtnActionPerformed
        // Validar os dados
        if (!validarCampos()) {
            return; // Interrompe se os campos obrigatórios não estiverem preenchidos
        }

        try {
            // Verificar se a guia está carregada no modelo
            if (requisicaoModel.getGuiaselecionada() == null) {
                // Criar uma nova guia caso não exista
                Guia guia = new Guia();
                guia.setPaciente(requisicaoModel.getPacienteSelecionado());
                guia.setMedico(requisicaoModel.getMedicoSelecionado());
                guia.setConvenio(requisicaoModel.getConvenioSelecionado());
                guia.setCartaoSUS(requisicaoModel.getCartaoSUS());
                guia.setParticular(requisicaoModel.getConvenioSelecionado() == null);
                guia.setDataCadastro(LocalDateTime.now());

                // Salvar a guia no banco
                GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());
                guiaDAO.save(guia);

                // Atualizar o modelo com a nova guia
                requisicaoModel.setGuiaselecionada(guia);
            }

            // Avançar para a próxima tela
            RequisicaoExamesPanel requisicaoExamesPanel = new RequisicaoExamesPanel(telaPrincipal, requisicaoModel);
            telaPrincipal.removeAll();
            telaPrincipal.add(requisicaoExamesPanel, java.awt.BorderLayout.CENTER);
            telaPrincipal.revalidate();
            telaPrincipal.repaint();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar a guia: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ProxiBtnActionPerformed

    private void PacinomeGFildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacinomeGFildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PacinomeGFildActionPerformed

    private void pesquisaMédicobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaMédicobtnActionPerformed
        MedicoPesquisaFrame pesquisaFrame = new MedicoPesquisaFrame(new MedicoListener() {
            @Override
            public void onMedicoSelecionado(Medico medico) {
                
                requisicaoModel.setMedicoSelecionado(medico);
                medicoSelecionado = medico;
                medicoCodigo.setText(String.valueOf(medico.getId()));
                medicoNomeField.setText(medico.getNome());
                medicoCRM.setText(String.valueOf(medico.getConselhoCrm()));
            }

            @Override
            public void onMedicoInativar(Medico medico) {
                // Não utilizado aqui
            }

        });
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_pesquisaMédicobtnActionPerformed

    private void pesquisaPacientebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaPacientebtn1ActionPerformed

        PacientePesquisaFrame pesquisaFrame = new PacientePesquisaFrame(new PacienteSelecionadoListener() {
            @Override
            public void receberPaciente(Paciente paciente) {
                requisicaoModel.setPacienteSelecionado(paciente); // Atualiza o modelo
                pacienteSelecionado = paciente;
                PacinomeGFild.setText(paciente.getNome());
                PaciCodGFild.setText(String.valueOf(paciente.getId()));
                NasciFild.setText(paciente.getDataNascimento().toString());
                idadeFild.setText(String.valueOf(paciente.calcularIdade()));
                Sexofild.setText(paciente.getSexo());
                telefoneField.setText(paciente.getTelefone());
            }

            @Override
            public void receberPacienteParaInativar(Paciente pacienteSelecionado) {
                //não é utilizado
            }
        });
        pesquisaFrame.setVisible(true);
        
        
    }//GEN-LAST:event_pesquisaPacientebtn1ActionPerformed

    private void pesquisaConveniobtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaConveniobtn1ActionPerformed
        ConvenioPesquisaFrame pesquisaFrame = new ConvenioPesquisaFrame(new ConvenioListener() {
            @Override
            public void onConvenioSelecionado(Convenio convenio) {
                requisicaoModel.setConvenioSelecionado(convenio);
                convenioSelecionado = convenio;
                Conveniofild.setText(String.valueOf(convenio.getId()));
                MatriFild.setText(convenio.getNome()); // Caso o convênio tenha uma matrícula específica
            }
        }); 
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_pesquisaConveniobtn1ActionPerformed

    private void medicoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicoCodigoActionPerformed

    private void datafildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datafildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datafildActionPerformed

    private void medicoCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicoCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicoCRMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anteriobtn;
    private javax.swing.JTextField CarSusfild;
    private javax.swing.JTextField Conveniofild;
    private javax.swing.JTextField MatriFild;
    private javax.swing.JTextField NasciFild;
    private javax.swing.JTextField PaciCodGFild;
    private javax.swing.JTextField PacinomeGFild;
    private javax.swing.JTextField ProcedimenFild;
    private javax.swing.JButton ProxiBtn;
    private javax.swing.JTextField ReqFild2;
    private javax.swing.JTextField Sexofild;
    private javax.swing.JTextField SituFild1;
    private javax.swing.JTextField datafild;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JTextField faturafild;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JTextField guiafild;
    private javax.swing.JTextField idadeFild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField medicoCRM;
    private javax.swing.JTextField medicoCodigo;
    private javax.swing.JTextField medicoNomeField;
    private javax.swing.JButton novoBtn;
    private javax.swing.JButton pesquisaConveniobtn1;
    private javax.swing.JButton pesquisaMédicobtn;
    private javax.swing.JButton pesquisaPacientebtn1;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JFormattedTextField telefoneField;
    // End of variables declaration//GEN-END:variables

    private void configurarCampos() {
        limparCampos();
        desabilitarCampos();
        guiaAtual = new Guia();
    }

    private void limparCampos() {
        PacinomeGFild.setText("");
        PaciCodGFild.setText("");
        NasciFild.setText("");
        idadeFild.setText("");
        Sexofild.setText("");
        Conveniofild.setText("");
        MatriFild.setText("");
        CarSusfild.setText("");
        datafild.setText("");
        faturafild.setText("");
        ProcedimenFild.setText("");
        SituFild1.setText("");
        guiafild.setText("");
        medicoNomeField.setText("");
        medicoCRM.setText("");
        medicoCodigo.setText("");
    }

    private void desabilitarCampos() {
        PacinomeGFild.setEditable(false);
        PaciCodGFild.setEditable(false);
        NasciFild.setEditable(false);
        idadeFild.setEditable(false);
        Sexofild.setEditable(false);
        Conveniofild.setEditable(false);
        MatriFild.setEditable(false);
        CarSusfild.setEditable(false);
        datafild.setEditable(false);
        faturafild.setEditable(false);
        ProcedimenFild.setEditable(false);
        SituFild1.setEditable(false);
        guiafild.setEditable(false);
        medicoNomeField.setEditable(false);
        medicoCRM.setEditable(false);
        medicoCodigo.setEditable(false);
    }

    private void carregarDados() {
        if (requisicaoModel.getPacienteSelecionado() != null) {
            PacinomeGFild.setText(requisicaoModel.getPacienteSelecionado().getNome());
            PaciCodGFild.setText(String.valueOf(requisicaoModel.getPacienteSelecionado().getId()));
            NasciFild.setText(requisicaoModel.getPacienteSelecionado().getDataNascimento().toString());
            idadeFild.setText(String.valueOf(requisicaoModel.getPacienteSelecionado().calcularIdade()));
            Sexofild.setText(requisicaoModel.getPacienteSelecionado().getSexo());
            CarSusfild.setText(requisicaoModel.getCartaoSUS());
        }

        if (requisicaoModel.getMedicoSelecionado() != null) {
            medicoNomeField.setText(requisicaoModel.getMedicoSelecionado().getNome());
            medicoCodigo.setText(String.valueOf(requisicaoModel.getMedicoSelecionado().getId()));
            medicoCRM.setText(requisicaoModel.getMedicoSelecionado().getConselhoCrm());
        }

        if (requisicaoModel.getConvenioSelecionado() != null) {
            Conveniofild.setText(requisicaoModel.getConvenioSelecionado().getNome());
            MatriFild.setText(String.valueOf(requisicaoModel.getConvenioSelecionado().getId()));
        }

        SituFild1.setText(requisicaoModel.getSituacao());
        ProcedimenFild.setText(requisicaoModel.getProcedimento());
        datafild.setText(requisicaoModel.getDataRequisicao());
        faturafild.setText(requisicaoModel.getFaturamento());
    }

    private boolean validarCampos() {
        boolean isValid = true;
        StringBuilder erros = new StringBuilder("Corrija os seguintes erros:\n");

        if (requisicaoModel.getPacienteSelecionado() == null) {
            erros.append("- Selecione um paciente.\n");
            isValid = false;
        }

        if (requisicaoModel.getMedicoSelecionado() == null) {
            erros.append("- Selecione um médico.\n");
            isValid = false;
        }

        if (requisicaoModel.getConvenioSelecionado() == null) {
            erros.append("- Selecione um convênio.\n");
            isValid = false;
        }

        if (!isValid) {
            JOptionPane.showMessageDialog(this, erros.toString(), "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        }

        return isValid;
    }
    private void habilitarCamposParaEdicao() {
        faturafild.setEditable(true);
        ProcedimenFild.setEditable(true);
        SituFild1.setEditable(true);

        pesquisaPacientebtn1.setEnabled(false);
        pesquisaMédicobtn.setEnabled(false);
        pesquisaConveniobtn1.setEnabled(false);
    }

    private void habilitarCamposParaNovo() {
        limparCampos();
        faturafild.setEditable(true);
        ProcedimenFild.setEditable(true);
        SituFild1.setEditable(true);

        pesquisaPacientebtn1.setEnabled(true);
        pesquisaMédicobtn.setEnabled(true);
        pesquisaConveniobtn1.setEnabled(true);
    }

//    private void excluirGuia(Guia guia) {
//        int confirm = JOptionPane.showConfirmDialog(this,
//                "Tem certeza que deseja excluir? esta guia?",
//                "Confirmar Inativação", JOptionPane.YES_NO_OPTION);
//
//        if (confirm == JOptionPane.YES_OPTION) {
//            try {
//                guia.setAtivo(false); // Marca a guia como inativa
//
//                GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());
//                guiaDAO.update(guia); // Atualiza a guia no banco de dados
//
//                JOptionPane.showMessageDialog(this, "Guia inativada com sucesso!");
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, "Erro ao inativar a guia: " + e.getMessage());
//            }
//        }
//    }

    private void carregarGuia(Guia guia) {
        if (guia != null) {
            // Preenchendo os dados gerais da guia
            guiafild.setText(guia.getId() != null ? guia.getId().toString() : ""); // Código da guia
            PaciCodGFild.setText(guia.getPaciente().getId().toString()); // Código do paciente
            PacinomeGFild.setText(guia.getPaciente().getNome()); // Nome do paciente
            NasciFild.setText(guia.getPaciente().getDataNascimento().toString()); // Data de nascimento
            idadeFild.setText(String.valueOf(guia.getPaciente().calcularIdade())); // Idade do paciente
            Conveniofild.setText(guia.getConvenio().getNome()); // Nome do convênio
            MatriFild.setText(guia.getConvenio().getNome()); // Matrícula do convênio
            datafild.setText(guia.getDataCadastro().toString()); // Data de cadastro
            
            requisicaoModel.setPacienteSelecionado(guia.getPaciente());
            requisicaoModel.setMedicoSelecionado(guia.getMedico());
            requisicaoModel.setConvenioSelecionado(guia.getConvenio());
            requisicaoModel.setGuiaselecionada(guia);
            requisicaoModel.setExames(guia.getExames());

            if (guia.getValorTotal() != null) {
                faturafild.setText(String.format("%.2f", guia.getValorTotal())); // Valor total
            }

            if (guia.getMedico() != null) {
                medicoCodigo.setText(guia.getMedico().getId().toString()); // ID do médico
                medicoNomeField.setText(guia.getMedico().getNome()); // Nome do médico
                medicoCRM.setText(guia.getMedico().getConselhoCrm()); // CRM do médico
                requisicaoModel.setMedicoSelecionado(guia.getMedico());
            }
            
            // Carregando exames associados à guia
            List<GuiaExame> exames = guia.getExames();
            if (exames != null && !exames.isEmpty()) {
                // Armazena os exames no RequisicaoModel
                requisicaoModel.setExames(new ArrayList<>(exames));



            } else {
                // Limpa a tabela de exames e o modelo
                requisicaoModel.setExames(new ArrayList<>());

            }

            JOptionPane.showMessageDialog(this, "Guia carregada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Guia não encontrada ou inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
