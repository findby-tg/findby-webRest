package com.br.Findby.Service;

import java.util.ArrayList;
import java.util.List;

import com.br.Findby.Model.Contato;
import com.br.Findby.Repository.ContatoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public List<Contato> listarContatoUsuario(int id) {
        List<Contato> retorno = new ArrayList<Contato>();
        List<Contato> lsCont = contatoRepository.findAll();
        for(Contato cont : lsCont) {
            if(cont.getCodUsuario().equals(id)) {
                retorno.add(cont);
            }
        }
        return retorno;
    }
    
}
