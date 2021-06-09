package com.br.Findby.Controller;

import com.br.Findby.Model.Segmento;
import com.br.Findby.Service.SegmentoService;

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

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/segmentos")
public class SegmentoController {

    @Autowired
    private SegmentoService segmentoService;
    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Segmento> listar(){
        return segmentoService.listarSegmentos();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/favorito")
    public  ResponseEntity<Void> favoritarSegmento(@RequestBody Map<String, Object> favorito) {
        try {
            JSONObject jsonFavorito = new JSONObject(favorito);
            segmentoService.adicionaFavorito(jsonFavorito.getInt("codUsuario"), jsonFavorito.getInt("codSegmento"));
           } catch (Exception e) {
               e.printStackTrace();
               return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
           }
           return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/favorito/{codUsuario}/{codSegmento}")
    public  ResponseEntity<Void> removerFavoritarSegmento(@PathVariable int codUsuario, @PathVariable int codSegmento) {
        try {
            segmentoService.removeFavorito(codUsuario, codSegmento);
           } catch (Exception e) {
               e.printStackTrace();
               return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
           }
           return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
