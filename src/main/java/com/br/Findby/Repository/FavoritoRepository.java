package com.br.Findby.Repository;

import com.br.Findby.Model.Favoritos;
import com.br.Findby.Model.FavoritosID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FavoritoRepository extends JpaRepository<Favoritos, FavoritosID> {

    @Query(value = "SELECT * FROM Favoritos f WHERE f.codUsuario = :codUsuario", nativeQuery = true)
    List<Favoritos> findByCodUsuario(@Param("codUsuario") Integer codUsuario);
}
