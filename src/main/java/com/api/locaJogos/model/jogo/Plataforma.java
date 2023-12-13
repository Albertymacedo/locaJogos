package com.api.locaJogos.model.jogo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "plataforma")
@Data
public class Plataforma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plataforma_id")
    private Long plataformaId;

    private String nome;

}
