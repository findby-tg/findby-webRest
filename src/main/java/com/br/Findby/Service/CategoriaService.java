package com.br.Findby.Service;

import java.util.List;

import com.br.Findby.Model.Categoria;
import com.br.Findby.Repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }
}
