package com.TemaNueve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColaBanco {
	
	
	 public static void main(String[] args) {
			
		 // Inicio del programa
	
		 System.out.println("🏦🌟 BANCO 🏦");
		 
		 
		 // Cola de clientes
		 
		 Queue<String> colaClientes = new LinkedList();
		 
		 			// Creamos una cola de tareas donde se guardarán los elementos en orden de llegada (FIFO)
		 			// Se usa LinkedList para atender (eliminar) al primero y agregar nuevos clientes sin que la estructura se desordene ni se ralentice.


		 // Entrada
		 
		 Scanner entrada = new Scanner (System.in);
		 
		 
		 // Bucle while con las opciones para gestionar la cola
		 
		 while (true) {
			 
	            int opcion = -1; // Inicializar opcion con un valor inválido
	            
	            
	            try {
	            	
	            	// Uso de try catch para que salga un mensaje de error si el usuario introduce un caracter que no sea número (así, en vez de que el programa/sistema dé error, aparecerá un mensaje dentro de la aplicación que le dirá al usuario que tiene que introducir un número

	  	          
	   			 System.out.println("\n¿Qué te gustaría hacer?");
	   	            
	   			 System.out.println("1. Añadir cliente");
	   	            
	   			 System.out.println("2. Atender cliente");

	   			 System.out.println("3. Mostrar cola");
	   	            
	   			 System.out.println("4. Salir");
	   	            
	   			 System.out.print("\nOpción: ");
	   			 
	   			 
	   			 
	   			 // Leer lo que ha elegido el usuario
	   	           
	   			 opcion = entrada.nextInt();
	   	            
	   			 entrada.nextLine(); // Para limpiar el buffer de entrada
	   			 
	   			 
	   			 
	   			 
	   			 switch (opcion) {
	   			 
	   			 
	   			 	case 1:
                     
	   			 		System.out.print("\n👥 Nombre del cliente que llega: ");
                       
	   			 		String nuevoCliente = entrada.nextLine();
                        
			
	   			 		colaClientes.add(nuevoCliente);
                        
	   			 		System.out.println("\n✅ Cliente agregado a la cola: " + nuevoCliente);
                        
	   			 		break;
                 
	   			 	case 2:
                     
	   			 	  if (colaClientes.isEmpty()) {
                          
	   			 		  System.out.println("\n⚠️ No hay clientes esperando.");
                      
	   			 	  } else {
                         
	   			 		  String clienteAtendido = colaClientes.poll();
	   			 		  
	   			 		  			// Si hay clientes en la cola, te devuelve el primero y lo elimina de la cola.

	   			 		  			// Si la cola está vacía, no da error, simplemente devuelve null (¡y eso es genial porque no peta el programa!✨).
                          
	   			 		  System.out.println("\n🎉 Cliente atendido: " + clienteAtendido);
                     
	   			 	  }
                    
	   			 		break;
                 
	   			 	case 3:
                     
	   			 		if (colaClientes.isEmpty()) {
                        
	   			 			System.out.println("\n🔴 No hay clientes en espera.");
                    
	   			 		} else {
                        
	   			 			System.out.println("\n📋 Clientes en espera:");
                         
	   			 			for (String cliente : colaClientes) {
                             
	   			 				System.out.println("- " + cliente);
                         
	   			 			}
                     
	   			 		}
                    
	   			 		break;
                
	   			 	case 4:
                    
	   			 		System.out.println("\n🌟 ¡Hasta luego! 🌟");
	   			 		
	   			 	System.out.println("\n🏦 SESIÓN CERRADA 🏦");
                    
	   			 		entrada.close();
                     
	   			 		return; // Salir del programa
                 
	   			 	default:
                     
	   			 		System.out.println("\n⚠️ Opción no válida.");
             
	   			 
	   			 }
	            	
	            	
	            } catch (Exception  e) {
	                
	            	System.out.println("\n⚠️ Error: Por favor, introduce un número válido.");
	                
	            	entrada.nextLine(); // Limpiar el buffer de entrada
	                continue; // Volver al inicio del ciclo
	            
	            }

	          
		
			 
			 
		 }
				 
		
    
	 }

	

}
