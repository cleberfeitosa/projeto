/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Cleber Feitosa
 */
public class Usuario {
    int iduser;
    String fone;
    String usuario;
    String login;
    String senha;
    String perfil;
    
    public Usuario() {
    }

    public Usuario(int iduser, String fone, String usuario, String login, String senha, String perfil) {
        this.iduser = iduser;
        this.fone = fone;
        this.usuario = usuario;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
      
    
}
