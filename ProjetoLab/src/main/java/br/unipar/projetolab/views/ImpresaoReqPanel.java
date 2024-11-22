
package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.GuiaDAO;
import br.unipar.projetolab.dao.GuiaDAOImp;
import br.unipar.projetolab.dao.ResultadoExameDAO;
import br.unipar.projetolab.dao.ResultadoExameDAOImp;
import br.unipar.projetolab.models.CampoResultadoExame;
import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.models.Guia;
import br.unipar.projetolab.models.GuiaExame;
import br.unipar.projetolab.models.ResultadoExame;
import br.unipar.projetolab.utils.EntityManagerUtil;
import br.unipar.projetolab.utils.HttpClientUtil;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Tab;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import java.awt.Desktop;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ImpresaoReqPanel extends javax.swing.JPanel {

   
    public ImpresaoReqPanel(JPanel telaSubtsPanel) {
        initComponents();
        adicionarListenerTabelaPacientes();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePaciente = new javax.swing.JTable();
        baixarpdfBtn = new javax.swing.JButton();
        ImprmiBtn1 = new javax.swing.JButton();
        btnEnviarparaSite = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        pesquisaGuiaField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableExames = new javax.swing.JTable();
        fecharBtn = new javax.swing.JButton();
        Pesquisarbtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(228, 228, 228));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Impressão por requisição");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/impressora (1).png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Imprime exames de pacientes a partir do código da requisição");
        jLabel15.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(228, 228, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Requisições", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Paciente", "Data"
            }
        ));
        jScrollPane1.setViewportView(tablePaciente);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 310));

        baixarpdfBtn.setBackground(new java.awt.Color(243, 255, 229));
        baixarpdfBtn.setText("Baixar PDF");
        baixarpdfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixarpdfBtnActionPerformed(evt);
            }
        });
        jPanel3.add(baixarpdfBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        ImprmiBtn1.setBackground(new java.awt.Color(243, 255, 229));
        ImprmiBtn1.setText("Imprimir");
        ImprmiBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprmiBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(ImprmiBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        btnEnviarparaSite.setBackground(new java.awt.Color(243, 255, 229));
        btnEnviarparaSite.setText("Enviar p Site");
        btnEnviarparaSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarparaSiteActionPerformed(evt);
            }
        });
        jPanel3.add(btnEnviarparaSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 100, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Requisição*:");
        jLabel14.setToolTipText("");

        pesquisaGuiaField.setBackground(new java.awt.Color(255, 255, 255));
        pesquisaGuiaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaGuiaFieldActionPerformed(evt);
            }
        });
        pesquisaGuiaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisaGuiaFieldKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exames", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tableExames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Exame", "Mat", "Situação"
            }
        ));
        tableExames.setColumnSelectionAllowed(true);
        tableExames.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableExames);
        tableExames.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        fecharBtn.setBackground(new java.awt.Color(243, 255, 229));
        fecharBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-excluir 1.png"))); // NOI18N
        fecharBtn.setText("Fechar");
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        Pesquisarbtn.setBackground(new java.awt.Color(243, 255, 229));
        Pesquisarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        Pesquisarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarbtnActionPerformed(evt);
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
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisaGuiaField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pesquisarbtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fecharBtn)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pesquisarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(pesquisaGuiaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecharBtn)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaGuiaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaGuiaFieldActionPerformed
        
    }//GEN-LAST:event_pesquisaGuiaFieldActionPerformed

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
       
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void PesquisarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarbtnActionPerformed
        RequisicaoPesquisaFrame pesquisaFrame = new RequisicaoPesquisaFrame(guia -> {
            if (guia != null) {
                carregarGuia(guia); // Carrega os dados da guia selecionada no formulário
            }
        });
        pesquisaFrame.setVisible(true);
        pesquisaGuiaField.setText("");
    }//GEN-LAST:event_PesquisarbtnActionPerformed

    private void baixarpdfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixarpdfBtnActionPerformed
        List<Guia> guiasSelecionadas = new ArrayList<>();
        List<Integer> linhasParaRemover = new ArrayList<>();
        int[] selectedRows = tablePaciente.getSelectedRows();

        if (selectedRows.length == 0) {
            // Adiciona todas as guias da tabela
            DefaultTableModel pacienteModel = (DefaultTableModel) tablePaciente.getModel();
            for (int i = 0; i < pacienteModel.getRowCount(); i++) {
                try {
                    guiasSelecionadas.add(obterGuiaSelecionada(i));
                    linhasParaRemover.add(i); // Adiciona todas as linhas para remoção
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(this, "Erro ao carregar guia: " + e.getMessage());
                }
            }
        } else {
            for (int selectedRow : selectedRows) {
                try {
                    guiasSelecionadas.add(obterGuiaSelecionada(selectedRow));
                    linhasParaRemover.add(selectedRow); // Adiciona as linhas selecionadas para remoção
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(this, "Erro ao carregar guia: " + e.getMessage());
                }
            }
        }

        if (guiasSelecionadas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma guia válida para gerar PDF.");
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecione a Pasta para Salvar PDFs");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Apenas diretórios
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            String caminhoPasta = fileChooser.getSelectedFile().getAbsolutePath();

            for (Guia guia : guiasSelecionadas) {
                List<ResultadoExame> resultadosExame = obterResultadosExame(guia);
                if (resultadosExame.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Nenhum resultado de exame encontrado para a guia " + guia.getId() + ".");
                    continue;
                }

                // Formata o nome do arquivo
                String nomePaciente = guia.getPaciente().getNome().replaceAll(" ", "_");
                String dataAtual = java.time.LocalDate.now().toString();
                String caminhoArquivo = caminhoPasta + File.separator + "Exames_" + nomePaciente + "_" + dataAtual + ".pdf";

                gerarPDF(caminhoArquivo, guia, resultadosExame);
            }

            JOptionPane.showMessageDialog(this, "PDFs gerados com sucesso na pasta selecionada.");

            // Remove as linhas da tabela de pacientes e limpa os exames
            linhasParaRemover.sort((a, b) -> b - a); // Ordena em ordem decrescente
            for (int rowIndex : linhasParaRemover) {
                removerLinhaPaciente(rowIndex);
            }

            limparExamesDaTabela(); // Limpa todos os exames da tabela
        }
            }//GEN-LAST:event_baixarpdfBtnActionPerformed

    private void ImprmiBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprmiBtn1ActionPerformed
        List<Guia> guiasSelecionadas = new ArrayList<>();
        List<Integer> linhasParaRemover = new ArrayList<>();
        int[] selectedRows = tablePaciente.getSelectedRows();

        if (selectedRows.length == 0) {
            // Adiciona todas as guias da tabela
            DefaultTableModel pacienteModel = (DefaultTableModel) tablePaciente.getModel();
            for (int i = 0; i < pacienteModel.getRowCount(); i++) {
                try {
                    guiasSelecionadas.add(obterGuiaSelecionada(i));
                    linhasParaRemover.add(i); // Adiciona todas as linhas para remoção
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(this, "Erro ao carregar guia: " + e.getMessage());
                }
            }
        } else {
            for (int selectedRow : selectedRows) {
                try {
                    guiasSelecionadas.add(obterGuiaSelecionada(selectedRow));
                    linhasParaRemover.add(selectedRow); // Adiciona as linhas selecionadas para remoção
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(this, "Erro ao carregar guia: " + e.getMessage());
                }
            }
        }

        if (guiasSelecionadas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma guia válida para impressão.");
            return;
        }

        for (Guia guia : guiasSelecionadas) {
            List<ResultadoExame> resultadosExame = obterResultadosExame(guia);
            if (resultadosExame.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhum resultado de exame encontrado para a guia " + guia.getId() + ".");
                continue;
            }

            // Formata o nome do arquivo temporário para impressão
            String nomePaciente = guia.getPaciente().getNome().replaceAll(" ", "_");
            String dataAtual = java.time.LocalDate.now().toString();
            String caminhoArquivo = "Exames_" + nomePaciente + "_" + dataAtual + "_Temp.pdf";

            gerarPDF(caminhoArquivo, guia, resultadosExame);

            // Atualiza o status para "Impresso"
            atualizarStatusGuiaExame(guia);

            // Imprime o arquivo
            imprimirPDF(caminhoArquivo);
        }

        JOptionPane.showMessageDialog(this, "Documentos enviados para impressão com sucesso.");

        // Remove as linhas da tabela de pacientes e limpa os exames
        linhasParaRemover.sort((a, b) -> b - a); // Ordena em ordem decrescente
        for (int rowIndex : linhasParaRemover) {
            removerLinhaPaciente(rowIndex);
        }

        limparExamesDaTabela(); // Limpa todos os exames da tabela
    }//GEN-LAST:event_ImprmiBtn1ActionPerformed

    private void pesquisaGuiaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaGuiaFieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { // Verifica se a tecla pressionada foi ENTER
            try {
                Long guiaId = Long.parseLong(pesquisaGuiaField.getText()); // Obtém o ID digitado
                GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());
                Guia guia = guiaDAO.findById(guiaId);

                if (guia != null) {
                    carregarGuia(guia); // Carrega os dados da guia
                    pesquisaGuiaField.setText("");
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Guia não encontrada para o ID: " + guiaId, "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um ID válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_pesquisaGuiaFieldKeyPressed

    private void btnEnviarparaSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarparaSiteActionPerformed
        int selectedRow = tablePaciente.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Nenhuma guia selecionada.");
            return;
        }

        try {
            // Obter a guia selecionada
            Guia guia = obterGuiaSelecionada(selectedRow);

            if (guia == null) {
                JOptionPane.showMessageDialog(this, "Guia não encontrada.");
                return;
            }

            // Pega o ID do paciente diretamente da guia
            Long pacienteId = guia.getPaciente().getId();

            // Criar o arquivo PDF na pasta temporária
            String nomePaciente = guia.getPaciente().getNome().replaceAll(" ", "_");
            String dataAtual = LocalDate.now().toString();
            String diretorioTemp = System.getProperty("java.io.tmpdir"); // Diretório temporário do sistema
            String caminhoArquivo = diretorioTemp + File.separator + "Exames_" + nomePaciente + "_" + dataAtual + ".pdf";

            // Gerar o PDF no caminho especificado
            gerarPDF(caminhoArquivo, guia, obterResultadosExame(guia));

            // Verificar se o arquivo foi gerado corretamente
            File arquivoPDF = new File(caminhoArquivo);
            if (!arquivoPDF.exists()) {
                JOptionPane.showMessageDialog(this, "Erro ao gerar o PDF da guia selecionada.");
                return;
            }

            // Enviar o PDF para o servidor
            String urlServidor = "http://localhost:8080/api/pdfs/upload";
            System.out.println("paciente id::" +pacienteId);
            String resposta = HttpClientUtil.enviarArquivoComPaciente(urlServidor, arquivoPDF, pacienteId);

            // Exibir mensagem de sucesso ou erro
            JOptionPane.showMessageDialog(this, resposta);

            // Opcional: Deletar o arquivo local após envio
            if (arquivoPDF.exists()) {
                arquivoPDF.delete();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao enviar a guia: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEnviarparaSiteActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ImprmiBtn1;
    private javax.swing.JButton Pesquisarbtn;
    private javax.swing.JButton baixarpdfBtn;
    private javax.swing.JButton btnEnviarparaSite;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pesquisaGuiaField;
    private javax.swing.JTable tableExames;
    private javax.swing.JTable tablePaciente;
    // End of variables declaration//GEN-END:variables

    private void gerarPDF(String caminhoArquivo, Guia guia, List<ResultadoExame> resultadosExame) {
        try (
                PdfWriter writer = new PdfWriter(caminhoArquivo); PdfDocument pdfDoc = new PdfDocument(writer)) {

            Document document = new Document(pdfDoc, PageSize.A4);
            document.setMargins(20, 20, 20, 20);

            PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
            PdfFont boldFont = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);

            // Título
            document.add(new Paragraph("Análises Clínicas")
                    .setFont(boldFont)
                    .setFontSize(14)
                    .setTextAlignment(TextAlignment.CENTER)
                    .setMarginBottom(10));

            // Cabeçalho estruturado
            Table cabecalhoTable = new Table(new float[]{1, 1});
            cabecalhoTable.setWidth(UnitValue.createPercentValue(100));

            // Coluna 1: Informações do paciente
            cabecalhoTable.addCell(new Cell()
                    .add(new Paragraph("Paciente: " + guia.getPaciente().getNome()).setFont(font).setFontSize(10))
                    .add(new Paragraph("CPF: " + guia.getPaciente().getCpf()).setFont(font).setFontSize(10))
                    .add(new Paragraph("Idade: " + guia.getPaciente().calcularIdade() + " anos").setFont(font).setFontSize(10))
                    .add(new Paragraph("Endereço: " + guia.getPaciente().getEndereco()).setFont(font).setFontSize(10))
                    .setBorder(Border.NO_BORDER)
                    .setPadding(10));

            // Coluna 2: Informações do médico e datas
            cabecalhoTable.addCell(new Cell()
                    .add(new Paragraph("Médico: " + guia.getMedico().getNome()).setFont(font).setFontSize(10))
                    .add(new Paragraph("Convênio: " + (guia.getConvenio() != null ? guia.getConvenio().getNome() : "Particular")).setFont(font).setFontSize(10))
                    .add(new Paragraph("Data Req.: " + guia.getDataCadastro().toLocalDate()).setFont(font).setFontSize(10))
                    .add(new Paragraph("Data Emissão: " + java.time.LocalDate.now()).setFont(font).setFontSize(10))
                    .setBorder(Border.NO_BORDER)
                    .setTextAlignment(TextAlignment.RIGHT)
                    .setPadding(10));

            document.add(cabecalhoTable);

            // Linha separadora
            document.add(new Paragraph("\n").setBorderBottom(new SolidBorder(1)).setMarginBottom(10));

            // Corpo (Exames e Resultados)
            for (GuiaExame guiaExame : guia.getExames()) {
                // Filtrar exames com status "Incluído"
                if(!"Incluído".equalsIgnoreCase(guiaExame.getStatus())
                        && !"Impresso".equalsIgnoreCase(guiaExame.getStatus())) {
                    continue;
                }

                Exame exame = guiaExame.getExame();

                // Nome do Exame
                document.add(new Paragraph(exame.getNome())
                        .setFont(boldFont)
                        .setFontSize(16)
                        .setMarginTop(10)
                        .setMarginBottom(5)
                        .setTextAlignment(TextAlignment.LEFT));

                // Material e Método
                document.add(new Paragraph("Material: " + exame.getTipoMaterial())
                        .setFont(font)
                        .setFontSize(10)
                        .setMarginBottom(3));
                document.add(new Paragraph("Método: " + exame.getMetodo())
                        .setFont(font)
                        .setFontSize(10)
                        .setMarginBottom(10));

                // Resultados e Valores de Referência
                for (CampoResultadoExame campo : resultadosExame.stream()
                        .filter(re -> re.getExame().getId().equals(exame.getId()))
                        .flatMap(re -> re.getCamposResultado().stream())
                        .toList()) {

                    // Espaço à esquerda do resultado
                    String resultadoTexto = " " + campo.getValor() + " " + campo.getEstruturaExame().getUnidade();

                    // Resultado e Valores de Referência na mesma linha
                    Table resultadoRefTable = new Table(new float[]{2, 3}); // Define larguras das colunas
                    resultadoRefTable.setWidth(UnitValue.createPercentValue(100));
                    resultadoRefTable.addCell(new Cell()
                            .add(new Paragraph(resultadoTexto)
                                    .setFont(boldFont)
                                    .setFontSize(14))
                            .setTextAlignment(TextAlignment.LEFT)
                            .setBorder(Border.NO_BORDER)
                            .setPaddingLeft(20)); // Adiciona o espaçamento à esquerda
                    resultadoRefTable.addCell(new Cell()
                            .add(new Paragraph("Valores de Referência: " + campo.getEstruturaExame().getReferencias() + " " + campo.getEstruturaExame().getUnidade())
                                    .setFont(font)
                                    .setFontSize(10))
                            .setTextAlignment(TextAlignment.RIGHT)
                            .setBorder(Border.NO_BORDER));

                    // Adiciona a linha ao documento
                    document.add(resultadoRefTable);
                }

                // Espaço entre exames
                document.add(new Paragraph("\n"));
            }

            document.close();
            JOptionPane.showMessageDialog(this, "PDF gerado com sucesso: " + caminhoArquivo);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao gerar PDF: " + e.getMessage());
        }
    }

    private void imprimirPDF(String caminhoArquivo) {
        try {
            File arquivo = new File(caminhoArquivo);

            // Verificar se o arquivo foi gerado corretamente
            if (!arquivo.exists()) {
                JOptionPane.showMessageDialog(this, "Arquivo PDF não encontrado para impressão.");
                return;
            }

            // Enviar o arquivo para a impressão
//            Desktop.getDesktop().print(arquivo); n funciona se n tver um leitor de pdf tipo o adobe
            Desktop.getDesktop().open(arquivo);

            JOptionPane.showMessageDialog(this, "Documento enviado para impressão.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao imprimir PDF: " + e.getMessage());
        }
    }

    private void carregarGuia(Guia guia) {
        if (guia == null) {
            JOptionPane.showMessageDialog(this, "Nenhuma guia selecionada.");
            return;
        }

        // Verifica se a guia já foi adicionada
        DefaultTableModel pacienteModel = (DefaultTableModel) tablePaciente.getModel();
        boolean guiaJaAdicionada = false;
        for (int i = 0; i < pacienteModel.getRowCount(); i++) {
            if (guia.getId().equals(pacienteModel.getValueAt(i, 0))) {
                guiaJaAdicionada = true;
                break;
            }
        }

        // Adiciona a guia na tabela de pacientes se ainda não foi adicionada
        if (!guiaJaAdicionada) {
            pacienteModel.addRow(new Object[]{
                guia.getId(),
                guia.getPaciente().getNome(),
                guia.getDataCadastro()
            });
        }

        // Atualiza a tabela de exames com os exames da última guia adicionada
        atualizarExamesDaUltimaGuia();
    }



    private Guia obterGuiaSelecionada(int selectedRow) {
        Long guiaId = (Long) tablePaciente.getValueAt(selectedRow, 0);
        GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());
        return guiaDAO.findById(guiaId);
    }

    private List<ResultadoExame> obterResultadosExame(Guia guia) {
        ResultadoExameDAO resultadoExameDAO = new ResultadoExameDAOImp(EntityManagerUtil.getManager());
        List<ResultadoExame> resultados = resultadoExameDAO.buscarPorGuia(guia.getId());

        // Log para verificar os resultados
        System.out.println("Resultados obtidos para a Guia ID " + guia.getId() + ":");
        for (ResultadoExame resultado : resultados) {
            System.out.println("Exame: " + resultado.getExame().getNome());
            for (CampoResultadoExame campo : resultado.getCamposResultado()) {
                System.out.println("Campo: " + campo.getEstruturaExame().getTexto() + " - Valor: " + campo.getValor());
            }
        }

        return resultados;
    }


    private void atualizarStatusGuiaExame(Guia guia) {
        try {
            GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());
            EntityManagerUtil.getManager().getTransaction().begin();

            for (GuiaExame guiaExame : guia.getExames()) {
                // Apenas exames com status "Incluído" podem ser atualizados para "Impresso"
                if ("Incluído".equalsIgnoreCase(guiaExame.getStatus())) {
                    guiaExame.setStatus("Impresso");
                }
            }

            guiaDAO.update(guia); // Salva as alterações no banco de dados
            EntityManagerUtil.getManager().getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Exames com status 'Incluído' foram atualizados para 'Impresso'.");
        } catch (Exception e) {
            EntityManagerUtil.getManager().getTransaction().rollback();
            JOptionPane.showMessageDialog(this, "Erro ao atualizar status: " + e.getMessage());
        }
    }
    
    private void removerLinhaPaciente(int rowIndex) {
        DefaultTableModel pacienteModel = (DefaultTableModel) tablePaciente.getModel();
        if (rowIndex >= 0 && rowIndex < pacienteModel.getRowCount()) {
            pacienteModel.removeRow(rowIndex);
        }
    }

    private void limparExamesDaTabela() {
        DefaultTableModel exameModel = (DefaultTableModel) tableExames.getModel();
        exameModel.setRowCount(0); // Limpa todas as linhas da tabela de exames
    }
    private void adicionarListenerTabelaPacientes() {
        tablePaciente.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting()) {
                int selectedRow = tablePaciente.getSelectedRow();
                if (selectedRow >= 0) {
                    Long guiaId = (Long) tablePaciente.getValueAt(selectedRow, 0);
                    GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());
                    Guia guia = guiaDAO.findById(guiaId);

                    if (guia != null) {
                        // Atualiza a tabela de exames com os exames da guia selecionada
                        limparExamesDaTabela();
                        for (GuiaExame guiaExame : guia.getExames()) {
                            ((DefaultTableModel) tableExames.getModel()).addRow(new Object[]{
                                guiaExame.getExame().getId(),
                                guiaExame.getExame().getNome(),
                                guiaExame.getExame().getTipoMaterial(),
                                guiaExame.getStatus()
                            });
                        }
                    }
                }
            }
        });
    }
    private void atualizarExamesDaUltimaGuia() {
        DefaultTableModel pacienteModel = (DefaultTableModel) tablePaciente.getModel();
        int ultimaLinha = pacienteModel.getRowCount() - 1;

        if (ultimaLinha >= 0) {
            Long guiaId = (Long) pacienteModel.getValueAt(ultimaLinha, 0);
            GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());
            Guia guia = guiaDAO.findById(guiaId);

            if (guia != null) {
                // Limpa os exames e carrega os exames da guia selecionada
                limparExamesDaTabela();
                for (GuiaExame guiaExame : guia.getExames()) {
                    ((DefaultTableModel) tableExames.getModel()).addRow(new Object[]{
                        guiaExame.getExame().getId(),
                        guiaExame.getExame().getNome(),
                        guiaExame.getExame().getTipoMaterial(),
                        guiaExame.getStatus()
                    });
                }
            }
        }
    }


}
