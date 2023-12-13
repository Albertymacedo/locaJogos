package com.api.locaJogos.controller;

import com.api.locaJogos.dto.jogo.jogoPlataforma.JogoPlataformaPost;
import com.api.locaJogos.model.jogo.JogoPlataforma;
import com.api.locaJogos.service.JogoPlataformaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jogoPlataforma")
public class JogoPlataformaController {

    @Autowired
    private JogoPlataformaService jogoPlataformaService;

    @PostMapping("/cadastrar")
    public ResponseEntity<JogoPlataforma> cadastrarJogoPlataforma(@RequestBody JogoPlataformaPost jogoPlataformaPost){
        return new ResponseEntity<>(jogoPlataformaService.cadastrarJogoPlataforma(jogoPlataformaPost), HttpStatus.CREATED);
    }


}
