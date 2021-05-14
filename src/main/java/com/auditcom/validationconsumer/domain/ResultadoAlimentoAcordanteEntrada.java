package com.auditcom.validationconsumer.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResultadoAlimentoAcordanteEntrada implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private Long id;
    private double valorImposto;
    private double valorBaseDeCalculo;
    private Double percentualCargaLiquida;
    private boolean calcularImposto;
    private boolean simplesNacional;
    private String mensagem;
    private String regiaoEmitente;
    private String regiaoDestinatario;
    private String fluxo;
    private String tipoProduto;
    private String categoria;
}
