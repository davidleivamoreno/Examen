package org.login;

public class Usuario {
    //Declaracion de Variables
    private String usuario;
    private String password;
    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
