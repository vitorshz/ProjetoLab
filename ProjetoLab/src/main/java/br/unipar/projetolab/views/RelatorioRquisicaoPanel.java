package br.unipar.projetolab.views;

import br.unipar.projetolab.dao.GuiaDAO;
import br.unipar.projetolab.dao.GuiaDAOImp;
import br.unipar.projetolab.models.Guia;
import br.unipar.projetolab.models.GuiaExame;
import br.unipar.projetolab.utils.EntityManagerUtil;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;


public class RelatorioRquisicaoPanel extends javax.swing.JPanel {

    private List<Guia> guiasFiltradas;
    
    public RelatorioRquisicaoPanel(JPanel telaSubtsPanel) {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        situacaobox = new javax.swing.JComboBox<>();
        jDateChooserDataInicial = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFinal = new com.toedter.calendar.JDateChooser();
        imprimeBtn = new javax.swing.JButton();
        filtrarBtn = new javax.swing.JButton();
        fecharBtn = new javax.swing.JButton();
        panelRelatorio = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Relatorio de Requisições");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/papel 1.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Listagem das requisições realizadas no periodo");
        jLabel15.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(740, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(228, 228, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Situação:");
        jLabel14.setToolTipText("");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Data Inicial*:");
        jLabel16.setToolTipText("");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Data Final*:");
        jLabel17.setToolTipText("");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        situacaobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "todas", " " }));
        jPanel3.add(situacaobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, -1));

        jDateChooserDataInicial.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserDataInicial.setDateFormatString("dd-MM-yyyy");
        jPanel3.add(jDateChooserDataInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, -1));

        jDateChooserDataFinal.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserDataFinal.setDateFormatString("dd-MM-yyyy");
        jPanel3.add(jDateChooserDataFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 100, -1));

        imprimeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/impressora (2).png"))); // NOI18N
        imprimeBtn.setText("Imprimir");
        imprimeBtn.setToolTipText("");
        imprimeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimeBtnActionPerformed(evt);
            }
        });
        jPanel3.add(imprimeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, -1));

        filtrarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        filtrarBtn.setText("Filtrar");
        filtrarBtn.setToolTipText("");
        filtrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarBtnActionPerformed(evt);
            }
        });
        jPanel3.add(filtrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 40));

        fecharBtn.setBackground(new java.awt.Color(243, 255, 229));
        fecharBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-excluir 1.png"))); // NOI18N
        fecharBtn.setText("Fechar");
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRelatorioLayout = new javax.swing.GroupLayout(panelRelatorio);
        panelRelatorio.setLayout(panelRelatorioLayout);
        panelRelatorioLayout.setHorizontalGroup(
            panelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelRelatorioLayout.setVerticalGroup(
            panelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecharBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fecharBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        Container parent = this.getParent();
        if (parent != null) {
            parent.remove(this); // Remove o JPanel do container pai
            parent.revalidate(); // Atualiza o layout
            parent.repaint();    // Repaint para refletir as mudanças
        }
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void imprimeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimeBtnActionPerformed
        try {
            if (guiasFiltradas == null || guiasFiltradas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhum relatório disponível para impressão. Por favor, aplique o filtro primeiro.");
                return;
            }

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Salvar Relatório");
            fileChooser.setSelectedFile(new File("Relatorio_Requisicoes.pdf"));

            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                String caminhoArquivo = fileChooser.getSelectedFile().getAbsolutePath();

                gerarPDFRelatorio(caminhoArquivo, guiasFiltradas);

                Desktop.getDesktop().open(new File(caminhoArquivo));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao imprimir relatório: " + e.getMessage());
        }
    }//GEN-LAST:event_imprimeBtnActionPerformed

    private void filtrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarBtnActionPerformed
        try {
            // Captura as datas
            Date dataInicialDate = jDateChooserDataInicial.getDate();
            Date dataFinalDate = jDateChooserDataFinal.getDate();

            if (dataInicialDate == null || dataFinalDate == null) {
                JOptionPane.showMessageDialog(this, "Por favor, selecione as datas inicial e final.");
                return;
            }

            if (dataInicialDate.after(dataFinalDate)) {
                JOptionPane.showMessageDialog(this, "A data inicial deve ser anterior ou igual à data final.");
                return;
            }

            // Conversão de datas para LocalDateTime
            LocalDateTime dataInicial = dataInicialDate.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();
            LocalDateTime dataFinal = dataFinalDate.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();

            // Buscar guias no período
            String situacaoSelecionada = situacaobox.getSelectedItem().toString();
            GuiaDAO guiaDAO = new GuiaDAOImp(EntityManagerUtil.getManager());
            guiasFiltradas = guiaDAO.buscarPorPeriodoESituacao(dataInicial, dataFinal, situacaoSelecionada);

            if (guiasFiltradas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhuma guia encontrada para os critérios selecionados.");
                return;
            }

            // Gerar PDF temporário
            String caminhoPDF = "relatorio_temp.pdf";
            gerarPDFRelatorio(caminhoPDF, guiasFiltradas);

            // Exibir no painel
            exibirPDFNoPainel(caminhoPDF);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao filtrar guias: " + e.getMessage());
        }
    }//GEN-LAST:event_filtrarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fecharBtn;
    private javax.swing.JButton filtrarBtn;
    private javax.swing.JButton imprimeBtn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooserDataFinal;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelRelatorio;
    private javax.swing.JComboBox<String> situacaobox;
    // End of variables declaration//GEN-END:variables

    // Método para exibir o PDF no painel
    private void exibirPDFNoPainel(String caminhoPDF) {
        try {
            PDDocument   document = PDDocument .load(new File(caminhoPDF));
            PDFRenderer renderer = new PDFRenderer(document);

            // Renderiza apenas a primeira página para o painel
            BufferedImage image = renderer.renderImageWithDPI(0, 100); // DPI ajustável
            ImageIcon icon = new ImageIcon(image);

            // Atualiza o painel de visualização
            panelRelatorio.removeAll();
            JLabel label = new JLabel(icon);
            JScrollPane scrollPane = new JScrollPane(label);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            panelRelatorio.setLayout(new BorderLayout());
            panelRelatorio.add(scrollPane, BorderLayout.CENTER);

            // Atualiza o layout
            panelRelatorio.revalidate();
            panelRelatorio.repaint();

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao exibir o PDF: " + e.getMessage());
        }
    }
    private void gerarPDFRelatorio(String caminhoArquivo, List<Guia> guias) {
        try (PdfWriter writer = new PdfWriter(caminhoArquivo); PdfDocument pdfDoc = new PdfDocument(writer)) {
            Document document = new Document(pdfDoc, PageSize.A4);
            document.setMargins(20, 20, 20, 20);

            PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
            PdfFont boldFont = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);

            // Cabeçalho
            document.add(new Paragraph("Relatório de Requisições")
                    .setFont(boldFont)
                    .setFontSize(16)
                    .setTextAlignment(TextAlignment.CENTER)
                    .setMarginBottom(10));
            document.add(new Paragraph("Laboratório de Análises Clínicas Tupãssi")
                    .setFont(boldFont)
                    .setFontSize(12)
                    .setTextAlignment(TextAlignment.CENTER)
                    .setMarginBottom(20));

            document.add(new Paragraph(String.format("Data inicial: %s", jDateChooserDataInicial.getDate()))
                    .setFont(font).setFontSize(10));
            document.add(new Paragraph(String.format("Data final: %s", jDateChooserDataFinal.getDate()))
                    .setFont(font).setFontSize(10));
            document.add(new Paragraph(String.format("Situação: %s\n", situacaobox.getSelectedItem()))
                    .setFont(font).setFontSize(10));

            double totalGeral = 0.0;

            for (Guia guia : guias) {
                document.add(new Paragraph(String.format("Código: %06d   Paciente: %s   Médico: %s   Data: %s",
                        guia.getId(),
                        guia.getPaciente().getNome(),
                        guia.getMedico().getNome(),
                        guia.getDataCadastro().toLocalDate()))
                        .setFont(boldFont)
                        .setFontSize(10)
                        .setMarginBottom(5));

                double totalRequisicao = 0.0;

                Table tabelaExames = new Table(new float[]{5, 2, 2});
                tabelaExames.setWidth(UnitValue.createPercentValue(100));
                tabelaExames.addHeaderCell(new Cell().add(new Paragraph("Exame").setFont(boldFont)));
                tabelaExames.addHeaderCell(new Cell().add(new Paragraph("Situação").setFont(boldFont)));
                tabelaExames.addHeaderCell(new Cell().add(new Paragraph("Valor").setFont(boldFont)));

                for (GuiaExame exame : guia.getExames()) {
                    tabelaExames.addCell(new Cell().add(new Paragraph(exame.getExame().getNome()).setFont(font)));
                    tabelaExames.addCell(new Cell().add(new Paragraph(exame.getStatus()).setFont(font)));
                    tabelaExames.addCell(new Cell().add(new Paragraph(String.format("R$ %.2f", exame.getPreco())).setFont(font)));
                    totalRequisicao += exame.getPreco();
                }

                document.add(tabelaExames);
                document.add(new Paragraph(String.format("Total requisição: R$ %.2f\n", totalRequisicao))
                        .setFont(boldFont).setFontSize(10));
                totalGeral += totalRequisicao;
            }

            document.add(new Paragraph(String.format("Total geral: R$ %.2f", totalGeral))
                    .setFont(boldFont)
                    .setFontSize(12)
                    .setMarginTop(20));

            document.close();
            JOptionPane.showMessageDialog(this, "PDF gerado com sucesso: " + caminhoArquivo);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao gerar relatório: " + e.getMessage());
        }
    }

}
