package ejerciciosResueltos;

import java.util.Scanner;

public class Ejercicio2Víctor {

		/**
		 * Calcular area
		 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double b,h,area;
		System.out.println("Introduce la base del triangulo: ");
		b=teclado.nextDouble();
		System.out.println("Introduce la altura del triangulo: ");
		h=teclado.nextDouble();
		area=(h*b)/2;
		System.out.println("El area del triangulo es: "+area);
		
	}

}
