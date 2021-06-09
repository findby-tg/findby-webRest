package com.br.Findby.Repository;

import com.br.Findby.Model.Favoritos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FavoritoRepository extends JpaRepository<Favoritos, Integer> {

    @Query(value = "SELECT * FROM Favoritos f WHERE f.codUsuario = :codUsuario", nativeQuery = true)
    List<Favoritos> findByCodUsuario(@Param("codUsuario") Integer codUsuario);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Favoritos WHERE codUsuario = :codUsuario AND codCategoria = :codCategoria", nativeQuery = true)
    void deleteByCategoria(@Param("codUsuario") Integer codUsuario, @Param("codCategoria") Integer codCategoria);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Favoritos(codUsuario, codCategoria) VALUES (:codUsuario, :codCategoria)", nativeQuery = true)
    void adicionaByCategoria(@Param("codUsuario") Integer codUsuario, @Param("codCategoria") Integer codCategoria);

}
