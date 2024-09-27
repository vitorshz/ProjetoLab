
package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.MedicoDAO;
import br.unipar.projetolab.dao.MedicoDAOImp;
import br.unipar.projetolab.models.Medico;
import br.unipar.projetolab.models.Paciente;
import br.unipar.projetolab.utils.EntityManagerUtil;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author vinid
 */
public class MedicoFrame extends javax.swing.JFrame {
     private MaskFormatter mfdata,mfcpf,mfcelular,mfCRM;

    /**
     * Creates new form MedicoFrame
     */
private Medico medicoAtual; // Instância do médico atual

public MedicoFrame() throws ParseException {
    try {
        // Inicializando as máscaras para formatação
        mfdata = new MaskFormatter("##/##/####"); // Data de Nascimento
        mfcpf = new MaskFormatter("###.###.###-##"); // CPF
        mfcelular = new MaskFormatter("(##) #####-####"); // Telefone/Celular

 
        mfCRM = new MaskFormatter("######/##"); // Exemplo de formato para CRM

    } catch (Exception e) {
        System.out.println("Erro ao criar a máscara: " + e.getMessage());
    }

    initComponents(); // Chama o método para inicializar os componentes da interface gráfica
}

@SuppressWarnings("unchecked")
// Outros métodos da classe...



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        codigoField = new javax.swing.JTextField();
        salvarBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        novoBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        fecharBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        estadoBox = new javax.swing.JComboBox<>();
        CRMField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tipoBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        telefoneField = new javax.swing.JFormattedTextField(mfcelular);
        jLabel9 = new javax.swing.JLabel();
        cpfField = new javax.swing.JFormattedTextField(mfcpf);
        jLabel11 = new javax.swing.JLabel();
        enderecoField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dataNascField = new javax.swing.JFormattedTextField(mfdata);
        jLabel12 = new javax.swing.JLabel();
        OBSField = new javax.swing.JFormattedTextField(mfcelular);
        nomeField = new javax.swing.JTextField();
        especialiddeField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Código");

        codigoField.setEditable(false);
        codigoField.setBackground(new java.awt.Color(153, 153, 153));
        codigoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoFieldActionPerformed(evt);
            }
        });

        salvarBtn.setBackground(new java.awt.Color(243, 255, 229));
        salvarBtn.setText("Salvar");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(243, 255, 229));
        editBtn.setText("Editar");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        novoBtn.setBackground(new java.awt.Color(243, 255, 229));
        novoBtn.setText("Novo");
        novoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoBtnActionPerformed(evt);
            }
        });

        excluirBtn.setBackground(new java.awt.Color(243, 255, 229));
        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        fecharBtn.setBackground(new java.awt.Color(243, 255, 229));
        fecharBtn.setText("Fechar");
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Cadastro de Medico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel2)
                .addContainerGap(606, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("CRM:");

        estadoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        estadoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoBoxActionPerformed(evt);
            }
        });

        CRMField.setEditable(false);
        CRMField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRMFieldActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Nome:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Espeecialidade:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Tipo:");

        tipoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "solicitante", " " }));
        tipoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoBoxActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Telefone:");

        telefoneField.setEditable(false);
        telefoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("CPF:");

        cpfField.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Endereço:");

        enderecoField.setEditable(false);
        enderecoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Data Nasc.");

        dataNascField.setEditable(false);
        dataNascField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Oservação:");

        OBSField.setEditable(false);
        OBSField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OBSFieldActionPerformed(evt);
            }
        });

        nomeField.setEditable(false);
        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });

        especialiddeField.setEditable(false);
        especialiddeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialiddeFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fecharBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(excluirBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(novoBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salvarBtn))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(184, 184, 184))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(170, 170, 170))))
                                .addGap(18, 18, 18)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataNascField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpfField, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(enderecoField)
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OBSField))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(especialiddeField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(CRMField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(estadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(nomeField))))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(estadoBox)
                    .addComponent(CRMField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(especialiddeField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tipoBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dataNascField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvarBtn)
                            .addComponent(editBtn)
                            .addComponent(novoBtn)
                            .addComponent(excluirBtn)
                            .addComponent(fecharBtn))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OBSField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addContainerGap(37, Short.MAX_VALUE))))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
       this.dispose();
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
       
        
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void novoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtnActionPerformed
        habilitarCampos();
        limparCampos();
        medicoAtual = null;  // Define null para indicar que um novo paciente será criado
        cpfField.setEditable(true);  // CPF pode ser editado apenas para novos cadastros
    }//GEN-LAST:event_novoBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
      
    }//GEN-LAST:event_editBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
       try {
    // Captura os dados do formulário
    String nome = nomeField.getText();
    String conselhoCrm = CRMField.getText();  // Conselho CRM
    String especialidade = especialiddeField.getText(); // Especialidade
    String tipo = (String) tipoBox.getSelectedItem(); // Tipo (Dr/Dra)
    String cpf = cpfField.getText();
    String endereco = enderecoField.getText();  // Endereço
    String celular = telefoneField.getText();
    String observacoes = OBSField.getText();

    // Formatar a data de nascimento de String para LocalDate
    String dataNascimentoStr = dataNascField.getText();
    LocalDate dataNascimento;
    try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(this, "Data de nascimento inválida. Por favor, insira no formato dd/MM/yyyy.");
        return;
    }

    // Verifica se os campos obrigatórios estão preenchidos
    if (nome.isEmpty() || conselhoCrm.isEmpty() || cpf.isEmpty() || dataNascimentoStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.");
        return;
    }

    // Cria uma nova instância de Medico ou usa o médico atual para edição
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

    // Salva o médico no banco de dados
    MedicoDAO medicoDAO = new MedicoDAOImp(EntityManagerUtil.getManager());
    if (medicoAtual != null) {
        medicoDAO.update(medico);
    } else {
        medicoDAO.save(medico);
    }

    // Exibe mensagem de sucesso
    JOptionPane.showMessageDialog(this, "Médico salvo com sucesso!");

    // Limpa os campos após o cadastro e desabilita-os
    limparCampos();
    desabilitarCampos();

} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Erro ao salvar médico: " + ex.getMessage());
}

          
    }//GEN-LAST:event_salvarBtnActionPerformed

    private void codigoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoFieldActionPerformed

    private void estadoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoBoxActionPerformed

    private void CRMFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRMFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRMFieldActionPerformed

    private void tipoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoBoxActionPerformed

    private void telefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFieldActionPerformed

    private void enderecoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoFieldActionPerformed

    private void dataNascFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascFieldActionPerformed

    private void OBSFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OBSFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OBSFieldActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void especialiddeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialiddeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialiddeFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MedicoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

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
    private javax.swing.JFormattedTextField OBSField;
    private javax.swing.JTextField codigoField;
    private javax.swing.JFormattedTextField cpfField;
    private javax.swing.JFormattedTextField dataNascField;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField enderecoField;
    private javax.swing.JTextField especialiddeField;
    private javax.swing.JComboBox<String> estadoBox;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeField;
    private javax.swing.JButton novoBtn;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JFormattedTextField telefoneField;
    private javax.swing.JComboBox<String> tipoBox;
    // End of variables declaration//GEN-END:variables
      private void limparCampos() {
    nomeField.setText("");
    cpfField.setText("");
    dataNascField.setText("");
    enderecoField.setText(""); // Endereço
    telefoneField.setText("");
    CRMField.setText(""); // CRM
    especialiddeField.setText(""); // Especialidade
    tipoBox.setSelectedItem(null); // Tipo
}

private void desabilitarCampos() {
    nomeField.setEditable(false);
    cpfField.setEditable(false);
    dataNascField.setEditable(false);
    enderecoField.setEditable(false);
    telefoneField.setEditable(false);
    CRMField.setEditable(false);
    especialiddeField.setEditable(false);
    tipoBox.setEnabled(false);
    codigoField.setEditable(false); // O campo de código sempre será não editável
}

public void carregarMedico(Medico medico) {
    medicoAtual = medico;
    codigoField.setText(medico.getId().toString());
    nomeField.setText(medico.getNome());
    cpfField.setText(medico.getCpf());

    // Formatar e setar a data de nascimento
    LocalDate dataNascimento = medico.getDataNascimento();
    if (dataNascimento != null) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataNascField.setText(dataNascimento.format(formatter));
    }

    enderecoField.setText(medico.getEndereco());
    telefoneField.setText(medico.getCelular());
    CRMField.setText(medico.getConselhoCrm());
    especialiddeField.setText(medico.getEspecialidade());
    
    // Setar o tipo nos respectivos JComboBox
    tipoBox.setSelectedItem(medico.getTipo());

    habilitarCamposParaEdicao();
}

// Método para receber o médico selecionado
public void receberMedico(Medico medico) {
    if (medico != null) {
        carregarMedico(medico); // Preenche os campos com o médico selecionado
    }
}

// Método para habilitar campos
private void habilitarCampos() {
    nomeField.setEditable(true);
    cpfField.setEditable(true);
    dataNascField.setEditable(true);
    enderecoField.setEditable(true); 
    telefoneField.setEditable(true);
    CRMField.setEditable(true);
    especialiddeField.setEditable(true);
    tipoBox.setEnabled(true);
    codigoField.setEditable(false); // O campo de código continua não editável
}

// Método para habilitar apenas os campos que podem ser editados
private void habilitarCamposParaEdicao() {
    nomeField.setEditable(true);
    enderecoField.setEditable(true);
    telefoneField.setEditable(true);
    CRMField.setEditable(true);
    especialiddeField.setEditable(true);
    tipoBox.setEnabled(true);

    // CPF e Data de Nascimento continuam desabilitados para edição
    cpfField.setEditable(false);
    dataNascField.setEditable(false);
}

// Método que recebe o médico selecionado para inativação
public void receberMedicoParaInativar(Medico medico) {
    if (medico != null) {
        // Exibe um diálogo de confirmação
        int confirmacao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja inativar o médico: " + medico.getNome() + "?",
                "Confirmar Inativação", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            // Se confirmado, inativa o médico
            try {
                MedicoDAO medicoDAO = new MedicoDAOImp(EntityManagerUtil.getManager());
                medico.setAtivo(false); // Marca o médico como inativo
                medicoDAO.update(medico); // Atualiza o médico no banco
                JOptionPane.showMessageDialog(this, "Médico inativado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao inativar o médico: " + ex.getMessage());
            }
        }
    }
}



}
