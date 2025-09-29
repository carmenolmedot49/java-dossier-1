package Calculadora2;

import java.util.Scanner;

public class ResultadosEj02 {

	public static void main (String[] args) {
		
		//Llamamiento a la clase EcuacionPrimerGrado
		
		EcuacionPrimerGrado ecuaciongrado1 = new EcuacionPrimerGrado(); // llamamos a la clase EcuacionPrimerGrado y la convierto en variable en esta clase, llamandose ecuaciongrado1
		
		
		// Inicio del programa
		
		System.out.println("✨ INICIANDO CALCULADORA DE PRIMER GRADO ✨");
		
		
		// Llamamiento a los números de la ecuación
		
			// Entrada
		
        Scanner entrada = new Scanner(System.in);
        
        
        	// Valores

		
        System.out.print("\nIntroduce el valor de 'a': ");
		
        float numeroA = entrada.nextFloat();
        
        
        System.out.print("Introduce el valor de 'b': ");
        float numeroB = entrada.nextFloat();
        
        
        // Relacionar los números introducidos con los números de la clase EcuacionPrimerGrado
        
        
        ecuaciongrado1.setA(numeroA);
        ecuaciongrado1.setB(numeroB);
        
        
        float solucion = ecuaciongrado1.calcularSolucion();

		
		// Mostrar soluciones
  
     
        if (Float.isNaN(solucion)) {
            System.out.println("\nError. No se puede calcular ecuación de primer grado. La ecuación no tiene solución real.");
        } else {
            System.out.println("\nLa solución de 'x' a la ecuación de primer grado es: " + solucion);
        }       
        
        
        
        // Cierre del programa
        
        System.out.println("\n✨ CÁLCULO FINALIZADO ✨");
        
        entrada.close();
		
		
	}
	
}
