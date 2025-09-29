package com.TemaNueve;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
	
	 public static void main(String[] args) {
	
		 // Inicio del programa
	
		 System.out.println("🌟 LISTA DE TAREAS 🌟");
		 
		 
		 // Lista de tareas
		 
		 ArrayList<String> tareas = new ArrayList();
		 
		 
		 // Entrada
		 
		 Scanner entrada = new Scanner (System.in);
		 
		 
		 // Bucle while con las opciones para gestionar la lista
		 
		 while (true) {
			 
	            int opcion = -1; // Inicializar opcion con un valor inválido
	            
	            try {
	            	
	           	 // Mostrar opciones al usuario
	  	          
	   			 System.out.println("\n¿Qué te gustaría hacer?");
	   	            
	   			 System.out.println("1. Agregar tarea");
	   	            
	   			 System.out.println("2. Eliminar tarea");

	   			 System.out.println("3. Ver todas las tareas");
	   	            
	   			 System.out.println("4. Salir");
	   	            
	   			 System.out.print("\nOpción: ");
	   			 
	   			 
	   			 
	   			 // Leer lo que ha elegido el usuario
	   	           
	   			 opcion = entrada.nextInt();
	   	            
	   			 entrada.nextLine(); // Para limpiar el buffer de entrada
	   			 
	   			 
	   			 
	   			 
	   			 switch (opcion) {
	   			 
	   			 
	   			 	case 1:
                     
	   			 		System.out.print("\nIntroduce la tarea a agregar: ");
                     
	   			 		String tareaAgregar = entrada.nextLine();
                    
	   			 		tareas.add(tareaAgregar);
                     
	   			 		System.out.println("\nTarea agregada.");
                     
	   			 		break;
                 
	   			 	case 2:
                     
	   			 		System.out.print("\nIntroduce el número de tarea a eliminar: ");
                     
	   			 		int tareaEliminar = entrada.nextInt();
                     
	   			 		entrada.nextLine(); // Limpiar el buffer de entrada
                     
	   			 		if (tareaEliminar > 0 && tareaEliminar <= tareas.size()) {
                        
	   			 			tareas.remove(tareaEliminar - 1); // Eliminamos la tarea
                         System.out.println("\nTarea eliminada.");
                     
	   			 		} else {
                         
                    	 System.out.println("\n⚠️ Número de tarea no válido.");
                     
	   			 		}
                    
	   			 		break;
                 
	   			 	case 3:
                     
	   			 		if (tareas.isEmpty()) {
                        
	   			 			System.out.println("\n🔴 No tienes tareas pendientes.");
                    
	   			 		} else {
                        
	   			 			System.out.println("\n✨ Tareas pendientes:");
                         
	   			 			for (int i = 0; i < tareas.size(); i++) {
                             
	   			 				System.out.println((i + 1) + ". " + tareas.get(i));
                         
	   			 			}
                     
	   			 		}
                    
	   			 		break;
                
	   			 	case 4:
                    
	   			 		System.out.println("\n🌟 ¡Hasta luego! 🌟");
	   			 		
	   			 	System.out.println("\n🌟 FIN 🌟");
                    
	   			 		entrada.close();
                     
	   			 		return; // Salir del programa
                 
	   			 	default:
                     
	   			 		System.out.println("\n⚠️ Opción no válida.");
             
	   			 
	   			 }
	            	
	            	
	            } catch (Exception  e) {
	                
	            	// Manejar el error si el usuario no introduce un número
	                
	            	System.out.println("\n⚠️ Error: Por favor, introduce un número válido.");
	                
	            	entrada.nextLine(); // Limpiar el buffer de entrada
	                continue; // Volver al inicio del ciclo
	            
	            }

	          
		
			 
			 
		 }
				 
		
    
	 }

}