package com.api.locaJogos.model;

import com.api.locaJogos.model.locacaoJogos.Locacao;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long idCliente;

    private String nome;

    private String email;

    private String telefone;

    private String senha;

    @OneToMany(mappedBy = "cliente")
    private Set<Locacao> locacoesJogos;

}
