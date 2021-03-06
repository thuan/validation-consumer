package com.auditcom.validationconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.auditcom.validationconsumer.domain.AlimentoAcordanteEntrada;
import com.auditcom.validationconsumer.domain.ResultadoAlimentoAcordanteEntrada;

@Service
public class ConsumerQueueEntryService {

	@Autowired
	private FeignClientService feignClientService;

	@Autowired
	private RequestQueueOuputService requestQueueOuputService;

	@Autowired
	private PersistAlimentoAcordanteEntradaService persistAlimentoAcordanteEntradaService;

	public ResponseEntity<ResultadoAlimentoAcordanteEntrada> validationRule(
			AlimentoAcordanteEntrada alimentoAcordanteEntrada) {
		return feignClientService.getResultado(alimentoAcordanteEntrada);
	}

	public void putToQueueOuput(AlimentoAcordanteEntrada alimentoAcordanteEntrada) {
		ResponseEntity<ResultadoAlimentoAcordanteEntrada> resultadoAlimentoAcordanteEntrada = validationRule(
				alimentoAcordanteEntrada);
		persistAlimentoAcordanteEntradaService.add(alimentoAcordanteEntrada);

		resultadoAlimentoAcordanteEntrada.getBody().setIdNf(alimentoAcordanteEntrada.getIdNf());
		requestQueueOuputService.putQueueOuput(resultadoAlimentoAcordanteEntrada.getBody());
	}
}
