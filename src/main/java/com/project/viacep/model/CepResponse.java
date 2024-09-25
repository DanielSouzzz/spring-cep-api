package com.project.viacep.model;

public record CepResponse(String cep, String logradouro, String bairro, String complemento,
                          String localidade, String uf) {
}
