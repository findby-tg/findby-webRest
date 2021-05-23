package com.br.Findby.Controller;

import java.util.List;

import com.br.Findby.Model.Produto;
import com.br.Findby.Service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/{id}")
    public List<Produto> listar(@PathVariable int id) {
        return produtoService.listarProdutosVendedor(id);
    }
}
