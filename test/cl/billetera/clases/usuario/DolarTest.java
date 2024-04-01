/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DolarTest {

    private Dolar dolarTest;

    @BeforeEach
    void setUp() {

        dolarTest = new Dolar();
    }
    /**
     * Testea el acceso al valor de dólar
     */
    @Test
    void testGetDolar() {

        assertEquals(950, dolarTest.getDolar());
    }
    @Test
    void testConvertir() {

        dolarTest.convertir();


    }


}
