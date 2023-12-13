package com.api.locaJogos.repository;

import com.api.locaJogos.model.jogo.JogoPlataforma;
import com.api.locaJogos.model.jogo.JogoPlataformaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoPlataformaRepository extends JpaRepository<JogoPlataforma, JogoPlataformaId> {

}
