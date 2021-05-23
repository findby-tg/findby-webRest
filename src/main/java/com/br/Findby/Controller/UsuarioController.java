package com.br.Findby.Controller;

import com.br.Findby.Model.Login;
import com.br.Findby.Model.LoginDTO;
import com.br.Findby.Model.Usuario;
import com.br.Findby.Service.UsuarioService;
import com.br.Findby.Utils.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


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
    public Login logar(@RequestBody Login login) {
        login.setSenha(Utils.encoder().encode(login.getSenha()));


        return login;
    }
}

