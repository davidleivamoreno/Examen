package org.login;
public class CargadorContexto{
public static void CargadorContexto(Login l1) {
    UsuariosAnot usuariosAnot=Login.class.getAnnotation(UsuariosAnot.class);
    UsuarioAnot[] arrayUsuarios=usuariosAnot.value();
    for (UsuarioAnot usuarioiterador:arrayUsuarios){
    String nombre=usuarioiterador.usuario();
    String password=usuarioiterador.password();
    l1.getUsuarios().add(new Usuario(nombre,password));
    }
}
}
