package com.api.locaJogos.controller;

import com.api.locaJogos.dto.locacaoJogo.locacacao.LocacaoPost;
import com.api.locaJogos.model.locacaoJogos.Locacao;
import com.api.locaJogos.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("locacao")
public class LocacaoController {

    @Autowired
    private LocacaoService locacaoService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Locacao> cadastrarLocacao(@RequestBody LocacaoPost locacaoPost){
        System.out.println(locacaoPost);
        return new ResponseEntity<>(locacaoService.cadastrarLocacao(locacaoPost), HttpStatus.CREATED);
    }

}
