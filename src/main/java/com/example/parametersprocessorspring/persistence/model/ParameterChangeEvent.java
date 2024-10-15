package com.example.parametersprocessorspring.persistence.model;

import com.example.parametersprocessorspring.persistence.entity.ParameterEntity;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class ParameterChangeEvent {
    private Long id;
    private String newValue;
    private LocalDateTime updateDate;

    public static ParameterChangeEvent buildFrom(ParameterEntity parameterEntity) {
        return new ParameterChangeEvent(parameterEntity.getId(), parameterEntity.getValue(), parameterEntity.getUpdateDate());
    }
}
