package br.unipar.projetolab.tablemodels;

import br.unipar.projetolab.models.Paciente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PacienteTableModel extends AbstractTableModel {

    private List<Paciente> pacientes;
    private final String[] colunas = {"Código", "Nome", "Data Nasc.", "Endereço", "Login"}; // Adicionei "Login"

    public PacienteTableModel(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public int getRowCount() {
        return pacientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente paciente = pacientes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return paciente.getId();
            case 1:
                return paciente.getNome();
            case 2:
                return paciente.getDataNascimento();
            case 3:
                return paciente.getEndereco();
            case 4:
                return paciente.getLogin(); // Exibe o login
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public Paciente getPacienteAt(int rowIndex) {
        return pacientes.get(rowIndex);
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
        fireTableDataChanged(); // Atualiza a tabela sempre que a lista de pacientes mudar
    }
}
