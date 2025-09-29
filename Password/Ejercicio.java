package Tema4y5;

import java.util.Scanner;

public class Ejercicio {
    
    public static void main(String[] args) {
    	
    	System.out.println("INICIO DEL PROGRAMA"); 
    
    	String password = "IvanyCarmenlosmasguapos230224";
    	
    	
    	Scanner entrada = new Scanner (System.in);
    	
    	int intentos = 3;
    	
    	
    	while (intentos > 0) {

        	System.out.println("Introduce la contraseña: ");
        	String entradaPassword = entrada.nextLine();
        	
        	
        	if (entradaPassword.equals(password)) {
        		System.out.println("¡Enhorabuena! Has acertado la contraseña 💖💖💖");
        		break; // Se interrumpe el bucle si ponemos bien la contraseña aunque no sea el tercer intento
        	} else {
        		intentos--;
        		
        		if (intentos > 0) {
        			System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
        			System.out.println("Quedan " + intentos + " intentos.");
        		} else {
        			System.out.println("Contraseña incorrecta. ");
        			System.out.println("Quedan " + intentos + " intentos.");
        		}
        		
        	}
        	
        	
    	}
    	 // Si escribimos mal 3 intentos el programa se cierra

    	
    	// Cierre del programa
    	System.out.println("FIN DEL PROGRAMA");
    	
    	entrada.close();
    	
    }
    
    
}
