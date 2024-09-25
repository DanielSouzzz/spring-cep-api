package com.project.viacep.service;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.project.viacep.model.RecordAddress;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServiceCep {
    public RecordAddress searchAddress(String cep) {
        URI address = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Falha ao obter seu cep, tente novamente!");
    }
        try {
            return new Gson().fromJson(response.body(), RecordAddress.class);
        } catch (JsonSyntaxException e) {
            throw new RuntimeException("Erro ao processar a resposta do servidor. Verifique o CEP inserido.", e);
        } finally {
            System.out.println("Retorno da api: " + response);
        }
  }
}

