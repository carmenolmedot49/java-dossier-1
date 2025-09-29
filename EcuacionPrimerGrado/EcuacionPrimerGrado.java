package Calculadora2;

public class EcuacionPrimerGrado {
	
	private float a;
	private float b;
	
	
	// Getters
	
	public float getA() {
		return a;
		
	}
	
	public float getB() {
		return b;
		
	}
	
	
	
	// Setters
	
	public void setA(float a) {
		this.a = a;
		
	}
	
	public void setB(float b) {
		this.b = b;
	}
	
	
	// Solucion
	
	public float calcularSolucion() {
		
		float noSolucion = Float.NaN; // para asegurar que siempre se retorne un valor, incluso si no se puede calcular la solución (como cuando a == 0)

		
		if (a != 0) {
			return -b / a;  // Si 'a' no es 0, calculamos la solución
			
		}
		
		return noSolucion; // Si no se pudo calcular, retorna NaN
			
	}
	
	
	// Calcular
	
	public String getEcuacion () {
		return a + "x " + b + " = 0";
	}
	
}


	