package com.br.Findby.Repository;

import java.util.List;

import com.br.Findby.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT * FROM Usuario us WHERE (us.login = :usuario OR us.email = :usuario)", nativeQuery = true)
    List<Usuario> findByLoginEmail(@Param("usuario") String usuario);

    @Query(value = "SELECT * FROM Usuario us WHERE us.tipoUsuario = :tipo", nativeQuery = true)
    List<Usuario> findByTipo(@Param("tipo") String tipo);
}
