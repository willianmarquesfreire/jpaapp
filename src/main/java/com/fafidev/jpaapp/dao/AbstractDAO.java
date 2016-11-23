/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fafidev.jpaapp.dao;

import com.fafidev.jpaapp.dao.conexao.Conexao;
import com.fafidev.jpaapp.util.JpaAppException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author fernando
 * @param <T> classe de entidade a ser gerenciada
 */
public abstract class AbstractDAO<T> implements Serializable {

    private final Class clazz;

    public AbstractDAO(Class clazz) {
        this.clazz = clazz;
    }

    public void salvar(T entidade) {
        try {
            Conexao.beginTransaction();
            Conexao.getEntityManager().persist(entidade);
            Conexao.commitAndCloseTransaction();
        } catch (Exception ex) {
            Conexao.rollbackAndCloseTransaction();
            String erro = "Erro ao salvar " + clazz.getName() + ":" + ex.getMessage();
            throw new JpaAppException(erro, ex);
        }
    }

    public void atualizar(T entidade) {
        try {
            Conexao.beginTransaction();
            Conexao.getEntityManager().merge(entidade);
            Conexao.commitAndCloseTransaction();
        } catch (Exception ex) {
            Conexao.rollbackAndCloseTransaction();
            String erro = "Erro ao atualizar " + clazz.getName() + ":" + ex.getMessage();
            throw new JpaAppException(erro, ex);
        }
    }

    public void excluir(T entidade) {
        try {
            Conexao.beginTransaction();
            Conexao.getEntityManager().remove(Conexao.getEntityManager().merge(entidade));
            Conexao.commitAndCloseTransaction();
        } catch (Exception ex) {
            Conexao.rollbackAndCloseTransaction();
            String erro = "Erro ao excluir " + clazz.getName() + ":" + ex.getMessage();
            throw new JpaAppException(erro, ex);
        }
    }

    public T recuperar(Long id) {
        return (T) Conexao.getEntityManager().find(clazz, id);
    }

    public List<T> listarTodos() {
        try {
            String hql = "from " + clazz.getSimpleName() + " obj order by obj.id";
            Query consulta = Conexao.getEntityManager().createQuery(hql);
            return consulta.getResultList();
        } catch (Exception ex) {
            String erro = "Erro ao listar " + clazz.getName() + ":" + ex.getMessage();
            throw new JpaAppException(erro, ex);
        }
    }

    public int count() {
        String hql = "select count(obj.id) as quantidade from " + clazz.getSimpleName() + " obj";
        Query consulta = Conexao.getEntityManager().createQuery(hql);
        Long quantidade = (Long) consulta.getSingleResult();
        return quantidade.intValue();
    }
}
