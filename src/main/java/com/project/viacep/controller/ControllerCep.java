package com.project.viacep.controller;

import com.project.viacep.model.dto.CepDTO;
import com.project.viacep.service.CepService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cep")
@CrossOrigin("*")
public class ControllerCep {
    private final CepService cepService;

    @GetMapping("/{cep}")
    public CepDTO getCep(@PathVariable("cep") String cep) {
        return cepService.searchAddress(cep);
    }
}
