package com.generation;

/*
Podemos utilizar el código anterior y hacer algunas modificaciones para cumplir con los requisitos del ejercicio 10

Lo primero que tenemos que hacer es seleccionar 5 palabras aleatorias del diccionario. Podemos hacer esto utilizando un objeto Random y el método keySet() de HashMap, que nos devuelve un conjunto de todas las claves (palabras en español) del diccionario. Luego podemos convertir este conjunto en un array para poder seleccionar 5 palabras al azar utilizando el método nextInt() de Random.

Una vez que tenemos las 5 palabras, podemos pedir al usuario que ingrese la traducción en inglés de cada una de ellas utilizando un bucle for. Para cada palabra, verificamos si la traducción ingresada por el usuario coincide con la traducción que tenemos almacenada en el diccionario. Si es así, incrementamos el contador de respuestas correctas. De lo contrario, incrementamos el contador de respuestas incorrectas.

Finalmente, imprimimos en pantalla cuántas respuestas fueron correctas e incorrectas.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        // Crear el diccionario
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("gracias", "thank you");
        diccionario.put("por favor", "please");
        diccionario.put("buenos días", "good morning");
        diccionario.put("buenas tardes", "good afternoon");
        diccionario.put("buenas noches", "good night");
        diccionario.put("sí", "yes");
        diccionario.put("no", "no");
        diccionario.put("hombre", "man");
        diccionario.put("mujer", "woman");
        diccionario.put("niño", "boy");
        diccionario.put("niña", "girl");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("comida", "food");
        diccionario.put("agua", "water");
        diccionario.put("aire", "air");
        diccionario.put("tiempo", "time");
        diccionario.put("trabajo", "work");
        diccionario.put("dinero", "money");
        diccionario.put("amigo", "friend");
        diccionario.put("amor", "love");
        diccionario.put("feliz", "happy");
        diccionario.put("triste", "sad");
        diccionario.put("enfermo", "sick");
        diccionario.put("salud", "health");
        
        // Seleccionar 5 palabras aleatorias del diccionario
        Random random = new Random();
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        String[] palabrasSeleccionadas = new String[5];
        for(int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabras[random.nextInt(palabras.length)];
    }
        // Contadores para palabras correctas e incorrectas
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // Pedir al usuario la traducción en inglés de cada palabra seleccionada
        for(int i = 0; i < 5; i++) {
            String palabra = palabrasSeleccionadas[i];
            System.out.print("Traduce \"" + palabra + "\": ");
            String respuesta = input.nextLine();
            
            if(respuesta.equalsIgnoreCase(diccionario.get(palabra))) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es \"" + diccionario.get(palabra) + "\".");
                respuestasIncorrectas++;
            }
        }
        System.out.println("Has acertado " + respuestasCorrectas + " palabras.");
        System.out.println("Te has equivocado en " + respuestasIncorrectas + " palabras.");

        // Cerrar el scanner
        input.close();
    }
}

