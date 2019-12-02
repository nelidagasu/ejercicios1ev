package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * En el método main de una clase Java llamada Calificaciones escribe un programa que resuelva 
 * el problema siguiente: un estudiante desea saber cuál será su promedio general en las tres 
 * materias que cursa y cuál será el promedio que obtendrá en cada una de ellas. Los criterios 
 * de calificación se establecen en la tabla siguiente:
 * 
 * Los datos de entrada (calificación del examen y calificaciones de cada una de las tareas 
 * realizadas) se introducirán por teclado y los datos de salida (los promedios de cada 
 * asignatura y el promedio de las tres) se mostrarán en la consola con una precisión de dos 
 * decimales. Resolver el problema sin utilizar la clase Scanner.
 * @author nelid
 *
 */
public class Calificaciones {

	public static void main(String[] args) {
		ArrayList<Float> matematicas = new ArrayList<>();
		ArrayList<Float> fisica = new ArrayList<>();
		ArrayList<Float> quimica = new ArrayList<>();
		
		Float mediaMatematicas;
		Float mediaFisica;
		Float mediaQuimica;
		Float media;
		
		System.out.println("MATEMÁTICAS:");
		System.out.println("Introduzca la nota del examen:");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		try {
			matematicas.add(Float.parseFloat(br.readLine()));
			
			System.out.println("Introduzca la nota de la primera tarea:");
			matematicas.add(Float.parseFloat(br.readLine()));
			
			System.out.println("Introduzca la nota de la segunda tarea:");
			matematicas.add(Float.parseFloat(br.readLine()));
			
			System.out.println("Introduzca la nota de la tercera tarea:");
			matematicas.add(Float.parseFloat(br.readLine()));
			
			mediaMatematicas = (float) ( (matematicas.get(0) * 0.9) + (((matematicas.get(1) + matematicas.get(2) + matematicas.get(3)) / 3) * 0.1));
			
			
			System.out.println("FÍSICA:");
			System.out.println("Introduzca la nota del examen:");
			fisica.add(Float.parseFloat(br.readLine()));
			
			System.out.println("Introduzca la nota de la primera tarea:");
			fisica.add(Float.parseFloat(br.readLine()));
			
			System.out.println("Introduzca la nota de la segunda tarea:");
			fisica.add(Float.parseFloat(br.readLine()));
			
			mediaFisica = (float) ( (fisica.get(0) * 0.8) + (((fisica.get(1) + fisica.get(2)) / 2) * 0.2));

			
			System.out.println("QUIMICA:");
			System.out.println("Introduzca la nota del examen:");
			quimica.add(Float.parseFloat(br.readLine()));
			
			System.out.println("Introduzca la nota de la primera tarea:");
			quimica.add(Float.parseFloat(br.readLine()));
			
			System.out.println("Introduzca la nota de la segunda tarea:");
			quimica.add(Float.parseFloat(br.readLine()));
			
			System.out.println("Introduzca la nota de la tercera tarea:");
			quimica.add(Float.parseFloat(br.readLine()));
			
			mediaQuimica = (float) ( (quimica.get(0) * 0.85) + (((quimica.get(1) + quimica.get(2) + quimica.get(3)) / 3) * 0.15));
			
			media = (mediaMatematicas + mediaFisica + mediaQuimica) / 3;
			
			System.out.println("La nota media de matemáticas es: " + String.format("%.2f", mediaMatematicas));
			System.out.println("La nota media de física es: " + String.format("%.2f", mediaFisica));
			System.out.println("La nota media de química es: " + String.format("%.2f", mediaQuimica));
			System.out.println("La nota media de las tres asignaturas es: " + String.format("%.2f", media));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
