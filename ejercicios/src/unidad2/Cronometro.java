package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * En el método main de una clase Java llamada Cronometro escribe un programa que pida al 
 * usuario que introduzca mediante el teclado su nombre y a continuación muestre en la 
 * consola un mensaje que incluya un número real que represente los segundos y milisegundos 
 * que ha tardado en contestar, con un formato de salida que emplee exactamente 3 dígitos 
 * en la parte decimal. 
 * 
 * Realiza el ejercicio sin utilizar la clase Scanner.
 * 
 * @author nelid
 *
 */
public class Cronometro {

	public static void main(String[] args) {
		System.out.println("Introduzca su nombre:");
		
		long inicio = System.currentTimeMillis();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		try {
			String nombre = br.readLine();
			
			long fin = System.currentTimeMillis();
			
			float tiempo = (fin - inicio) / 1000f;
			
			System.out.println("Has tardado " + String.format("%.3f", tiempo) + " segundos en escribir " + nombre);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
