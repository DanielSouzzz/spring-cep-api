package com.project.viacep.model;

public record RecordAddress(String cep, String logradouro, String bairro, String complemento,
                            String localidade, String uf) {
}
