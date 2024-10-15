package com.example.parametersprocessorspring.persistence.controller;

import com.example.parametersprocessorspring.persistence.entity.ParameterEntity;
import com.example.parametersprocessorspring.persistence.model.ParameterDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/parameter")
public class ParameterController {

    //    Search for all existing parameters
    @GetMapping("/filter")
    public List<ParameterDTO> filter(@RequestParam(defaultValue = "1", required = false) Integer page, @RequestParam(defaultValue = "100", required = false) Integer count) {
//
    }

    @GetMapping("/getByName")
    public ParameterDTO getByName(@RequestParam(required = true) String parameterName) {
//
    }

    //    Deleting a parameter
    @DeleteMapping("/:id")
    public void deleteById(@PathVariable("id") Long id) {

    }

    //    Changing the value of a parameter
    @PutMapping("/:id")
    public ParameterDTO update(@PathVariable("id") Long id, String value) {

    }
}
