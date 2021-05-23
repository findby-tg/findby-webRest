package com.br.Findby.Controller;

import com.br.Findby.Model.Favoritos;
import com.br.Findby.Service.FavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/favoritos")
public class FavoritoController {

    @Autowired
    private FavoritoService favoritoService;

    @GetMapping
    public List<Favoritos> listar(){

        return favoritoService.listarFavoritos();

    }

    @GetMapping("/{id}")
    public List<Favoritos> favoritosPorUsuario(@PathVariable Integer id){

        return favoritoService.listarFavoritosPorUsuario(id);

    }
}
