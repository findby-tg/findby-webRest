package com.br.Findby.Service;

import java.util.List;
import java.util.Optional;

import com.br.Findby.Model.Endereco;
import com.br.Findby.Repository.EnderecoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> listarEnderecos() {
        return enderecoRepository.findAll();
    }

    public List<Endereco> listarEnderecos(int codUsuario) {
        return enderecoRepository.findByUsuario(codUsuario);
    }
}
