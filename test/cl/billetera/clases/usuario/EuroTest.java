/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EuroTest {

    private Euro euroTest;

    @BeforeEach
    void setUp() {

        euroTest = new Euro();
    }

    /**
     * Testea el acceso al valor de euro
     */
    @Test
    void testGetEuro() {
        assertEquals(910.0, euroTest.getEuro());
    }

    @Test
    void testConvertir() {

        euroTest.convertir();

    }
}
