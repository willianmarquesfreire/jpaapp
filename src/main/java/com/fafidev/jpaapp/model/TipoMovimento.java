package com.fafidev.jpaapp.model;

/**
 * @author willian
 */
public enum TipoMovimento {
    DEPOSITO,
    SAQUE,
    TRANSFERENCIA,
    RECEBIMENTO;

    private String movimento;

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }

}
