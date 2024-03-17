/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * se utiliza el modificador de acceso protected para utilizar las
 * variables en otras clases
 */
public class Persona {
    /*
    1)Atributos de una clase
    modificadores de acceso, son parte de los polimorfismos
    public, private, protected y son palabras reservadas
    */

    protected static String nombreUsuario;
    protected static String rutUsuario;
    protected static Random idUsuario;
    protected String password;

     /*
    2)Constructor
     */

    /**
     * Obliga que al crear una persona se deban ingresar todos sus datos
     *
     * @param nombreUsuario almacena el nombre del usuario
     * @param rutUsuario    almacena el rut del usuario
     * @param idUsuario     le asigna un id que sera usado para representar al usuario
     */
    public Persona(String nombreUsuario, String rutUsuario, Random idUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.rutUsuario = rutUsuario;
        this.idUsuario = idUsuario;
    }
    /*
    3)Metodos de acceso
     */

    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    public static void setNombreUsuario(String nombreUsuario) {
        Persona.nombreUsuario = nombreUsuario;
    }

    public static String getRutUsuario() {
        return rutUsuario;
    }

    public static void setRutUsuario(String rutUsuario) {
        Persona.rutUsuario = rutUsuario;
    }

    public static Random getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(Random idUsuario) {
        Persona.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Permite crear un usuario con sus correspondientes datos personales y
     * generar un id.
     */



/*
    4)Metodos de comportamiento
     */
    public static void crearUsuarioYMontosInciales() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Crea usuario y configurar montos iniciales");

        System.out.println("Ingrese el nombre del Usuario");
        Scanner scanner = new Scanner(System.in);

        setNombreUsuario(scanner.next());
        System.out.println("Ingrese el rut del usuario sin pintos y con guion");
        System.out.println("    ejemplo:  19000123-0");
        setRutUsuario(scanner.next());
        setIdUsuario(new Random());
        System.out.println("indique una contraseña de 10 caracteres");
        System.out.print("contraseña: ");

        //limpiar consola y volver al menu
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Usuario creado");
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
