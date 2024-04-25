package com.example.ProvaA.controller;

import com.example.ProvaA.service.IBGEService;
//import com.example.ProvaA.model.IBGEEntity;
import com.example.ProvaA.service.IBGEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/noticias")
public class IBGEController {

    IBGEService ibgeService =  new IBGEService();

    @GetMapping("http://localhost:8080/noticiasereleases")
    public String obterNoticiaseReleases(@PathVariable int noticiasereleases) {
        return ibgeService.obterNoticiaseReleases();
    }
    @GetMapping("http://localhost:8080/noticias")
    public String obterNoticias(@PathVariable  int noticias ) {
        return ibgeService.obterNoticias(noticias);
    }

    @GetMapping("http://localhost:8080/releases")
    public String obterReleases(@PathVariable int releases) {
        return ibgeService.obterReleases(releases);
    }
}
