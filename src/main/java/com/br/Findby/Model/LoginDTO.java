package com.br.Findby.Model;

public class LoginDTO {
    private String usuario;
    private String senha;
    private String tipoUsuario;
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((senha == null) ? 0 : senha.hashCode());
        result = prime * result + ((tipoUsuario == null) ? 0 : tipoUsuario.hashCode());
        result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
        LoginDTO other = (LoginDTO) obj;
        if (senha == null) {
            if (other.senha != null)
                return false;
        } else if (!senha.equals(other.senha))
            return false;
        if (tipoUsuario == null) {
            if (other.tipoUsuario != null)
                return false;
        } else if (!tipoUsuario.equals(other.tipoUsuario))
            return false;
        if (usuario == null) {
            if (other.usuario != null)
                return false;
        } else if (!usuario.equals(other.usuario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "LoginDTO [senha=" + senha + ", tipoUsuario=" + tipoUsuario + ", usuario=" + usuario + "]";
    }
}
