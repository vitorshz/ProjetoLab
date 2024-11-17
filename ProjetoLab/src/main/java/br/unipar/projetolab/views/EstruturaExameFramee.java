
package br.unipar.projetolab.views;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstruturaExameFramee extends JFrame {

    private JTextField abreviacaoField;
    private JTextField nomeField;
    private JTextField tipoMaterialField;
    private JTable estruturaTable;
    private DefaultTableModel tableModel;

    public EstruturaExameFramee() {
        setTitle("Estrutura do Exame");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Painel Superior com informações básicas do Exame
        JPanel infoPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        infoPanel.setBorder(BorderFactory.createTitledBorder("Informações do Exame"));
        
        infoPanel.add(new JLabel("Abreviação:"));
        abreviacaoField = new JTextField();
        infoPanel.add(abreviacaoField);
        
        infoPanel.add(new JLabel("Nome do Exame:"));
        nomeField = new JTextField();
        infoPanel.add(nomeField);
        
        infoPanel.add(new JLabel("Tipo de Material:"));
        tipoMaterialField = new JTextField();
        infoPanel.add(tipoMaterialField);

        // Configuração da Tabela de Estrutura
        String[] colunas = {"Ordem", "Variável", "Tipo", "Texto", "Unidade", "Cálculo", "Referências", "Máximo", "Obrigatório", "Valor Padrão"};
        tableModel = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0; // A coluna "Ordem" não é editável
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 8) return Boolean.class; // Coluna "Obrigatório" como checkbox
                return String.class;
            }
        };
        estruturaTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(estruturaTable);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Estrutura do Exame"));

        // Botões de Ação
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton addRowBtn = new JButton("Adicionar Linha");
        JButton removeRowBtn = new JButton("Remover Linha");
        JButton salvarBtn = new JButton("Salvar Estrutura");

        addRowBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                adicionarLinha();
            }
        });

        removeRowBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                removerLinha();
            }
        });

        salvarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                salvarEstrutura();
            }
        });

        buttonPanel.add(addRowBtn);
        buttonPanel.add(removeRowBtn);
        buttonPanel.add(salvarBtn);

        // Adicionar Painéis ao Frame
        mainPanel.add(infoPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        getContentPane().add(mainPanel);
    }

    private void adicionarLinha() {
        int ordem = tableModel.getRowCount() + 1;
        tableModel.addRow(new Object[]{ordem, "", "", "", "", "", "", "", false, ""});
    }

    private void removerLinha() {
        int selectedRow = estruturaTable.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
            ajustarOrdem();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para remover.");
        }
    }

    private void ajustarOrdem() {
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.setValueAt(i + 1, i, 0); // Ajusta a coluna "Ordem"
        }
    }

    private void salvarEstrutura() {
        // Implementação do código para salvar a estrutura do exame
        JOptionPane.showMessageDialog(this, "Estrutura do exame salva com sucesso!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EstruturaExameFramee().setVisible(true));
    }
}

