package com.api.locaJogos.dto.jogo.jogoPlataforma;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class JogoPlataformaPost {

    @NotBlank
    private Long jogoId;

    @NotBlank
    private Long plataformaId;

    @Positive
    private BigDecimal precoDiario;

}
