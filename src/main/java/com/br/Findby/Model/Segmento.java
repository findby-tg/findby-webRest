package com.br.Findby.Model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Segmento")
@Table(name = "Segmento")
public class Segmento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codSegmento;
    private String nomeSegmento;

    @OneToMany
    @JoinColumn(name="codSegmento")
    private List<Usuario> usuarios;

    @OneToMany
    @JoinColumn(name="codSegmento")
    private List<Categoria> categorias;


    public Integer getCodSegmento() {
        return codSegmento;
    }

    public void setCodSegmento(Integer codSegmento) {
        this.codSegmento = codSegmento;
    }

    public String getNomeSegmento() {
        return nomeSegmento;
    }

    public void setNomeSegmento(String nomeSegmento) {
        this.nomeSegmento = nomeSegmento;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

  }
