package com.api.locaJogos.repository;

import com.api.locaJogos.model.locacaoJogos.ItemLocacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemLocacaoRepository extends JpaRepository<ItemLocacao, Long> {

}
