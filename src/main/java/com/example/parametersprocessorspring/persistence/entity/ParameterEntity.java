package com.example.parametersprocessorspring.persistence.entity;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ParameterEntity {
    Long Id;
    //    @Unique
    String Name;
    String Value;
    LocalDateTime createDate;
    LocalDateTime updateDate;
}