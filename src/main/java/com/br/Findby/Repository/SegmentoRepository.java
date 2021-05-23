package com.br.Findby.Repository;

import com.br.Findby.Model.Segmento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegmentoRepository extends JpaRepository<Segmento, Long> {
}
