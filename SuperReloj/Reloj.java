package Tema4y5;

import java.time.LocalDate; // Para obtener la fecha actual (día, mes, año)
import java.time.Month; // Para trabajar con el mes actual (por nombre o valor numérico)
import java.time.DayOfWeek; // Para obtener el día de la semana (lunes, martes, etc.)
import java.time.format.TextStyle; // Para dar formato a los nombres de los días o meses (por ejemplo, en español)
import java.util.Locale; // Para establecer el idioma/ubicación para mostrar los nombres de días/meses (en este caso, español)
import java.time.LocalDateTime; // Para trabajar con fecha y hora juntas (fecha completa con horas, minutos, segundos)
import java.time.format.DateTimeFormatter; // Para dar formato a la fecha y hora de acuerdo a un patrón personalizado (por ejemplo, "dd/MM/yyyy HH:mm:ss")
import java.time.ZoneId; // Para obtener la zona horaria (en este caso, Europa/Madrid)
import java.time.ZonedDateTime; // Para obtener la fecha y hora exacta con la zona horaria (por ejemplo, la hora local en Madrid)


public class Reloj {

    public static void main(String[] args) {
    	
    	// Inicio del programa
    	
    	System.out.println("DÍA Y AÑO ACTUAL EN JAÉN, ESPAÑA"); 
    	
    	// Declaración hora
    	boolean reloj = true;
    	
    	
    	
    	// Zona horaria
    	
    	LocalDateTime fechaLocal = LocalDateTime.now();
    	ZoneId madrid = ZoneId.of("Europe/Madrid");
    	ZonedDateTime zonaMadrid = ZonedDateTime.of(fechaLocal, madrid);
    	
    	System.out.println("Zona horaria de Madrid: " + zonaMadrid);
    	
    	
    	// Fecha, mes, día de la semana
    	
    	 LocalDate fechaActual = LocalDate.now();
    	 String formatoFecha =  fechaActual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")); // Con este string usando DateTimeFormatter hacemos que la fecha salga en el orden que queremos
         System.out.println("Fecha actual: " + formatoFecha);
        
         System.out.println("Día: " + fechaActual.getDayOfMonth());
     
         
         Month mes = fechaActual.getMonth();
         System.out.println("Mes: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")) + " (número del mes en el año: " + mes.getValue() + ")");

         
         
         DayOfWeek diaSemana = fechaActual.getDayOfWeek();
         System.out.println("Día de la semana: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES")) + " (número del día en la semana: " + diaSemana.getValue() + ")");
         System.out.println("Posición del día en el año: " + fechaActual.getDayOfYear());
    	
    	
    	//Declaración bisiesto
    	boolean esBisiesto = LocalDate.now().isLeapYear();
    	
    	if (esBisiesto == true) {
    		System.out.println("Año bisiesto. "); 
    	} else {
    		System.out.println("Año no bisiesto. "); 
    	}
    	
    
    	
    	// Fecha y hora actuales
    	
    	System.out.println("FECHA Y HORA LOCAL EN JAÉN, ESPAÑA"); 
    	
    	while (reloj == true) {
    		
    		LocalDateTime fechaTiempo = LocalDateTime.now();
    		 DateTimeFormatter formatoFechaTiempo = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //  Con HH mayúscula es formato 24 horas

             String fechaYHoraFormateada = fechaTiempo.format(formatoFechaTiempo);
        	
          

             // Imprimir la fecha y hora juntas
            
             System.out.print("\r" + "Fecha y hora: " + fechaYHoraFormateada);

            
             // Esperar 1 segundo antes de actualizar la fecha y hora
           
             try {
                 Thread.sleep(1000); // Espera 1 segundo
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
        
        	
    	}
    	
    	
   
    }
	
	
	
}
