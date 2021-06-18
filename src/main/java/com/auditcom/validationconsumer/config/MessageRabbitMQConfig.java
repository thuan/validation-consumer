package com.auditcom.validationconsumer.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageRabbitMQConfig {

    public static final String EXCHANGE = "message_exchange";
    public static final String QUEUE_ENTRY = "queue_entry";
    public static final String QUEUE_EXIT = "queue_exit";
    public static final String ROUTING_KEY_EXIT = "queue_exit";

    @Bean
    public Queue queueExit() {
        return new Queue(QUEUE_EXIT);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    public Binding bindingExit(TopicExchange exchange) {
        return BindingBuilder.bind(queueExit()).to(exchange).with(queueExit().getName());
    }

    @Bean
    public HealthIndicator rabbitHealthIndicator() {
        return () -> Health.up().withDetail("version", "mock").build();
    }

    @Bean
    public MessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter());
        return rabbitTemplate;
    }
}
