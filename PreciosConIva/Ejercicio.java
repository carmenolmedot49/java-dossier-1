package Tema4y5;

import java.util.Scanner;

public class Ejercicio {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // 1. El usuario introduce un número como texto
        System.out.println("Introduce un número: ");
        
        String precio = sc.nextLine(); // 2. Se lee la entrada como cadena
        float num = Float.parseFloat(precio); // 3. Se convierte a decimal
        
        float iva = num * 0.21f;
        float precioFinal = num + iva; // se calcula el 21% del IVA
        
        
        System.out.println("El precio con IVA es: " + precioFinal + "€");
        
        
        sc.close();
    }
}