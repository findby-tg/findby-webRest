package com.br.Findby.Controller;

import com.br.Findby.Model.Login;
import com.br.Findby.Model.Usuario;
import com.br.Findby.Service.UsuarioService;
import com.br.Findby.Utils.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.listarUsuarios();
    }

    @PostMapping("/login")
    public Map<String,Object> logar(@RequestBody Login login) {
        return usuarioService.validaLogin(login);
    }

    @PostMapping("/loginTeste")
    public Login logarteste(@RequestBody Login login) {
        login.setSenha(Utils.encoder().encode(login.getSenha()));
        return login;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarUsuario(@RequestBody Usuario usuario){

         usuarioService.cadastrarUsuario(usuario);
         return  new ResponseEntity<>(HttpStatus.CREATED);
    }
}

