package com.CuentaBancaria;

public class CuentaBancaria {
	
	private String numeroCuenta;
	private String titular;
	private double saldo;
	private String ultimaOperacion;
	private String contrasena;
	
	
	// Constructor 
	
	public CuentaBancaria (String numeroCuenta, String titular, String contrasena) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.contrasena = contrasena;
		this.ultimaOperacion = "Cuenta creada";  // Suponemos que la cuenta es nueva y por eso la única operación realizada es que se ha creado la cuenta
		this.saldo = 0.0; // Por el mismo motivo, el saldo de partida es 0 euros (ponemos decimal ya que le hemos dado el atributo double
	}
	
	
	//Getters
	
	public String getNumeroCuenta() {
		return numeroCuenta;
		
	}
	
	public String getTitular() {
		return titular;
		
	}
	
	public double getSaldo() {
		return saldo;
		
	}
	
	public String getUltimaOperacion() {
		return ultimaOperacion;
		
	}
	
	  public String getContrasena() { 
	        return contrasena;
	        
	 }
	
	
	//Setters
	
	public void setSaldo(double saldo) {
		this.saldo = saldo; // Para poder modificar la cantidad del saldo
		this.ultimaOperacion = "Salgo actualizado a " + saldo + "€"; // Para poder modificar el saldo también en el apartado de últimas operaciones
		
	}
	
	public void setUltimaOperacion(String ultimaOperacion) {
		this.ultimaOperacion = ultimaOperacion; // Cambiamos la última operación añadiendo el nuevo valor
		
	
	}
	
	public void setContrasena(String contrasena) { // Vamos a permitir que la contraseña sea modificable por el usuario
        this.contrasena = contrasena;
   
	}
	
	
    
    // Ingresar dinero
    
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            this.ultimaOperacion = cantidad + "€ ingresados.";
        
        }
  
    }
 	
    
    // Retirar dinero
    
    public boolean retirarDinero(double cantidad) {
        
    	if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            this.ultimaOperacion = cantidad + "€ retirados.";
            return true;
       
        }
       
        return false;
    
    }

    
    // Transferencia entre cuentas
    
    public boolean transferirDinero(CuentaBancaria cuentaDestino, double cantidad) {
        
    	if (cantidad > 0 && this.saldo >= cantidad) {
            
        	this.saldo -= cantidad;
            this.ultimaOperacion = cantidad + "€ transferidos a " + cuentaDestino.getNumeroCuenta();
            
            cuentaDestino.saldo += cantidad;
            cuentaDestino.ultimaOperacion = cantidad + "€ recibidos de " + this.numeroCuenta;
            
            return true;
        
    	}
        
    	return false;
    }

    
    // Para la modificación de la contraseña
	
    
    	// Verificación de la contraseña
	
    public boolean verificarContrasena(String contrasenaIntroducida) {
        return this.contrasena.equals(contrasenaIntroducida);
   
    }
    
    	// Cambiar la contraseña (tras haberla verificado)
    
    public boolean cambiarContrasena(String contrasenaActual, String nuevaContrasena) {
    	
        if (this.contrasena.equals(contrasenaActual)) {
            this.contrasena = nuevaContrasena;
            return true; // Contraseña cambiada
            
        }
        
        return false; // Contraseña incorrecta
        
    }
 

}



/* 
 * 
 * ACLARACIONES BÁSICAS

GETTERS Y SETTERS

👑 Getter: sirve para consultar (leer) el valor de un atributo privado.
👑 Setter: sirve para modificar (cambiar) el valor de un atributo privado.

En POO (Programación Orientada a Objetos), los atributos se ponen privados (private) para protegerlos, y así nadie pueda tocarlos directamente desde fuera de la clase como si fuera su casa sin permiso 
Por eso, para modificarlos necesitamos los setters.

 * 
 
SETTERS

Cuando haces un setter con parámetro (o sea, que entre paréntesis le estás pasando un valor), le decimos que el valor, en este caso el saldo, que hay entre paréntesis, es el nuevo valor que va a tener.

Por eso usamos this.atributo = parametro; con ello le estamos diciendo que el atributo tiene que actualizarse.

La palabra this sirve para diferenciar entre el atributo de la clase y el parámetro del método, ya que ambos pueden tener el mismo nombre.

*/
