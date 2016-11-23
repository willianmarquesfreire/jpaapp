package com.fafidev.jpaapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "pessoasfisicas")
public class PessoaFisica extends Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "nome=" + nome + '}';
    }

}
