package Ejercicios;

import java.util.Scanner;

public class Ejercicios2 {
	
	public static void main(String[] args) {
       
		
		 System.out.println("🌟 INICIO DEL PROGRAMA 🌟");
		
		        
		// Entrada de texto
		Scanner entrada = new Scanner(System.in);
		System.out.print("\nIntroduce una frase o una palabra: ");
		String frase = entrada.nextLine();

		        
		// Verificar si la frase es un palíndromo
		        
		boolean esPalindromo = verificarPalindromo(frase);

		        
		// Imprimir el resultado
		        
			if (esPalindromo) {
		           
				System.out.println("\n¡Es un palíndromo!");
		       
			} else {
		          
				System.out.println("\nNo es un palíndromo.");
		        
			}

		
		        
		// Cerrar el scanner
			
			System.out.println("\n🌟 FIN DEL PROGRAMA 🌟");
		        
			entrada.close();
	
	}
			
			
	
	// Método para verificar si una frase es un palíndromo
			
	private static boolean verificarPalindromo(String frase) {
		
				
		// Eliminar signos de puntuación, espacios y convertir a minúsculas
				
		String fraseLimpia = frase.replaceAll("[^a-zA-Z]", "").toLowerCase();

				
		// Comprobar si la frase es igual a su reverso
				
		StringBuilder reversed = new StringBuilder(fraseLimpia).reverse();
				
		return fraseLimpia.equals(reversed.toString());
			
			
		
		
		
			
	}
	


}
