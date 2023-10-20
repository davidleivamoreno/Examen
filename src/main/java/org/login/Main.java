package org.login;

public class Main {
    public static void main(String[] args){
        Login l1=new Login();
        CargadorContexto.CargadorContexto(l1);
       for(Usuario usuario:l1.usuarios){
           System.out.println(usuario);
       }
        l1.login();
    }
}
