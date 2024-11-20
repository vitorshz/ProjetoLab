package br.unipar.projetolab.tablemodels;

import br.unipar.projetolab.models.Guia;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class GuiaTableModel extends AbstractTableModel {

    private List<Guia> guias;
    private final String[] colunas = {"Código", "Paciente", "Médico", "Data Cadastro"};

    public GuiaTableModel(List<Guia> guias) {
        this.guias = guias;
    }

    @Override
    public int getRowCount() {
        return guias.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Guia guia = guias.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return guia.getId();
            case 1:
                return guia.getPaciente().getNome();
            case 2:
                return guia.getMedico().getNome();
            case 3:
                return guia.getDataCadastro();
            default:
                return null;
        }
    }

    public void setGuias(List<Guia> guias) {
        this.guias = guias;
        fireTableDataChanged(); // Atualiza a tabela
    }

    public Guia getGuiaAt(int rowIndex) {
        return guias.get(rowIndex);
    }
}

