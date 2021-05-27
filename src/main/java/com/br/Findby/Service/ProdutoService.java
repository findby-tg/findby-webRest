package com.br.Findby.Service;

import java.util.ArrayList;
import java.util.List;

import com.br.Findby.Model.Produto;
import com.br.Findby.Repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutosVendedor(int id) {
        List<Produto> retorno = new ArrayList<Produto>();
        List<Produto> lsProduto = produtoRepository.findAll();
        for(Produto prod : lsProduto) {
            if(prod.getCodUsuario().equals(id)) {
                retorno.add(prod);
            }
        }

        return retorno;
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }
}
