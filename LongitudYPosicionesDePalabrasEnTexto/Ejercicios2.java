package Ejercicios;

import java.util.Scanner;

public class Ejercicios2 {
	
	public static void main(String[] args) {
       
		
		 System.out.println("🌟 INICIO DEL PROGRAMA 🌟");
		
		        
		// Entrada de texto
		Scanner entrada = new Scanner(System.in);
		System.out.print("\n💬 Introduce una frase o un texto: ");
		String frase = entrada.nextLine();

		        
		// Separar por espacios, declarar la posición actual e imprimir resultado
		        
		String[] palabras = frase.split("\\s+");

        int posicionActual = 0;

        System.out.println("\n🔍 Resultado:\n");
        
        
		        
		// Recorrer la posición de la palabra desde la posición actual
		
		for (String palabra : palabras) {
			
			int longitud = palabra.length();
			 
			
				System.out.println("📌 Palabra: \"" + palabra + "\"");
	            System.out.println("   🔠 Longitud: " + longitud);
	            System.out.println("   🚩 Posición inicial: " + posicionActual);
	            System.out.println("   🏁 Posición final: " + (posicionActual + longitud - 1) + "\n");

			 
	            posicionActual += longitud + 1;

			
		}
					// En este recorrido lo que se hace es que para cada palabra dentro del array palabras, calculamos la longitud de la palabra y la guardamos en una variable llamada longitud
		
		
		        
		// Cerrar el programa
			
			System.out.println("\n🌟 FIN DEL PROGRAMA 🌟");
		        
			entrada.close();
	
	}
			
	


}
