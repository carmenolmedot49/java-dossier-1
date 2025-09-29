package Figuras;

import java.util.Scanner;

public class Ej3 {
	
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        
        // Inicio de programa
       
        System.out.print("✨ INICIO DEL PROGRAMA ✨ ");

        // Círculo
        
        System.out.print("\nIntroduce el radio del círculo ✨: ");
        double radio = entrada.nextDouble();
        FiguraGeometrica circulo = new Circulo(radio);

       
        // Rectángulo
        
        System.out.print("\nIntroduce el ancho del rectángulo 📐: ");
        double ancho = entrada.nextDouble();
       
        System.out.print("Introduce el largo del rectángulo 📐: ");
        double largo = entrada.nextDouble();
        FiguraGeometrica rectangulo = new Rectangulo(ancho, largo);

        
        // Triángulo
        
        System.out.print("\nIntroduce la base del triángulo 🔻: ");
        double base = entrada.nextDouble();
        
        System.out.print("Introduce la altura del triángulo 🔻: ");
        double altura = entrada.nextDouble();
       
        System.out.print("Introduce el lado 1 del triángulo 🔻: ");
        double lado1 = entrada.nextDouble();
       
        System.out.print("Introduce el lado 2 del triángulo 🔻: ");
        double lado2 = entrada.nextDouble();
        FiguraGeometrica triangulo = new Triangulo(base, altura, lado1, lado2);

       
        // Resultados
        
        System.out.println("\n----- RESULTADOS -----");

        System.out.println("\n🔵 CÍRCULO:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\n🟩 RECTÁNGULO:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        System.out.println("\n🔺 TRIÁNGULO:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());

        
        // Cierre de programa
        
        System.out.print("✨ FIN DEL PROGRAMA ✨ ");
        
        entrada.close();
    }


}