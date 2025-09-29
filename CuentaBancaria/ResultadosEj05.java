package com.CuentaBancaria;


import java.util.Scanner;

// Clase principal

public class ResultadosEj05 {
	
	public static void main (String[] args) {
		
		
		
		// Inicio del programa
		
		System.out.println("✨ INICIO DEL PROGRAMA ✨");
		
			// Entrada
		
        Scanner entrada = new Scanner(System.in);
        
        
        	// Valores

		
        System.out.print("\nIntroduce el número de cuenta: ");
        String numeroCuenta = entrada.nextLine();
        
        System.out.print("Introduce el nombre del titular de la cuenta: ");
        String nombreTitular = entrada.nextLine();
        
        // Solicitamos la contraseña
        System.out.print("Introduce la contraseña: ");
        String contrasena = entrada.nextLine();
        
    	System.out.print("\n✨CUENTA CREADA CON ÉXITO✨");
    	System.out.println(" "); // Salto de línea
        
        
        // Llamamiento a la clase CuentaBancaria (creación de la cuenta bancaria)
		
     	CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, nombreTitular, contrasena); // Lo tenemos que poner después de definirlos y no al principio del código (si no, el programa no sabrá "a qué nos referimos" en grosso modo
    
     	
     
     	
     	
     	// Mostrar los datos de la cuenta una vez ha ingresado
     	
     	System.out.println("\nNúmero de cuenta: " + cuentaBancaria.getNumeroCuenta());
        System.out.println("Titular: " + cuentaBancaria.getTitular());
        System.out.println("Saldo actual: " + cuentaBancaria.getSaldo() + "€");
        System.out.println("Última operación: " + cuentaBancaria.getUltimaOperacion());
        
        
        
       // Menú de opciones
        
        boolean exit = false;
        
        while (!exit) {
        	
        	System.out.println("\nSeleccione una opción:");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Transferir dinero");
            System.out.println("4. Modificar contraseña");
            System.out.println("5. Salir");
            System.out.print("\nOpción: ");
            
            int opcion = entrada.nextInt();
            
            switch (opcion) {
            
            	case 1: 
            		
            		System.out.println("\nINGRESAR DINERO");
            		
            		System.out.print("\nIntroduce la cantidad de dinero que quieres ingresar: ");
            		   
            		double cantidadIngreso = entrada.nextDouble(); // Se crea una variable con el nombre cantidadIngreso en la que se guardará la cantidad que el usuario ponga
            		    
            		    
            		    
            		    if (cantidadIngreso > 0) {
            		    	
            		    	cuentaBancaria.ingresarDinero(cantidadIngreso); // Se relaciona con el nombre que le habíamos dado en la clase principal (llamada CuentaBancaria)
            		    
            		    	System.out.println("\n✅ Se han ingresado " + cantidadIngreso + "€");
                		    System.out.println("\n💰 Saldo actual: " + cuentaBancaria.getSaldo() + "€");
                		    System.out.println("\n📝 Última operación: " + cuentaBancaria.getUltimaOperacion());
            		    
            		    } else {
            		    	System.out.println("❌ La cantidad ingresada no es válida. Debe ser mayor que 0.");
            		    	
            		    }
            		    
            		    	// Si el usuario quiere ingresar 0 euros o menos, no se podrá. La cantidad deberá ser siempre mayor a 0.
            		    
            		   
            		break;
            		
            	
            	case 2:
            	    
            		System.out.println("\nRETIRAR DINERO");
            	    
            		System.out.print("\nIntroduce la cantidad de dinero que quieres retirar: ");
            	    
            	    double cantidadRetiro = entrada.nextDouble();
            	    
            	    if (cantidadRetiro > 0) {
            	       
            	    	boolean retiradaExitosa = cuentaBancaria.retirarDinero(cantidadRetiro);
            	        
            	        if (retiradaExitosa) {
            	            
            	        	System.out.println("\n✅ Se han retirado " + cantidadRetiro + "€");
            	       
            	        } else {
            	            
            	        	System.out.println("\n❌ No se puede retirar esa cantidad. Saldo insuficiente.");
            	        
            	        }
            	        
            	        
            	        System.out.println("\n💰 Saldo actual: " + cuentaBancaria.getSaldo() + "€");
            	        System.out.println("\n📝 Última operación: " + cuentaBancaria.getUltimaOperacion());
            	        
            	   
            	    } else {
            	        
            	    	System.out.println("❌ La cantidad ingresada no es válida. Debe ser mayor que 0.");
            	    
            	    }
            	   
            	    break;

            	    
            	    
            	    
            	case 3:
            		
            	    System.out.println("\nTRANSFERIR DINERO A OTRA CUENTA");
            	    
            	    System.out.print("\nIntroduce el número de cuenta destino: ");
            	   
            	    entrada.nextLine(); // Limpiar el buffer del scanner
            	    
            	    String numeroCuentaDestino = entrada.nextLine();

            	    System.out.print("Introduce el nombre del titular de la cuenta destino: ");
            	    String titularDestino = entrada.nextLine();

            	    CuentaBancaria cuentaDestino = new CuentaBancaria(numeroCuentaDestino, titularDestino, "n/a");

            	   
            	    System.out.print("Introduce la cantidad a transferir: ");
            	    double cantidadTransferencia = entrada.nextDouble();

            	    	if (cantidadTransferencia > 0) {
            	    		
            	    		boolean transferenciaExitosa = cuentaBancaria.transferirDinero(cuentaDestino, cantidadTransferencia);

            	    		if (transferenciaExitosa) {
            	    			
            	    			System.out.println("\n✅ Transferencia realizada correctamente.");
            	    			System.out.println("\n💰 Saldo actual: " + cuentaBancaria.getSaldo() + "€");
            	    			System.out.println("\n📝 Última operación: " + cuentaBancaria.getUltimaOperacion());
            	    		
            	    		} else {
            	    			
            	    			System.out.println("\n❌ No se pudo realizar la transferencia. Saldo insuficiente o cantidad inválida.");
            	    		
            	    		}
            	    	
            	    	} else {
            	    		
            	    		System.out.println("\n❌ Cantidad inválida. Debe ser mayor que 0.");
            	    	
            	    	}

            	    break;
    
            	    
            	case 4:
            		
            		System.out.println("\nMODIFICAR CONTRASEÑA");
            		
            		System.out.print("\nIntroduce la contraseña actual: ");
            		entrada.nextLine(); // Limpiar el buffer del scanner
            		
            		String contrasenaIntroducida = entrada.nextLine();
            		
            		
            		if (cuentaBancaria.verificarContrasena(contrasenaIntroducida)) {
            			
            			System.out.print("\nIntroduce la nueva contraseña: ");
            			
            			String nuevaContrasena = entrada.nextLine();
            			
            			// Cambiar la contraseña usando el método de la clase principal
            	        boolean cambioExitoso = cuentaBancaria.cambiarContrasena(contrasenaIntroducida, nuevaContrasena);

            			
            	        if (cambioExitoso) {
            	            
            	        	System.out.println("\n✅ Contraseña modificada correctamente.");
            	        
            	        } else {
            	            
            	        	System.out.println("\n❌ No se pudo modificar la contraseña. Contraseña actual incorrecta.");
            	        
            	        }
            			
            		} else {
            			
            			System.out.print("\n❌ Contraseña incorrecta. No se pudo modificar.");
            			System.out.println(" "); // Salto de línea
            			
            		}
            		
            		break;
            	
            	case 5:
            	    System.out.println("\n👑✨ Cerrando sesión... ¡Gracias por confiar en nuestro banco! ");
            	    exit = true;
            	    break;

            		
            	
            	default:
            		System.out.println("\nOpción no válida o acción no permitida.");
            		break;
            }
        	
        	
        }
        

        

        
        // Cierre del programa
        
        System.out.println("\n✨ SESIÓN CERRADA CORRECTAMENTE ✨");
        
        entrada.close();
		
		
	}

	
}
