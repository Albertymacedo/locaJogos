package com.api.locaJogos.controller;

import com.api.locaJogos.dto.jogo.plataforma.PlataformaPost;
import com.api.locaJogos.model.jogo.Plataforma;
import com.api.locaJogos.service.PlataformaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("plataforma")
public class PlataformaController {

    @Autowired
    private PlataformaService plataformaService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Plataforma> cadastrarPlataforma(@RequestBody @Valid PlataformaPost plataformaPost){
        return new ResponseEntity<>(plataformaService.cadastrarPlataforma(plataformaPost), HttpStatus.CREATED);
    }
}
