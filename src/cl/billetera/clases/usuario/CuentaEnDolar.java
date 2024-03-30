/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import com.sun.jdi.InternalException;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CuentaEnDolar extends Cuenta implements CambioDeDivisa {
    public CuentaEnDolar(long saldoEnLaCuenta, String nombreUsuario, String rutUsuario, String password, String correoElectronico, boolean sesionActiva, boolean isMayorEdad) {
        super(saldoEnLaCuenta, nombreUsuario, rutUsuario, password, correoElectronico, sesionActiva, isMayorEdad);
    }

    /**
     *
     */
    @Override
    public void cambio() throws IOException, InternalException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        boolean seguir = true;
        Scanner scanner = new Scanner(System.in);


        while (seguir) {
            try {

                System.out.println("Cambio de divisa");
                System.out.println("Seleccione una opcion: ");
                System.out.println("1. Dolar a peso");
                System.out.println("2. Peso  a dolar");
                System.out.println("3. pesos en su cuenta a dolar");
                System.out.println("4. volver al menu principal");
                String menu = scanner.next();


                switch (menu) {
                    case "1":
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("Dolar a peso");



                        break;

                    case "2":
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("Pesos en su cuenta a dolar");

                        break;

                    case "3":
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("Pesos en su cuenta a dolar");
                        System.out.println("$" + saldoEnLaCuenta+ " en dolares es: "+saldoEnLaCuenta/950);


                    case "4":
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("");
                        System.out.println("Volviendo al menu");
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        seguir = false;
                        break;


                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}