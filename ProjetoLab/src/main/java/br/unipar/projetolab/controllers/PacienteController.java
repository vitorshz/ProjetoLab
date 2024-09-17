package br.unipar.projetolab.controllers;

import br.unipar.projetolab.models.Paciente;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PacienteController {

    public void cadastrarPaciente(Paciente paciente) {
        // Abrir uma sessão do Hibernate
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            // Iniciar a transação
            transaction = session.beginTransaction();
            // Salvar o paciente no banco de dados
            session.save(paciente);
            // Comitar a transação
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

