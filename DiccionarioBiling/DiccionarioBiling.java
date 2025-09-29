package com.TemaNueve;


import java.util.HashMap;
import java.util.Scanner;


public class DiccionarioBiling {
	
	 public static void main(String[] args) {
		 
		 
		 		// Inicio del programa
			
				 System.out.println("📘 DICCIONARIO ESPAÑOL-INGLÉS 📘");
				 
				 
				 // HashMap para almacenar el diccionario (palabra en español -> traducción en inglés)
				 
				 HashMap<String, String> diccionario = new HashMap<>();
				 
				 			
				 			// HashMap es una estructura de datos en Java que almacena pares clave-valor


				 // Entrada
				 
				 Scanner entrada = new Scanner (System.in);
				 
				 
				 // Bucle while con las opciones para gestionar la cola
				 
				 while (true) {
					 
			            int opcion = -1; // Inicializar opcion con un valor inválido
			            
			            
			            try {
			            	
			            	// Uso de try catch para que salga un mensaje de error si el usuario introduce un caracter que no sea número (así, en vez de que el programa/sistema dé error, aparecerá un mensaje dentro de la aplicación que le dirá al usuario que tiene que introducir un número

			  	          
			   			 System.out.println("\n¿Qué te gustaría hacer?");
			   	            
			   			 System.out.println("1. Traducir palabra");
			   	            
			   			 System.out.println("2. Agregar palabra al diccionario");
			   			 
			   			 System.out.println("3. Eliminar palabra del diccionario");

			   			 System.out.println("4. Mostrar las palabras del diccionario");
			   			 
			   			 System.out.println("5. Salir");
			   	            
			   			 System.out.print("\nOpción: ");
			   			 
			   			 
			   			 
			   			 // Leer lo que ha elegido el usuario
			   	           
			   			 opcion = entrada.nextInt();
			   	            
			   			 entrada.nextLine(); // Para limpiar el buffer de entrada
			   			 
			   			 
			   			 
			   			 
			   			 switch (opcion) {
			   			 
			   			 
			   			 	case 1:
		                     
			   			 		System.out.println("\n🔤 Traducir palabra 🔤");
			   			 		
			   			 		System.out.print("\nIntroduce la palabra en español: ");
		                       
			   			 		String palabraEsp = entrada.nextLine().toLowerCase();
		                        
			   			 		
			   			 		// Buscar la traducción en el diccionario
			                   
			   			 		String traduccion = diccionario.get(palabraEsp);
			   			 		
					
			   			 	 
			   			 		if (traduccion != null) {
			                        
			   			 			System.out.println("\nTraducción de '" + palabraEsp + "' en inglés: " + traduccion);
			                   
			   			 		} else {
			                       
			   			 			System.out.println("\n⚠️ La palabra no está en el diccionario.");
			                    
			   			 		}
			                    
			   			 		break;
			   			 		
		                 
			   			 	case 2:
			   			 		
			   			 		
			   			 		
			   			 		System.out.println("\n🔡 Agregar palabra al diccionario 🔡");
			   			 	
			   			 		System.out.print("\nIntroduce la palabra en español: ");
		                       
			   			 		String nuevaPalabraEsp = entrada.nextLine().toLowerCase();
			   			 		
			   			 		
			   			 		if (diccionario.containsKey(nuevaPalabraEsp)) {
			   			 			
			   			 			System.out.println("\n⚠️ Esta palabra ya está en el diccionario.");
			   			 		
			   			 		} else {
				
			   			 			System.out.print("Introduce la palabra en inglés: ");
		
			   			 			String nuevaTraduccion = entrada.nextLine();
		   			 		
			   			 		
			   			 			diccionario.put(nuevaPalabraEsp, nuevaTraduccion); // Con diccionario .put() estamos añadiendo elementos nuevo a la lista "diccionario"
 			                    
			   			 			System.out.println("\n✅ Palabra agregada al diccionario.");
			   			 
			   			 		}
		                    
			   			 		break;
			   			 		
		                 
			   			 	case 3:
			   			 		
		                        
			   			 		System.out.print("\n❌ Eliminar palabra del diccionario ❌");
			   			 		
			   			 		System.out.println();
			   			 		System.out.print("\nIntroduce la palabra en español que deseas eliminar: ");
		                       
			   			 		String palabraEliminar = entrada.nextLine().toLowerCase();
		                        
		                        
			   			 		if (diccionario.containsKey(palabraEliminar)) {
		                            
			   			 			diccionario.remove(palabraEliminar);
		                            
			   			 			System.out.println("\n✅ Palabra eliminada del diccionario.");
		                       
			   			 		} else {
		                           
			   			 			System.out.println("\n⚠️ La palabra no está en el diccionario.");
		                        
			   			 		}
		                       
			   			 		break;
			   			 	
			   			 		
			   			 		
			   			 	case 4:
			   			 		
		                        System.out.println("\n📜 Palabras en el diccionario 📜");
		                        
		                        if (diccionario.isEmpty()) {
		                            
		                        	System.out.println("\n⚠️ El diccionario está vacío.");
		                       
		                        } else {
		                           
		                        	for (String palabra : diccionario.keySet()) {
		                               
		                        		System.out.println(palabra);
		                            
		                        	}
		                       
		                        }
		                       
		                        break;
		                        
		                
			   			 	case 5:
		                    
			   			 		System.out.println("\n🌟 ¡Hasta luego! 🌟");
			   			 		
			   			 		System.out.println("\n📕 DICCIONARIO CERRADO 📕");
		                    
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
