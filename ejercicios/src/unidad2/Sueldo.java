package unidad2;

import java.util.Scanner;

/**
 * En el m�todo main de una clase Java llamada Sueldo escribe un programa que resuelva el problema siguiente: un 
 * vendedor recibe un sueldo base m�s un 10% extra por comisi�n de sus ventas; el vendedor desea saber cu�nto dinero
 * obtendr� por concepto de comisiones, por las tres ventas que realiza en el mes y el total que recibir� en el mes,
 * teniendo en cuenta su sueldo base y las comisiones. Se utilizar� el teclado para la entrada de datos y la consola
 * para la salida. Para resolver este problema est� permitido utilizar la clase Scanner.
 * @author nelid
 *
 */
public class Sueldo {
	public static void main(String[] args) {
		Float sueldoBase;
		Float sueldo;
		Float venta1;
		Float venta2;
		Float venta3;
		
		System.out.println("introduzca el sueldo base: ");
		Scanner sc = new Scanner(System.in);
		
		sueldoBase = sc.nextFloat();
		
		System.out.println("Introduzca el importe de la venta uno: ");
		venta1 = sc.nextFloat();
		
		System.out.println("Introduzca el importe de la venta dos: ");
		venta2 = sc.nextFloat();
		
		System.out.println("Introduzca el importe de la venta tres: ");
		venta3 = sc.nextFloat();
		
		sueldo = (float) (sueldoBase + (venta1 * 0.1) + (venta2 * 0.1) + (venta3 * 0.1));
		
		System.out.println("El sueldo del mes ser� de " + String.format("%.2f", sueldo) + " �");
	}
}
