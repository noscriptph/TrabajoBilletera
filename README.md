
# Billetera Virtual

Proyecto basado en tarea asignada en bootcamp en la estapa de java.



## Objetivo
El objetivo de nuestro proyecto **Alke Wallet** es desarrollar una billetera
digital que permita a los usuarios gestionar sus activos financieros de
manera segura y conveniente.
Nuestro objetivo es entregar una aplicación funcional, segura y fácil de
usar que proporcione a los usuarios una solución confiable para
administrar sus activos financieros de manera digital.

## Requerimientos generales
—Administración de fondos: El programa debe permitir crear una cuenta, ver su saldo disponible, realizar ingreso y 
retiro de dinero (debe impactar sobre el saldo actual).

—Conversión de moneda: El programa debe permitir convertir el saldo de un tipo de moneda a otra.
## Aspectos técnicos
—Legibilidad del código: Se evaluará la claridad y organización del código desarrollado, asegurando buenas prácticas de programación y facilidad de mantenimiento.

—Documentación: Se verificará que el proyecto esté
correctamente documentado, incluyendo comentarios en el código, explicaciones de funcionalidades y documentación técnica adicional según sea necesario
## Aspectos estructurales
—Cumplimiento de los requerimientos: Se evaluará si todas las funcionalidades requeridas han sido implementadas de acuerdo con los requisitos establecidos.

—Calidad del proyecto: Se analizará la calidad del código, la estructura de la base de datos, la seguridad implementada y otros aspectos técnicos para garantizar un proyecto robusto y
confiable.
## Entregables ✅

Al finalizar el proyecto **Alke Wallet**, se espera que el equipo de desarrollo
entregue los siguientes elementos como evidencia concreta del trabajo
realizado:

● Código fuente: Se debe proporcionar el código fuente completo del
proyecto, incluyendo todos los archivos y directorios necesarios para
compilar y ejecutar la aplicación.

● Documentación técnica: Debe incluir una documentación clara y
concisa que describa la estructura del proyecto, la arquitectura
utilizada, las tecnologías empleadas y las instrucciones para ejecutar
la aplicación en un entorno local.

● Prototipo o demostración funcional: Se espera presentar un
prototipo o una demostración funcional de la aplicación que
muestre las principales características y funcionalidades
implementadas.

● Informe de pruebas: Se debe proporcionar un informe detallado
que documente las pruebas realizadas en el proyecto, incluyendo las
pruebas unitarias, pruebas de integración y cualquier otra prueba
relevante. Este informe debe mostrar los resultados de las pruebas y
cualquier problema identificado y solucionado.

● Presentación final: Se espera una presentación final del proyecto
que muestre los aspectos técnicos, los desafíos enfrentados, las
soluciones implementadas y los logros obtenidos. Esta presentación
debe ser clara, concisa y orientada a la audiencia, destacando los
aspectos más relevantes del proyecto.
## MENU Y SALIDA

<img alt="menu" height="400" src="https://github.com/noscriptph/TrabajoBilletera/assets/103396791/9bf83b50-03b2-40a3-a9b9-cd13e4cbbccb" width="600"/>

Se diseñó el menu de entrada y salida de tal forma que el usuario sienta que la aplicacion está más viva y le recuerde
a cualquier aplicacion del diario vivir que corre en terminal(esto tomando de referencia aplicaciones ejecutadas en linux, windows como parches, actualizaciones, navegacion por carpetas, etc).
Además el uso debe ser intuitivo y que independiente de lo ingresado por el usuario no existan problemas de cuelgues 
o errores en pantalla, solo alertas lo más simple y amigables posibles así evitar frustracion por parte del usuario.

##MAIN
<img alt="main" height="400" src="https://github.com/noscriptph/TrabajoBilletera/assets/103396791/66f9b259-fe9e-4d86-822d-d63a3a1c6435" width="600"/>

el unico trabajo de main.java es hacer un llamado a menú.menuAplicacion(). Esto para mantener una buena costumbre de evitar sobrecargar el main con codigo innecesario y
prepararme a aprender kotlin y usar Android Studio

<img alt="butter robot" height="400" src="https://github.com/noscriptph/TrabajoBilletera/assets/103396791/191af339-c7fb-406e-bf20-e8cb37ab56b5" width="300"/>

## PROBLEMAS ENCONTRADOS Y SOLUCIONADOS

Se empezó de cero la escritura de la función de cambio de moneda ya que uno de los problemas encontrados fueron la inconsistencia en el codigo.

Otro problema encontrado fue hacer el llamado de un getter de tipo bolean de forma getBoolean, pero se debia realizar asi isBoolean, cambiando esto fue posible solucionar un problema con los inicios de sesion y la comprobacion de que la sesion estaba iniciada.

## DIAGRAMA UML
Destinado a ser una ayuda visual de lo que contiene el codigo y como esta populado, es idealmente usado en ambientes profesionales para que los
programadores puedan saber donde encontrar las clases y que metodos contienen, esto permite ahorrar tiempo y evita la necesidad de busear dentro del codigo en caso
de tener algun requerimiento muy especifico

<img alt="diagrama uml" height="300" src="https://github.com/noscriptph/TrabajoBilletera/assets/103396791/536d9206-0548-49ef-b8df-573383a7df67" width="600"/>


## EJECUCION CON BASH
Analizando la practicidad del codigo se decidio investigar como ejecutar con un doble click el artifact generado por el ide, ya que asi se puede confirmar
el funcionamiento de los comandos de consola compatibles con windows, estos comando realizan una limpieza del stream de caracteres entregados por la
aplicacion java, lo que mantiene limpia la interfaz y en caso de existir datos sensibles estos no podran ser vistos en el historial.
<img alt="ejecutar desde archivo bash el artifact" height="290" src="https://github.com/noscriptph/TrabajoBilletera/assets/103396791/66909744-4cea-40af-a12b-5bfbf103cb63" width="600"/>

<img alt="referencia a la ejecucion desde bash" height="500" src="https://github.com/noscriptph/TrabajoBilletera/assets/103396791/abc8d1a8-3540-403f-9c1b-a30eabbe4595" width="600"/>

Esto me sirvio para hacer pruebas sin emular el terminal o consola

## BLOQUES DE CODIGO REUTILIZABLE
Viendo que tuve la necesidad de reutilizar codigo como es el caso del switch y que este cuente con esepcion de errores pense que seria
bueno empezar a crear un repositorio con estos bloques, pensando en el futuro y por si a alguien mas le pueda servir
este es el link por si gustas de contribuir


![repositorio de codigos de uso rapido](https://github.com/noscriptph/TrabajoBilletera/assets/103396791/7da78f9d-d6b8-427b-aa7c-ace8cdcf9cb3)


## REFERENCIAS

-Youtube [INTERFACE](https://www.youtube.com/watch?v=9fkpLb6rSY8)

-VideosClases alkemi

-Todas las Imagenes se encuentran dentro de la carpeta Media



