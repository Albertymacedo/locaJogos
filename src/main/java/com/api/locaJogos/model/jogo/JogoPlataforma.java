package com.api.locaJogos.model.jogo;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "jogo_plataforma")
@Data
public class JogoPlataforma {

    @EmbeddedId
    private JogoPlataformaId id;

    @Column(name = "preco_diario")
    private BigDecimal precoDiario;

}
