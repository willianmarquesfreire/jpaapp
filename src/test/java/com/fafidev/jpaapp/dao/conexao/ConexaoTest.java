package com.fafidev.jpaapp.dao.conexao;

import javax.persistence.EntityManager;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author fernando
 */
public class ConexaoTest {

    private final EntityManager entityManager;

    public ConexaoTest() {
        entityManager = Conexao.getEntityManager();
    }

    @Test
    public void temConexaoValida() {
        Assert.assertNotNull(entityManager);
        Assert.assertTrue(entityManager.isOpen());
    }
}
