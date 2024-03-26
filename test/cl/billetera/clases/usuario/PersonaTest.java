/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    Persona personaTest;

    @BeforeEach
    public void setUp() throws Exception {
        personaTest = new Persona();
    }

    @Test
    void verificarMayoriaEdadUsuario() {
        boolean esMayorDeEdad = personaTest.verificarMayoriaEdadUsuario(18);
        assertTrue(esMayorDeEdad);
    }
    @Test
    void verificarMinoriaEdadUsuario() {
        boolean esMenorEdad = personaTest.verificarMayoriaEdadUsuario(17);
        assertFalse(esMenorEdad);
    }

    @Test
    void verificarEdadValida() {
        boolean edadValida = personaTest.verificarMayoriaEdadUsuario(121);
        assertFalse(edadValida);
    }



}


