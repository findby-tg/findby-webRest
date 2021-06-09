package com.br.Findby.Controller;

import java.util.List;
import java.util.Map;

import com.br.Findby.Model.Categoria;
import com.br.Findby.Service.CategoriaService;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @CrossOrigin(origins = "*")
    @PostMapping("/favorito")
    public  ResponseEntity<Void> favoritarCategoria(@RequestBody Map<String, Object> favorito) {
        try {
            JSONObject jsonFavorito = new JSONObject(favorito);
            categoriaService.adicionaFavorito(jsonFavorito.getInt("codUsuario"), jsonFavorito.getInt("codCategoria"));
           } catch (Exception e) {
               e.printStackTrace();
               return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
           }
           return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/favorito/{codUsuario}/{codCategoria}")
    public  ResponseEntity<Void> removerFavoritarCategoria(@PathVariable int codUsuario, @PathVariable int codCategoria) {
        try {
            categoriaService.removeFavorito(codUsuario, codCategoria);
           } catch (Exception e) {
               e.printStackTrace();
               return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
           }
           return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
