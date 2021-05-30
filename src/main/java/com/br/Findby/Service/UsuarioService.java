package com.br.Findby.Service;

import com.br.Findby.Model.Login;
import com.br.Findby.Model.Usuario;
import com.br.Findby.Repository.UsuarioRepository;
import com.br.Findby.Utils.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuarios(){

        return usuarioRepository.findAll();


    }

    public List<Usuario> listarUsuariosByTipo(String tipo) {
        return usuarioRepository.findByTipo(tipo);
    }

    public Optional<Usuario> obterUsuario(Long id) {
        return usuarioRepository.findById(id);
    }

    public Map<String,Object> validaLogin(Login login) {
        Map<String,Object> retorno = new HashMap<String,Object>();
        retorno.put("valido", false);
        retorno.put("tipoUsuario", "");
        retorno.put("idUsuario", "");

        List<Usuario> lsUser = usuarioRepository.findByLoginEmail(login.getUsuario());
        for(Usuario lg : lsUser) {
            if(Utils.encoder().matches(login.getSenha(), lg.getSenha())) {
                retorno.put("valido", true);
                retorno.put("tipoUsuario", lg.getTipoUsuario());
                retorno.put("idUsuario", lg.getCodUsuario());
            }
        }
        return retorno;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {

       usuario.setSenha(Utils.encoder().encode(usuario.getSenha()));
        return usuarioRepository.save(usuario);
    }
}
