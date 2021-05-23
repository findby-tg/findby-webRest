package com.br.Findby.Model;

import javax.persistence.*;

@Entity(name = "Endereco")
@Table(name = "Endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codEndereco;
    private Integer codUsuario;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private Integer cep;
    private Integer cidade;
    private Integer uf;
    private Integer pais;
    private Double latitude;
    private Double longitude;
    private Integer raio;
    
    public Integer getCodEndereco() {
        return codEndereco;
    }
    public void setCodEndereco(Integer codEndereco) {
        this.codEndereco = codEndereco;
    }
    public Integer getCodUsuario() {
        return codUsuario;
    }
    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public Integer getCep() {
        return cep;
    }
    public void setCep(Integer cep) {
        this.cep = cep;
    }
    public Integer getCidade() {
        return cidade;
    }
    public void setCidade(Integer cidade) {
        this.cidade = cidade;
    }
    public Integer getUf() {
        return uf;
    }
    public void setUf(Integer uf) {
        this.uf = uf;
    }
    public Integer getPais() {
        return pais;
    }
    public void setPais(Integer pais) {
        this.pais = pais;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public Integer getRaio() {
        return raio;
    }
    public void setRaio(Integer raio) {
        this.raio = raio;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
        result = prime * result + ((cep == null) ? 0 : cep.hashCode());
        result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
        result = prime * result + ((codEndereco == null) ? 0 : codEndereco.hashCode());
        result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
        result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
        result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
        result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((pais == null) ? 0 : pais.hashCode());
        result = prime * result + ((raio == null) ? 0 : raio.hashCode());
        result = prime * result + ((uf == null) ? 0 : uf.hashCode());
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
        Endereco other = (Endereco) obj;
        if (bairro == null) {
            if (other.bairro != null)
                return false;
        } else if (!bairro.equals(other.bairro))
            return false;
        if (cep == null) {
            if (other.cep != null)
                return false;
        } else if (!cep.equals(other.cep))
            return false;
        if (cidade == null) {
            if (other.cidade != null)
                return false;
        } else if (!cidade.equals(other.cidade))
            return false;
        if (codEndereco == null) {
            if (other.codEndereco != null)
                return false;
        } else if (!codEndereco.equals(other.codEndereco))
            return false;
        if (codUsuario == null) {
            if (other.codUsuario != null)
                return false;
        } else if (!codUsuario.equals(other.codUsuario))
            return false;
        if (latitude == null) {
            if (other.latitude != null)
                return false;
        } else if (!latitude.equals(other.latitude))
            return false;
        if (logradouro == null) {
            if (other.logradouro != null)
                return false;
        } else if (!logradouro.equals(other.logradouro))
            return false;
        if (longitude == null) {
            if (other.longitude != null)
                return false;
        } else if (!longitude.equals(other.longitude))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (pais == null) {
            if (other.pais != null)
                return false;
        } else if (!pais.equals(other.pais))
            return false;
        if (raio == null) {
            if (other.raio != null)
                return false;
        } else if (!raio.equals(other.raio))
            return false;
        if (uf == null) {
            if (other.uf != null)
                return false;
        } else if (!uf.equals(other.uf))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Endereco [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", codEndereco=" + codEndereco
                + ", codUsuario=" + codUsuario + ", latitude=" + latitude + ", logradouro=" + logradouro
                + ", longitude=" + longitude + ", numero=" + numero + ", pais=" + pais + ", raio=" + raio + ", uf=" + uf
                + "]";
    }
}
