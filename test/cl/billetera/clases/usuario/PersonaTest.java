/*
 * Copyright (c) 2024.
 */

package cl.billetera.clases.usuario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonaTest {

    Persona personaTest;

    @BeforeEach
    public void setUp() throws Exception {
        personaTest = new Persona();
        Persona.setNombreUsuario("alguien");
        Persona.setRutUsuario("11111111-1");
        Persona.setIdUsuario("01234567890");
        Persona.setPassword("1234567890");
        Persona.setCorreoElectronico("alguien@dominio.com");


    }


    @Test
    void verificarMayoriaEdadUsuario() {
        boolean esMayorEdad = personaTest.verificarMayoriaEdadUsuario(19);
        assertTrue(personaTest.isIsMayorEdad());
    }

    @Test
    void verificarMinoriaEdadUsuario() {
        boolean esMenorEdad = personaTest.verificarMayoriaEdadUsuario(17);
        assertFalse(personaTest.isIsMayorEdad());
    }

    @Test
    void verificarEdadValida() {
        boolean edadValida = personaTest.verificarMayoriaEdadUsuario(121);
        assertFalse(personaTest.isIsMayorEdad());
    }



}


