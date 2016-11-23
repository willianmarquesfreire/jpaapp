package com.fafidev.jpaapp.dao.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fernando
 */
public final class Conexao {

    private static final EntityManagerFactory FACTORY;
    private static final ThreadLocal<EntityManager> THREADS;

    static {
        FACTORY = Persistence.createEntityManagerFactory("JpaAppPU");
        THREADS = new ThreadLocal<>();
    }

    public static EntityManager getEntityManager() {
        EntityManager entityManager = THREADS.get();
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = FACTORY.createEntityManager();
            THREADS.set(entityManager);
        }
        return entityManager;
    }

    public static void beginTransaction() {
        getEntityManager().getTransaction().begin();
    }

    public static void commitTransaction() {
        getEntityManager().getTransaction().commit();
    }

    public static void rollbackTransaction() {
        getEntityManager().getTransaction().rollback();
    }

    public static void rollbackAndCloseTransaction() {
        rollbackTransaction();
        closeTransaction();
    }

    public static void commitAndCloseTransaction() {
        commitTransaction();
        closeTransaction();
    }

    public static void closeTransaction() {
        getEntityManager().close();
    }

    public static void closeFactory() {
        FACTORY.close();
    }
}
