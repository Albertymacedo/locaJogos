package com.api.locaJogos.mapper;

import com.api.locaJogos.dto.locacaoJogo.locacacao.LocacaoPost;
import com.api.locaJogos.model.locacaoJogos.ItemLocacao;
import com.api.locaJogos.model.locacaoJogos.Locacao;
import org.modelmapper.ModelMapper;

import java.util.Set;
import java.util.stream.Collectors;

public class LocacaoMapper {

    public static Locacao mapLocacaoPostToLocacao(LocacaoPost locacaoPost, ModelMapper modelMapper) {
        Locacao locacao = modelMapper.map(locacaoPost, Locacao.class);


        // Mapeamento personalizado para a propriedade itemLocacoes
        Set<ItemLocacao> itemLocacoes = locacaoPost.getItensLocacao().stream()
                .map(itemLocacaoPost -> modelMapper.map(itemLocacaoPost, ItemLocacao.class))
                .collect(Collectors.toSet());

        locacao.setItensLocacao(itemLocacoes);

        return locacao;
    }

}
