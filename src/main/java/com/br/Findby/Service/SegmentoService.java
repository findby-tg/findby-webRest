package com.br.Findby.Service;


import com.br.Findby.Model.Segmento;
import com.br.Findby.Repository.FavoritoRepository;
import com.br.Findby.Repository.SegmentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SegmentoService {

    @Autowired
    private SegmentoRepository segmentoRepository;
    @Autowired
    private FavoritoRepository favoritoRepository;

    public List<Segmento> listarSegmentos(){
        return segmentoRepository.findAll();
    }

    public void removeFavorito(int codUsuario, int codSegmento) {
        try {
            favoritoRepository.deleteBySegmento(codUsuario, codSegmento);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void adicionaFavorito(int codUsuario, int codSegmento) {
        try {
            favoritoRepository.adicionaBySegmento(codUsuario, codSegmento);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
