package com.api.locaJogos.service;

import com.api.locaJogos.dto.jogo.jogoPlataforma.JogoPlataformaPost;
import com.api.locaJogos.model.jogo.JogoPlataforma;
import com.api.locaJogos.repository.JogoPlataformaRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogoPlataformaService {

    @Autowired
    private JogoPlataformaRepository jogoPlataformaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public JogoPlataforma cadastrarJogoPlataforma(JogoPlataformaPost jogoPlataformaPost){
        JogoPlataforma jogoPlataforma = modelMapper.map(jogoPlataformaPost, JogoPlataforma.class);
        return jogoPlataformaRepository.save(jogoPlataforma);
    }



}
