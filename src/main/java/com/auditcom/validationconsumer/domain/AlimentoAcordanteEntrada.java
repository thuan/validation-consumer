package com.auditcom.validationconsumer.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AlimentoAcordanteEntrada implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private int crt;
    private double percentualICMS;

    private String ufEmitente;
    private String ufDestinatario;

    private double valorItem;

    private double valorIPI;

    private double valorFrete;

    private double valorSeguro;

    private double valorOutros;

    private int cfop;

    private String cnpjEmitente;

    private String cnpjDestinatario;

    private String categoria;

    private String cst;

    private String normaExecucao;
}
