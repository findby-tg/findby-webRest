package com.br.Findby.Model;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity(name = "Produtos")
@Table(name = "Produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codProduto;
    private Integer codUsuario;
    private String nomeProduto;
    private Timestamp dataCadastro;
    private String descricao;
    private Double preco;
    private String marca;
    private Integer codCategoria;
    private String imgProd;

    public Integer getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }
    public Integer getCodUsuario() {
        return codUsuario;
    }
    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public Timestamp getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Timestamp dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Integer getCodCategoria() {
        return codCategoria;
    }
    public void setCodCategoria(Integer codCategoria) {
        this.codCategoria = codCategoria;
    }
    public String getImgProd() {
        return imgProd;
    }
    public void setImgProd(String imgProd) {
        this.imgProd = imgProd;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codProduto == null) ? 0 : codProduto.hashCode());
        result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
        result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((nomeProduto == null) ? 0 : nomeProduto.hashCode());
        result = prime * result + ((preco == null) ? 0 : preco.hashCode());
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
        Produto other = (Produto) obj;
        if (codProduto == null) {
            if (other.codProduto != null)
                return false;
        } else if (!codProduto.equals(other.codProduto))
            return false;
        if (codUsuario == null) {
            if (other.codUsuario != null)
                return false;
        } else if (!codUsuario.equals(other.codUsuario))
            return false;
        if (dataCadastro == null) {
            if (other.dataCadastro != null)
                return false;
        } else if (!dataCadastro.equals(other.dataCadastro))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (nomeProduto == null) {
            if (other.nomeProduto != null)
                return false;
        } else if (!nomeProduto.equals(other.nomeProduto))
            return false;
        if (preco == null) {
            if (other.preco != null)
                return false;
        } else if (!preco.equals(other.preco))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [codProduto=" + codProduto + ", codUsuario=" + codUsuario + ", dataCadastro=" + dataCadastro
                + ", descricao=" + descricao + ", marca=" + marca + ", nomeProduto=" + nomeProduto + ", preco=" + preco
                + "]";
    }
    
}
