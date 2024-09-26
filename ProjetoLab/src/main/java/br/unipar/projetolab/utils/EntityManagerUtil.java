package br.unipar.projetolab.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
    
    private static EntityManagerFactory emf;
    
    private EntityManagerUtil() {
        // Construtor privado para evitar instanciamento
    }
    
    // Inicializa o EntityManagerFactory se não estiver já inicializado
    public static EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            try {
                emf = Persistence.createEntityManagerFactory("DesktopPU");
                System.out.println("Conexão aberta!");
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao inicializar EntityManagerFactory", e);
            }
        }
        return emf;
    }

    // Fecha o EntityManagerFactory
    public static void closeEntityManagerFactory() {
        if (emf != null && emf.isOpen()) {
            emf.close();
            System.out.println("Conexão fechada!");
        }
    }

    // Garante que o EntityManager seja criado somente após a inicialização da EntityManagerFactory
    public static EntityManager getManager() {
        if (emf == null) {
            // Garante que a fábrica esteja inicializada
            getEntityManagerFactory();
        }
        EntityManager em = emf.createEntityManager();  // Cria um novo EntityManager
        System.out.println("EntityManager aberto!");
        return em;
    }
}
