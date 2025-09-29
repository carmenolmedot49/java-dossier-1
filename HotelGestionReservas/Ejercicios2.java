package Ejercicios;

import java.util.Scanner;

public class Ejercicios2 {
	
	public static void main(String[] args) {
		
		
		 // Habitaciones del hotel

		 boolean[][][] hotel = new boolean[3][10][365]; // El hotel tiene 3 pisos, cada uno 10 habitaciones y las reservas se pueden hacer para las 365 dias del año.

       
		// Inicio del programa
		 
		 System.out.println("🍃 HOTEL BRISA VERDE 🍃 ");
		 Scanner entrada = new Scanner(System.in);
		 
		 
		 
		
		
		 // Menú de gestiones
		 
		 while (true) {
			 
			 
			 // Hago un try catch por si el usuario pone un número fuera de rango, así no dará en error el código si no que se imprimirá un mensaje de opción inválida

			 try { 
				 
				
				 System.out.println("\n💫 Menú principal:");
		         System.out.println("1️. Hacer una reserva");
		         System.out.println("2️. Cancelar una reserva");
		         System.out.println("3️. Comprobar disponibilidad");
		         System.out.println("4️. Ver habitaciones libres en un día");
		         System.out.println("5. Mostrar un informe de la ocupación del hotel para un día específico");
		         System.out.println("0️. Salir");
		         System.out.print("\n👉 Elige una opción: ");
		         
				 int opcion = entrada.nextInt();

				 
				 switch (opcion) {
	             
				 	case 1:
	                 
				 		System.out.println("\n✨ Has elegido hacer una reserva");
				 		
				 		System.out.print("\n🧾 Introduce el piso (1-3): ");
				 		int piso = entrada.nextInt() - 1;

				 		System.out.print("🛏️ Introduce la habitación (1-10): ");
				 		int habitacion = entrada.nextInt() - 1; // Para que se vean dias reales y no empezando desde 0

				 		System.out.print("📆 Introduce el día del año (1-365): ");
				 		int dia = entrada.nextInt() - 1;

				 		
				 		// Verificamos si está disponible
				 		
				 		if (!hotel[piso][habitacion][dia]) {
				 		   
				 			hotel[piso][habitacion][dia] = true; // Se hace la reserva
				 		   
				 			System.out.println("\n✅ ¡Reserva realizada con éxito!");
				 		    
				 			System.out.println("\n📍 Piso: " + (piso + 1) + " | Habitación: " + (habitacion + 1) + " | Día: " + (dia + 1));
				 		
				 		} else {
				 		   
				 			System.out.println("\n❌ Lo siento, esa habitación ya está reservada para ese día.");
				 		
				 		}

				 		
	                 
				 		break;
	             
				 	case 2:
	                 
				 		System.out.println("\n🔁 Has elegido cancelar una reserva");
				 		
				 		System.out.print("\n🧾 Introduce el piso (1-3): ");
				 		piso = entrada.nextInt() - 1;

				 		System.out.print("🛏️ Introduce la habitación (1-10): ");
				 		habitacion = entrada.nextInt() - 1;

				 		System.out.print("📆 Introduce el día del año (1-365): ");
				 		dia = entrada.nextInt() - 1;

				 		
				 		if (hotel[piso][habitacion][dia]) {
				 		    
				 			hotel[piso][habitacion][dia] = false; // Cancelamos la reserva
				 		    
				 			System.out.println("\n✅ Reserva cancelada con éxito");
				 		    System.out.println("\n📍 Piso: " + (piso + 1) + " | Habitación: " + (habitacion + 1) + " | Día: " + (dia + 1));
				 		
				 		} else {
				 		    
				 			System.out.println("\n⚠️ No hay ninguna reserva en esa habitación ese día");
				 		
				 		}

	                 
				 		break;
	            
				 	case 3:
	                 
				 		System.out.println("\n🔍 Comprobando disponibilidad");

				 	    System.out.print("\n📆 Introduce el día del año (1-365): ");
				 	    dia = entrada.nextInt() - 1;
				 	
				 	   
				 	    // Verificamos la disponibilidad en todos los pisos y habitaciones
				 	   
				 	    boolean disponibilidadEncontrada = false;

				 	    
				 	    for (int p = 0; p < 3; p++) { // Para cada piso
				 	        
				 	    	for (int h = 0; h < 10; h++) { // Para cada habitación
				 	            
				 	    		if (!hotel[p][h][dia]) { // Si la habitación está libre
				 	                
				 	    			System.out.println("\n✅ Piso " + (p + 1) + " | Habitación " + (h + 1) + " está libre.");
				 	                		
				 	    			disponibilidadEncontrada = true;
				 	            
				 	    		}
				 	        
				 	    	}
				 	    
				 	    }

				 	    
				 	    // Si no se encontró ninguna habitación libre
				 	    
				 	    if (!disponibilidadEncontrada) {
				 	        
				 	    	System.out.println("\n❌ No hay habitaciones libres para ese día.");
				 	    
				 	    }
				 		
	                 
				 		break;
	             
				 	case 4:
	                 
				 		System.out.println("\n📅 Mostrando habitaciones libres en ese día");
				 		
				 		System.out.print("\n📆 Introduce el día del año (1-365): ");
				 		dia = entrada.nextInt() - 1;
				 		

				 	    
				 		// Verificamos las habitaciones libres en todos los pisos
				 	   
				 		boolean habitacionesLibres = false;

				 	    
				 		for (int p = 0; p < 3; p++) { // Recorremos todos los pisos
				 	        
				 	    	System.out.println("\n🏨 Piso " + (p + 1) + ":");
				 	        
				 	       
				 	    	boolean pisoLibre = false;
				 	        
				 	        
				 	    	for (int h = 0; h < 10; h++) { // Recorremos todas las habitaciones
				 	           
				 	    		if (!hotel[p][h][dia]) { // Si la habitación está libre
				 	                
				 	    			System.out.println("\n✅ Habitación " + (h + 1) + " está libre.");
				 	               
				 	    			pisoLibre = true;
				 	            
				 	    		}
				 	        
				 	    	}
				 	       
				 	    	
				 	        if (!pisoLibre) {
				 	            
				 	        	System.out.println("\n❌ No hay habitaciones libres en este piso para ese día.");
				 	        
				 	        }
				 	    
				 		}
	                 
				 		break;
	             
				 	
				 	case 5:
				 		
				 		System.out.println("\n📊 Mostrando informe de ocupación para un día específico");

				 	    
				 		System.out.print("\n📆 Introduce el día del año (1-365): ");
				 		dia = entrada.nextInt() - 1;
				 	    
				 		// Informe de ocupación para el día seleccionado
				 	   
				 		boolean ocupacionCompleta = true;
				 	   
				 		for (int p = 0; p < 3; p++) { // Recorremos los pisos
				 	        
				 			System.out.println("🏨 Piso " + p + ":");
				 	        
				 	        boolean pisoLibre = false; // Asumimos que el piso está libre al principio
				 	        
				 	       
				 	        for (int h = 0; h < 10; h++) { // Recorremos las habitaciones
				 	            
				 	        	if (hotel[p][h][dia]) { // Si la habitación está reservada
				 	              
				 	        		System.out.println(" 🛏️ Habitación " + (h + 1) + " está ocupada.");
				 	         
				 	            
				 	        	} else {
				 	               
				 	        		System.out.println(" ✅ Habitación " + (h + 1)  + " está libre.");
				 	               
				 	        		ocupacionCompleta = false;
				 	        		pisoLibre = true; // Al menos una habitación está libre en el piso
				 	            
				 	        	}
				 	        }
				 	        
				 	        
				 	        if (!pisoLibre) {
				 	            
				 	        	System.out.println("\n❌ Todo el piso " + (p + 1) + " está ocupado.");
				 	       
				 	        }
				 	    
				 		}

				 		
				 	    // Si toda la ocupación está completa
				 	    
				 		if (ocupacionCompleta) {
				 	       
				 			System.out.println("\n❌ El hotel está completamente ocupado en el día " + (dia + 1) + ".");
				 	   
				 		} else {
				 			
				 			System.out.println("\n✅ El hotel tiene habitaciones disponibles en este día.");
				 	   
				 		}

				 	    break;
				 		
				 	
				 	case 0:
	                 
				 		
				 		// Cerrar el programa
				 		
				 		System.out.println("\n👋 Cerrando sesión. ¡Hasta pronto!");
						
						System.out.println("\n🌟 SESIÓN CERRADA 🌟");
						entrada.close();
	                 
	                 
				 		return; // Salimos del main directamente como reinas
	             
				 	default:
	                 
				 		System.out.println("\n❌ Opción no válida, intenta otra vez.");
	        
				 }
		        
				 
		
				 
				 
			 } catch (IllegalArgumentException e) {
				    
				 System.out.println("\n❌ " + e.getMessage() + ". Inténtelo de nuevo.");
				
			 
			 } catch (ArrayIndexOutOfBoundsException e) {
				   
				 System.out.println("\n❌ Has introducido un valor fuera de los rangos permitidos (piso, habitación o día). Intenta de nuevo 💖.");
				
			 
			 } catch (Exception e) {
				   
				 System.out.println("\n❌ Ocurrió un error inesperado. Por favor, inténtelo de nuevo.");
				   
				 entrada.nextLine();  // Limpiar el buffer
				
			 
			 }
			 
			
		 }
		 
		 
		
	
	}
			
	


}