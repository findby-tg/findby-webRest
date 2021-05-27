package com.br.Findby.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity(name = "Favoritos")
@Table(name = "Favoritos")
@IdClass(FavoritosID.class)
public class Favoritos implements Serializable {

    @Id
    private Integer codUsuario;
    @Id
    private Integer codItem;
    @Id
    private String indTipoFav;


    public Favoritos() {
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodItem() {
        return codItem;
    }

    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    public String getIndTipoFav() {
        return indTipoFav;
    }

    public void setIndTipoFav(String indTipoFav) {
        this.indTipoFav = indTipoFav;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codItem == null) ? 0 : codItem.hashCode());
        result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
        result = prime * result + ((indTipoFav == null) ? 0 : indTipoFav.hashCode());
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
        if (codItem == null) {
            if (other.codItem != null)
                return false;
        } else if (!codItem.equals(other.codItem))
            return false;
        if (codUsuario == null) {
            if (other.codUsuario != null)
                return false;
        } else if (!codUsuario.equals(other.codUsuario))
            return false;
        if (indTipoFav == null) {
            if (other.indTipoFav != null)
                return false;
        } else if (!indTipoFav.equals(other.indTipoFav))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Favoritos [codItem=" + codItem + ", codUsuario=" + codUsuario + ", indTipoFav=" + indTipoFav + "]";
    }

}
