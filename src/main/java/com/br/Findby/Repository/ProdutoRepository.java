package com.br.Findby.Repository;

import com.br.Findby.Model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
