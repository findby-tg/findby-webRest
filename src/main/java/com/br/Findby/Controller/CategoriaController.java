package com.br.Findby.Controller;

import java.util.List;

import com.br.Findby.Model.Categoria;
import com.br.Findby.Service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Categoria> listar() {
        return categoriaService.listarCategorias();
    }
}
