package com.TemaNueve;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Ejercicio1 {
	
	
	 public static void main(String[] args) {
		 
		 	
		 	// Inicio del programa

		 	System.out.println("🌟 INICIO DEL PROGRAMA 🌟");
		 
		 	
		 	// Entrada
		 
	        Scanner entrada = new Scanner(System.in);
	        
	        
	        // Colección de nombres sin repetición
	        
	        Set<String> nombres = new HashSet<>();
	        
	        	// Set<String>: Colección para guardar solo elementos únicos (sin repeticiones) y de tipo String (textos).
	        	// new HashSet<>(): Crea un HashSet, que guarda esos elementos de forma rápida y única. 
	        
	        System.out.println("🌸 Introduce nombres de personas (escribe 'f' para terminar):");

	        
	        while (true) {
	            System.out.print("Nombre: ");
	            String nombre = entrada.nextLine();
	            
	            if (nombre.equalsIgnoreCase("f")) {
	                break;
	            }
	            
	            nombres.add(nombre);
	        }
	        		
	        	// Se introduce el nombre bajo la variable "nombre" en String, en el momento en el que el usuario teclee "f", se acabará el programa; mientras añada nombres se añadirán a la colección "nombres"
	       
	        
	        
	        // Resultados
	        
	        System.out.println("\n✨ Nombres únicos introducidos:");
	        
	        for (String nombre : nombres) {
	            System.out.println("- " + nombre);
	        
	        }
	        
	        // Se recorren los nombres introducidos bajo la variable "nombre" en la colección "nombres en un bucle for (cada uno con un guion)
	        
	        
	        
	        // Fin del programa
	        
	        System.out.println("\n🌟 FIN DEL PROGRAMA 🌟");
    		entrada.close();
	 }

}
