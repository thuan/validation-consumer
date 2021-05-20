package com.auditcom.validationconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.auditcom.validationconsumer.domain.AlimentoAcordanteEntrada;
import com.auditcom.validationconsumer.domain.ResultadoAlimentoAcordanteEntrada;

@FeignClient(name = "FeignClientService", url = "http://localhost:8086/persist/entry")
public interface PersistAlimentoAcordanteEntradaService {
	@RequestMapping(method = RequestMethod.POST, value = "/add", consumes = "application/json")
	ResponseEntity<ResultadoAlimentoAcordanteEntrada> add(
			@RequestBody AlimentoAcordanteEntrada alimentoAcordanteEntrada);
}
