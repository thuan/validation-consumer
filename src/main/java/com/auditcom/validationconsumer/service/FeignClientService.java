package com.auditcom.validationconsumer.service;

import com.auditcom.validationconsumer.domain.ResultadoAlimentoAcordanteEntrada;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "FeignClientService", url = "http://localhost:8081/define-region")
public interface FeignClientService {
    @RequestMapping(method = RequestMethod.GET, value = "/resultado", consumes = "application/json")
    ResultadoAlimentoAcordanteEntrada getResultado(
        @RequestParam("ufEmitente") String ufEmitente,
        @RequestParam("ufDestinatario") String ufDestinatario,
        @RequestParam("percentualICMS") double percentualICMS,
        @RequestParam("crt") int crt,
        @RequestParam("valorItem") double valorItem,
        @RequestParam("valorIPI") double valorIPI,
        @RequestParam("valorFrete") double valorFrete,
        @RequestParam("valorSeguro") double valorSeguro,
        @RequestParam("valorOutros") double valorOutros,
        @RequestParam("cst") String cst,
        @RequestParam("categoria") String categoria
    );
}
