package com.br.Findby.Repository;

import java.util.List;

import com.br.Findby.Model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    
    @Query(value = "SELECT * FROM Endereco end WHERE end.codUsuario = :usuario", nativeQuery = true)
    List<Endereco> findByUsuario(@Param("usuario") int codUsuario);
}
