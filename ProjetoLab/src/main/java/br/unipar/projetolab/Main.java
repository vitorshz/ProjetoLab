
package br.unipar.projetolab;

import br.unipar.projetolab.models.RequisicaoModel;
import br.unipar.projetolab.views.ConvenioFrame;
import br.unipar.projetolab.views.EstruturaExameFrame;
import br.unipar.projetolab.views.ExameFrame;
import br.unipar.projetolab.views.ImpresaoReqPanel;
import br.unipar.projetolab.views.LoginFrame;
import br.unipar.projetolab.views.MedicoFrame;
import br.unipar.projetolab.views.OperadorFrame;
import br.unipar.projetolab.views.PacienteFrame;
import br.unipar.projetolab.views.RelatorioRquisicaoPanel;
import br.unipar.projetolab.views.RequisicaoCadPanel;
import br.unipar.projetolab.views.ResultadoExameFrame;
import br.unipar.projetolab.views.ResultadoExamePanel;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.UIManager;


public class Main extends javax.swing.JFrame {
    private PacienteFrame pacienteFrame;
    private MedicoFrame medicoFrame;
    private ConvenioFrame convenioFrame;
    private RequisicaoCadPanel requisicaopanel;
    
    private boolean isCadastroExpanded = false;
    private boolean isResultadoExpanded = false;
    private Timer cadastroTimer;
    private Timer resultadoTimer;
    private int cadastroHeight = 0;
    private int resultadoHeight = 0;
    
    // Adicionando as variáveis de controle para o dropdown de Exames
    private boolean isExamesExpanded = false;
    private Timer examesTimer;
    private int examesHeight = 0;
    
    public Main() {

        initComponents();
        setupDropdowns();
        setExtendedState(MAXIMIZED_BOTH);
        // Timer para fechar a tela inicial após um certo tempo (exemplo: 1 hora)
        Timer timer = new Timer(3600000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre o LogiFrame (substitua pelo seu frame real)
                LoginFrame logiFrame = new LoginFrame(); // Altere para o nome correto do seu frame
                logiFrame.setVisible(true);
                dispose(); // Fecha a tela atual
            }
        });
        timer.setRepeats(false); // Executa apenas uma vez
        timer.start(); // Inicia o timer
        

    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        sideBar = new javax.swing.JPanel();
        cadastroPanel = new javax.swing.JPanel();
        btnGuia = new javax.swing.JButton();
        btnConvenio = new javax.swing.JButton();
        btnMédico = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnCadastros = new javax.swing.JButton();
        btnResultados = new javax.swing.JButton();
        resultadoPanel = new javax.swing.JPanel();
        btnImpressaoExames1 = new javax.swing.JButton();
        btnInclusaoExames1 = new javax.swing.JButton();
        panelExames = new javax.swing.JPanel();
        btnEstruturaExame = new javax.swing.JButton();
        cadastroExame = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnExames = new javax.swing.JButton();
        telaSubtsPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        pacientemenuitem = new javax.swing.JMenuItem();
        medicomenuitem = new javax.swing.JMenuItem();
        conveniomenuitem = new javax.swing.JMenuItem();
        operadorMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sideBar.setBackground(new java.awt.Color(51, 51, 51));

        cadastroPanel.setBackground(new java.awt.Color(51, 51, 51));

        btnGuia.setBackground(new java.awt.Color(51, 51, 51));
        btnGuia.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnGuia.setForeground(new java.awt.Color(255, 255, 255));
        btnGuia.setText("Guia");
        btnGuia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiaActionPerformed(evt);
            }
        });

        btnConvenio.setBackground(new java.awt.Color(51, 51, 51));
        btnConvenio.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnConvenio.setForeground(new java.awt.Color(255, 255, 255));
        btnConvenio.setText("Convênio");
        btnConvenio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvenioActionPerformed(evt);
            }
        });

        btnMédico.setBackground(new java.awt.Color(51, 51, 51));
        btnMédico.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnMédico.setForeground(new java.awt.Color(255, 255, 255));
        btnMédico.setText("Médicos");
        btnMédico.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnMédico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMédicoActionPerformed(evt);
            }
        });

        btnPaciente.setBackground(new java.awt.Color(51, 51, 51));
        btnPaciente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnPaciente.setText("Paciente");
        btnPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastroPanelLayout = new javax.swing.GroupLayout(cadastroPanel);
        cadastroPanel.setLayout(cadastroPanelLayout);
        cadastroPanelLayout.setHorizontalGroup(
            cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMédico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGuia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cadastroPanelLayout.setVerticalGroup(
            cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroPanelLayout.createSequentialGroup()
                .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMédico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnCadastros.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastros.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnCadastros.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-cadastro-32px.png"))); // NOI18N
        btnCadastros.setText("Cadastros");
        btnCadastros.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnCadastros.setIconTextGap(12);
        btnCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrosActionPerformed(evt);
            }
        });

        btnResultados.setBackground(new java.awt.Color(51, 51, 51));
        btnResultados.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnResultados.setForeground(new java.awt.Color(255, 255, 255));
        btnResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-resultado-exame-de-sangue-32px.png"))); // NOI18N
        btnResultados.setText("Resultados");
        btnResultados.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnResultados.setIconTextGap(12);
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
            }
        });

        resultadoPanel.setBackground(new java.awt.Color(51, 51, 51));

        btnImpressaoExames1.setBackground(new java.awt.Color(51, 51, 51));
        btnImpressaoExames1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnImpressaoExames1.setForeground(new java.awt.Color(255, 255, 255));
        btnImpressaoExames1.setText("Impressão");
        btnImpressaoExames1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnImpressaoExames1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpressaoExames1ActionPerformed(evt);
            }
        });

        btnInclusaoExames1.setBackground(new java.awt.Color(51, 51, 51));
        btnInclusaoExames1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnInclusaoExames1.setForeground(new java.awt.Color(255, 255, 255));
        btnInclusaoExames1.setText("Inclusão");
        btnInclusaoExames1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnInclusaoExames1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInclusaoExames1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultadoPanelLayout = new javax.swing.GroupLayout(resultadoPanel);
        resultadoPanel.setLayout(resultadoPanelLayout);
        resultadoPanelLayout.setHorizontalGroup(
            resultadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(resultadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInclusaoExames1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImpressaoExames1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        resultadoPanelLayout.setVerticalGroup(
            resultadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnInclusaoExames1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnImpressaoExames1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelExames.setBackground(new java.awt.Color(51, 51, 51));

        btnEstruturaExame.setBackground(new java.awt.Color(51, 51, 51));
        btnEstruturaExame.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEstruturaExame.setForeground(new java.awt.Color(255, 255, 255));
        btnEstruturaExame.setText("Editar Estrutura Exame");
        btnEstruturaExame.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnEstruturaExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstruturaExameActionPerformed(evt);
            }
        });

        cadastroExame.setBackground(new java.awt.Color(51, 51, 51));
        cadastroExame.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cadastroExame.setForeground(new java.awt.Color(255, 255, 255));
        cadastroExame.setText("Cadastro Exame");
        cadastroExame.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cadastroExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroExameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelExamesLayout = new javax.swing.GroupLayout(panelExames);
        panelExames.setLayout(panelExamesLayout);
        panelExamesLayout.setHorizontalGroup(
            panelExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExamesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEstruturaExame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelExamesLayout.setVerticalGroup(
            panelExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExamesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(cadastroExame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEstruturaExame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnRelatorios.setBackground(new java.awt.Color(51, 51, 51));
        btnRelatorios.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-relatorio-32px.png"))); // NOI18N
        btnRelatorios.setText("Relatórios");
        btnRelatorios.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnRelatorios.setIconTextGap(12);
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        btnExames.setBackground(new java.awt.Color(51, 51, 51));
        btnExames.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnExames.setForeground(new java.awt.Color(255, 255, 255));
        btnExames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exame-64px.png"))); // NOI18N
        btnExames.setText("Exames");
        btnExames.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnExames.setIconTextGap(12);
        btnExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(resultadoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelExames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRelatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnExames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(cadastroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(resultadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnExames, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelExames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        telaSubtsPanel.setLayout(new java.awt.BorderLayout());

        jMenu3.setText("Cadastros");

        pacientemenuitem.setText("Paciente");
        pacientemenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacientemenuitemActionPerformed(evt);
            }
        });
        jMenu3.add(pacientemenuitem);

        medicomenuitem.setText("Médico");
        medicomenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicomenuitemActionPerformed(evt);
            }
        });
        jMenu3.add(medicomenuitem);

        conveniomenuitem.setText("Convenio");
        conveniomenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conveniomenuitemActionPerformed(evt);
            }
        });
        jMenu3.add(conveniomenuitem);

        operadorMenuItem.setText("Operador");
        operadorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operadorMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(operadorMenuItem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telaSubtsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaSubtsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pacientemenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientemenuitemActionPerformed
        try {
            pacienteFrame = new PacienteFrame(telaSubtsPanel);
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        pacienteFrame.setVisible(true); 
    }//GEN-LAST:event_pacientemenuitemActionPerformed

    private void medicomenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicomenuitemActionPerformed
        try {
            medicoFrame = new MedicoFrame(telaSubtsPanel);
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        medicoFrame.setVisible(true);
    }//GEN-LAST:event_medicomenuitemActionPerformed

    private void conveniomenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conveniomenuitemActionPerformed
        convenioFrame = new ConvenioFrame(telaSubtsPanel);
        convenioFrame.setVisible(true);    }//GEN-LAST:event_conveniomenuitemActionPerformed

    private void operadorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operadorMenuItemActionPerformed
        OperadorFrame operadorFrame = new OperadorFrame();
        operadorFrame.setVisible(true);
    }//GEN-LAST:event_operadorMenuItemActionPerformed

    private void btnCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrosActionPerformed
        toggleCadastroDropdown();
    }//GEN-LAST:event_btnCadastrosActionPerformed

    private void btnMédicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMédicoActionPerformed
        try {
            // Inicializar o painel inicial
            telaSubtsPanel.removeAll();
            MedicoFrame relatorioCadPanel = new MedicoFrame(telaSubtsPanel);
            
            // Adicionar o painel inicial à tela principal
            telaSubtsPanel.add(relatorioCadPanel, java.awt.BorderLayout.CENTER);
            
            // Atualizar a interface
            telaSubtsPanel.revalidate();
            telaSubtsPanel.repaint();
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMédicoActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        try {
            // Inicializar o painel inicial
            telaSubtsPanel.removeAll();
            PacienteFrame relatorioCadPanel = new PacienteFrame(telaSubtsPanel);
            
            // Adicionar o painel inicial à tela principal
            telaSubtsPanel.add(relatorioCadPanel, java.awt.BorderLayout.CENTER);
            
            // Atualizar a interface
            telaSubtsPanel.revalidate();
            telaSubtsPanel.repaint();
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvenioActionPerformed
       // Inicializar o painel inicial
        telaSubtsPanel.removeAll();
        ConvenioFrame relatorioCadPanel = new ConvenioFrame(telaSubtsPanel);

        // Adicionar o painel inicial à tela principal
        telaSubtsPanel.add(relatorioCadPanel, java.awt.BorderLayout.CENTER);

        // Atualizar a interface
        telaSubtsPanel.revalidate();
        telaSubtsPanel.repaint(); 
    }//GEN-LAST:event_btnConvenioActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        // Inicializar o painel inicial
        telaSubtsPanel.removeAll();
        RelatorioRquisicaoPanel relatorioCadPanel = new RelatorioRquisicaoPanel(telaSubtsPanel);

        // Adicionar o painel inicial à tela principal
        telaSubtsPanel.add(relatorioCadPanel, java.awt.BorderLayout.CENTER);

        // Atualizar a interface
        telaSubtsPanel.revalidate();
        telaSubtsPanel.repaint();    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiaActionPerformed
        telaSubtsPanel.removeAll();
        // Inicializar o RequisicaoModel
        RequisicaoModel requisicaoModel = new RequisicaoModel();

        // Inicializar o painel inicial
        RequisicaoCadPanel requisicaoCadPanel = new RequisicaoCadPanel(telaSubtsPanel, requisicaoModel);

        // Adicionar o painel inicial à tela principal
        telaSubtsPanel.add(requisicaoCadPanel, java.awt.BorderLayout.CENTER);
        

        // Atualizar a interface
        telaSubtsPanel.revalidate();
        telaSubtsPanel.repaint();

    }//GEN-LAST:event_btnGuiaActionPerformed

    private void btnImpressaoExames1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpressaoExames1ActionPerformed
        // Inicializar o painel inicial
        telaSubtsPanel.removeAll();
        ImpresaoReqPanel requisicaoCadPanel = new ImpresaoReqPanel(telaSubtsPanel);

        // Adicionar o painel inicial à tela principal
        telaSubtsPanel.add(requisicaoCadPanel, java.awt.BorderLayout.CENTER);

        // Atualizar a interface
        telaSubtsPanel.revalidate();
        telaSubtsPanel.repaint();    }//GEN-LAST:event_btnImpressaoExames1ActionPerformed

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
        toggleResultadoDropdown();
    }//GEN-LAST:event_btnResultadosActionPerformed

    private void btnInclusaoExames1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInclusaoExames1ActionPerformed
        ResultadoExamePanel resultadoExamePanel = new ResultadoExamePanel(telaSubtsPanel);
        telaSubtsPanel.removeAll();
        telaSubtsPanel.add(resultadoExamePanel, BorderLayout.CENTER);
        telaSubtsPanel.revalidate();
        telaSubtsPanel.repaint();


    }//GEN-LAST:event_btnInclusaoExames1ActionPerformed

    private void btnExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamesActionPerformed
        toggleExamesDropdown(); 
    }//GEN-LAST:event_btnExamesActionPerformed

    private void btnEstruturaExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstruturaExameActionPerformed
        // Inicializar o painel inicial
        telaSubtsPanel.removeAll();
        EstruturaExameFrame requisicaoCadPanel = new EstruturaExameFrame(telaSubtsPanel);

        // Adicionar o painel inicial à tela principal
        telaSubtsPanel.add(requisicaoCadPanel, java.awt.BorderLayout.CENTER);

        // Atualizar a interface
        telaSubtsPanel.revalidate();
        telaSubtsPanel.repaint();
    }//GEN-LAST:event_btnEstruturaExameActionPerformed

    private void cadastroExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroExameActionPerformed
        // Inicializar o painel inicial
        telaSubtsPanel.removeAll();
        ExameFrame requisicaoCadPanel = new ExameFrame(telaSubtsPanel);

        // Adicionar o painel inicial à tela principal
        telaSubtsPanel.add(requisicaoCadPanel, java.awt.BorderLayout.CENTER);

        // Atualizar a interface
        telaSubtsPanel.revalidate();
        telaSubtsPanel.repaint();
    }//GEN-LAST:event_cadastroExameActionPerformed
    
    // Atualização do setup inicial para incluir Exames
    private void setupDropdowns() {
        cadastroPanel.setVisible(false);
        resultadoPanel.setVisible(false);
        panelExames.setVisible(false);

        updateArrowIcons(); // Atualiza as setas iniciais
    }

    // Modificação para atualizar os ícones do dropdown

    private void updateArrowIcons() {
        if (isCadastroExpanded) {
            btnCadastros.setText("Cadastros    ↓");
        } else {
            btnCadastros.setText("Cadastros    →");
        }

        if (isResultadoExpanded) {
            btnResultados.setText("Resultados    ↓");
        } else {
            btnResultados.setText("Resultados    →");
        }

        if (isExamesExpanded) {
            btnExames.setText("Exames    ↓");
        } else {
            btnExames.setText("Exames    →");
        }
    }
    // Métodos para alternar o estado do dropdown de Exames

    private void toggleExamesDropdown() {
        if (isExamesExpanded) {
            collapseExamesDropdown();
        } else {
            expandExamesDropdown();
        }
        updateArrowIcons(); // Atualiza a seta após a mudança
    }

    private void expandExamesDropdown() {
        isExamesExpanded = true;
        panelExames.setVisible(true); // Mostrar o painel dos botões
        examesHeight = 0;
        examesTimer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                examesHeight += 5;
                panelExames.setPreferredSize(new Dimension(221, examesHeight));
                panelExames.revalidate();
                panelExames.repaint();
                if (examesHeight >= 80) { // Ajuste conforme a quantidade de botões
                    examesTimer.stop();
                }
            }
        });
        examesTimer.start();
    }

    private void collapseExamesDropdown() {
        isExamesExpanded = false;
        examesTimer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                examesHeight -= 5;
                panelExames.setPreferredSize(new Dimension(221, examesHeight));
                panelExames.revalidate();
                panelExames.repaint();
                if (examesHeight <= 0) {
                    panelExames.setVisible(false); // Esconder o painel ao recolher
                    examesTimer.stop();
                }
            }
        });
        examesTimer.start();
    }


    // Alternar dropdown de "Cadastros"
    private void toggleCadastroDropdown() {
        if (isCadastroExpanded) {
            collapseCadastroDropdown();
        } else {
            expandCadastroDropdown();
        }
        updateArrowIcons(); // Atualiza a seta após a mudança
    }

    // Expandir dropdown de "Cadastros"
    private void expandCadastroDropdown() {
        isCadastroExpanded = true;
        cadastroPanel.setVisible(true); // Mostrar o painel dos botões
        cadastroHeight = 0;
        cadastroTimer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastroHeight += 5;
                cadastroPanel.setPreferredSize(new Dimension(221, cadastroHeight));
                cadastroPanel.revalidate();
                cadastroPanel.repaint();
                if (cadastroHeight >= 160) { // Ajustar conforme a quantidade de botões
                    cadastroTimer.stop();
                }
            }
        });
        cadastroTimer.start();
    }

    // Recolher dropdown de "Cadastros"
    private void collapseCadastroDropdown() {
        isCadastroExpanded = false;
        cadastroTimer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastroHeight -= 5;
                cadastroPanel.setPreferredSize(new Dimension(221, cadastroHeight));
                cadastroPanel.revalidate();
                cadastroPanel.repaint();
                if (cadastroHeight <= 0) {
                    cadastroPanel.setVisible(false); // Esconder o painel ao recolher
                    cadastroTimer.stop();
                }
            }
        });
        cadastroTimer.start();
    }

    // Alternar dropdown de "Resultados"
    private void toggleResultadoDropdown() {
        if (isResultadoExpanded) {
            collapseResultadoDropdown();
        } else {
            expandResultadoDropdown();
        }
        updateArrowIcons(); // Atualiza a seta após a mudança
    }

    // Expandir dropdown de "Resultados"
    private void expandResultadoDropdown() {
        isResultadoExpanded = true;
        resultadoPanel.setVisible(true); // Mostrar o painel dos botões
        resultadoHeight = 0;
        resultadoTimer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoHeight += 5;
                resultadoPanel.setPreferredSize(new Dimension(221, resultadoHeight));
                resultadoPanel.revalidate();
                resultadoPanel.repaint();
                if (resultadoHeight >= 120) { // Ajustar conforme a quantidade de botões
                    resultadoTimer.stop();
                }
            }
        });
        resultadoTimer.start();
    }

    // Recolher dropdown de "Resultados"
    private void collapseResultadoDropdown() {
        isResultadoExpanded = false;
        resultadoTimer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoHeight -= 5;
                resultadoPanel.setPreferredSize(new Dimension(221, resultadoHeight));
                resultadoPanel.revalidate();
                resultadoPanel.repaint();
                if (resultadoHeight <= 0) {
                    resultadoPanel.setVisible(false); // Esconder o painel ao recolher
                    resultadoTimer.stop();
                }
            }
        });
        resultadoTimer.start();
    }
    
    public static void main(String args[]) {
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //mudar de main() para login() depois
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastros;
    private javax.swing.JButton btnConvenio;
    private javax.swing.JButton btnEstruturaExame;
    private javax.swing.JButton btnExames;
    private javax.swing.JButton btnGuia;
    private javax.swing.JButton btnImpressaoExames1;
    private javax.swing.JButton btnInclusaoExames1;
    private javax.swing.JButton btnMédico;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnResultados;
    private javax.swing.JButton cadastroExame;
    private javax.swing.JPanel cadastroPanel;
    private javax.swing.JMenuItem conveniomenuitem;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem medicomenuitem;
    private javax.swing.JMenuItem operadorMenuItem;
    private javax.swing.JMenuItem pacientemenuitem;
    private javax.swing.JPanel panelExames;
    private javax.swing.JPanel resultadoPanel;
    private javax.swing.JPanel sideBar;
    private javax.swing.JPanel telaSubtsPanel;
    // End of variables declaration//GEN-END:variables
}
