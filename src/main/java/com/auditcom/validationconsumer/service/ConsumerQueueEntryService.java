package com.auditcom.validationconsumer.service;

import com.auditcom.validationconsumer.domain.AlimentoAcordanteEntrada;
import com.auditcom.validationconsumer.domain.ResultadoAlimentoAcordanteEntrada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerQueueEntryService {

    @Autowired
    private FeignClientService feignClientService;

    @Autowired
    private RequestQueueOuputService requestQueueOuputService;

    public ResultadoAlimentoAcordanteEntrada validationRule(AlimentoAcordanteEntrada alimentoAcordanteEntrada) {
        return feignClientService.getResultado(
            alimentoAcordanteEntrada.getUfEmitente(),
            alimentoAcordanteEntrada.getUfDestinatario(),
            alimentoAcordanteEntrada.getPercentualICMS(),
            alimentoAcordanteEntrada.getCrt(),
            alimentoAcordanteEntrada.getValorItem(),
            alimentoAcordanteEntrada.getValorIPI(),
            alimentoAcordanteEntrada.getValorFrete(),
            alimentoAcordanteEntrada.getValorSeguro(),
            alimentoAcordanteEntrada.getValorOutros(),
            alimentoAcordanteEntrada.getCst(),
            alimentoAcordanteEntrada.getCategoria()
        );
    }

    public void putToQueueOuput(AlimentoAcordanteEntrada alimentoAcordanteEntrada) {
        ResultadoAlimentoAcordanteEntrada resultadoAlimentoAcordanteEntrada = validationRule(alimentoAcordanteEntrada);

        requestQueueOuputService.putQueueOuput(resultadoAlimentoAcordanteEntrada);
    }
}
//
//
//JuncaoResultadoEAlimentoAcordanteEnttrada juncaoResultadoEAlimentoAcordanteEntrada = JuncaoResultadoEAlimentoAcordanteEnttrada
//		.builder().categoriaAlimento(alimentoAcordanteEntrada.getCategoria())
//		.categoriaResultado(resultadoAlimentoAcordanteEntrada.getCategoria())
//		.cfop(alimentoAcordanteEntrada.getCfop())
//		.cnpjDestinatario(alimentoAcordanteEntrada.getCnpjDestinatario())
//		.cnpjEmitente(alimentoAcordanteEntrada.getCnpjEmitente()).crt(alimentoAcordanteEntrada.getCrt())
//		.cst(alimentoAcordanteEntrada.getCst()).fluxo(resultadoAlimentoAcordanteEntrada.getFluxo())
//		.mensagem(resultadoAlimentoAcordanteEntrada.getMensagem())
//		.normaExecucao(alimentoAcordanteEntrada.getNormaExecucao())
//		.percentualCargaLiquida(resultadoAlimentoAcordanteEntrada.getPercentualCargaLiquida())
//		.percentualICMS(alimentoAcordanteEntrada.getPercentualICMS())
//		.regiaoDestinatario(resultadoAlimentoAcordanteEntrada.getRegiaoDestinatario())
//		.regiaoEmitente(resultadoAlimentoAcordanteEntrada.getRegiaoEmitente())
//		.tipoProduto(resultadoAlimentoAcordanteEntrada.getTipoProduto())
//		.ufDestinatario(alimentoAcordanteEntrada.getUfDestinatario())
//		.ufEmitente(alimentoAcordanteEntrada.getUfEmitente())
//		.valorBaseDeCalculo(resultadoAlimentoAcordanteEntrada.getValorBaseDeCalculo())
//		.valorFrete(alimentoAcordanteEntrada.getValorFrete())
//		.valorImposto(resultadoAlimentoAcordanteEntrada.getValorImposto())
//		.valorIPI(alimentoAcordanteEntrada.getValorIPI()).valorItem(alimentoAcordanteEntrada.getValorItem())
//		.valorOutros(alimentoAcordanteEntrada.getValorOutros())
//		.valorSeguro(alimentoAcordanteEntrada.getValorSeguro()).build();
