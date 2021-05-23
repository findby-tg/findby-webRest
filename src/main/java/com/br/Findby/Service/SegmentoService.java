package com.br.Findby.Service;


import com.br.Findby.Model.Segmento;
import com.br.Findby.Repository.SegmentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SegmentoService {

    @Autowired
    private SegmentoRepository segmentoRepository;

    public List<Segmento> listarSegmentos(){

        return segmentoRepository.findAll();


    }
}
