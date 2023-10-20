package org.login;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(UsuariosAnot.class)
public @interface UsuarioAnot {
    //Declaracion de Variables en la anotacion
    String usuario() default "VOID";
    String password() default "VOID";
}
