package com.br.Findby.Model;

import javax.persistence.*;

@Entity(name = "Categoria")
@Table(name = "Categoria")
public class Categoria {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer codCategoria;
        private Integer codSegmento;
        private String nomeCategoria;
        
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
        public String getNomeCategoria() {
            return nomeCategoria;
        }
        public void setNomeCategoria(String nomeCategoria) {
            this.nomeCategoria = nomeCategoria;
        }
        
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((codCategoria == null) ? 0 : codCategoria.hashCode());
            result = prime * result + ((codSegmento == null) ? 0 : codSegmento.hashCode());
            result = prime * result + ((nomeCategoria == null) ? 0 : nomeCategoria.hashCode());
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
            Categoria other = (Categoria) obj;
            if (codCategoria == null) {
                if (other.codCategoria != null)
                    return false;
            } else if (!codCategoria.equals(other.codCategoria))
                return false;
            if (codSegmento == null) {
                if (other.codSegmento != null)
                    return false;
            } else if (!codSegmento.equals(other.codSegmento))
                return false;
            if (nomeCategoria == null) {
                if (other.nomeCategoria != null)
                    return false;
            } else if (!nomeCategoria.equals(other.nomeCategoria))
                return false;
            return true;
        }
    
        @Override
        public String toString() {
            return "Categoria [codCategoria=" + codCategoria + ", codSegmento=" + codSegmento + ", nomeCategoria="
                    + nomeCategoria + "]";
        }
    
}
