package Tema4y5;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        // Inicio
        System.out.println("INICIO DEL PROGRAMA");
        

        // Declaración
        
        int numUno = 1;
        
        
        Scanner entrada = new Scanner (System.in);
    	
   
    	System.out.println("Inserta un número: ");
    	int numEntrada = entrada.nextInt();
    	
    	int resultado = numEntrada + numUno;
    	

    	// Procedimiento
    	
    	if (numEntrada > numUno) {
    		System.out.println("El resultado de la operación es: " + resultado);
    	} else {
    		System.out.println("Operación no válida.");
    	}

        
        // Cierre del programa
   
        System.out.println("FIN DEL PROGRAMA");
        
        entrada.close();
        
    }
    
}
