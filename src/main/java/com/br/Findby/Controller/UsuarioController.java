package com.br.Findby.Controller;

import com.br.Findby.Model.Login;
import com.br.Findby.Model.Usuario;
import com.br.Findby.Service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.listarUsuarios();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/tipo/{tipo}")
    public List<Usuario> listarVendedores(@PathVariable String tipo){
        return usuarioService.listarUsuariosByTipo(tipo);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<Usuario> obterUsuario(@PathVariable Long id) {
        return usuarioService.obterUsuario(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public Map<String,Object> logar(@RequestBody Login login) {
        return usuarioService.validaLogin(login);
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<Void> cadastrarUsuario(@RequestBody Usuario usuario){

         usuarioService.cadastrarUsuario(usuario);
         return  new ResponseEntity<>(HttpStatus.CREATED);
    }
}

