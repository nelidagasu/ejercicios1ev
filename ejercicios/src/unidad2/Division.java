package unidad2;

/**
 * En el m�todo main de una clase Java llamada Division escribe un programa que 
 * muestre en la consola la divisi�n de 1234 entre 532 siendo ambos n�meros reales. 
 * El formato de salida ser� un n�mero que ocupar� un m�nimo de 15 caracteres en 
 * pantalla, de los cuales dos se utilizar�n para la parte decimal.
 * 
 * @author nelida
 *
 */
public class Division {

	public static void main(String[] args) {
		double resultado = 15.2d ;
		
		resultado = 1234 / 532;
		
		System.out.println("El resultado de dividir 1234 entre 532 es " + String.format("%.2f", resultado));

	}

}
