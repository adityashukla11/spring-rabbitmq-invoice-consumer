package com.practice.springrabbitmqinvoiceconsumer.consumer;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class InvoiceDetailsReceiver {

    private final ObjectMapper objectMapper;
    @RabbitListener(queues = "created-invoices")
    public void receivedNewInvoices(Message message) throws IOException {
        JsonNode invoice = objectMapper.readTree(message.getBody());
        // Further processing.
    }
}
