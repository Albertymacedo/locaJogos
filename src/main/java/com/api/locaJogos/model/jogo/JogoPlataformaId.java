package com.api.locaJogos.model.jogo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class JogoPlataformaId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_jogo")
    private Jogo jogo;

    @ManyToOne
    @JoinColumn(name = "id_plataforma")
    private Plataforma plataforma;

}