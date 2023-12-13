package com.api.locaJogos.model.locacaoJogos;

import com.api.locaJogos.model.Cliente;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "locacao")
@Data
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locacaoId;

    @Column(name = "data_registro")
    private LocalDateTime dataRegistroLocacao;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "locacao", cascade = CascadeType.ALL)
    private Set<ItemLocacao> itensLocacao;

}