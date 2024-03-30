/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import java.io.IOException;

public class CuentaEnDolar extends Cuenta implements CambioDeDivisa {
    public CuentaEnDolar(long saldoEnLaCuenta, String nombreUsuario, String rutUsuario, String password, String correoElectronico, boolean sesionActiva, boolean isMayorEdad) {
        super(saldoEnLaCuenta, nombreUsuario, rutUsuario, password, correoElectronico, sesionActiva, isMayorEdad);
    }

    /**
     */


}
