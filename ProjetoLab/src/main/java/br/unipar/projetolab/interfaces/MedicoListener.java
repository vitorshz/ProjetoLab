package br.unipar.projetolab.interfaces;

import br.unipar.projetolab.models.Medico;


public interface MedicoListener {
    void onMedicoSelecionado(Medico medico);
    void onMedicoInativar(Medico medico);
}
