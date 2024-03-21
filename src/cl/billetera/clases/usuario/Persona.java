/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Se utiliza el modificador de acceso protected para utilizar las
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
    protected static String password;
    private static Random idUsuario;
    private static String correoElectronico;

    protected boolean sesionActiva=false;

     /*
    2)Constructor
     */

    /**
     * Obliga que al crear una persona se deban ingresar todos sus datos
     *
     * @param nombreUsuario     almacena el nombre del usuario
     * @param rutUsuario        almacena el rut del usuario
     * @param idUsuario         le asigna un id que sera usado para representar al usuario
     * @param password          guarda la contraseña para el usuario creado
     * @param correoElectronico guarda el correo del usuario
     */
    public Persona(String nombreUsuario, String rutUsuario, Random idUsuario, String password, String correoElectronico) {
        this.nombreUsuario = nombreUsuario;
        this.rutUsuario = rutUsuario;
        this.idUsuario = idUsuario;
        this.password = password;
        this.correoElectronico = correoElectronico;
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

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Persona.password = password;
    }

    public static String getCorreoElectronico() {
        return correoElectronico;
    }

    public static void setCorreoElectronico(String correoElectronico) {

    }

    /**
     * Permite crear un usuario con sus correspondientes datos personales y
     * generar un id.
     */

    public static void crearUsuario() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Crea usuario y configurar contraseña");

        System.out.println("Ingrese el nombre del Usuario");
        Scanner scanner = new Scanner(System.in);

        setNombreUsuario(scanner.next());
        System.out.println("Ingrese el rut del usuario sin pintos y con guion");
        System.out.println("    ejemplo:  19000123-0");
        scanner.nextLine();
        setRutUsuario(scanner.nextLine());
        setIdUsuario(new Random());
        System.out.println("Ingrese su Email:");
        setCorreoElectronico(scanner.nextLine());

        System.out.println("Indique una contraseña de 10 caracteres");
        System.out.println("solo se permiten 10 caracteres, el resto sera eliminado");
        System.out.print("contraseña: ");

        setPassword(scanner.nextLine());
        setPassword(getPassword().substring(0, 10));


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

    public static void inciarSesion() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        String textoAComparar1;
        String textoAComparar2;
        System.out.println("Ingrese su correo");
        Scanner scanner1 = new Scanner(System.in);
        textoAComparar1 = scanner1.nextLine();

        System.out.println("Ingrese su contraseña");
        Scanner scanner2 = new Scanner(System.in);
        textoAComparar2 = scanner2.nextLine();

        if ((textoAComparar1.equals(getCorreoElectronico())) && (textoAComparar2.equals(getPassword()))) {
            System.out.println("Sesion iniciada correctamente");
            setSesionActiva(true);
            //limpiar consola y volver al menu
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.print("Volviendo al menu");
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);


        } else {
            System.out.println("Usuario o contraseña equivocados");
            System.out.println("Intentelo nuevamente o contacte con entidad bancaria");

            //limpiar consola y volver al menu
            System.out.print("Volviendo al menu");
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }


    }
    /*
    4)Metodos de comportamiento
     */

    public boolean isSesionActiva() {
        return sesionActiva;
    }

    public static void setSesionActiva(boolean sesionActiva) {

    }
        /*
    5)Metodos utilitarios o de logica
     */
}
