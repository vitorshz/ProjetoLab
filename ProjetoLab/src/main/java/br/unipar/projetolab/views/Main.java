
package br.unipar.projetolab.views;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
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

    public Main() {

         initComponents();
        
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
        telaSubtsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        pacientemenuitem = new javax.swing.JMenuItem();
        medicomenuitem = new javax.swing.JMenuItem();
        conveniomenuitem = new javax.swing.JMenuItem();
        operadorMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        telaSubtsPanel.setBackground(new java.awt.Color(255, 255, 255));
        telaSubtsPanel.setForeground(new java.awt.Color(0, 0, 0));
        telaSubtsPanel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bem Vindo!");

        javax.swing.GroupLayout telaSubtsPanelLayout = new javax.swing.GroupLayout(telaSubtsPanel);
        telaSubtsPanel.setLayout(telaSubtsPanelLayout);
        telaSubtsPanelLayout.setHorizontalGroup(
            telaSubtsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaSubtsPanelLayout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(488, 488, 488))
        );
        telaSubtsPanelLayout.setVerticalGroup(
            telaSubtsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaSubtsPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addContainerGap(577, Short.MAX_VALUE))
        );

        menu.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telaSubtsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaSubtsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pacientemenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientemenuitemActionPerformed
        try {
            pacienteFrame = new PacienteFrame();
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        pacienteFrame.setVisible(true); 
    }//GEN-LAST:event_pacientemenuitemActionPerformed

    private void medicomenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicomenuitemActionPerformed
        try {
            medicoFrame = new MedicoFrame();
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        medicoFrame.setVisible(true);
    }//GEN-LAST:event_medicomenuitemActionPerformed

    private void conveniomenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conveniomenuitemActionPerformed
        convenioFrame = new ConvenioFrame();
        convenioFrame.setVisible(true);    }//GEN-LAST:event_conveniomenuitemActionPerformed

    private void operadorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operadorMenuItemActionPerformed
        OperadorFrame operadorFrame = new OperadorFrame();
        operadorFrame.setVisible(true);
    }//GEN-LAST:event_operadorMenuItemActionPerformed

    
    public static void main(String args[]) {
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem conveniomenuitem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem medicomenuitem;
    private javax.swing.JPanel menu;
    private javax.swing.JMenuItem operadorMenuItem;
    private javax.swing.JMenuItem pacientemenuitem;
    private javax.swing.JPanel telaSubtsPanel;
    // End of variables declaration//GEN-END:variables
}
