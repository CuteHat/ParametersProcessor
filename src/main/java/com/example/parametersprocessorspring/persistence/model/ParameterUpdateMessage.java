package com.example.parametersprocessorspring.persistence.model;

import lombok.Setter;

import java.sql.Timestamp;

//    {
//            "id": "string",
//            "eventType": "string",
//            "timestamp": "timestamp",
//            "message": "string"
//            }
@Setter
public class ParameterUpdateMessage {
    public String eventType;
    public Timestamp timestamp;
    public String message;
}
