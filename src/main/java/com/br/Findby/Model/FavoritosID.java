package com.br.Findby.Model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FavoritosID implements Serializable {
    private Integer codUsuario;
    private Integer codItem;
    private String indTipoFav;

    public FavoritosID() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FavoritosID)) return false;
        FavoritosID that = (FavoritosID) o;
        return Objects.equals(getCodUsuario(), that.getCodUsuario()) && Objects.equals(getCodItem(), that.getCodItem()) && Objects.equals(getIndTipoFav(), that.getIndTipoFav());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodUsuario(), getCodItem(), getIndTipoFav());
    }
}



