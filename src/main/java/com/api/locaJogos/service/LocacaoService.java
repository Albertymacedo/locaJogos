package com.api.locaJogos.service;

import com.api.locaJogos.dto.locacaoJogo.locacacao.LocacaoPost;
import com.api.locaJogos.mapper.LocacaoMapper;
import com.api.locaJogos.model.locacaoJogos.ItemLocacao;
import com.api.locaJogos.model.locacaoJogos.Locacao;
import com.api.locaJogos.repository.ItemLocacaoRepository;
import com.api.locaJogos.repository.LocacaoRepository;
import jakarta.transaction.Transactional;
import org.hibernate.id.uuid.LocalObjectUuidHelper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    @Autowired
    private ItemLocacaoRepository itemLocacaoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public Locacao cadastrarLocacao(LocacaoPost locacaoPost){
        Locacao locacao = LocacaoMapper.mapLocacaoPostToLocacao(locacaoPost,modelMapper);
        locacao.setDataRegistroLocacao(LocalDateTime.now());



        System.out.println("Locacao: " + locacao);
        return locacaoRepository.save(locacao);
    }

}
