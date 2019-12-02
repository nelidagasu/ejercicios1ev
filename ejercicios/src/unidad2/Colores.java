package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * En el método main de una clase Java llamada Sueldo escribe un programa que permita convertir las componentes de un 
 * color en el espacio RGB en sus componentes en el espacio YIQ, según las expresiones matemáticas siguientes:
		 * y=0,299r + 0,587g + 0,114b
		 * i=0,596r − 0,275g − 0,321b
		 * q=0,212r − 0,528g + 0,311b
 * Se le pedirá al usuario que introduzca por teclado las componentes rgb (rojo, verde y azul).
 * 
 * @author nelid
 *
 */
public class Colores {
	public static void main(String[] args) {
		int r;
		int g;
		int b;
		double y;
		double i;
		double q;
		
		System.out.println("Introduzca la componente r del color: ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		try {
			r = Integer.valueOf(br.readLine());
			
			System.out.println("Introduzca la componente g del color: ");
			g = Integer.valueOf(br.readLine());
			
			System.out.println("Introduzca la componente b del color: ");
			b = Integer.valueOf(br.readLine());
			
			y = (0.299 * r) + (0.587 * g) + (0.114 * b);
			i = (0.596 * r) - (0.275 * g) - (0.321 * b);
			q = (0.212 * r) - (0.528 * g) + (0.311 * b);
			
			System.out.println("El color (" + r + ", " + g + ", " + b + ") RGB se corresponde con el color (" + y + ", " + i + ", " + q + ") YIQ.");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
