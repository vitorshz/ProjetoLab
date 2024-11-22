package br.unipar.projetolab.views;

import javax.swing.text.MaskFormatter;
import br.unipar.projetolab.dao.ConvenioDAO;
import br.unipar.projetolab.dao.ConvenioDAOImp;
import br.unipar.projetolab.enums.TipoPessoa;
import br.unipar.projetolab.interfaces.ConvenioListener;
import br.unipar.projetolab.models.Convenio;
import br.unipar.projetolab.utils.EntityManagerUtil;
import br.unipar.projetolab.views.ConvenioPesquisaFrame;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;


public class ConvenioFrame extends javax.swing.JPanel implements ConvenioListener {

     private MaskFormatter mfcei, mfcnpj, mfcelular,mfcep;
    private Convenio convenioAtual;
    
    public ConvenioFrame(JPanel telaSubtsPanel) {
        
        try {
            mfcei = new MaskFormatter(" ##.#######.##-##");
            mfcnpj = new MaskFormatter("##.###.###/####-##");
            mfcelular = new MaskFormatter("(##) #####-####");
            mfcep = new MaskFormatter("######-###");
        } catch (Exception e) {
            System.out.println("Erro ao criar a mascara");
        }
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salvarBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        novoBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        fecharBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        codigoField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tipoPessoaComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        razaoSocialField = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        fantasiaField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cnpjField = new javax.swing.JFormattedTextField(mfcnpj);
        jLabel11 = new javax.swing.JLabel();
        enderecoField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        telefoneField = new javax.swing.JFormattedTextField(mfcelular);
        jLabel13 = new javax.swing.JLabel();
        ceiField = new javax.swing.JFormattedTextField(mfcei);
        jLabel15 = new javax.swing.JLabel();
        cepfield = new javax.swing.JFormattedTextField(mfcep);
        jLabel14 = new javax.swing.JLabel();
        observacoesField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        salvarBtn.setBackground(new java.awt.Color(243, 255, 229));
        salvarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/disquete.png"))); // NOI18N
        salvarBtn.setText("Salvar");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
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

        novoBtn.setBackground(new java.awt.Color(243, 255, 229));
        novoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo-documento.png"))); // NOI18N
        novoBtn.setText("Novo");
        novoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoBtnActionPerformed(evt);
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

        fecharBtn.setBackground(new java.awt.Color(243, 255, 229));
        fecharBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-excluir 1.png"))); // NOI18N
        fecharBtn.setText("Fechar");
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Cadastro de Convênios");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/convenio-icon.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Cadastro de Convênios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Codigo*:");

        codigoField.setEditable(false);
        codigoField.setBackground(new java.awt.Color(153, 153, 153));
        codigoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nome*:");

        nomeField.setEditable(false);
        nomeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeFieldFocusGained(evt);
            }
        });
        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Pessoa*:");

        tipoPessoaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juridica", "Fisica" }));
        tipoPessoaComboBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tipoPessoaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPessoaComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Razão Social*:");

        razaoSocialField.setEditable(false);
        razaoSocialField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razaoSocialFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Fantasia:");

        fantasiaField.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("CNPJ*:");

        cnpjField.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Endereço:");

        enderecoField.setEditable(false);
        enderecoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Telefone*:");

        telefoneField.setEditable(false);
        telefoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("CEI:");

        ceiField.setEditable(false);
        ceiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceiFieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("CEP:");

        cepfield.setEditable(false);
        cepfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepfieldActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Observações:");

        observacoesField.setEditable(false);
        observacoesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacoesFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(tipoPessoaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))
                                .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(razaoSocialField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fantasiaField, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(cnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel13)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(enderecoField)
                                        .addComponent(ceiField))))
                            .addComponent(cepfield, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(observacoesField)))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tipoPessoaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(razaoSocialField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(fantasiaField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(ceiField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cepfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(observacoesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(631, Short.MAX_VALUE)
                    .addComponent(fecharBtn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(excluirBtn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(novoBtn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(editBtn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(salvarBtn)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(674, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(salvarBtn)
                        .addComponent(editBtn)
                        .addComponent(novoBtn)
                        .addComponent(excluirBtn)
                        .addComponent(fecharBtn))
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void observacoesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacoesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacoesFieldActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        try {
            String nome = nomeField.getText().trim();
            String cnpj = cnpjField.getText().trim();
            String telefone = telefoneField.getText().trim();

            boolean isValid = true;
            Border defaultBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1);
            Border errorBorder = BorderFactory.createLineBorder(Color.RED, 1);

            // Validação do campo Nome
            if (nome.isEmpty() || nome.length() < 3) {
                nomeField.setBorder(errorBorder);
                isValid = false;
            } else {
                nomeField.setBorder(defaultBorder);
            }

            // Validação do campo CNPJ
            if (cnpj.isEmpty() || !cnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}")) {
                cnpjField.setBorder(errorBorder);
                isValid = false;
            } else {
                cnpjField.setBorder(defaultBorder);
            }

            // Validação do campo Telefone
            if (telefone.isEmpty() || !telefone.matches("\\(\\d{2}\\) \\d{5}-\\d{4}")) {
                telefoneField.setBorder(errorBorder);
                isValid = false;
            } else {
                telefoneField.setBorder(defaultBorder);
            }

            // Se algum campo for inválido, exibe mensagem e retorna
            if (!isValid) {
                JOptionPane.showMessageDialog(this, "Por favor, corrija os campos destacados em vermelho.");
                return;
            }

            // Continua com a lógica de salvar...
            if (convenioAtual == null) {
                convenioAtual = new Convenio();
            }

            convenioAtual.setNome(nome);
            convenioAtual.setCnpj(cnpj);
            convenioAtual.setTelefone(telefone);
            convenioAtual.setRazaoSocial(razaoSocialField.getText());
            convenioAtual.setEndereco(enderecoField.getText());
            convenioAtual.setObservacoes(observacoesField.getText());
            convenioAtual.setCep(cepfield.getText());
            convenioAtual.setFantasia(fantasiaField.getText());
            convenioAtual.setCei(ceiField.getText());
            convenioAtual.setTipoPessoa(TipoPessoa.valueOf(tipoPessoaComboBox.getSelectedItem().toString().toUpperCase()));
            convenioAtual.setAtivo(true);

            ConvenioDAOImp convenioDAO = new ConvenioDAOImp(EntityManagerUtil.getManager());
            convenioDAO.save(convenioAtual);

            JOptionPane.showMessageDialog(this, "Convênio salvo com sucesso!");

            limparCampos();
            desabilitarCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar convênio: " + ex.getMessage());
        }
    }//GEN-LAST:event_salvarBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        ConvenioPesquisaFrame pesquisaFrame = new ConvenioPesquisaFrame(this); // Modo edição (false)
        pesquisaFrame.setModoExclusao(false); // Configura para modo de exclusão
        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void novoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtnActionPerformed
        habilitarCampos();
        limparCampos();
    }//GEN-LAST:event_novoBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        ConvenioPesquisaFrame pesquisaFrame = new ConvenioPesquisaFrame(this); // Modo exclusão (true)
        pesquisaFrame.setModoExclusao(true); // Configura para modo de exclusão

        pesquisaFrame.setVisible(true);
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        Container parent = this.getParent();
        if (parent != null) {
            parent.remove(this); // Remove o JPanel do container pai
            parent.revalidate(); // Atualiza o layout
            parent.repaint();    // Repaint para refletir as mudanças
        }
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void cepfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepfieldActionPerformed

    private void ceiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceiFieldActionPerformed

    private void telefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFieldActionPerformed

    private void enderecoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoFieldActionPerformed

    private void razaoSocialFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razaoSocialFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_razaoSocialFieldActionPerformed

    private void tipoPessoaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPessoaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoPessoaComboBoxActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void nomeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFieldFocusGained
        Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY,1);
        nomeField.setBorder(border);
    }//GEN-LAST:event_nomeFieldFocusGained

    private void codigoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ceiField;
    private javax.swing.JFormattedTextField cepfield;
    private javax.swing.JFormattedTextField cnpjField;
    private javax.swing.JTextField codigoField;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField enderecoField;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JTextField fantasiaField;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField observacoesField;
    private javax.swing.JFormattedTextField razaoSocialField;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JFormattedTextField telefoneField;
    private javax.swing.JComboBox<String> tipoPessoaComboBox;
    // End of variables declaration//GEN-END:variables
         private void habilitarCampos() {
        nomeField.setEditable(true);
        razaoSocialField.setEditable(true);
        cnpjField.setEditable(true);
        ceiField.setEditable(true);
        telefoneField.setEditable(true);
        cepfield.setEditable(true);
        enderecoField.setEditable(true);
        observacoesField.setEditable(true);
        fantasiaField.setEditable(true);

    }

    private void desabilitarCampos() {
        nomeField.setEditable(false);
        razaoSocialField.setEditable(false);
        cnpjField.setEditable(false);
        ceiField.setEditable(false);
        telefoneField.setEditable(false);
        cepfield.setEditable(false);
        enderecoField.setEditable(false);
        observacoesField.setEditable(false);
        fantasiaField.setEditable(false);

    }

    private void limparCampos() {
        codigoField.setText("");
        nomeField.setText("");
        razaoSocialField.setText("");
        cnpjField.setText("");
        ceiField.setText("");
        telefoneField.setText("");
        cepfield.setText("");
        enderecoField.setText("");
        observacoesField.setText("");
        fantasiaField.setText("");

    }
    @Override
    public void onConvenioSelecionado(Convenio convenio) {
        this.convenioAtual = convenio;
        carregarConvenio(convenio);
        habilitarCampos();
    }

    private void carregarConvenio(Convenio convenio) {
        codigoField.setText(convenio.getId().toString());
        nomeField.setText(convenio.getNome());
        razaoSocialField.setText(convenio.getRazaoSocial());
        cnpjField.setText(convenio.getCnpj());
        ceiField.setText(convenio.getCei());
        telefoneField.setText(convenio.getTelefone());
        cepfield.setText(convenio.getCep());
        enderecoField.setText(convenio.getEndereco());
        observacoesField.setText(convenio.getObservacoes());
        fantasiaField.setText(convenio.getFantasia());
    }

}
