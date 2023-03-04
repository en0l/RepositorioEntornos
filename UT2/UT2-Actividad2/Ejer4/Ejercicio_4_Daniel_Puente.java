package ejerciciosResueltos;
import java.util.Scanner;
public class Ejercicio_4_Daniel_Puente{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double cant, porc;
		System.out.println("introduce una cantidad: ");
		cant = teclado.nextDouble();
		
		porc = (cant*10)/100;
		System.out.println("El 10% de "+cant+" es:"+porc);	}
}