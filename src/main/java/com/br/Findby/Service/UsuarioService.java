package com.br.Findby.Service;

import com.br.Findby.Model.Login;
import com.br.Findby.Model.LoginDTO;
import com.br.Findby.Model.Usuario;
import com.br.Findby.Repository.UsuarioRepository;
import com.br.Findby.Utils.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usarioRepository;

    public List<Usuario> listarUsuarios(){

        return usarioRepository.findAll();


    }

    public Map<String,Object> validaLogin(Login login) {
        Map<String,Object> retorno = new HashMap<String,Object>();
        retorno.put("valido", false);
        retorno.put("tipoUsuario", "");

        //login.setSenha(Utils.encoder().encode(login.getSenha()));
        List<Usuario> lsUser = usarioRepository.findByLoginEmail(login.getUsuario());
        for(Usuario lg : lsUser) {
            if(Utils.encoder().matches(login.getSenha(), lg.getSenha())) {
                retorno.put("valido", true);
                retorno.put("tipoUsuario", lg.getTipoUsuario());
            }
        }
        return retorno;
    }

}
