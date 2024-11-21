package br.unipar.projetolab.views;

import br.unipar.projetolab.models.CampoResultadoExame;
import br.unipar.projetolab.models.EstruturaExame;
import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.models.Guia;
import br.unipar.projetolab.models.GuiaExame;
import br.unipar.projetolab.models.ResultadoExame;
import br.unipar.projetolab.utils.EntityManagerUtil;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class ExameCarregaPanel extends JPanel {

    private Exame exame;
    private Guia guia;
    private JPanel camposResultadoPanel;

    public ExameCarregaPanel(Exame exame, Guia guia, GuiaExame guiaExame) {
        if (exame == null || guia == null) {
            throw new IllegalArgumentException("Exame e Guia não podem ser nulos.");
        }

        this.exame = exame;
        this.guia = guia;

        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(new Color(245, 245, 220));

        // Adiciona o painel criado pelo método criarPainelExame
        JPanel painelExame = criarPainelExame(exame, guiaExame);
        add(painelExame, BorderLayout.CENTER);
    }
    
    private JPanel criarPainelExame(Exame exame, GuiaExame guiaExame) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBackground(new Color(245, 245, 220));

        // Título do exame
        JLabel tituloLabel = new JLabel(exame.getNome());
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 24));
        tituloLabel.setBounds(20, 10, 400, 30);
        panel.add(tituloLabel);

        // Material
        JLabel materialLabel = new JLabel("Material: " + exame.getTipoMaterial());
        materialLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        materialLabel.setBounds(20, 50, 200, 20);
        panel.add(materialLabel);

        // Método
        JLabel metodoLabel = new JLabel("Método: " + exame.getMetodo());
        metodoLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        metodoLabel.setBounds(20, 70, 300, 20);
        panel.add(metodoLabel);

        // Valores de referência
        String referencias = exame.getEstruturas().isEmpty()
                ? "Sem valores de referência"
                : exame.getEstruturas().get(0).getReferencias();

        JLabel referenciaLabel = new JLabel("<html>Valores de Referência:<br>" + referencias + "</html>");
        referenciaLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        referenciaLabel.setBounds(400, 10, 200, 60);
        referenciaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(referenciaLabel);

        // Painel para campos de resultado
        camposResultadoPanel = new JPanel();
        camposResultadoPanel.setLayout(null);
        camposResultadoPanel.setBounds(20, 100, 600, 300);
        camposResultadoPanel.setBackground(new Color(245, 245, 220));
        this.add(camposResultadoPanel);
        

        // Carregar os campos de resultado
        carregarCamposResultado(guiaExame);
        
        // Botões
        JButton salvarButton = new JButton("Salvar Resultados");
        salvarButton.setBounds(20, 410, 200, 30);
        salvarButton.setVisible(false);
        panel.add(salvarButton);

        JButton editarButton = new JButton("Editar Resultados");
        editarButton.setBounds(240, 410, 200, 30);
        panel.add(editarButton);

        editarButton.addActionListener(e -> {
            salvarButton.setVisible(true);
            editarButton.setVisible(false);
            editarResultados(camposResultadoPanel);
        });

        salvarButton.addActionListener(e -> {
            salvarResultadosExame(guiaExame, camposResultadoPanel);
            salvarButton.setVisible(false);
            editarButton.setVisible(true);
        });

        return panel;
    }
    private void carregarCamposResultado(GuiaExame guiaExame) {
        camposResultadoPanel.removeAll(); // Limpa o painel antes de carregar os resultados

        EntityManager em = EntityManagerUtil.getManager();
        try {
            List<CampoResultadoExame> resultadosSalvos = em.createQuery(
                    "SELECT c FROM CampoResultadoExame c WHERE c.resultadoExame.exame.id = :exameId AND c.resultadoExame.guia.id = :guiaId",
                    CampoResultadoExame.class)
                    .setParameter("exameId", guiaExame.getExame().getId())
                    .setParameter("guiaId", guiaExame.getGuia().getId())
                    .getResultList();


            // Carrega os campos de resultado
            int yOffset = 0;
            for (EstruturaExame estrutura : guiaExame.getExame().getEstruturas()) {
                JLabel label = new JLabel(estrutura.getTexto() + ":");
                label.setFont(new Font("Arial", Font.PLAIN, 14));
                label.setBounds(20, yOffset, 150, 25);
                camposResultadoPanel.add(label);

                CampoResultadoExame resultadoSalvo = resultadosSalvos.stream()
                        .filter(r -> r.getEstruturaExame().getId().equals(estrutura.getId()))
                        .findFirst()
                        .orElse(null);

                if (resultadoSalvo != null) {
                    JLabel valorLabel = new JLabel(resultadoSalvo.getValor());
                    valorLabel.setFont(new Font("Arial", Font.PLAIN, 14));
                    valorLabel.setBounds(180, yOffset, 300, 25);
                    valorLabel.putClientProperty("estrutura", estrutura);
                    camposResultadoPanel.add(valorLabel);
                } else {
                    Component campo = criarComponenteParaTipo(estrutura);
                    if (campo instanceof JComponent) {
                        ((JComponent) campo).putClientProperty("estrutura", estrutura);
                        campo.setBounds(180, yOffset, 300, 25);
                        camposResultadoPanel.add(campo);
                    }
                }

                yOffset += 40;
            }

            camposResultadoPanel.revalidate();
            camposResultadoPanel.repaint();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar os campos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }



    private Component criarComponenteParaTipo(EstruturaExame estrutura) {
        switch (estrutura.getTipo()) {
            case "Texto":
            case "Editável":
                return new JTextField(estrutura.getValorPadrao());

            case "Número":
                JTextField numeroField = new JTextField(estrutura.getValorPadrao());
                numeroField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                            e.consume(); // Bloqueia caracteres inválidos
                        }
                    }
                });
                return numeroField;

            case "Lista de Opções":
                String[] opcoes = estrutura.getTexto() != null ? estrutura.getTexto().split(",") : new String[]{};
                return new JComboBox<>(opcoes);

            case "Observações":
                JTextArea observacoesArea = new JTextArea(estrutura.getValorPadrao());
                observacoesArea.setRows(3);
                observacoesArea.setColumns(20);
                return new JScrollPane(observacoesArea);

            case "Fórmula":
                JLabel formulaLabel = new JLabel(estrutura.getCalculo());
                formulaLabel.setFont(new Font("Arial", Font.ITALIC, 12));
                return formulaLabel;

            default:
                return new JTextField(estrutura.getValorPadrao());
        }
    }

    private void editarResultados(JPanel camposResultadoPanel) {
        for (Component comp : camposResultadoPanel.getComponents()) {
            if (comp instanceof JLabel) {
                JLabel label = (JLabel) comp;
                EstruturaExame estrutura = (EstruturaExame) label.getClientProperty("estrutura");

                if (estrutura != null) {
                    JTextField textField = new JTextField(label.getText());
                    textField.setBounds(label.getBounds());
                    textField.putClientProperty("estrutura", estrutura);

                    camposResultadoPanel.remove(label);
                    camposResultadoPanel.add(textField);
                }
            }
        }

        camposResultadoPanel.revalidate();
        camposResultadoPanel.repaint();
    }

    private void salvarResultadosExame(GuiaExame guiaExame, JPanel camposResultadoPanel) {
        EntityManager em = EntityManagerUtil.getManager();
        try {
            em.getTransaction().begin();

            // Busca ou cria o ResultadoExame
            ResultadoExame resultadoExame = em.createQuery(
                    "SELECT r FROM ResultadoExame r WHERE r.exame.id = :exameId AND r.guia.id = :guiaId",
                    ResultadoExame.class)
                    .setParameter("exameId", guiaExame.getExame().getId())
                    .setParameter("guiaId", guiaExame.getGuia().getId())
                    .getResultStream()
                    .findFirst()
                    .orElseGet(() -> {
                        ResultadoExame novo = new ResultadoExame();
                        novo.setExame(guiaExame.getExame());
                        novo.setGuia(guiaExame.getGuia());
                        em.persist(novo);
                        return novo;
                    });

            // Itera pelos componentes do painel para salvar os resultados
            for (Component comp : camposResultadoPanel.getComponents()) {
                if (comp instanceof JComponent) {
                    EstruturaExame estrutura = (EstruturaExame) ((JComponent) comp).getClientProperty("estrutura");

                    if (estrutura != null) {
                        String valor = "";
                        if (comp instanceof JTextField) {
                            valor = ((JTextField) comp).getText();
                        } else if (comp instanceof JComboBox) {
                            valor = ((JComboBox<?>) comp).getSelectedItem() != null
                                    ? ((JComboBox<?>) comp).getSelectedItem().toString()
                                    : "";
                        } else if (comp instanceof JScrollPane) {
                            JTextArea textArea = (JTextArea) ((JScrollPane) comp).getViewport().getView();
                            valor = textArea.getText();
                        }

                        CampoResultadoExame campoResultado = em.createQuery(
                                "SELECT c FROM CampoResultadoExame c WHERE c.estruturaExame.id = :estruturaId AND c.resultadoExame.id = :resultadoId",
                                CampoResultadoExame.class)
                                .setParameter("estruturaId", estrutura.getId())
                                .setParameter("resultadoId", resultadoExame.getId())
                                .getResultStream()
                                .findFirst()
                                .orElseGet(() -> {
                                    CampoResultadoExame novo = new CampoResultadoExame();
                                    novo.setEstruturaExame(estrutura);
                                    novo.setResultadoExame(resultadoExame);
                                    em.persist(novo);
                                    return novo;
                                });

                        campoResultado.setValor(valor);
                        em.merge(campoResultado);
                    }
                }
            }

            // Atualiza o status do GuiaExame para "Incluído"
            guiaExame.setStatus("Incluído");
            em.merge(guiaExame);

            em.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Resultados salvos com sucesso! Status atualizado para 'Incluído'.");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao salvar resultados: " + e.getMessage());
        } finally {
            em.close();
        }
    }


    private boolean salvarResultados() {
        EntityManager em = EntityManagerUtil.getManager();
        try {
            em.getTransaction().begin();

            // Garante que a guia esteja gerenciada
            Guia guiaGerenciada = em.find(Guia.class, guia.getId());

            // Busca ou cria o ResultadoExame
            ResultadoExame resultadoExame = em.createQuery(
                "SELECT r FROM ResultadoExame r WHERE r.exame.id = :exameId AND r.guia.id = :guiaId",
                ResultadoExame.class)
                .setParameter("exameId", exame.getId())
                .setParameter("guiaId", guiaGerenciada.getId())
                .getResultStream()
                .findFirst()
                .orElseGet(() -> {
                    ResultadoExame novoResultado = new ResultadoExame();
                    novoResultado.setExame(exame);
                    novoResultado.setGuia(guiaGerenciada);
                    em.persist(novoResultado);
                    return novoResultado;
                });

            // Processa os campos e salva no banco
            for (Component comp : camposResultadoPanel.getComponents()) {
                if (comp instanceof JComponent) {
                    EstruturaExame estrutura = (EstruturaExame) ((JComponent) comp).getClientProperty("estrutura");
                    if (estrutura != null) {
                        String valor = "";
                        if (comp instanceof JTextField) {
                            valor = ((JTextField) comp).getText();
                        } else if (comp instanceof JComboBox) {
                            valor = ((JComboBox<?>) comp).getSelectedItem() != null
                                    ? ((JComboBox<?>) comp).getSelectedItem().toString()
                                    : "";
                        } else if (comp instanceof JScrollPane) {
                            JTextArea textArea = (JTextArea) ((JScrollPane) comp).getViewport().getView();
                            valor = textArea.getText();
                        }

                        CampoResultadoExame campoResultado = em.createQuery(
                            "SELECT c FROM CampoResultadoExame c WHERE c.estruturaExame.id = :estruturaId AND c.resultadoExame.id = :resultadoId",
                            CampoResultadoExame.class)
                            .setParameter("estruturaId", estrutura.getId())
                            .setParameter("resultadoId", resultadoExame.getId())
                            .getResultStream()
                            .findFirst()
                            .orElseGet(() -> {
                                CampoResultadoExame novoCampo = new CampoResultadoExame();
                                novoCampo.setEstruturaExame(estrutura);
                                novoCampo.setResultadoExame(resultadoExame);
                                return novoCampo;
                            });

                        campoResultado.setValor(valor);
                        em.persist(campoResultado);
                    }
                }
            }

            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        } finally {
            em.close();
        }
    }
    
    private void atualizarParaCampos(JPanel camposResultadoPanel) {
        for (Component comp : camposResultadoPanel.getComponents()) {
            if (comp instanceof JLabel) {
                JLabel label = (JLabel) comp;

                EstruturaExame estrutura = label.getClientProperty("estrutura") instanceof EstruturaExame
                        ? (EstruturaExame) label.getClientProperty("estrutura")
                        : null;

                if (estrutura != null) {
                    Component campo = criarComponenteParaTipo(estrutura);
                    if (campo instanceof JComponent) {
                        ((JComponent) campo).putClientProperty("estrutura", estrutura);
                    }
                    campo.setBounds(label.getBounds());
                    camposResultadoPanel.add(campo);
                    camposResultadoPanel.remove(label);
                }
            }
        }

        camposResultadoPanel.revalidate();
        camposResultadoPanel.repaint();
    }

    private void atualizarParaLabels(JPanel camposResultadoPanel) {
        for (Component comp : camposResultadoPanel.getComponents()) {
            if (comp instanceof JComponent) {
                EstruturaExame estrutura = ((JComponent) comp).getClientProperty("estrutura") instanceof EstruturaExame
                        ? (EstruturaExame) ((JComponent) comp).getClientProperty("estrutura")
                        : null;

                if (estrutura != null) {
                    String valor = "";
                    if (comp instanceof JTextField) {
                        valor = ((JTextField) comp).getText();
                    } else if (comp instanceof JComboBox) {
                        valor = ((JComboBox<?>) comp).getSelectedItem() != null
                                ? ((JComboBox<?>) comp).getSelectedItem().toString()
                                : "";
                    } else if (comp instanceof JScrollPane) {
                        JTextArea textArea = (JTextArea) ((JScrollPane) comp).getViewport().getView();
                        valor = textArea.getText();
                    }

                    JLabel label = new JLabel(valor);
                    label.setFont(new Font("Arial", Font.PLAIN, 14));
                    label.setBounds(comp.getBounds());
                    label.putClientProperty("estrutura", estrutura);
                    camposResultadoPanel.add(label);
                    camposResultadoPanel.remove(comp);
                }
            }
        }

        camposResultadoPanel.revalidate();
        camposResultadoPanel.repaint();
    }
}
