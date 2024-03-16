/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Persona {
    /*
    1)Atributos de una clase
    modificadores de acceso, son parte de los polimorfismos
    public, private, protected y son palabras reservadas
    */
    private String nombreUsuario;
    private String rutUsuario;
    public Long idUsuario;





     /*
    2)Constructor
     */

    /**
     * Obliga que al crear una persona se deban ingresar todos sus datos
     * @param nombreUsuario
     * @param rutUsuario
     * @param idUsuario
     */
    public Persona(String nombreUsuario, String rutUsuario, long idUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.rutUsuario = rutUsuario;
        this.idUsuario = idUsuario;
    }
    /*
    3)Metodos de acceso
     */

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getRutUsuario() {
        return rutUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    /*
    4)Metodos de comportamiento
     */
public static void crearUsuarioYMontosInciales() throws IOException, InterruptedException {
    new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
    System.out.println("Crea usuario y configurar montos iniciales");




    //limpiar consola y volver al menu
    new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
    System.out.println("Usuario creado y monto asignado");
    System.out.print("Volviendo al menu");
    System.out.print(".");
    TimeUnit.SECONDS.sleep(1);
    System.out.print(".");
    TimeUnit.SECONDS.sleep(1);
    System.out.print(".");
    TimeUnit.SECONDS.sleep(1);
}

        /*
    5)Metodos utilitarios o de logica
     */
}
