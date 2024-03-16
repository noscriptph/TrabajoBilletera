/*
 * Copyright (c) 2024.
 * Proyecto del curso bootcamp android y java, el objetivo es realizar un wallet que registre transacciones, cambios de
 * divisa, crear un usuario y que tenga su acceso protegido con contraseña
 */

import cl.billetera.clases.Menu;

import java.io.IOException;

/**
 * Ejecuta solamente a la clase Menu siguiendo recomendacion
 * y buena práctica de mantener el main lo más limpio posible
 */
public class Main {
    /**
     * @Autor Victor Paillacar
     * @Descripcion Ejecuta solamente a la clase Menu siguiendo recomendacion
     * y buena práctica de mantener el main lo más limpio posible
     */
    public static void main(String[] args) throws IOException, InterruptedException {

        Menu.menuAplicacion();
    }
}