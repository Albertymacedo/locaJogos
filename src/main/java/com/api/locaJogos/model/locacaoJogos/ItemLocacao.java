package com.api.locaJogos.model.locacaoJogos;

import com.api.locaJogos.model.jogo.JogoPlataforma;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "item_locacao")
@Data
public class ItemLocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_locacao_id")
    private Long itemLocacaoId;

    @Column(name = "dias_locado")
    private Integer qtdDiasLocacao;

    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "id_locacao")
    private Locacao locacao;

    @ManyToOne
    private JogoPlataforma jogoLocado;

}
