/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import com.sun.jdi.InternalException;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CuentaEnEuro extends Cuenta implements CambioDeDivisa {

    double EURO = 910;

    public CuentaEnEuro(long saldoEnLaCuenta, String nombreUsuario, String rutUsuario, String password, String correoElectronico, boolean sesionActiva, boolean isMayorEdad) {
        super(saldoEnLaCuenta, nombreUsuario, rutUsuario, password, correoElectronico, sesionActiva, isMayorEdad);
    }

    public CuentaEnEuro() {

    }

    /**
     *
     */
    @Override
    public void cambio(double saldoEnLaCuenta) throws IOException, InternalException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        boolean seguir = true;
        Scanner scanner = new Scanner(System.in);


        while (seguir) {
            try {

                System.out.println("Cambio de divisa");
                System.out.println("Seleccione una opcion: ");
                System.out.println("1. Euro a peso");
                System.out.println("2. Peso  a euro");
                System.out.println("3. Pesos en su cuenta a euro");
                System.out.println("4. volver al menu principal");
                String menu = scanner.next();


                switch (menu) {
                    case "1":
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("Euro a peso");
                        System.out.println("Ingrese la cantidad de euros que quiere convertir");
                        double euros = scanner.nextDouble();
                        System.out.println("$" + euros + " en pesos es: " + euros * EURO);


                        System.out.println("Volviendo al menu");
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();


                        break;

                    case "2":
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("Pesos en su cuenta a euro");
                        System.out.println("Ingrese la cantidad de pesos que quiere convertir");
                        double pesos = scanner.nextDouble();
                        System.out.println("$" + pesos + " en euros es: " + pesos / EURO);


                        System.out.println("Volviendo al menu");
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        break;

                    case "3":
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("Pesos en su cuenta a euro");
                        System.out.println("$" + saldoEnLaCuenta + " en euros es: " + saldoEnLaCuenta / EURO);


                        System.out.println("Volviendo al menu");
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        break;
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
