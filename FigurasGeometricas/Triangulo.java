package Figuras;

public class Triangulo implements FiguraGeometrica {
	
	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	
	// Constructor
	
	public Triangulo (double base, double altura, double lado1, double lado2) {
		
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;

 
	}
	
	
	// Área y perímetro
	
	public double calcularArea() {
		 return (base * altura) / 2;
		 
	}
	
	public double calcularPerimetro() {
		 return lado1 + lado2 + base;
		 
	}
	

}
