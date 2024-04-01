/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;


import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public abstract class Cuenta extends Persona {

    /**
     * setea el saldo en la cuenta en $0
     */
    public static double saldoEnLaCuenta = 0;


    public Cuenta(long saldoEnLaCuenta, String nombreUsuario, String rutUsuario, String password, String correoElectronico, boolean sesionActiva, boolean isMayorEdad) {

        this.saldoEnLaCuenta = saldoEnLaCuenta;
    }


    /**
     * permite acceder al saldo en la cuenta
     */
    public static long getSaldoEnLaCuenta() {

        return (long) saldoEnLaCuenta;
    }


    /**
     * @param saldoEnLaCuenta Pemite guardar saldo en la cuenta
     */
    public static void setSaldoEnLaCuenta(double saldoEnLaCuenta) {
        Cuenta.saldoEnLaCuenta = saldoEnLaCuenta;
    }

    /**
     * Este metodo sirve para ver el saldo en la
     * cuenta
     */
    public static void verSaldo() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();


        boolean condicion;
        condicion = isSesionActiva();
        if (condicion) {
            System.out.println("El saldo en la cuenta es: $" + getSaldoEnLaCuenta());
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            //en windows esta linea limpia la consola
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.println("Debe iniciar sesion para consultar esta informacion");
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            //en windows esta linea limpia la consola
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        }

    }

    /**
     * Este metodo sirve para ver si la sesion esta activa,
     * muestra el nombre de usuario, el rut de usuario,
     * el correo electronico y el saldo en la cuenta
     */
    public static void verEstadoCuenta() throws InterruptedException, IOException {
        if (Persona.isSesionActiva()) {
            System.out.println("Informacion visible por 10 segundos por seguridad");
            System.out.println("Sesion iniciada");
            System.out.println("-$" + getSaldoEnLaCuenta() + " pesos");
            System.out.println("-Nombre de usuario es=" + getNombreUsuario());
            System.out.println("-Rut de usuario es=" + getRutUsuario());
            System.out.println("-Correo electronico es=" + getCorreoElectronico());

            TimeUnit.SECONDS.sleep(10);


        } else {
            System.out.println("Debe iniciar sesion para consultar esta informacion");
        }
        //limpiar consola
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.print("Volviendo al menu");
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
    }

    /**
     * Muestra el menú de transaccion
     * este menu sirve para llamar a los metodos de transaccion
     * para retirar y depositar dinero
     */
    public static void menuDeTransaccion() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println("Indique que desea hacer");
        System.out.println("1)Retirar dinero");
        System.out.println("2)Depositar dinero");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        if (respuesta.equals("1")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            retirarDinero();


        } else if (respuesta.equals("2")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            depositarDinero();

        }
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
    }

    /**
     * permite retirar dinero de la cuenta
     */
    private static void retirarDinero() {
        System.out.println("Cuanto desea retirar dinero?");
        Scanner scanner = new Scanner(System.in);
        long retirar = scanner.nextLong();
        System.out.println("Retirando $" + retirar + " de la cuenta");
        setSaldoEnLaCuenta(getSaldoEnLaCuenta() - retirar);
    }

    /**
     * permite depositar dinero de la cuenta
     */
    private static void depositarDinero() {
        System.out.println("Cuanto desea depositar?");
        Scanner scanner = new Scanner(System.in);
        long depositar = scanner.nextLong();
        System.out.println("Depositando $" + depositar + " en la cuenta");
        setSaldoEnLaCuenta(getSaldoEnLaCuenta() + depositar);

    }
}
