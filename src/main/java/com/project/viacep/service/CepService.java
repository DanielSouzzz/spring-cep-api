package com.project.viacep.service;

import com.google.gson.Gson;
import com.project.viacep.model.CepResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class CepService {

    public CepResponse searchAddress(String cep) {
        URI address = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), CepResponse.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Falha ao obter seu cep, tente novamente!");
        } finally {
            System.out.println("Retorno de retorno da api: " + (response != null ? response.statusCode() : null));
        }
    }
}

