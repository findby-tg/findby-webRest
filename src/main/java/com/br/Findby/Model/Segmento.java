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

 }
