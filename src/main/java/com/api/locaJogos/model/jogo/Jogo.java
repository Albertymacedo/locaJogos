package com.api.locaJogos.model.jogo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "jogo")
@Data
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jogo_id")
    private Long jogoId;

    private String titulo;

}