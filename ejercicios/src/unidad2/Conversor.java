package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * En el m�todo main de una clase Java llamada Conversor escribe un programa en Java 
 * que convierta de euros a d�lares. 
 * 
 * El dato de entrada ser� un n�mero decimal correspondiente a la cantidad en euros, 
 * y el dato de salida ser� un n�mero decimal que representar� la cantidad 
 * correspondiente en d�lares con una precisi�n de 2 decimales. 
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
			System.out.println("ERROR. Debe introducir un n�mero v�lido.");
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
