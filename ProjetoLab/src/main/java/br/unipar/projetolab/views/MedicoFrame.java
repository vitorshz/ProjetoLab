
package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.MedicoDAO;
import br.unipar.projetolab.dao.MedicoDAOImp;
import br.unipar.projetolab.interfaces.MedicoListener;
import br.unipar.projetolab.models.Medico;
import br.unipar.projetolab.models.Paciente;
import br.unipar.projetolab.utils.EntityManagerUtil;
import com.formdev.flatlaf.FlatLightLaf;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;


public class MedicoFrame extends javax.swing.JFrame implements MedicoListener{
     private MaskFormatter mfdata,mfcpf,mfcelular,mfCRM;

    
private Medico medicoAtual; 

public MedicoFrame() throws ParseException {
    try {
       
        mfdata = new MaskFormatter("##/##/####");
        mfcpf = new MaskFormatter("###.###.###-##"); 
        mfcelular = new MaskFormatter("(##) #####-####"); 

 
        mfCRM = new MaskFormatter("######/##"); 

    } catch (Exception e) {
        System.out.println("Erro ao criar a máscara: " + e.getMessage());
    }

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
        codigoField = new javax.swing.JTextField();
        CRMField = new javax.swing.JTextField();
        estadoBox = new javax.swing.JComboBox<>();
        nomeField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        especialiddeField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tipoBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dataNascField = new javax.swing.JFormattedTextField(mfdata);
        cpfField = new javax.swing.JFormattedTextField(mfcpf);
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        enderecoField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        EmailField = new javax.swing.JFormattedTextField(mfcelular);
        OBSField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        telefoneField = new javax.swing.JFormattedTextField(mfcelular);
        jLabel18 = new javax.swing.JLabel();
        telefoneField2 = new javax.swing.JFormattedTextField(mfcelular);
        telefoneField3 = new javax.swing.JFormattedTextField(mfcelular);
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
        jLabel2.setText("Cadastro de Medico");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_26.png"))); // NOI18N

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
        jLabel13.setText("CRM*:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Código*:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, -1));

        codigoField.setEditable(false);
        codigoField.setBackground(new java.awt.Color(153, 153, 153));
        codigoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoFieldActionPerformed(evt);
            }
        });
        jPanel3.add(codigoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, -1));

        CRMField.setEditable(false);
        CRMField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRMFieldActionPerformed(evt);
            }
        });
        jPanel3.add(CRMField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, -1));

        estadoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        estadoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoBoxActionPerformed(evt);
            }
        });
        jPanel3.add(estadoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        nomeField.setEditable(false);
        jPanel3.add(nomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 510, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Nome*:");
        jLabel14.setToolTipText("");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Especialidade:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        especialiddeField.setEditable(false);
        jPanel3.add(especialiddeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 510, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Tipo:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        tipoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solicitante", "Realizante", "SolicitanteRealizante", "Preferencial" }));
        jPanel3.add(tipoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Data Nasc.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        dataNascField.setEditable(false);
        jPanel3.add(dataNascField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, -1));

        cpfField.setEditable(false);
        jPanel3.add(cpfField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 120, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("CPF:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Endereço:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        enderecoField.setEditable(false);
        enderecoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoFieldActionPerformed(evt);
            }
        });
        jPanel3.add(enderecoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 510, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Email:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        EmailField.setEditable(false);
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        jPanel3.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 180, -1));
        jPanel3.add(OBSField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 530, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Observação:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Telefone:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        telefoneField.setEditable(false);
        telefoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneFieldActionPerformed(evt);
            }
        });
        jPanel3.add(telefoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 120, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Celular:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        telefoneField2.setEditable(false);
        telefoneField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneField2ActionPerformed(evt);
            }
        });
        jPanel3.add(telefoneField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 120, -1));

        telefoneField3.setEditable(false);
        telefoneField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneField3ActionPerformed(evt);
            }
        });
        jPanel3.add(telefoneField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 120, -1));

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
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoFieldActionPerformed

    private void CRMFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRMFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRMFieldActionPerformed

    private void estadoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoBoxActionPerformed

    private void enderecoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void telefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFieldActionPerformed

    private void telefoneField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneField2ActionPerformed

    private void telefoneField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneField3ActionPerformed

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        MedicoPesquisaFrame pesquisaFrame = new MedicoPesquisaFrame(this);
        pesquisaFrame.setModoExclusao(true); // Configura para modo de edição

        pesquisaFrame.setVisible(true);

    }//GEN-LAST:event_excluirBtnActionPerformed

    private void novoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtnActionPerformed
        habilitarCampos();
        limparCampos();
        medicoAtual = null;
        cpfField.setEditable(true);
    }//GEN-LAST:event_novoBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        MedicoPesquisaFrame pesquisaFrame = new MedicoPesquisaFrame(this);
        pesquisaFrame.setModoExclusao(false); // Configura para modo de edição

        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        try {

            String nome = nomeField.getText();
            String conselhoCrm = CRMField.getText();
            String especialidade = especialiddeField.getText();
            String tipo = (String) tipoBox.getSelectedItem();
            String cpf = cpfField.getText();
            String endereco = enderecoField.getText();
            String celular = telefoneField.getText();
            String observacoes = OBSField.getText();

            String dataNascimentoStr = dataNascField.getText();
            LocalDate dataNascimento;
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Data de nascimento inválida. Por favor, insira no formato dd/MM/yyyy.");
                return;
            }

            if (nome.isEmpty() || conselhoCrm.isEmpty() || cpf.isEmpty() || dataNascimentoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.");
                return;
            }

            Medico medico = medicoAtual != null ? medicoAtual : new Medico();
            medico.setNome(nome);
            medico.setConselhoCrm(conselhoCrm);
            medico.setEspecialidade(especialidade);
            medico.setTipo(tipo);
            medico.setCpf(cpf);
            medico.setEndereco(endereco);
            medico.setCelular(celular);

            medico.setObservacoes(observacoes);
            medico.setDataNascimento(dataNascimento);

            MedicoDAO medicoDAO = new MedicoDAOImp(EntityManagerUtil.getManager());
            if (medicoAtual != null) {
                medicoDAO.update(medico);
            } else {
                medicoDAO.save(medico);
            }

            JOptionPane.showMessageDialog(this, "Médico salvo com sucesso!");

            limparCampos();
            desabilitarCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar médico: " + ex.getMessage());
        }

    }//GEN-LAST:event_salvarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MedicoFrame().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(MedicoFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CRMField;
    private javax.swing.JFormattedTextField EmailField;
    private javax.swing.JTextField OBSField;
    private javax.swing.JTextField codigoField;
    private javax.swing.JFormattedTextField cpfField;
    private javax.swing.JFormattedTextField dataNascField;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField enderecoField;
    private javax.swing.JTextField especialiddeField;
    private javax.swing.JComboBox<String> estadoBox;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nomeField;
    private javax.swing.JButton novoBtn;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JFormattedTextField telefoneField;
    private javax.swing.JFormattedTextField telefoneField2;
    private javax.swing.JFormattedTextField telefoneField3;
    private javax.swing.JComboBox<String> tipoBox;
    // End of variables declaration//GEN-END:variables
      private void limparCampos() {
    nomeField.setText("");
    cpfField.setText("");
    dataNascField.setText("");
    enderecoField.setText(""); 
    EmailField.setText("");
    CRMField.setText(""); 
    especialiddeField.setText(""); 
    tipoBox.setSelectedItem(null); 
}

private void desabilitarCampos() {
    nomeField.setEditable(false);
    cpfField.setEditable(false);
    dataNascField.setEditable(false);
    enderecoField.setEditable(false);
    EmailField.setEditable(false);
    CRMField.setEditable(false);
    especialiddeField.setEditable(false);
    tipoBox.setEnabled(false);
    codigoField.setEditable(false); 
    OBSField.setEditable(false);

}

    private void carregarMedico(Medico medico) {
        medicoAtual = medico;
        codigoField.setText(medico.getId().toString());
        nomeField.setText(medico.getNome());
        cpfField.setText(medico.getCpf());

        LocalDate dataNascimento = medico.getDataNascimento();
        if (dataNascimento != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dataNascField.setText(dataNascimento.format(formatter));
        }

        enderecoField.setText(medico.getEndereco());
        EmailField.setText(medico.getCelular());
        CRMField.setText(medico.getConselhoCrm());
        especialiddeField.setText(medico.getEspecialidade());
        tipoBox.setSelectedItem(medico.getTipo());
        habilitarCamposParaEdicao();
    }


public void receberMedico(Medico medico) {
    if (medico != null) {
        carregarMedico(medico);
    }
}


private void habilitarCampos() {
    nomeField.setEditable(true);
    cpfField.setEditable(true);
    dataNascField.setEditable(true);
    enderecoField.setEditable(true); 
    EmailField.setEditable(true);
    CRMField.setEditable(true);
    especialiddeField.setEditable(true);
    tipoBox.setEnabled(true);
    codigoField.setEditable(false);
    OBSField.setEditable(true);

}


private void habilitarCamposParaEdicao() {
    nomeField.setEditable(true);
    enderecoField.setEditable(true);
    EmailField.setEditable(true);
    CRMField.setEditable(true);
    especialiddeField.setEditable(true);
    tipoBox.setEnabled(true);
    OBSField.setEditable(true);

   
    cpfField.setEditable(false);
    dataNascField.setEditable(false);
}


public void receberMedicoParaInativar(Medico medico) {
    if (medico != null) {
        
        int confirmacao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja inativar o médico: " + medico.getNome() + "?",
                "Confirmar Inativação", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            
            try {
                MedicoDAO medicoDAO = new MedicoDAOImp(EntityManagerUtil.getManager());
                medico.setAtivo(false); 
                medicoDAO.update(medico); 
                JOptionPane.showMessageDialog(this, "Médico inativado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao inativar o médico: " + ex.getMessage());
            }
        }
    }
}

    @Override
    public void onMedicoSelecionado(Medico medico) {
        carregarMedico(medico);
    }

    @Override
    public void onMedicoInativar(Medico medico) {
        int confirmacao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja inativar o médico: " + medico.getNome() + "?",
                "Confirmar Inativação", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            try {
                MedicoDAOImp medicoDAO = new MedicoDAOImp(EntityManagerUtil.getManager());
                medico.setAtivo(false);
                medicoDAO.update(medico);

                JOptionPane.showMessageDialog(this, "Médico inativado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao inativar o médico: " + ex.getMessage());
            }
        }
    }



}
