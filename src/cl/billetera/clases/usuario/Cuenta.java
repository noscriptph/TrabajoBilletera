/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import java.io.IOException;
import java.util.Scanner;


public  class Cuenta extends Persona  {
    /*
1)Atributos de una clase
modificadores de acceso, son parte de los polimorfismos
public, private, protected y son palabras reservadas
*/
    private static long saldoEnLaCuenta=0;


     /*
    2)Constructor
     */

    public Cuenta(long saldoEnLaCuenta,String nombreUsuario, String rutUsuario, String password, String correoElectronico, boolean sesionActiva, boolean isMayorEdad) {

        this.saldoEnLaCuenta = saldoEnLaCuenta;
    }


/*
    3)Metodos de acceso
     */

    public static long getSaldoEnLaCuenta() {
        return saldoEnLaCuenta;
    }

    public static void setSaldoEnLaCuenta(long saldoEnLaCuenta) {

    }

/*
    4)Metodos de comportamiento
     */


public static void verSaldo(){
   if(Persona.getSesionActiva()){
       System.out.println("El saldo en la cuenta es: $" + getSaldoEnLaCuenta());
   }else{
       System.out.println("Debe iniciar sesion para consultar esta informacion");
   }

}
public void depositarORetirarDinero() throws IOException, InterruptedException {
    System.out.println("Quiere depositar o retirar dinero?");
    System.out.println("1)Depositar dinero");
    System.out.println("2)Retirar dinero");
    Scanner scanner = new Scanner(System.in);
    String respuesta = scanner.nextLine();
    if(respuesta.equals("1")){
        depositarDinero();
    }else if(respuesta.equals("2")){
        retirarDinero();
    }else{
        System.out.println("Respuesta incorrecta");
        System.out.println("Volviendo al menu principal");
    }


}

public static void menuDeTransaccion(){
    System.out.println("Indique que desea hacer");
    System.out.println("1)Retirar dinero");
    System.out.println("2)Depositar dinero");
    Scanner scanner = new Scanner(System.in);
    String respuesta = scanner.nextLine();
    if(respuesta.equals("1")){
        retirarDinero();
        System.out.println("Retirado");

    }else if(respuesta.equals("2")){
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
    System.out.println("Cuanto desea depositar dinero?");
    Scanner scanner = new Scanner(System.in);
    long depositar = scanner.nextLong();
    System.out.println("Depositando $" + depositar + " en la cuenta");
    setSaldoEnLaCuenta(getSaldoEnLaCuenta() + depositar);


    }

        /*
    5)Metodos utilitarios o de logica
     */

}
