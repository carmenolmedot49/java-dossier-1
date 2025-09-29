package Ejercicios;


import java.util.Scanner;

public class Ejercicios {
	
	public static void main(String[] args) {

		// Crear un array
		
		String [] frutas = {"Manzana", "Pera", "Plátano", "Fresa", "Melocotón", "Naranja", "Mandarina", "Mango", "Sandía", "Melón"};
		
		
		// Entrada
		
		Scanner entrada = new Scanner(System.in);
		
		// Inicio de programa
		
		System.out.println("🌟 INICIO DEL PROGRAMA 🌟");
		
		
		//Solicitar la información
		
		while (true) {
			
			 System.out.println("\nMenú:");
	         System.out.println("1. Mostrar fruta por posición");
	         System.out.println("2. Salir");
	         System.out.print("\nSelecciona una opción: ");
			
	         
	         int opcion = entrada.nextInt();
	         
	         switch (opcion) {
	         
	         case 1:
	        	 
	        	 System.out.print("\nIntroduce la posición (1-10): ");
	        	 int posicion = entrada.nextInt();
	        	 
	        	 if (posicion >= 1 && posicion <= 10) {
	        		 
	        		 System.out.println("\nLa fruta en la posición " + posicion + " es: " + frutas[posicion - 1] + ". ");
	        		 
	        	 } else {
	        		 
	        		 System.out.println("\nNo existe tal posición. Por favor, introduce un número entre 1 y 10. ");
	        		 
	        	 }
	        	 
	        	 break;
	        	 
	        	 
	        	 
	         case 2:
	        	 
	        	 System.out.println("\n¡Hasta luego!");
	     		 System.out.println("\n🌟 FIN DEL PROGRAMA 🌟");
	     		 entrada.close();
	     		 
	        	 return;
	        	 
	        	 
	         default:
	        	 System.out.println("\nOpción inválida o acción no permitida. Vuelve a intentarlo. ");
	        	 break;
	        	 
	        	 
	         }
	         
			
		}
		
	}


}
