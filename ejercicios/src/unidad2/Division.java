package unidad2;

/**
 * En el método main de una clase Java llamada Division escribe un programa que 
 * muestre en la consola la división de 1234 entre 532 siendo ambos números reales. 
 * El formato de salida será un número que ocupará un mínimo de 15 caracteres en 
 * pantalla, de los cuales dos se utilizarán para la parte decimal.
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
