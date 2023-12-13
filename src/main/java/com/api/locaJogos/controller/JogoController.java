package com.api.locaJogos.controller;

import com.api.locaJogos.dto.jogo.jogo.JogoPost;
import com.api.locaJogos.model.jogo.Jogo;
import com.api.locaJogos.service.JogoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jogo")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Jogo> cadastrarJogo(@RequestBody @Valid JogoPost jogoPost){
        return new ResponseEntity<>(jogoService.cadastrarJogo(jogoPost), HttpStatus.CREATED);
    }
}
