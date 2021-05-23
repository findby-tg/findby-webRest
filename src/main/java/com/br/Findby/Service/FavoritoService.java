package com.br.Findby.Service;

import com.br.Findby.Model.Favoritos;
import com.br.Findby.Repository.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritoService {
    @Autowired
    private FavoritoRepository favoritoRepository;

    public List<Favoritos> listarFavoritos(){
        return favoritoRepository.findAll();
    }


    public List<Favoritos> listarFavoritosPorUsuario(Integer codUsuario) {

        return favoritoRepository.findByCodUsuario(codUsuario);
    }
}
