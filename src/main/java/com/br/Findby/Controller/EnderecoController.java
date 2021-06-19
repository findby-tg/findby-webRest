package com.br.Findby.Controller;

import java.util.List;

import com.br.Findby.Model.Endereco;
import com.br.Findby.Service.EnderecoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Endereco> listar() {
        return enderecoService.listarEnderecos();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{codUsuario}")
    public List<Endereco> listarEndUsuario(@PathVariable int codUsuario) {
        return enderecoService.listarEnderecos(codUsuario);
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<Void> inserirEndereco(@RequestBody Endereco endereco) {
        try {
            enderecoService.inserirEndereco(endereco);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch(Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
