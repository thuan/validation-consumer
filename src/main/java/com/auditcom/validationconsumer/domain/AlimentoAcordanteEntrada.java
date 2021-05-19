package com.auditcom.validationconsumer.domain;

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

	public int getCrt() {
		return crt;
	}

	public void setCrt(int crt) {
		this.crt = crt;
	}

	public double getPercentualICMS() {
		return percentualICMS;
	}

	public void setPercentualICMS(double percentualICMS) {
		this.percentualICMS = percentualICMS;
	}

	public String getUfEmitente() {
		return ufEmitente;
	}

	public void setUfEmitente(String ufEmitente) {
		this.ufEmitente = ufEmitente;
	}

	public String getUfDestinatario() {
		return ufDestinatario;
	}

	public void setUfDestinatario(String ufDestinatario) {
		this.ufDestinatario = ufDestinatario;
	}

	public double getValorItem() {
		return valorItem;
	}

	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}

	public double getValorIPI() {
		return valorIPI;
	}

	public void setValorIPI(double valorIPI) {
		this.valorIPI = valorIPI;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public double getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public double getValorOutros() {
		return valorOutros;
	}

	public void setValorOutros(double valorOutros) {
		this.valorOutros = valorOutros;
	}

	public int getCfop() {
		return cfop;
	}

	public void setCfop(int cfop) {
		this.cfop = cfop;
	}

	public String getCnpjEmitente() {
		return cnpjEmitente;
	}

	public void setCnpjEmitente(String cnpjEmitente) {
		this.cnpjEmitente = cnpjEmitente;
	}

	public String getCnpjDestinatario() {
		return cnpjDestinatario;
	}

	public void setCnpjDestinatario(String cnpjDestinatario) {
		this.cnpjDestinatario = cnpjDestinatario;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public String getNormaExecucao() {
		return normaExecucao;
	}

	public void setNormaExecucao(String normaExecucao) {
		this.normaExecucao = normaExecucao;
	}
}
