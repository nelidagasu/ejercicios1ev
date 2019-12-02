package unidad3;

import java.util.Scanner;

/**
 * En el m�todo main de una clase llamada ParImpar escribe un programa que diga si un n�mero introducido 
 * por teclado es par o impar.
 * 
 * @author nelid
 *
 */
public class ParImpar {
	public static void main(String[] args) {
		int numero;
		
		System.out.println("Introduzca un n�mero para saber si es par o impar: ");
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("El n�mero " + numero + " es par.");
		else 
			System.out.println("El n�mero " + numero + " es impar.");
	}
}
