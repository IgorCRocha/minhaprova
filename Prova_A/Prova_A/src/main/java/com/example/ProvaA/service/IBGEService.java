package com.example.ProvaA.service;


import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class IBGEService {

    private String consultarURL() {
        String apiUrl= "https://servicodados.ibge.gov.br/api/v3/noticias";
        String dados= "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
        return dados;
    }
        public String obterNoticiaseReleases() {
            return consultarURL("http://localhost:8080/noticiasereleases");
        }

        public String obterNoticias(int noticias) {
        return consultarURL("http://localhost:8080/noticias"+noticias+"/noticias");
        }

        public String obterReleases(int releases) {
        return consultarURL("http://localhost:8080/releases"+releases+"/releases");
        }

    }
