/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CuentaTest {

    @Test
    void testGetSaldoEnLaCuenta() {
        assertEquals(0L, Cuenta.getSaldoEnLaCuenta());
    }

    @Test
    void testSetSaldoEnLaCuenta() {
        // Setup
        // Run the test
        Cuenta.setSaldoEnLaCuenta(0.0);

        // Verify the results
    }

    @Test
    void testVerSaldo() throws Exception {
        Cuenta.setSaldoEnLaCuenta(10000);
        Cuenta.verSaldo();
        assertEquals(10_000,Cuenta.getSaldoEnLaCuenta());

    }




    @Test
    void testVerEstadoCuenta() throws Exception {
        
        Cuenta.verEstadoCuenta();

    }



}
