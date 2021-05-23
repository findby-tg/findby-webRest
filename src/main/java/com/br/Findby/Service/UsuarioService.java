package com.br.Findby.Service;

import com.br.Findby.Model.Usuario;
import com.br.Findby.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usarioRepository;

    public List<Usuario> listarUsuarios(){

        return usarioRepository.findAll();


    }

}
