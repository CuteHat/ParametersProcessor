package com.example.parametersprocessorspring.persistence.service;

import com.example.parametersprocessorspring.persistence.entity.ParameterEntity;
import com.example.parametersprocessorspring.persistence.model.ParameterDTO;
import com.example.parametersprocessorspring.persistence.repository.ParameterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ParameterService {
    private final ParameterRepository parameterRepository;
    private final KafkaProducer kafkaProducer;

    public List<ParameterDTO> filter(Integer page, Integer count) {
        List<ParameterEntity> all = parameterRepository.findAll(page, count);
        return all
                .stream()
                .map(ParameterDTO::from)
                .collect(Collectors.toList());
    }


}
