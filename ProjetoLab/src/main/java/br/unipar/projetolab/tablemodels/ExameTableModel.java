package br.unipar.projetolab.tablemodels;

import br.unipar.projetolab.models.Exame;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ExameTableModel extends AbstractTableModel {

    private final List<Exame> exames;
    private final String[] colunas = {"ID", "Abreviação", "Nome", "Preço Padrão", "Tipo de Material"};

    public ExameTableModel(List<Exame> exames) {
        this.exames = exames;
    }

    @Override
    public int getRowCount() {
        return exames.size();
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        Exame exame = exames.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return exame.getId();
            case 1:
                return exame.getAbreviacao();
            case 2:
                return exame.getNome();
            case 3:
                return exame.getPrecoPadrao();
            case 4:
                return exame.getTipoMaterial();
            default:
                return null;
        }
    }

    // Método para atualizar a lista de exames
    public void setExames(List<Exame> exames) {
        this.exames.clear();
        this.exames.addAll(exames);
        fireTableDataChanged(); // Notifica a tabela para atualizar os dados
    }

    // Método para retornar o exame em uma linha específica
    public Exame getExameAt(int rowIndex) {
        return exames.get(rowIndex);
    }
}

