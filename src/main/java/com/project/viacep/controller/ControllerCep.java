package com.project.viacep.controller;

import com.project.viacep.model.dto.CepDTO;
import com.project.viacep.service.CepService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cep")
public class ControllerCep {
    private final CepService cepService;

    @GetMapping("/{cep}")
    public CepDTO getCep(@PathVariable("cep") String cep) {
        return cepService.searchAddress(cep);
    }
}
