package com.project.viacep.dto;

import lombok.AllArgsConstructor;

@lombok.Data
@AllArgsConstructor
public class CepDTO {
    private String logradouro;
    private String bairro;
    private String complemento;
    private String localidade;
    private String uf;

    public CepDTO(String logradouro, String bairro, String localidade, String uf) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

}
