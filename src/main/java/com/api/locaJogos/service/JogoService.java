package com.api.locaJogos.service;

import com.api.locaJogos.dto.jogo.jogo.JogoPost;
import com.api.locaJogos.model.jogo.Jogo;
import com.api.locaJogos.repository.JogoRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public Jogo cadastrarJogo(JogoPost jogoPost){
        Jogo jogo = modelMapper.map(jogoPost, Jogo.class);

        return jogoRepository.save(jogo);
    }
}
