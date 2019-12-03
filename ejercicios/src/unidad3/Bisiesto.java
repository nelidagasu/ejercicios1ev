package unidad3;

import java.util.Scanner;

/**
 * En el método main de una clase llamada Bisiesto escribe un programa que utilizando una única expresión lógica 
 * determine si un año es o no es bisiesto. El año se introducirá por teclado y el resultado lo mostrará en la
 * pantalla. Un año es bisiesto si es múltiplo de 4. Los años múltiplos de 100 no son bisiestos, salvo si son 
 * múltiplos de 400.
 * 
 * @author nelid
 *
 */
public class Bisiesto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano;
		System.out.println("Introduzca un año");
		
		ano = sc.nextInt();
		
		if ((ano % 4 == 0) & ((ano % 100 != 0) || (ano % 400 == 0))) 
			System.out.println("El año " + ano + " es bisiesto.");
		else
			System.out.println("El año " + ano + " no es bisiesto.");
	}
	
}
