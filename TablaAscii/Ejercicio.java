package Tema4y5;

import java.util.Scanner;

public class Ejercicio {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); // 1. El usuario introduce un número como texto
        System.out.println("Introduce un número: ");
        
        String texto = teclado.nextLine(); // 2. Se lee la entrada como cadena
        
        int codigoAscii = Integer.parseInt(texto); // 3. Se convierte a entero
        
        char caracter = (char) codigoAscii; // 4. Se convierte el número a carácter ASCII
        
        System.out.println("El número " + codigoAscii + " corresponde al carácter: " + caracter);
        
        teclado.close();
    }
}


