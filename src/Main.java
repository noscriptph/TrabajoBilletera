/*
 * Copyright (c) 2024.
 * Proyecto del curso bootcamp android y java, el objetivo es realizar un wallet que registre transacciones, cambios de
 * divisa, crear un usuario y que tenga su acceso protegido con contraseña
 */

import cl.billetera.clases.Menu;

import java.io.IOException;

/**
 * Ejecuta solamente a la clase Menu siguiendo recomendacion
 * y buena practica de mantener el mai lo mas lipio posible
 */
public class Main {
    /**
     * @Autor Victor Paillacar
     * @Descripcion Ejecuta solamente a la clase Menu siguiendo recomendacion
     *   y buena practica de mantener el mai lo mas lipio posible
     */
    public static void main(String[] args) throws IOException, InterruptedException {

        Menu.menuAplicacion();
    }
}