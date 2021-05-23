package com.br.Findby.Controller;

import java.util.List;

import com.br.Findby.Model.Contato;
import com.br.Findby.Service.ContatoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
    @Autowired
    private ContatoService contatoService;

    @GetMapping("/{id}")
    public List<Contato> listar(@PathVariable int id) {
       return contatoService.listarContatoUsuario(id);
    }
}
