package cl.billetera.clases;

import cl.billetera.clases.usuario.CambioDeDivisa;
import cl.billetera.clases.usuario.Persona;
import cl.billetera.clases.usuario.Cuenta;
import com.sun.jdi.InternalException;


import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Se encarga de llamar a las clases para ejecutar
 * configuracion inicial de la Cuenta, iniciar sesion,
 * depositar y retirar dinero, hacer conversiones de
 * moneda
 */
public class Menu {

    public static String menu;


    /**
     * {@code @Descripcion} Este metodo de comportamiento es muy importante ya que es la base de todo el funcionamiento de la aplicacion,
     * permite hacer todas las funciones que espera el cliente, ademas de incluir un menu de cerrado intuitivo y tener
     * un control de errores al momento de ingresar mal las opciones.
     * Uso la opcion de   TimeUnit.SECONDS.sleep(3);    para qe el cliente al cerrar logre leer el mensaje  que la
     * aplicacion le entrega y que el cierre no sea inmediato
     */

    public static void menuAplicacion() throws IOException, InternalException, InterruptedException {

        boolean seguir = true;
        Scanner scanner = new Scanner(System.in);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Bienvenido a su billetera!");
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);


        while (seguir) {
            try {
                // Aca muestro por pantalla el menu
                //en windows esta linea limpia la consola
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                System.out.println("MENU");

                System.out.println("    1) Crear usuario");

                System.out.println("    2) Iniciar sesion");

                System.out.println("    3) Ver saldo en la cuenta");

                System.out.println("    4) Depositar o retirar dinero");

                System.out.println("    5) Ver estado de Cuenta");

                System.out.println("    6) Realizar conversion de dinero");

                System.out.println("    7) Ver valores de conversion");

                System.out.println("    8) ");

                System.out.println("    9) Salir (La informacion ingresada sera borrada)");


                System.out.print("Escriba un numero: ");


                menu = scanner.next();


                switch (menu) {
                    case "1":
                        Persona.verificarMayoriaEdadUsuario();
                        Persona.crearUsuario();

                        break;


                    case "2":
                        Persona.iniciarSesion();

                        break;


                    case "3":
                        Cuenta.verSaldo();


                        break;
                    case "4":
                        Cuenta.menuDeTransaccion();

                        break;


                    case "5":
                        Cuenta.verEstadoCuenta();


                        break;


                    case "6":
                        CambioDeDivisa.conversorMoneda();

                        break;


                    case "7":


                        break;
                    case "8":

                        break;


                    case "9":
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("");
                        System.out.println("Muchas gracias por preferirnos");
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print(".");
                        TimeUnit.SECONDS.sleep(1);
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        seguir = false;
                        break;


                    default:
                        System.out.println("Accion invalida, intentelo denuevo");

                        break;

                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
