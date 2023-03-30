package com.generation;

// El código permite al usuario ingresar una cadena de texto y la invierte, mostrando la cadena resultante en pantalla

import java.util.Scanner;

public class Ejercicio6 {

	public static void reverseString() {
		System.out.println("Por favor ingresa la cadena que se va a invertir:");
		
		// Creamos un objeto Scanner para recibir la entrada del usuario
		Scanner input = new Scanner(System.in);
		
		// Almacenamos la cadena de texto ingresada por el usuario en una variable de tipo String
		String cadena = input.nextLine();
		
		// Creamos un objeto StringBuilder y agregar la cadena de texto original
		StringBuilder cadenaReversed = new StringBuilder(cadena);
		
		// Utilizamos el método reverse() de StringBuilder para invertir la cadena de texto y mostrarla en pantalla
		System.out.println("Cadena invertida resultante:");
		System.out.println(cadenaReversed.reverse());
		
        // Cerramos el Scanner
		input.close();
	}

	public static void main(String[] args) {
		// Llamamos al método reverseString() para ejecutar el programa
		reverseString();
	}
}