package com.fafidev.jpaapp.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

    @Override
    public String toString() {
        return "Agencia{" + "ID=" + ID + ", numero=" + numero + ", digitoVerificador=" + digitoVerificador + '}';
    }

}
