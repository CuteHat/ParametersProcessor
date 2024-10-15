package com.example.parametersprocessorspring.persistence.repository;

import com.example.parametersprocessorspring.persistence.entity.ParameterEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParameterRepository implements ParameterRepositoryInterface {
    @Override
    public ParameterEntity save() {
        return null;
    }

    @Override
    public ParameterEntity searchByName(String name) {
        return null;
    }

    @Override
    public List<ParameterEntity> findAll(int page, int howMany) {
        return null;
    }

    @Override
    public void delete(ParameterEntity entity) {

    }

    @Override
    public void deleteById(ParameterEntity entity) {

    }

    @Override
    public void updateValue(Long parameterId, String value) {

    }
}
