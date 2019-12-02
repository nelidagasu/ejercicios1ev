package unidad3;
import java.util.Scanner;

/**
 * En el método main de una clase llamada Hora escribe un programa que lea una hora (horas, minutos y segundos) 
 * desde el teclado y muestre en la pantalla la hora correspondiente al segundo siguiente. Realiza la lectura 
 * de los datos de entrada como estimes oportuno.
 * 
 * @author nelid
 *
 */
public class Hora {
	public static void main(String[] args) {
		String hora;
		String[] horaArray;
		
		int horas;
		int minutos;
		int segundos;
		
		System.out.println("Introduzca la hora con el formato hh:mm:ss ");
		
		Scanner sc = new Scanner(System.in);
		
		hora = sc.next();
		
		horaArray  = hora.split(":");
		
		horas = Integer.valueOf(horaArray[0]);
		minutos = Integer.valueOf(horaArray[1]);
		segundos = Integer.valueOf(horaArray[2]);
		
		segundos++;
		
		if (segundos > 59) {
			segundos = 0;
			
			minutos++;
			
			if (minutos > 59) {
				minutos = 0;
				horas++;
				
				if (horas > 23) {
					horas = 0;
				}
			}
		}
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
	}
}
