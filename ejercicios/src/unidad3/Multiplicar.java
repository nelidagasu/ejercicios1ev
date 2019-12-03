package unidad3;

import java.util.Scanner;

/**
 * En el m�todo main de una clase llamada Multiplicar escribe un programa que ayude al aprendizaje de las tablas 
 * de multiplicar. El programa preguntar� qu� tabla se desea repasar (n�mero entre 1 y 9). A continuaci�n, 
 * preguntar� el resultado de cada multiplicaci�n de la tabla elegida, contabilizando cada fallo y mostrando la 
 * respuesta correcta. Al completar la tabla, el programa le dir� al usuario si ha aprobado (menos de 2 fallos) 
 * o ha suspendido (2 o m�s fallos). 
 * Despu�s finalizar el repaso de cada tabla, se dar� la opci�n de repasar otra o salir del programa.
 * @author nelid
 *
 */
public class Multiplicar {

	public static void main(String[] args) {
		String salir = "N";
		Scanner sc = new Scanner(System.in);
		int tabla;
		int fallos;
		int aux;
		int entrada;
		
		do {
			fallos = 0;
			
			System.out.println("�Qu� tabla desea repasar?");
			tabla = sc.nextInt();
			
			for (int i = 0; i < 11; i++) {
				aux = tabla * i;
				entrada = 0;
				System.out.println(tabla + " x " + i + " = ");
				entrada = sc.nextInt();
				
				if (entrada == aux)
					System.out.println("�Corecto!");
				else {
					System.out.println("La respuesta correcta es " + aux);
					fallos ++;
				}
			}
			
			System.out.println("�Desea salir del programa? S/N");
			salir = sc.next();
		} while (salir.equals("N")) ;
		
		if (fallos < 2)
			System.out.println("�Aprobado!");
		else
			System.out.println("Suspenso");
	}

}
