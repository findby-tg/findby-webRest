package com.br.Findby.Model;


import javax.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity(name = "Usuario")
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long codUsuario;
    private String nome;
    private String email;
    private String login;
    private String cpfCgc;
    private Integer numDddCelular;
    private Integer telefoneCelular;
    private String tipoUsuario;
    private String tipoPessoa;
    private Integer raio;
    private String senha;
    private String indUsaLatLong;

    @ManyToOne
    @JoinColumn(name="codSegmento")
    private Segmento segmento;

    @OneToMany
    @JoinColumn(name="codUsuario")
    private List<Endereco> enderecos;
    
    @OneToMany
    @JoinColumn(name="codUsuario")
    private List<Contato> contatos;

    public Usuario() {
    }


    public Long getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Long codUsuario) {
        this.codUsuario = codUsuario;
    }

       public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCpfCgc() {
        return cpfCgc;
    }

    public void setCpfCgc(String cpfCgc) {
        this.cpfCgc = cpfCgc;
    }

    public Integer getNumDddCelular() {
        return numDddCelular;
    }

    public void setNumDddCelular(Integer numDddCelular) {
        this.numDddCelular = numDddCelular;
    }

    public Integer getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(Integer telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public Integer getRaio() {
        return raio;
    }

    public void setRaio(Integer raio) {
        this.raio = raio;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public String getIndUsaLatLong() {
        return indUsaLatLong;
    }


    public void setIndUsaLatLong(String indUsaLatLong) {
        this.indUsaLatLong = indUsaLatLong;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return codUsuario == usuario.codUsuario && numDddCelular == usuario.numDddCelular && telefoneCelular == usuario.telefoneCelular && raio == usuario.raio && Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email) && Objects.equals(login, usuario.login) && Objects.equals(cpfCgc, usuario.cpfCgc) && Objects.equals(tipoUsuario, usuario.tipoUsuario) && Objects.equals(tipoPessoa, usuario.tipoPessoa) && Objects.equals(senha, usuario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codUsuario, nome, email, login, cpfCgc, numDddCelular, telefoneCelular, tipoUsuario, tipoPessoa, raio, senha);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codUsuario=" + codUsuario +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", cpfCgc='" + cpfCgc + '\'' +
                ", numDddCelular=" + numDddCelular +
                ", telefoneCelular=" + telefoneCelular +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                ", tipoPessoa='" + tipoPessoa + '\'' +
                ", raio=" + raio +
                ", senha='" + senha + '\'' +
                '}';
    }
}
