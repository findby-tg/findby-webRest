package com.br.Findby.Controller;

import com.br.Findby.Model.Login;
import com.br.Findby.Model.Usuario;
import com.br.Findby.Service.UsuarioService;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    @PostMapping("/loginSenha")
    public String retornaSenha(@RequestBody Login login) {
        return usuarioService.retornaSenha(login);
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<Void> cadastrarUsuario(@RequestBody Usuario usuario){
        try {
         usuarioService.cadastrarUsuario(usuario);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/favorito")
    public  ResponseEntity<Void> favoritarVendedor(@RequestBody Map<String, Object> favorito) {
        try {
            JSONObject jsonFavorito = new JSONObject(favorito);
            usuarioService.adicionaFavorito(jsonFavorito.getInt("codUsuario"), jsonFavorito.getInt("codVendedor"));
           } catch (Exception e) {
               e.printStackTrace();
               return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
           }
           return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/favorito/{codUsuario}/{codVendedor}")
    public  ResponseEntity<Void> removerFavoritarVendedor(@PathVariable int codUsuario, @PathVariable int codVendedor) {
        try {
            usuarioService.removeFavorito(codUsuario, codVendedor);
           } catch (Exception e) {
               e.printStackTrace();
               return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
           }
           return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}

