package com.generation;

// El programa calcula la cantidad de minutos que faltan para el próximo viernes a las 15:00, a partir del día, hora y minutos ingresados por el usuario.

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
	    
	    // Crear un objeto Scanner para obtener entradas del usuario
	    Scanner input = new Scanner(System.in);

	    // Solicitar al usuario que ingrese el día de la semana
	    System.out.println("Ingresa el día (Lun-Vie):");
	    String d = input.nextLine().toLowerCase();

	    // Solicitar al usuario que ingrese la hora en formato de 24 horas
	    System.out.println("Ingresa la hora (formato 24h):");
	    String h = input.nextLine();

	    // Solicitar al usuario que ingrese los minutos
	    System.out.println("Ingresa los minutos:");
	    String m = input.nextLine();

	    // Conviertir el día ingresado a un número de día específico en el mes de abril de 1995
	    switch (d) {
	        case "lunes": d="17"; break;
	        case "martes": d="18"; break;
	        case "miércoles": d="19"; break;
	        case "jueves": d="20"; break;
	        case "viernes": d="21"; break;
	        default: d="21"; System.out.println("Se tomó como día Viernes."); break;
	    }

	    // Crear un objeto LocalDateTime con la fecha y hora ingresadas por el usuario
	    LocalDateTime diaInput = LocalDateTime.parse("1995-04-"+d+"T"+h+":"+m+":00");

	    // Crear un objeto LocalDateTime con la fecha y hora del próximo viernes a las 15:00
	    LocalDateTime diaViernes = LocalDateTime.parse("1995-04-21T15:00:00");

	    // Calcular la cantidad de minutos entre las dos fechas
	    long min = ChronoUnit.MINUTES.between(diaInput, diaViernes);

	    // Imprimir un mensaje indicando la cantidad de minutos que faltan para el próximo viernes a las 15:00
	    if(min<=0) {
	        System.out.println("¡Por fin es fin de semana!");
	    } else {
	        System.out.println("Faltan: " + min+" minutos para el fin de semana.");
	    }

	    // Cerrar el objeto Scanner para liberar recursos
	    input.close();
	}
}


