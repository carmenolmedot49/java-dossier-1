package Relogio;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Reloj {
	
	// Atributos
	
	private LocalDate fechaActual;
	private LocalTime horaActual;
	private Duration tiempoCronometro;
	private LocalTime inicioCronometro;
	private boolean cronometroActivo;

	public static void main (String[] args) {
		
		Reloj reloj = new Reloj();
		
		
		
		// Fecha
		
		LocalDate fechaActual = LocalDate.of(2024, Month.FEBRUARY, 23);
		reloj.setFecha(fechaActual);
       		
		System.out.println("\nFecha: " + reloj.obtenerFecha("dd/MM/yyyy"));

		
	
        
		// Hora
        
        LocalTime horaActual = LocalTime.of(04, 30, 00);
        reloj.setHora(horaActual);
		
		System.out.println("Hora: " + reloj.obtenerHora("HH:mm:ss"));
 
		
	}
	
	// Métodos para modificar la fecha y la hora 
	
	public void setFecha (LocalDate fecha) {
		this.fechaActual = fecha;
		
	}
	
	public void setHora(LocalTime hora) {
		this.horaActual = hora;
		
	}
	
	
	
	// Formato específico de fecha
	
	public String obtenerFecha(String formato) {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
	    return this.fechaActual.format(formatter);
	}

	public String obtenerHora(String formato) {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
	    return this.horaActual.format(formatter);
	}
    
	
	

	// Funcionalidad del cronómetro
	
		public void iniciarCronometro() {
		    // Inicializamos el cronómetro
		    this.inicioCronometro = LocalTime.now();
		    this.cronometroActivo = true;
		}
		
		public void pararCronometro() {
		    // Calculamos el tiempo transcurrido
		    if (this.cronometroActivo) {
		        LocalTime finCronometro = LocalTime.now();
		        this.tiempoCronometro = Duration.between(this.inicioCronometro, finCronometro);
		        this.cronometroActivo = false;
		    }
		}
		
		public String mostrarTiempoCronometro() {
		    // Mostramos el tiempo transcurrido en minutos y segundos
		    long minutos = this.tiempoCronometro.toMinutes();
		    long segundos = this.tiempoCronometro.getSeconds() % 60;
		    return String.format("%02d:%02d", minutos, segundos);
		}
	

	
	// Modificación de la fecha y la hora
		
		public void modificarFechaHora(int anos, int meses, int dias, int horas, int minutos, int segundos) {
	        this.fechaActual = this.fechaActual.plusYears(anos)
	                                           .plusMonths(meses)
	                                           .plusDays(dias);

	        this.horaActual = this.horaActual.plusHours(horas)
	                                         .plusMinutes(minutos)
	                                         .plusSeconds(segundos);
	    }
		

}