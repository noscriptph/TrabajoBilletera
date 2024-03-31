/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import com.sun.jdi.InternalException;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public abstract class Cuenta extends Persona {

    public static double saldoEnLaCuenta = 0;


    public Cuenta(long saldoEnLaCuenta, String nombreUsuario, String rutUsuario, String password, String correoElectronico, boolean sesionActiva, boolean isMayorEdad) {

        this.saldoEnLaCuenta = saldoEnLaCuenta;
    }

    public Cuenta() {

    }


    public static long getSaldoEnLaCuenta() {
        return (long) saldoEnLaCuenta;
    }

    public static void setSaldoEnLaCuenta(long saldoEnLaCuenta) {

    }


    public static void verSaldo() {
        if (Persona.getSesionActiva()) {
            System.out.println("El saldo en la cuenta es: $" + getSaldoEnLaCuenta());
        } else {
            System.out.println("Debe iniciar sesion para consultar esta informacion");
        }

    }

    public static void verEstadoCuenta() throws InterruptedException, IOException {
        if (Persona.getSesionActiva()) {
            System.out.println("Sesion iniciada");

            TimeUnit.SECONDS.sleep(2);

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
            System.out.println("Debe iniciar sesion para consultar esta informacion");
        }
    }

    public static void menuDeTransaccion() {
        System.out.println("Indique que desea hacer");
        System.out.println("1)Retirar dinero");
        System.out.println("2)Depositar dinero");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        if (respuesta.equals("1")) {
            retirarDinero();
            System.out.println("Retirado");

        } else if (respuesta.equals("2")) {
            depositarDinero();
            System.out.println("Depositado");
        }
    }

    private static void retirarDinero() {
        System.out.println("Cuanto desea retirar dinero?");
        Scanner scanner = new Scanner(System.in);
        long retirar = scanner.nextLong();
        System.out.println("Retirando $" + retirar + " de la cuenta");
        setSaldoEnLaCuenta(getSaldoEnLaCuenta() - retirar);
    }

    private static void depositarDinero() {
        System.out.println("Cuanto desea depositar?");
        Scanner scanner = new Scanner(System.in);
        long depositar = scanner.nextLong();
        System.out.println("Depositando $" + depositar + " en la cuenta");
        setSaldoEnLaCuenta(getSaldoEnLaCuenta() + depositar);


    }

    public void depositarORetirarDinero() throws IOException, InterruptedException {
        System.out.println("Quiere depositar o retirar dinero?");
        System.out.println("1)Depositar dinero");
        System.out.println("2)Retirar dinero");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        //limpiar consola
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        if (respuesta.equals("1")) {
            depositarDinero();
        } else if (respuesta.equals("2")) {
            retirarDinero();
        } else {
            //limpiar consola y volver al menu
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Respuesta incorrecta");
            System.out.println("Volviendo al menu principal");
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            //limpiar consola y volver al menu
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }


    }


    public static double cambio() {
        return 0;
    }

    public abstract void cambio(double saldoEnLaCuenta) throws IOException, InternalException, InterruptedException;
}
