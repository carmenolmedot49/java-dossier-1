package Ejercicios;

public class Matriz {
    
    public static void main(String[] args) {
        
        
    	// Definir el número de puntos (en este caso, 5 puntos)
        
    	int puntos = 5;
        
    	
    	
        // Crear la matriz de adyacencia (inicializada a 0)
        
    	int[][] matriz = new int[puntos][puntos];
        
        
    	
    	// Definir las conexiones (conexiones entre puntos como pares)
        
    	int[][] conexiones = { {1, 2}, {2, 3}, {3, 1}, {4, 5}, {5, 1} }; // Aquí podemos poner las conexiones que queramos, los códigos de abajo serán los que calculen la matriz
        
        
    	
    	// Llenar la matriz de adyacencia basándonos en las conexiones
    	
    		// ESTE ES EL CÓDIGO CLAVE QUE HACE QUE SE CALCULE LA MATRIZ
        
    	for (int[] conexion : conexiones) {
            
    		int i = conexion[0] - 1; // Restar 1 para convertir a índice basado en 0
            int j = conexion[1] - 1; // Restar 1 para convertir a índice basado en 0
            
            matriz[i][j] = 1; // Marca la conexión
            matriz[j][i] = 1; // Marca la conexión en la otra dirección (ya que es bidireccional)
        
    	}
        
    	
        
    	// Resultado
        
    	System.out.println("Matriz de adyacencia:");
        System.out.println(); 
        
        
        for (int i = 0; i < puntos; i++) {
          
        	for (int j = 0; j < puntos; j++) {
                
        		System.out.print(matriz[i][j] + " ");
            
        	}
            
        	
        	System.out.println(); // Salto de línea para que se vea como un cuadrado
        }
    }
}
