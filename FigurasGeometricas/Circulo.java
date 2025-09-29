package Figuras;

public class Circulo implements FiguraGeometrica {
	
	private double radio;
	
	// Constructor 
	
	public Circulo(double radio) {
	    this.radio = radio;
	}
	
	
	// Área y perímetro
	
	public double calcularArea() {
		 return Math.PI * Math.pow(radio, 2);
		 
	}
	
	public double calcularPerimetro() {
		 return 2 * Math.PI * radio;
		 
	}
	

}
