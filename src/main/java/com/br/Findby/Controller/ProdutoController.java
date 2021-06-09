package com.br.Findby.Controller;

import java.util.List;
import java.util.Map;

import com.br.Findby.Model.Produto;
import com.br.Findby.Service.ProdutoService;

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

@RestController()
@RequestMapping("/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoService produtoService;

    @CrossOrigin(origins = "*")
    @GetMapping("")
    public List<Produto> listarProd() {
        return produtoService.listarProdutos();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public List<Produto> listarProdVend(@PathVariable int id) {
        return produtoService.listarProdutosVendedor(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/favorito")
    public  ResponseEntity<Void> favoritarProduto(@RequestBody Map<String, Object> favorito) {
        try {
            JSONObject jsonFavorito = new JSONObject(favorito);
            produtoService.adicionaFavorito(jsonFavorito.getInt("codUsuario"), jsonFavorito.getInt("codProduto"));
           } catch (Exception e) {
               e.printStackTrace();
               return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
           }
           return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/favorito/{codUsuario}/{codProduto}")
    public  ResponseEntity<Void> removerFavoritarProduto(@PathVariable int codUsuario, @PathVariable int codProduto) {
        try {
            produtoService.removeFavorito(codUsuario, codProduto);
           } catch (Exception e) {
               e.printStackTrace();
               return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
           }
           return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
