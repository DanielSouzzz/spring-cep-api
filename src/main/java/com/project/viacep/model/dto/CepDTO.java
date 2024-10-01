package com.project.viacep.model.dto;

import com.project.viacep.model.CepResponse;
import lombok.AllArgsConstructor;

@lombok.Data
@AllArgsConstructor
public class CepDTO {
    private String logradouro;
    private String bairro;
    private String complemento;
    private String localidade;
    private String uf;

    public CepDTO(CepResponse cepResponse) {
        this.logradouro = cepResponse.logradouro();
        this.bairro = cepResponse.bairro();
        this.localidade = cepResponse.localidade();
        this.uf = cepResponse.uf();
    }

}
