package com.api.locaJogos.service;

import com.api.locaJogos.dto.jogo.plataforma.PlataformaPost;
import com.api.locaJogos.model.jogo.Plataforma;
import com.api.locaJogos.repository.PlataformaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlataformaService {

    @Autowired
    private PlataformaRepository plataformaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public Plataforma cadastrarPlataforma(@Valid PlataformaPost plataformaPost){
        Plataforma plataforma = modelMapper.map(plataformaPost, Plataforma.class);

        return plataformaRepository.save(plataforma);
    }
}