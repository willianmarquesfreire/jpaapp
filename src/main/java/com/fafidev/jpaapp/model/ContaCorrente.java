package com.fafidev.jpaapp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author willian
 */
@Entity
@Table(name = "contascorrentes")
public class ContaCorrente extends Conta implements Serializable {

    @Column(name = "taxamanutencao", scale = 5, precision = 5)
    private BigDecimal taxaManutencao;

    public BigDecimal getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(BigDecimal taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

}
