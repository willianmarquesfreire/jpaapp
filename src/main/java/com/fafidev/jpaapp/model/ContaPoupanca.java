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
@Table(name = "contaspoupancas")
public class ContaPoupanca extends Conta implements Serializable {

    @Column(name = "taxarendimento", scale = 5, precision = 5)
    private BigDecimal taxaRendimento;

    public BigDecimal getTaxaManutencao() {
        return taxaRendimento;
    }

    public void setTaxaManutencao(BigDecimal taxaManutencao) {
        this.taxaRendimento = taxaManutencao;
    }

}
