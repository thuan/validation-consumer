package com.auditcom.validationconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.auditcom.validationconsumer.domain.ResultadoAlimentoAcordanteEntrada;

@FeignClient(name = "FeignClientService", url = "http://localhost:8085/queueouput")
public interface RequestQueueOuputService {
	@RequestMapping(method = RequestMethod.POST, value = "/add", consumes = "application/json")
	ResponseEntity<Void> putQueueOuput(
			@RequestBody ResultadoAlimentoAcordanteEntrada resultadoAlimentoAcordanteEntrada);
}
