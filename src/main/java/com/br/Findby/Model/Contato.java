package com.br.Findby.Model;

import javax.persistence.*;


@Entity(name = "Contato")
@Table(name = "Contato")
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codContato;
    private Integer codUsuario;
    private Integer numDdd;
    private Integer numContato;
    private String indTipoContato;
    
    public Integer getCodContato() {
        return codContato;
    }
    public void setCodContato(Integer codContato) {
        this.codContato = codContato;
    }
    public Integer getCodUsuario() {
        return codUsuario;
    }
    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }
    public Integer getNumDdd() {
        return numDdd;
    }
    public void setNumDdd(Integer numDdd) {
        this.numDdd = numDdd;
    }
    public Integer getNumContato() {
        return numContato;
    }
    public void setNumContato(Integer numContato) {
        this.numContato = numContato;
    }
    public String getIndTipoContato() {
        return indTipoContato;
    }
    public void setIndTipoContato(String indTipoContato) {
        this.indTipoContato = indTipoContato;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codContato == null) ? 0 : codContato.hashCode());
        result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
        result = prime * result + ((indTipoContato == null) ? 0 : indTipoContato.hashCode());
        result = prime * result + ((numContato == null) ? 0 : numContato.hashCode());
        result = prime * result + ((numDdd == null) ? 0 : numDdd.hashCode());
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
        Contato other = (Contato) obj;
        if (codContato == null) {
            if (other.codContato != null)
                return false;
        } else if (!codContato.equals(other.codContato))
            return false;
        if (codUsuario == null) {
            if (other.codUsuario != null)
                return false;
        } else if (!codUsuario.equals(other.codUsuario))
            return false;
        if (indTipoContato == null) {
            if (other.indTipoContato != null)
                return false;
        } else if (!indTipoContato.equals(other.indTipoContato))
            return false;
        if (numContato == null) {
            if (other.numContato != null)
                return false;
        } else if (!numContato.equals(other.numContato))
            return false;
        if (numDdd == null) {
            if (other.numDdd != null)
                return false;
        } else if (!numDdd.equals(other.numDdd))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Contato [codContato=" + codContato + ", codUsuario=" + codUsuario + ", indTipoContato=" + indTipoContato
                + ", numContato=" + numContato + ", numDdd=" + numDdd + "]";
    }

}
