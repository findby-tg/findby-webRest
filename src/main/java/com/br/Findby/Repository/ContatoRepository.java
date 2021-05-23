package com.br.Findby.Repository;

import com.br.Findby.Model.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
    
}
