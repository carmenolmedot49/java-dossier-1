package Ejercicios;

import java.util.Scanner;

public class Ejercicios2 {
	
	public static void main(String[] args) {
       
		
		 System.out.println("🌟 INICIO DEL PROGRAMA 🌟");
		
		        
		// Entrada de texto
		Scanner entrada = new Scanner(System.in);
		System.out.print("\nIntroduce una frase o un texto: ");
		String frase = entrada.nextLine();

		        
		// Suma de caracteres
		        
		int suma = 0;
		String temporal = ""; // Esto quiere decir que está vacía

		        
		// Recorrer la cadena
		
		for (int i = 0; i < frase.length(); i++) {
			
			char cadena = frase.charAt(i); // Obtiene el carácter en la posición i (el caracter en cuestión) de la cadena texto

			
				// función Character.isDigit para comprobar si un carácter es un digito o no
			
			if (Character.isDigit(cadena)) { 
				
				temporal += cadena;
				
						// Si el carácter que estamos mirando es un número (por ejemplo, un "1", "2", etc.), lo vamos agregando a la variable temporal, que es como una cajita que va guardando los números que encontramos, uno por uno.
			
			} else if (!temporal.equals("")){

				suma += Integer.parseInt(temporal);
				temporal = "";
				
			}
			
						// Si la variable temporal no está vacía, es decir, que contiene un número, lo convierte a entero, lo suma a la variable suma y luego vacía temporal para el siguiente número

		}
		
		
		// Si al final de la cadena queda un número sin sumar todavía, se suma
		
		if (!temporal.equals("")) {
			
			suma += Integer.parseInt(temporal);
		
		}
				// Si temporal no está vacío, sumamos el contenido de temporal a la variable suma convirtiéndolo en entero con Integer.parseInt()
		
		
		
		// Resultado
		
        System.out.println("\nLa suma de los números encontrados es: " + suma);
		
		        
		// Cerrar el scanner
			
			System.out.println("\n🌟 FIN DEL PROGRAMA 🌟");
		        
			entrada.close();
	
	}
			
	


}
