package com.fafidev.jpaapp.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "pessoasjuridicas")
public class PessoaJuridica extends Pessoa {

    @Column(name = "nomefantasia")
    private String nomeFantasia;
    @Column(name = "razaosocial", nullable = false)
    private String razaoSocial;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "fundacao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fundacao;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", fundacao=" + fundacao + '}';
    }

}
