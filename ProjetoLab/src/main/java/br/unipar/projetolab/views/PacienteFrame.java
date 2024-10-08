package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.PacienteDAO;
import br.unipar.projetolab.dao.PacienteDAOImp;
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


public class PacienteFrame extends javax.swing.JFrame {
    
    private MaskFormatter mfdata,mfcpf,mfcelular;
    private Paciente pacienteAtual; 
    
    public PacienteFrame() throws ParseException {
        try {
            mfdata = new MaskFormatter("##/##/####");
            mfcpf = new MaskFormatter("###.###.###-##");
            mfcelular = new MaskFormatter("(##) #####-####");

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
        telefoneField = new javax.swing.JFormattedTextField(mfcelular);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código");

        codigoField.setEditable(false);
        codigoField.setBackground(new java.awt.Color(153, 153, 153));
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
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Data Nasc.");

        dataNascField.setEditable(false);
        dataNascField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sexo:");

        sexoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        sexoBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sexoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoBoxActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sangue:");

        sangueBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));
        sangueBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sangueBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fator RH:");

        fatorRHBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        fatorRHBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatorRHBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("CPF:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Telefone:");

        enderecoField.setEditable(false);
        enderecoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Endereço:");

        salvarBtn.setBackground(new java.awt.Color(243, 255, 229));
        salvarBtn.setForeground(new java.awt.Color(0, 0, 0));
        salvarBtn.setText("Salvar");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(243, 255, 229));
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setText("Editar");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        novoBtn.setBackground(new java.awt.Color(243, 255, 229));
        novoBtn.setForeground(new java.awt.Color(0, 0, 0));
        novoBtn.setText("Novo");
        novoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoBtnActionPerformed(evt);
            }
        });

        excluirBtn.setBackground(new java.awt.Color(243, 255, 229));
        excluirBtn.setForeground(new java.awt.Color(0, 0, 0));
        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        fecharBtn.setBackground(new java.awt.Color(243, 255, 229));
        fecharBtn.setForeground(new java.awt.Color(0, 0, 0));
        fecharBtn.setText("Fechar");
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cadastro de Paciente");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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

        telefoneField.setEditable(false);
        telefoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 331, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sexoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataNascField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sangueBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fatorRHBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefoneField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dataNascField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sexoBox)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(sangueBox)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5))
                    .addComponent(fatorRHBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarBtn)
                    .addComponent(editBtn)
                    .addComponent(novoBtn)
                    .addComponent(excluirBtn)
                    .addComponent(fecharBtn))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        // Abre a tela de pesquisa de pacientes
        PacientePesquisaFrame pesquisaFrame = new PacientePesquisaFrame(this, true); // 'true' indica que estamos em modo de exclusão/inativação
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void novoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtnActionPerformed
        habilitarCampos();
        limparCampos();
        pacienteAtual = null;  // Define null para indicar que um novo paciente será criado
        cpfField.setEditable(true);  // CPF pode ser editado apenas para novos cadastros
    }//GEN-LAST:event_novoBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        PacientePesquisaFrame pesquisaFrame = new PacientePesquisaFrame(this,false);
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        try {
            // Captura os dados do formulário
            String nome = nomeField.getText();
            String cpf = cpfField.getText();
            String endereco = enderecoField.getText();  // Endereço
            String telefone = telefoneField.getText();

            // Capturar as seleções dos JComboBox
            String sexo = (String) sexoBox.getSelectedItem();
            String tipoSangue = (String) sangueBox.getSelectedItem();
            String fatorRh = (String) fatorRHBox.getSelectedItem();

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

            // Cria uma nova instância de Paciente ou usa o paciente atual para edição
            Paciente paciente = pacienteAtual != null ? pacienteAtual : new Paciente();
            paciente.setNome(nome);
            paciente.setCpf(cpf);
            paciente.setDataNascimento(dataNascimento);
            paciente.setEndereco(endereco);
            paciente.setTelefone(telefone);
            paciente.setSexo(sexo);
            paciente.setTipoSangue(tipoSangue);
            paciente.setFatorRh(fatorRh);

            // Salva o paciente no banco de dados
            PacienteDAO pacienteDAO = new PacienteDAOImp(EntityManagerUtil.getManager());
            if (pacienteAtual != null) {
                pacienteDAO.update(paciente);
            } else {
                pacienteDAO.save(paciente);
            }

            // Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Paciente salvo com sucesso!");

            // Limpa os campos após o cadastro e desabilita-os
            limparCampos();
            desabilitarCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar paciente: " + ex.getMessage());
        }

    }//GEN-LAST:event_salvarBtnActionPerformed

    private void enderecoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoFieldActionPerformed

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

    private void telefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFieldActionPerformed


    public static void main(String args[]) {
        //melhorar o look and feel
        FlatLightLaf.setup();

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
    private javax.swing.JFormattedTextField telefoneField;
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
        enderecoField.setEditable(false);
        telefoneField.setEditable(false);
        sexoBox.setEnabled(false);
        sangueBox.setEnabled(false);
        fatorRHBox.setEnabled(false);
        codigoField.setEditable(false);  // O campo de código sempre será não editável
    }
    
    public void carregarPaciente(Paciente paciente) {
        pacienteAtual = paciente;
        codigoField.setText(paciente.getId().toString());
        nomeField.setText(paciente.getNome());
        cpfField.setText(paciente.getCpf());

        // Formatar e setar a data de nascimento
        LocalDate dataNascimento = paciente.getDataNascimento();
        if (dataNascimento != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dataNascField.setText(dataNascimento.format(formatter));
        }

        enderecoField.setText(paciente.getEndereco());
        telefoneField.setText(paciente.getTelefone());

        // Setar os valores do sexo, sangue e fator RH nos respectivos JComboBox
        sexoBox.setSelectedItem(paciente.getSexo());
        sangueBox.setSelectedItem(paciente.getTipoSangue());
        fatorRHBox.setSelectedItem(paciente.getFatorRh());

        habilitarCamposParaEdicao();
    }

    
    // Método para receber o paciente selecionado
    public void receberPaciente(Paciente paciente) {
        if (paciente != null) {
            carregarPaciente(paciente); // Preenche os campos com o paciente selecionado
        }
    }
    

    // Método para habilitar campos
    private void habilitarCampos() {
        nomeField.setEditable(true);
        cpfField.setEditable(true);
        dataNascField.setEditable(true);
        enderecoField.setEditable(true); 
        telefoneField.setEditable(true);
        sexoBox.setEnabled(true);
        sangueBox.setEnabled(true);
        fatorRHBox.setEnabled(true);
        codigoField.setEditable(false);  // O campo de código continua não editável
    }
    
    // Método para habilitar apenas os campos que podem ser editados
    private void habilitarCamposParaEdicao() {
        nomeField.setEditable(true);
        enderecoField.setEditable(true);
        telefoneField.setEditable(true);
        sexoBox.setEnabled(true);
        sangueBox.setEnabled(true);
        fatorRHBox.setEnabled(true);

        // CPF e Data de Nascimento continuam desabilitados para edição
        cpfField.setEditable(false);
        dataNascField.setEditable(false);
    }
    
    // Método que recebe o paciente selecionado para inativação
    public void receberPacienteParaInativar(Paciente paciente) {
        if (paciente != null) {
            // Exibe um diálogo de confirmação
            int confirmacao = JOptionPane.showConfirmDialog(this,
                    "Tem certeza que deseja inativar o paciente: " + paciente.getNome() + "?",
                    "Confirmar Inativação", JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_OPTION) {
                // Se confirmado, inativa o paciente
                try {
                    PacienteDAO pacienteDAO = new PacienteDAOImp(EntityManagerUtil.getManager());
                    paciente.setAtivo(false);  // Marca o paciente como inativo
                    pacienteDAO.update(paciente);  // Atualiza o paciente no banco
                    JOptionPane.showMessageDialog(this, "Paciente inativado com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inativar o paciente: " + ex.getMessage());
                }
            }
        }
    }
}
