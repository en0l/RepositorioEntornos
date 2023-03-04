package ejerciciosResueltos;
import java.util.*;
public class Ejercicio2 {

	/**
	 * Calcular area
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		double b, h, area;
		
		System.out.println("Introduce la base del triangulo: ");
		b=teclado.nextDouble();
		System.out.println("Introduce la altura del triángulo: ");
		h=teclado.nextDouble();
		area=(h*b)/2;
		System.out.println("El area del triángulo es: "+area);
		
	
		
		
	}

}
