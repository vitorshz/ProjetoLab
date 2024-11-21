package br.unipar.projetolab.cellrenderer;

import javax.swing.*;
import java.awt.*;

public class ExameListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        // Configuração do texto
        String nomeExame = value.toString(); // O valor aqui será o nome do exame
        label.setText("<html><b>" + nomeExame + "</b><br><i>Material: Sangue</i><br>Sem resultado</html>");

        // Configurações visuais
        label.setOpaque(true);
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setBackground(isSelected ? new Color(184, 207, 229) : Color.WHITE);
        label.setForeground(isSelected ? Color.BLACK : Color.DARK_GRAY);

        return label;
    }
}

