package br.unipar.projetolab.tablemodels;

import br.unipar.projetolab.models.Convenio;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ConvenioTableModel extends AbstractTableModel {

    private final List<Convenio> convenios;
    private final String[] colunas = {"Código", "Nome", "CNPJ", "Telefone"};

    public ConvenioTableModel(List<Convenio> convenios) {
        this.convenios = convenios;
    }

    @Override
    public int getRowCount() {
        return convenios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Convenio convenio = convenios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return convenio.getId();
            case 1:
                return convenio.getNome();
            case 2:
                return convenio.getCnpj();
            case 3:
                return convenio.getTelefone();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public Convenio getConvenioAt(int rowIndex) {
        return convenios.get(rowIndex);
    }
}
