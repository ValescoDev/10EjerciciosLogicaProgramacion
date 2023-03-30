package com.generation;

// Este código tiene como objetivo solicitar al usuario 10 números por consola, buscar los números primos y moverlos al inicio del array, y mostrar el array original y el array con los números primos al inicio.

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
    	
    	/* El proceso de búsqueda y ordenamiento de los números primos se realiza mediante un bucle que recorre todo el array y utiliza una función auxiliar "esPrimo" que verifica si un número es primo o no. Si se encuentra un número primo, se intercambia con el elemento correspondiente en la posición "posPrimos" del array, la cual se va incrementando a medida que se van encontrando más números primos. */
        
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        // Solicitar al usuario los 10 números por consola
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = sc.nextInt();
        }
        
        // Mostrar el array original
        System.out.println("Array original:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("pos[" + i + "] = " + numeros[i]);
        }
        
        int posPrimos = 0;
        
        // Buscar los números primos y moverlos al inicio del array
        for(int i = 0; i < numeros.length; i++) {
            if(esPrimo(numeros[i])) {
                int temp = numeros[i];
                numeros[i] = numeros[posPrimos];
                numeros[posPrimos] = temp;
                posPrimos++;
            }
        }
        
        // Mostrar el array con los números primos al inicio
        System.out.println("Array ordenado:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("pos[" + i + "] = " + numeros[i]);
        }
        
        // Cerrar el scanner
        sc.close();
    }
    
    // Método que verifica si un número es primo
    public static boolean esPrimo(int numero) {
        if(numero < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(numero); i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
