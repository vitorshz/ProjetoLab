package br.unipar.projetolab.views;

import br.unipar.projetolab.models.CampoResultadoExame;
import br.unipar.projetolab.models.EstruturaExame;
import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.models.Guia;
import br.unipar.projetolab.models.GuiaExame;
import br.unipar.projetolab.utils.EntityManagerUtil;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import java.util.List;

public class ExameCarregaPanel extends JPanel {

    private Exame exame;
    private Guia guia;
    private List<CampoResultadoExame> resultadosSalvos;

    public ExameCarregaPanel(Exame exame, Guia guia) {
        this.exame = exame;
        this.guia = guia;
        this.resultadosSalvos = new ArrayList<>();

        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(new Color(245, 245, 220));

        carregarResultados();
        criarComponentes();
    }

    private void carregarResultados() {
        EntityManager em = EntityManagerUtil.getManager();
        try {
            resultadosSalvos = em.createQuery(
                    "SELECT c FROM CampoResultadoExame c "
                    + "WHERE c.resultadoExame.exame.id = :exameId AND c.resultadoExame.guia.id = :guiaId",
                    CampoResultadoExame.class)
                    .setParameter("exameId", exame.getId())
                    .setParameter("guiaId", guia.getId())
                    .getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    private void criarComponentes() {
        // Adicionar título e informações do exame como antes
        JLabel tituloLabel = new JLabel(exame.getNome());
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 24));
        tituloLabel.setBounds(20, 10, 400, 30);
        add(tituloLabel);

        // Material
        JLabel materialLabel = new JLabel("Material: " + exame.getTipoMaterial());
        materialLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        materialLabel.setBounds(20, 50, 200, 20);
        add(materialLabel);

        // Valores de referência
        String referencias = exame.getEstruturas().isEmpty()
                ? "Sem valores de referência"
                : exame.getEstruturas().get(0).getReferencias();

        JLabel referenciaLabel = new JLabel("<html>Valores de Referência:<br>" + referencias + "</html>");
        referenciaLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        referenciaLabel.setBounds(400, 10, 200, 60);
        referenciaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        add(referenciaLabel);

        // Campos de resultado
        JPanel camposResultadoPanel = new JPanel();
        camposResultadoPanel.setLayout(null);
        camposResultadoPanel.setBounds(20, 100, 600, 300);
        camposResultadoPanel.setBackground(new Color(245, 245, 220));
        add(camposResultadoPanel);

        int yOffset = 0;
        for (EstruturaExame estrutura : exame.getEstruturas()) {
            CampoResultadoExame resultadoSalvo = resultadosSalvos.stream()
                    .filter(r -> r.getEstruturaExame().getId().equals(estrutura.getId()))
                    .findFirst()
                    .orElse(null);

            if (resultadoSalvo != null) {
                JLabel label = new JLabel(estrutura.getTexto() + ": " + resultadoSalvo.getValor());
                label.setFont(new Font("Arial", Font.PLAIN, 14));
                label.setBounds(0, yOffset, 450, 25);
                camposResultadoPanel.add(label);
            } else {
                JTextField textField = new JTextField(estrutura.getValorPadrao());
                textField.setBounds(160, yOffset, 300, 30);
                camposResultadoPanel.add(textField);
            }
            yOffset += 40;
        }
    }
}

