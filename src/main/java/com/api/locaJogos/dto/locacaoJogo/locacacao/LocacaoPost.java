package com.api.locaJogos.dto.locacaoJogo.locacacao;

import com.api.locaJogos.dto.locacaoJogo.itemLocacao.ItemLocacaoPost;
import lombok.Data;

import java.util.Set;

@Data
public class LocacaoPost {

    private Long idCliente;

    private Set<ItemLocacaoPost> itensLocacao;

}
