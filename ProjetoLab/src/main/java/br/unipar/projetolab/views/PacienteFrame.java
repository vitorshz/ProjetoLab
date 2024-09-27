package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.PacienteDAO;
import br.unipar.projetolab.dao.PacienteDAOImp;
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



public class PacienteFrame extends javax.swing.JFrame {
    
    private MaskFormatter mfdata,mfcpf;

    public PacienteFrame() throws ParseException {
        try {
            mfdata = new MaskFormatter("##/##/####");
            mfcpf = new MaskFormatter("###.###.###-##");
        } catch (Exception e) {
            System.out.println("Erro ao criar a mascara");
        }
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        codigoField = new javax.swing.JTextField();
        nomeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dataNascField = new javax.swing.JFormattedTextField(mfdata);
        jLabel6 = new javax.swing.JLabel();
        sexoBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        sangueBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        fatorRHBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        telefoneField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        enderecoField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        salvarBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        novoBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        fecharBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cpfField = new javax.swing.JFormattedTextField(mfcpf);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Código");

        codigoField.setEditable(false);
        codigoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoFieldActionPerformed(evt);
            }
        });

        nomeField.setEditable(false);
        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Data Nasc.");

        dataNascField.setEditable(false);
        dataNascField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Sexo:");

        sexoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sexoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Sangue:");

        sangueBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sangueBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sangueBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Fator RH:");

        fatorRHBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fatorRHBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatorRHBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("CPF:");

        telefoneField.setEditable(false);
        telefoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Telefone:");

        enderecoField.setEditable(false);
        enderecoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Endereço:");

        salvarBtn.setText("Salvar");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Editar");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        novoBtn.setText("Novo");
        novoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoBtnActionPerformed(evt);
            }
        });

        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        fecharBtn.setText("Excluir");
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Cadastro de pacientes");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18))
        );

        cpfField.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sexoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dataNascField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sangueBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fatorRHBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addGap(10, 10, 10)
                                        .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(fecharBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(excluirBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(novoBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(editBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salvarBtn))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)
                                .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jLabel4)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(sexoBox)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dataNascField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addComponent(sangueBox)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)
                        .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fatorRHBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarBtn)
                    .addComponent(editBtn)
                    .addComponent(novoBtn)
                    .addComponent(excluirBtn)
                    .addComponent(fecharBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void novoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtnActionPerformed
        // Ao clicar no botão "Novo", habilita os campos para o cadastro
        habilitarCampos();
        limparCampos();  // Limpa os campos para um novo cadastro
    }//GEN-LAST:event_novoBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        try {
            
            // Captura os dados do formulário
            String nome = nomeField.getText();
            String cpf = cpfField.getText();
            String endereco = enderecoField.getText();  // Endereço
            String telefone = telefoneField.getText();

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
            if (nome.isEmpty() || cpf.isEmpty() || dataNascimentoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.");
                return;
            }


            // Cria uma nova instância de Paciente
            Paciente paciente = new Paciente();
            paciente.setNome(nome);
            paciente.setCpf(cpf);
            paciente.setDataNascimento(dataNascimento);  // Usar LocalDate aqui
            paciente.setEndereco(endereco);
            paciente.setTelefone(telefone);
            

            // Salva o paciente no banco de dados
            PacienteDAO pacienteDAO = new PacienteDAOImp(EntityManagerUtil.getManager());
            paciente = pacienteDAO.save(paciente);

            // Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Paciente cadastrado com sucesso!\n "
                    + "Código do Paciente: "+paciente.getId());

            // Limpa os campos após o cadastro e desabilita-os
            limparCampos();
            desabilitarCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar paciente: " + ex.getMessage());
        }

    }//GEN-LAST:event_salvarBtnActionPerformed

    private void enderecoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoFieldActionPerformed

    private void telefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFieldActionPerformed

    private void fatorRHBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatorRHBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fatorRHBoxActionPerformed

    private void sangueBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sangueBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sangueBoxActionPerformed

    private void sexoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoBoxActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void codigoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoFieldActionPerformed

    private void dataNascFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascFieldActionPerformed


    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PacienteFrame().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(PacienteFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoField;
    private javax.swing.JFormattedTextField cpfField;
    private javax.swing.JFormattedTextField dataNascField;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField enderecoField;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JComboBox<String> fatorRHBox;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeField;
    private javax.swing.JButton novoBtn;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JComboBox<String> sangueBox;
    private javax.swing.JComboBox<String> sexoBox;
    private javax.swing.JTextField telefoneField;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        nomeField.setText("");
        cpfField.setText("");
        dataNascField.setText("");
        enderecoField.setText("");  // Endereço
        telefoneField.setText("");
    }
    
    // Método para desabilitar campos
    private void desabilitarCampos() {
        nomeField.setEditable(false);
        cpfField.setEditable(false);
        dataNascField.setEditable(false);
        enderecoField.setEditable(false);  // Campo de endereço (ajuste o nome conforme necessário)
        telefoneField.setEditable(false);
        sexoBox.setEnabled(false);
        sangueBox.setEnabled(false);
        fatorRHBox.setEnabled(false);
        codigoField.setEditable(false);  // O campo de código sempre será não editável
    }

    // Método para habilitar campos
    private void habilitarCampos() {
        nomeField.setEditable(true);
        cpfField.setEditable(true);
        dataNascField.setEditable(true);
        enderecoField.setEditable(true);  // Campo de endereço (ajuste o nome conforme necessário)
        telefoneField.setEditable(true);
        sexoBox.setEnabled(true);
        sangueBox.setEnabled(true);
        fatorRHBox.setEnabled(true);
        codigoField.setEditable(false);  // O campo de código continua não editável
    }
    
    
}
