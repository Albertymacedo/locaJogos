package com.api.locaJogos.repository;

import com.api.locaJogos.model.locacaoJogos.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Long> {

}
