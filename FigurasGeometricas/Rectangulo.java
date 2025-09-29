package Figuras;

public class Rectangulo implements FiguraGeometrica {
	
	private double largo;
	private double ancho;
	
	
	// Constructor
	
	public Rectangulo (double ancho, double largo) {
		
		this.ancho = ancho;
		this.largo = largo;

		
	}
	
	
	// Área y perímetro
	
	public double calcularArea() {
		 return largo * ancho;
		 
	}
	
	public double calcularPerimetro() {
		 return 2 * (largo + ancho);
		 
	}

}
