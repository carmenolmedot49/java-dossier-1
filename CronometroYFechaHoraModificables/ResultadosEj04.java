package Relogio;


import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;


public class ResultadosEj04 {

	public static void main(String[] args) {
		
		// Crear una instancia de la clase Reloj
		
		Reloj reloj = new Reloj();
		
		
		// Modificar la fecha y la hora
		
		LocalDate fechaActual = LocalDate.of(2024, Month.FEBRUARY, 23);
		reloj.setFecha(fechaActual);
		LocalTime horaActual = LocalTime.of(04, 30, 00);
		reloj.setHora(horaActual);

		
		// Mostrar la fecha y la hora en un formato específico
		
		System.out.println("📅 FECHA Y HORA 🕜 ");

		
		System.out.println("\nFecha: " + reloj.obtenerFecha("dd/MM/yyyy"));
		System.out.println("Hora: " + reloj.obtenerHora("HH:mm:ss"));

		
		// Iniciar el cronómetro
		
		reloj.iniciarCronometro();
		System.out.println("\nINICIANDO...");
		
		
		   // Interacción con el usuario para controlar el cronómetro
        Scanner entrada = new Scanner(System.in);
        boolean cronometroActivo = false;

        while (true) {
            System.out.println("\n¿Qué te gustaría hacer?");
            System.out.println("1. Iniciar cronómetro");
            System.out.println("2. Detener cronómetro y ver tiempo transcurrido");
            System.out.println("3. Modificar fecha y hora (relativas a la fecha y a la hora configurada por defecto)");
            System.out.println("4. Salir");
            System.out.print("\nElige una opción: ");
            
            int opcion = entrada.nextInt();
            
            if (opcion == 1 && !cronometroActivo) {
                reloj.iniciarCronometro();
                System.out.println("\nCronómetro iniciado...");
                cronometroActivo = true;
            
            } else if (opcion == 2 && cronometroActivo) {
                reloj.pararCronometro();
                System.out.println("\n⏹️ Cronómetro detenido.");
                System.out.println("\n⏱️ Tiempo transcurrido: " + reloj.mostrarTiempoCronometro());
                cronometroActivo = false;
           
            
                
            } else if (opcion == 3) {
            	System.out.println("\n✨ Vamos a modificar la fecha y la hora ✨");
                
                System.out.print("Años a sumar/restar (usa negativo para restar): ");
                int anos = entrada.nextInt();
                
                System.out.print("Meses: ");
                int meses = entrada.nextInt();
                
                System.out.print("Días: ");
                int dias = entrada.nextInt();
                
                System.out.print("Horas: ");
                int horas = entrada.nextInt();
                
                System.out.print("Minutos: ");
                int minutos = entrada.nextInt();
                
                System.out.print("Segundos: ");
                int segundos = entrada.nextInt();
                
                reloj.modificarFechaHora(anos, meses, dias, horas, minutos, segundos);
                
                System.out.println("\n✨ Fecha y hora modificadas:✨ ");
                System.out.println("Fecha: " + reloj.obtenerFecha("dd/MM/yyyy"));
                System.out.println("Hora: " + reloj.obtenerHora("HH:mm:ss"));
                
                
            } else if (opcion == 4) {
            	System.out.println("\n¡Hasta luego! 👋");
                System.out.println("\n✨FIN DEL PROGRAMA✨");
                break;
            	
           
            } else {
                System.out.println("\nOpción no válida o acción no permitida.");
            }
       
        }
        
        entrada.close();
        
    }
	
	
}