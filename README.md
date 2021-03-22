# Curso de Iniciación a la Programación Java

## Ejercicios

- Juego de “Adivina el número que estoy pensando”, un número del 0 al 100, ya te diré si es mayor o menor que el mío, pero tienes 10 intentos como mucho.

        Scanner teclado = new Scanner(System.in); cad = teclado.nextLine();  
        var rnd = new Random(); num = rnd.nextInt(10);  
        num = Integer.parseInt(cad);

- *Opcional:* Decodificar las cadenas con el siguiente formato:  

        3+4+3,4-7*1=

    en los siguientes componentes:  

        3 +  
        4 +  
        3,4 -  
        7 *  
        1 =  
    mostrando el resultado en la consola.

- Convertir el juego “Adivina el número que estoy pensando” en la clase JuegoDelNumero sin interfaz de usuario. Debe contar con los métodos inicializar y jugada, así como informar del número de intentos y el resultado de la última jugada. No debe dejar continuar si el juego ha terminado. Para probar el juego se debe implementar el interfaz de usuario.

- *Opcional:* Crear la clase Calculadora que acumule y permita obtener los resultados parciales de las operaciones obtenidas en la decodificación anterior.

- Crear las clases para implementar juegos que utilizan una baraja de naipes. Los naipes tienen dos propiedades distintivas: valor y palo. Probar la funcionalidad de barajar, repartir, comparar, … (Utilizar Enumeraciones, genéricos, colecciones …)
