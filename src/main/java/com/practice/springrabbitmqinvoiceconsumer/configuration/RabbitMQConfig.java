package com.practice.springrabbitmqinvoiceconsumer.configuration;

import org.springframework.amqp.support.converter.DefaultClassMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

//    @Bean
//    public MessageConverter jsonToMapMessageConverter() {
//        DefaultClassMapper defaultClassMapper = new DefaultClassMapper();
//        defaultClassMapper.setTrustedPackages("com.fasterxml.jackson.databind.node"); // trusted packages
//        Jackson2JsonMessageConverter jackson2JsonMessageConverter = new Jackson2JsonMessageConverter();
//        jackson2JsonMessageConverter.setClassMapper(defaultClassMapper);
//        return jackson2JsonMessageConverter;
//    }

}
