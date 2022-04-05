package com.clebe.cursomc.domain;

import com.clebe.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento{

    static final Long SerialVersionUID = 1L;

    private Integer numeroDeParcelas;

    public PagamentoComCartao(){}

    public PagamentoComCartao(Integer id, EstadoPagamento estado,
                              Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
