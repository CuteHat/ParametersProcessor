package com.example.parametersprocessorspring.persistence.model;

import com.example.parametersprocessorspring.persistence.entity.ParameterEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
public class ParameterDTO {
    Long Id;
    String Name;
    String Value;
    LocalDateTime createDate;
    LocalDateTime updateDate;

    public static ParameterDTO from(ParameterEntity entity) {
        return new ParameterDTO();
    }
}
