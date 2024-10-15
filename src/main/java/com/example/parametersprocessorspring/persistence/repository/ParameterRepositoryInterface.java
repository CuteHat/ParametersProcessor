package com.example.parametersprocessorspring.persistence.repository;

import com.example.parametersprocessorspring.persistence.entity.ParameterEntity;

import java.util.List;

interface ParameterRepositoryInterface {
    ParameterEntity save();

    ParameterEntity searchByName(String name);

    List<ParameterEntity> findAll(int page, int howMany); // page=1 howmany=100 default

    void delete(ParameterEntity entity);

    void deleteById(ParameterEntity entity);

    void updateValue(Long parameterId, String value);
}