package com.br.Findby.Controller;

import com.br.Findby.Model.Segmento;
import com.br.Findby.Service.SegmentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/segmentos")
public class SegmentoController {

    @Autowired
    private SegmentoService segmentoService;
    @GetMapping
    public List<Segmento> listar(){
        return segmentoService.listarSegmentos();
    }
}
