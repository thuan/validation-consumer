package com.auditcom.validationconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.auditcom.validationconsumer.domain.AlimentoAcordanteEntrada;
import com.auditcom.validationconsumer.domain.ResultadoAlimentoAcordanteEntrada;

@FeignClient(name = "FeignClientService", url = "http://localhost:8081/define-region")
public interface FeignClientService {
	@RequestMapping(method = RequestMethod.POST, value = "/resultado", consumes = "application/json")
	ResponseEntity<ResultadoAlimentoAcordanteEntrada> getResultado(
			@RequestBody AlimentoAcordanteEntrada alimentoAcordanteEntrada);
}
