package com.fafidev.jpaapp.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author willian
 */
@Entity
@Table(name = "contassalarios")
public class ContaSalario extends Conta implements Serializable {

    @Column(name = "qtdsaques", scale = 5, precision = 5)
    private Integer qtdSaques;

    public Integer getTaxaManutencao() {
        return qtdSaques;
    }

    public void setTaxaManutencao(Integer qtdSaques) {
        this.qtdSaques = qtdSaques;
    }

}
