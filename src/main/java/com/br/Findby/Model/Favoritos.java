package com.br.Findby.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Favoritos")
@Table(name = "Favoritos")
public class Favoritos implements Serializable {

    @Id
    private Integer codFavorito;
    private Integer codUsuario;
    private Integer codCategoria;
    private Integer codSegmento;
    private Integer codVendedor;
    private Integer codProduto;
    
    public Integer getCodFavorito() {
        return codFavorito;
    }
    public void setCodFavorito(Integer codFavorito) {
        this.codFavorito = codFavorito;
    }
    public Integer getCodUsuario() {
        return codUsuario;
    }
    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }
    public Integer getCodCategoria() {
        return codCategoria;
    }
    public void setCodCategoria(Integer codCategoria) {
        this.codCategoria = codCategoria;
    }
    public Integer getCodSegmento() {
        return codSegmento;
    }
    public void setCodSegmento(Integer codSegmento) {
        this.codSegmento = codSegmento;
    }
    public Integer getCodVendedor() {
        return codVendedor;
    }
    public void setCodVendedor(Integer codVendedor) {
        this.codVendedor = codVendedor;
    }
    public Integer getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codCategoria == null) ? 0 : codCategoria.hashCode());
        result = prime * result + ((codFavorito == null) ? 0 : codFavorito.hashCode());
        result = prime * result + ((codProduto == null) ? 0 : codProduto.hashCode());
        result = prime * result + ((codSegmento == null) ? 0 : codSegmento.hashCode());
        result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
        result = prime * result + ((codVendedor == null) ? 0 : codVendedor.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Favoritos other = (Favoritos) obj;
        if (codCategoria == null) {
            if (other.codCategoria != null)
                return false;
        } else if (!codCategoria.equals(other.codCategoria))
            return false;
        if (codFavorito == null) {
            if (other.codFavorito != null)
                return false;
        } else if (!codFavorito.equals(other.codFavorito))
            return false;
        if (codProduto == null) {
            if (other.codProduto != null)
                return false;
        } else if (!codProduto.equals(other.codProduto))
            return false;
        if (codSegmento == null) {
            if (other.codSegmento != null)
                return false;
        } else if (!codSegmento.equals(other.codSegmento))
            return false;
        if (codUsuario == null) {
            if (other.codUsuario != null)
                return false;
        } else if (!codUsuario.equals(other.codUsuario))
            return false;
        if (codVendedor == null) {
            if (other.codVendedor != null)
                return false;
        } else if (!codVendedor.equals(other.codVendedor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Favoritos [codCategoria=" + codCategoria + ", codFavorito=" + codFavorito + ", codProduto=" + codProduto
                + ", codSegmento=" + codSegmento + ", codUsuario=" + codUsuario + ", codVendedor=" + codVendedor + "]";
    } 
}
