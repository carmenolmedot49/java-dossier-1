package Tema4y5;

import java.util.Scanner;

public class Ejercicio {
    
    public static void main(String[] args) {
    	
    	System.out.println("INICIO DEL PROGRAMA"); 
    	
    	
    	Scanner entrada = new Scanner (System.in);
    	
    
    	
    	System.out.println("Inserta el valor A: ");
    	float a = entrada.nextFloat();
    	
    	System.out.println("Inserta el valor B: ");
    	float b = entrada.nextFloat();
    	
    	System.out.println("Inserta el valor C: ");
    	float c = entrada.nextFloat();
    	
 
    	System.out.println("Calculando discriminante...");
    	
    	
    	
    	// Discriminante = b2−4ac
    	
    	float discriminante = b * b - 4 * a * c;
    	System.out.println("Discriminante calculado: " + discriminante);
    	
    	
    	// Comprobación del discriminante
    	if (discriminante >= 0) {
    		System.out.println("El discriminante es positivo o cero. Se procede a calcular la raíz cuadrada.");
    		
    		// Comprobación sqrt
        	System.out.println("Calculando la raíz cuadrada...");
        	double sqrt = Math.sqrt(discriminante);
        	
        	System.out.println("Raíz cuadrada: " + sqrt);
        	
        	
        	// Soluciones con la forma cuadrática
        	
        	double solucionA = (-b + sqrt) / (2 * a) ;
        	double solucionB = (-b - sqrt ) / (2* a );
        	
        	System.out.println("Primera solución: " + solucionA);
        	System.out.println("Segunda solucion: " + solucionB);
    	
    	
    	
    	} else {
    		System.out.println("Discriminante negativo. No tiene soluciones reales.");
    	}
    
    	
    	
    	
    	// Cierre del programa
    	System.out.println("FIN DEL PROGRAMA");
    	
    	entrada.close();
    	
    }
    
    
}
