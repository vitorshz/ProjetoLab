
package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.MedicoDAO;
import br.unipar.projetolab.dao.MedicoDAOImp;
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


public class MedicoFrame extends javax.swing.JFrame {
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
        salvarBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        novoBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        fecharBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telefoneField = new javax.swing.JFormattedTextField(mfcelular);
        jLabel9 = new javax.swing.JLabel();
        cpfField = new javax.swing.JFormattedTextField(mfcpf);
        jLabel11 = new javax.swing.JLabel();
        enderecoField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        OBSField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_26.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(629, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(27, Short.MAX_VALUE))
        );

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

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Observação:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 746, Short.MAX_VALUE)
                        .addComponent(fecharBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvarBtn)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OBSField)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(enderecoField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addGap(641, 641, 641))
                            .addComponent(cpfField, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE))
                        .addContainerGap(239, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvarBtn)
                            .addComponent(editBtn)
                            .addComponent(novoBtn)
                            .addComponent(excluirBtn)
                            .addComponent(fecharBtn)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(OBSField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 79, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
       this.dispose();
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
       MedicoPesquisaFrame pesquisaFrame = new MedicoPesquisaFrame(this, true);
       pesquisaFrame.setVisible(true);
        
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void novoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtnActionPerformed
        habilitarCampos();
        limparCampos();
        medicoAtual = null;  
        cpfField.setEditable(true);  
    }//GEN-LAST:event_novoBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
       MedicoPesquisaFrame pesquisaFrame = new MedicoPesquisaFrame(this, false);
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

    private void telefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFieldActionPerformed

    private void enderecoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoFieldActionPerformed

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
    private javax.swing.JTextField OBSField;
    private javax.swing.JFormattedTextField cpfField;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField enderecoField;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton novoBtn;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JFormattedTextField telefoneField;
    // End of variables declaration//GEN-END:variables
      private void limparCampos() {
    nomeField.setText("");
    cpfField.setText("");
    dataNascField.setText("");
    enderecoField.setText(""); 
    telefoneField.setText("");
    CRMField.setText(""); 
    especialiddeField.setText(""); 
    tipoBox.setSelectedItem(null); 
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
    codigoField.setEditable(false); 
    OBSField.setEditable(false);

}

public void carregarMedico(Medico medico) {
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
    telefoneField.setText(medico.getCelular());
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
    telefoneField.setEditable(true);
    CRMField.setEditable(true);
    especialiddeField.setEditable(true);
    tipoBox.setEnabled(true);
    codigoField.setEditable(false);
    OBSField.setEditable(true);

}


private void habilitarCamposParaEdicao() {
    nomeField.setEditable(true);
    enderecoField.setEditable(true);
    telefoneField.setEditable(true);
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



}
