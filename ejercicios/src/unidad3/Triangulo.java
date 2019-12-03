package unidad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * En el método main de una clase llamada Triángulo escribe un programa que determine si tres números reales 
 * que se introducen por teclado pueden ser las longitudes de los lados de un triángulo. Si la respuesta es 
 * afirmativa, tendrá que responder a las preguntas siguientes:
	• ¿Es escaleno?
	• ¿Es equilátero?
	• ¿Es isósceles?
 * @author nelid
 *
 */
public class Triangulo {
	public static void main(String[] args) {
		ArrayList<Integer> lados = new ArrayList<>();
		double a;
		double b;
		double c; // Lado mayor
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer lado:");
		lados.add(sc.nextInt());
		
		System.out.println("Introduzca el segundo lado:");
		lados.add(sc.nextInt());
		
		System.out.println("Introduzca el tercer lado:");
		lados.add(sc.nextInt());
		
		Collections.sort(lados);
		
		a = lados.get(0);
		b = lados.get(1);
		c = lados.get(2);
		
		if (a + b > c & a + c > b & b + c > a) {
			if (a == b & b == c)
				System.out.println("Las medidas introducidas se corresponden con las de un triángulo equilátero.");
			else if (a == b || b == c || a == c)
				System.out.println("Las medidas introducidas se corresponden con las de un triángulo isósceles.");
			else
				System.out.println("Las medidas introducidas se corresponden con las de un triángulo escaleno.");
		}
		else
			System.out.println("Las medidas introducidas no se corresponden con un triángulo válido.");
			
	}

}
