package com.example.parametersprocessorspring.persistence.service;

import com.example.parametersprocessorspring.persistence.model.ParameterChangeEvent;
import com.example.parametersprocessorspring.persistence.model.ParameterUpdateMessage;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class KafkaProducer {
    public final String TOPIC = "PARAMETER_UPDATE_EVENT";
    public final String EVENT_TYPE = "PARAMETER_UPDATE_EVENT";

    @Retry
    public void produce(ParameterChangeEvent event) {
        ParameterUpdateMessage message = new ParameterUpdateMessage();

        Gson gson = new Gson();
        String messageString =gson.toJson(event);

        message.setMessage(messageString);
//        message.setTimestamp(); set local timestamp
        message.setEventType(EVENT_TYPE);

        // make call to kafka client
        // result = kafkaClient(TOPIC,message)
        String result;


    }
}
