package com.br.Findby.Model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Favoritos")
@Table(name = "Favoritos")
public class Favoritos {

    @EmbeddedId
    private FavoritosID favoritosID;


    public Favoritos() {
    }

    public FavoritosID getFavoritosID() {
        return favoritosID;
    }

    public void setFavoritosID(FavoritosID favoritosID) {
        this.favoritosID = favoritosID;
    }


}
