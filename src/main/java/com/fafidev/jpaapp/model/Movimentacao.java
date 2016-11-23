package com.fafidev.jpaapp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author willian
 */
@Entity
@Table(name = "movimentacoes")
public class Movimentacao implements Serializable {

    @Id
    private Long ID;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datamovimentacao")
    private Date dataMovimentacao;
    @Column(precision = 5, scale = 5)
    private BigDecimal valor;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Movimentacao{" + "ID=" + ID + ", dataMovimentacao=" + dataMovimentacao + ", valor=" + valor + '}';
    }

}
