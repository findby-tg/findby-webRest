package com.br.Findby.Service;

import java.util.List;

import com.br.Findby.Model.Categoria;
import com.br.Findby.Repository.CategoriaRepository;
import com.br.Findby.Repository.FavoritoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private FavoritoRepository favoritoRepository;
    
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public void removeFavorito(int codUsuario, int codCategoria) {
        try {
            favoritoRepository.deleteByCategoria(codUsuario, codCategoria);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void adicionaFavorito(int codUsuario, int codCategoria) {
        try {
            favoritoRepository.adicionaByCategoria(codUsuario, codCategoria);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
