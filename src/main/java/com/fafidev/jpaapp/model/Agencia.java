package com.fafidev.jpaapp.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author willian
 */
@Entity
@Table(name = "agencias")
public class Agencia implements Serializable {

    @Id
    private Long ID;

    @Column(nullable = false)
    private String numero;
    @Column(name = "digitoverificador")
    private String digitoVerificador;

    @OneToOne
    private Endereco endereco;

    @OneToMany
    private List<Conta> contas;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "Agencia{" + "ID=" + ID + ", numero=" + numero + ", digitoVerificador=" + digitoVerificador + '}';
    }

}
