package com.api.locaJogos.service;

import com.api.locaJogos.dto.cliente.ClientePost;
import com.api.locaJogos.exception.BadRequestException;
import com.api.locaJogos.model.Cliente;
import com.api.locaJogos.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public Cliente cadastrarCliente(ClientePost clientePost){
        Cliente cliente = modelMapper.map(clientePost, Cliente.class);

        if(clienteRepository.findByEmail(cliente.getEmail()) != null){
            throw new BadRequestException("O email informado já está em uso [!]");
        }

        return clienteRepository.save(cliente);
    }

}
