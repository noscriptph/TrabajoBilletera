/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import java.util.Random;


public  class Cuenta{
    /*
1)Atributos de una clase
modificadores de acceso, son parte de los polimorfismos
public, private, protected y son palabras reservadas
*/
    private long saldoEnLaCuenta;


     /*
    2)Constructor
     */

    public Cuenta(long saldoEnLaCuenta) {
        this.saldoEnLaCuenta = saldoEnLaCuenta;
    }


/*
    3)Metodos de acceso
     */

    public long getSaldoEnLaCuenta() {
        return saldoEnLaCuenta;
    }

    public void setSaldoEnLaCuenta(long saldoEnLaCuenta) {
        this.saldoEnLaCuenta = saldoEnLaCuenta;
    }

/*
    4)Metodos de comportamiento
     */


public static void verSaldo(){


}
        /*
    5)Metodos utilitarios o de logica
     */

}
