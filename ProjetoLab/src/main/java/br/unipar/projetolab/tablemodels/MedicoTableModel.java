package br.unipar.projetolab.tablemodels;

import br.unipar.projetolab.models.Medico;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MedicoTableModel extends AbstractTableModel {

    private List<Medico> medicos;
    private final String[] colunas = {"Código", "Nome", "CRM", "Especialidade", "Tipo", "Data Nasc.", "Celular"}; // Adicione ou remova colunas conforme necessário

    public MedicoTableModel(List<Medico> medicos) {
        this.medicos = medicos;
    }

    @Override
    public int getRowCount() {
        return medicos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Medico medico = medicos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return medico.getId();
            case 1:
                return medico.getNome();
            case 2:
                return medico.getConselhoCrm();
            case 3:
                return medico.getEspecialidade();
            case 4:
                return medico.getTipo();
            case 5:
                return medico.getDataNascimento(); // Você pode precisar formatar essa data
            case 6:
                return medico.getCelular();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public Medico getMedicoAt(int rowIndex) {
        return medicos.get(rowIndex);
    }
}
