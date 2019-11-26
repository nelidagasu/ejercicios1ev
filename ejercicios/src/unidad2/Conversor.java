package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * En el método main de una clase Java llamada Conversor escribe un programa en Java 
 * que convierta de euros a dólares. 
 * 
 * El dato de entrada será un número decimal correspondiente a la cantidad en euros, 
 * y el dato de salida será un número decimal que representará la cantidad 
 * correspondiente en dólares con una precisión de 2 decimales. 
 * 
 * Realiza el ejercicio sin utilizar la clase Scanner
 * 
 * @author nelid
 *
 */
public class Conversor {

	public static void main(String[] args) {
		float dolares;
		float euros;
		
		System.out.println("Introduzca cantidad en dolares para convertir a euros:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		try {
			dolares = Float.parseFloat(br.readLine());
			
			euros = (float) (dolares * 0.91);
			
			System.out.println(String.format("%.2f", dolares) + " dolares son " + String.format("%.2f", euros) + " euros.");
		} catch (NumberFormatException e) {
			System.out.println("ERROR. Debe introducir un número válido.");
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
