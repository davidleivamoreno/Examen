package org.login;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*Implementa una clase Login a la que se le pasará por anotación los usuarios que pueden acceder junto con la contraseña.

Ten en cuenta lo siguiente:

Login tendrá un método de login() que solicitará por consola (Scanner) un usuario y contraseña.

Seguidamente, comprobará en una lista interna de credenciales de Login, si existe algún usuario con dicha contraseña, indicando por mensaje 2 opciones:
ACCESO CONCEDIDO
ACCESO DENEGADO.

Un objeto Login se instanciará a través de un método cargador de contexto (estático) que procese las anotaciones y registre la lista de credenciales de los usuarios.

Prueba Login en un método de main().
*/
@UsuarioAnot(usuario= "usuario1",password = "1234")
@UsuarioAnot(usuario="usuario2",password = "admin.1")
public class Login {
    public Set<Usuario> usuarios=new HashSet<>();
    //Constructor
    public Login(){

    }
    //Getters y Setters
    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    //Métodos
    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre");
        String nombre = sc.nextLine();
        System.out.println("Escriba la contraseña:");
        String acceso="";
        String contraseña = sc.nextLine();

        for (Usuario usuario : usuarios) {
            if (nombre.equals(usuario.getUsuario()) && contraseña.equals(usuario.getpassword())) {
                acceso="ACCESO CONCEDIDO";

            } else {
                if(acceso.equals("") || acceso.equals("ACCESO DENEGADO")) {
                    acceso = "ACCESO DENEGADO";
                }
            }

        }
        System.out.println(acceso);


    }
}