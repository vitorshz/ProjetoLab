package br.unipar.projetolab.cellrenderer;

import br.unipar.projetolab.models.GuiaExame;
import javax.swing.*;
import java.awt.*;

public class ExameListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        if (value instanceof GuiaExame) {
            GuiaExame guiaExame = (GuiaExame) value;
            String nomeExame = guiaExame.getExame().getNome();
            String tipoMaterial = guiaExame.getExame().getTipoMaterial();
            String status = guiaExame.getStatus();

            // Configuração do texto com informações do exame
            label.setText("<html><b>" + nomeExame + "</b><br><i>Material: " + tipoMaterial + "</i><br>Status: " + status + "</html>");
        }

        // Configurações visuais
        label.setOpaque(true);
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setBackground(isSelected ? new Color(184, 207, 229) : Color.WHITE);
        label.setForeground(isSelected ? Color.BLACK : Color.DARK_GRAY);

        return label;
    }



}

