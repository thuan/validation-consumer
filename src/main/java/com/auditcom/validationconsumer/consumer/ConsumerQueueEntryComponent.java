package com.auditcom.validationconsumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.auditcom.validationconsumer.config.MessageRabbitMQConfig;
import com.auditcom.validationconsumer.domain.AlimentoAcordanteEntrada;
import com.auditcom.validationconsumer.service.ConsumerQueueEntryService;

@Component
public class ConsumerQueueEntryComponent {

	@Autowired
	private ConsumerQueueEntryService consumerQueueEntryService;

	@RabbitListener(queues = MessageRabbitMQConfig.QUEUE_ENTRY)
	public void consumirQueueEntry(AlimentoAcordanteEntrada alimentoAcordanteEntrada) {
		consumerQueueEntryService.putToQueueOuput(alimentoAcordanteEntrada);
	}
}
