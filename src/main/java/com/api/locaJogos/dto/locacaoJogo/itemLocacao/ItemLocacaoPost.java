package com.api.locaJogos.dto.locacaoJogo.itemLocacao;

import lombok.Data;

@Data
public class ItemLocacaoPost {

    private Long locacaoId;

    private Long jogoId;

    private Long plataformaId;

    private Integer qtdDiasLocacao;

    private Integer quantidade;

}
