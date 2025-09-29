package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Ejercicios {
	
	public static void main(String[] args) {

		// Crear un array de 20 elementos con números enteros
		
		int [] array = new int [20];
		
		
		// Array con valores aleatorios entre 1 y 99
		
		Random aleatorio = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array [i] = aleatorio.nextInt(100);
			
		}
		
		
		// Entrada
		
		Scanner entrada = new Scanner(System.in);
		
		// Inicio de programa
		
		System.out.println("🌟 INICIO DEL PROGRAMA 🌟");
		
		
		//Solicitar la información
		
		while (true) {
			
			 System.out.println("\n🌟 MENÚ 🌟");
	         System.out.println("1. Mostrar valores de la lista");
	         System.out.println("2. Añadir elementos a la lista");
	         System.out.println("3. Ordenar lista de forma ascendente");
	         System.out.println("4. Salir");
	         System.out.print("\nSelecciona una opción: ");
			
	         
	         int opcion = entrada.nextInt();
	         
	         switch (opcion) {
	         
	         case 1:
	        	 
	        	 System.out.print("\nMostrar valores de la lista 😊 ");
	        	 System.out.println();
	        	 System.out.print("\nLista de números veinte aleatorios del 1 al 100: ");
	      
	        	 for (int i = 0; i < array.length; i++) {
	        		 System.out.print(array[i] + " ");
	        		 
	        	 }
	        	 
	        	 //  Este código recorre todos los elementos del array y los imprime uno por uno, separados por un espacio. 
	        	 
	        	 System.out.println(); 
	        	 break;
	        	 
	        	 
	        	 
	         case 2:
	        	 
	        	 System.out.println("\nAñadir elementos la lista 😊 ");
	        	 
	        	 System.out.print("\n¿Cuántos elementos deseas añadir? ");
                 int anadir = entrada.nextInt();
                 
                 // Crear un nuevo array con más capacidad
                
                 int[] nuevoArray = Arrays.copyOf(array, array.length + anadir);
                 
                 
                 // Copiar los elementos del array original al nuevo array
                 
                 System.arraycopy(array, 0, nuevoArray, 0, array.length);
                 
                 
                 // Añadir los nuevos elementos aleatorios al final del array
                 
                 for (int i = array.length; i < nuevoArray.length; i++) {
                     nuevoArray[i] = aleatorio.nextInt(100);
                 
                 }
                 
                 // Cambiar el array antiguo con el nuevo array con más elementos
               
                 array = nuevoArray;
	     		 
                 
                 System.out.println("\nElementos añadidos 😉");
	        	 
                 break; 	 
	        	 
                 	// Con esto hacemos que, si introducimos un 4, por ejemplo, se añadirán 4 elementos aleatorios
	        	 
	         case 3:
	        	 
	        	 System.out.println("\nOrdenar lista de forma ascendente 😊 ");
	        	 
	        	 Arrays.sort(array);
	        	 
	        	 System.out.println("\nLista ordenada con éxito 😇 ");
	     		
	        	 break;	 
	        	 
	        	 
	        	 
	        	 
	         case 4:
	        	 
	        	 System.out.println("\n👋 ¡Hasta luego! 👋");
	     		 System.out.println("\n🌟 FIN DEL PROGRAMA 🌟");
	     		 entrada.close();
	     		 
	        	 return;
	        	 
	        	 
	         default:
	        	 System.out.println("\n😢 Opción inválida o acción no permitida. Vuelve a intentarlo. ");
	        	 break;
	        	 
	        	 
	         }
	         
			
		}
		
	}


}
