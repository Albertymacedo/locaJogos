package com.api.locaJogos.controller;

import com.api.locaJogos.dto.cliente.ClientePost;
import com.api.locaJogos.model.Cliente;
import com.api.locaJogos.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody @Valid ClientePost clientePost){
        return new ResponseEntity<>(clienteService.cadastrarCliente(clientePost), HttpStatus.CREATED);
    }


}
