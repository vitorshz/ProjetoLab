package br.unipar.projetolab.tablemodels;

import br.unipar.projetolab.models.EstruturaExame;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class EstruturaExameTableModel extends AbstractTableModel {

    private final String[] colunas = {"Ordem", "Var", "Tipo", "Texto", "Unidade", "Calculo", "Referencias", "Máximo", "Obrigatório", "Vl Padrão"};
    private final List<EstruturaExame> linhas = new ArrayList<>();
    private final String[] tipos = {"Texto", "Editável", "Número", "Fórmula", "Lista de Opções", "Observações"};

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 8) {
            return Boolean.class;
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EstruturaExame linha = linhas.get(rowIndex);
        switch (columnIndex) {
            case 0: return linha.getOrdem();
            case 1: return linha.getVariavel();
            case 2: return linha.getTipo();
            case 3: return linha.getTexto();
            case 4: return linha.getUnidade();
            case 5: return linha.getCalculo();
            case 6: return linha.getReferencias();
            case 7: return linha.getMaximo();
            case 8: return linha.getObrigatorio();
            case 9: return linha.getValorPadrao();
            default: return null;
        }
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        EstruturaExame linha = linhas.get(rowIndex);
        switch (columnIndex) {
            case 1:
                linha.setVariavel((String) value);
                break;
            case 2:
                linha.setTipo((String) value);
                configurarColunasPorTipo(linha); // Configura colunas conforme o tipo selecionado
                break;
            case 3:
                linha.setTexto((String) value);
                break;
            case 4:
                linha.setUnidade((String) value);
                break;
            case 5:
                linha.setCalculo((String) value);
                break;
            case 6:
                linha.setReferencias((String) value);
                break;
            case 7:
                linha.setMaximo((String) value);
                break;
            case 8:
                linha.setObrigatorio((Boolean) value);
                break;
            case 9: // Valor Padrão
                if ("Lista de Opções".equals(linha.getTipo()) && linha.getTexto() != null) {
                    String[] opcoes = linha.getTexto().split(",");
                    if (!Arrays.asList(opcoes).contains(value)) {
                        JOptionPane.showMessageDialog(null, "O valor padrão deve ser uma das opções listadas.");
                        return;
                    }
                }
                linha.setValorPadrao((String) value);
                break;
            default:
                super.setValueAt(value, rowIndex, columnIndex);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void configurarColunasPorTipo(EstruturaExame linha) {
        String tipo = linha.getTipo();
        if (tipo == null || tipo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O tipo do campo não pode ser vazio.");
            return;
        }

        switch (tipo) {
            case "Texto":
            case "Observações":
                linha.setCalculo(null);
                linha.setReferencias(null);
                linha.setTexto("Digite o texto aqui");
                break;

            case "Editável":
                linha.setTexto(null);
                linha.setReferencias(null);
                break;

            case "Número":
                linha.setCalculo(null);
                linha.setTexto(null);
                linha.setReferencias("Exemplo: 0-100");
                break;

            case "Fórmula":
                linha.setCalculo("Exemplo: A+B");
                linha.setTexto(null);
                linha.setReferencias(null);
                break;

            case "Lista de Opções":
                linha.setTexto("Opção 1, Opção 2"); // Texto inicial para opções
                linha.setCalculo(null);
                linha.setReferencias(null);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Tipo inválido: " + tipo);
        }
    }


    public void adicionarLinha() {
        EstruturaExame novaLinha = new EstruturaExame();
        novaLinha.setOrdem(linhas.size() + 1); // Set ordem to the next number
        linhas.add(novaLinha);
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    public void removerLinha(int rowIndex) {
        int confirmacao = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza de que deseja excluir esta linha?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacao == JOptionPane.YES_OPTION) {
            linhas.remove(rowIndex);
            fireTableRowsDeleted(rowIndex, rowIndex);
        }
    }


    public String[] getTipos() {
        return tipos;
    }

    public List<EstruturaExame> getLinhas() {
        return linhas;
    }

    public void setLinhas(List<EstruturaExame> estruturas) {
        linhas.clear();
        linhas.addAll(estruturas);
        fireTableDataChanged();
    }

    public void limparTabela() {
        linhas.clear();
        fireTableDataChanged();
    }
}
