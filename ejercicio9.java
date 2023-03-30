package com.generation;

/*
* Pseudocódigo *

1. Crear un objeto HashMap para almacenar las palabras en español y su traducción en inglés.
2. Agregar al menos 20 palabras y sus traducciones al diccionario.
3. Solicitar al usuario una palabra en español.
4. Buscar la palabra en el diccionario utilizando el método get() de HashMap.
5. Si se encuentra la palabra, mostrar su traducción en inglés por consola.
6. Si no se encuentra la palabra, mostrar un mensaje indicando que no se encuentra en el diccionario.

*/

// El diccionario es creado en el método crearDiccionario() y consiste en un objeto HashMap que almacena pares de palabras. Luego se utiliza el método buscarTraduccion() para buscar la traducción de la palabra ingresada por el usuario en el diccionario. Si la encuentra, la palabra en inglés es impresa en consola; de lo contrario, se imprime el mensaje de error.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {

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
        
        // Solicitar la palabra al usuario
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una palabra en español: ");
        String palabra = input.nextLine().toLowerCase();
        
        // Buscar la traducción en el diccionario
        String traduccion = diccionario.get(palabra);
        
        // Mostrar la traducción o un mensaje de error
        if(traduccion != null) {
            System.out.println("La traducción al inglés es: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
        
        // Cerrar el scanner
        input.close();
    }

}