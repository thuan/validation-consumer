package com.auditcom.validationconsumer.domain;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public double getValorBaseDeCalculo() {
		return valorBaseDeCalculo;
	}

	public void setValorBaseDeCalculo(double valorBaseDeCalculo) {
		this.valorBaseDeCalculo = valorBaseDeCalculo;
	}

	public Double getPercentualCargaLiquida() {
		return percentualCargaLiquida;
	}

	public void setPercentualCargaLiquida(Double percentualCargaLiquida) {
		this.percentualCargaLiquida = percentualCargaLiquida;
	}

	public boolean isCalcularImposto() {
		return calcularImposto;
	}

	public void setCalcularImposto(boolean calcularImposto) {
		this.calcularImposto = calcularImposto;
	}

	public boolean isSimplesNacional() {
		return simplesNacional;
	}

	public void setSimplesNacional(boolean simplesNacional) {
		this.simplesNacional = simplesNacional;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getRegiaoEmitente() {
		return regiaoEmitente;
	}

	public void setRegiaoEmitente(String regiaoEmitente) {
		this.regiaoEmitente = regiaoEmitente;
	}

	public String getRegiaoDestinatario() {
		return regiaoDestinatario;
	}

	public void setRegiaoDestinatario(String regiaoDestinatario) {
		this.regiaoDestinatario = regiaoDestinatario;
	}

	public String getFluxo() {
		return fluxo;
	}

	public void setFluxo(String fluxo) {
		this.fluxo = fluxo;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
