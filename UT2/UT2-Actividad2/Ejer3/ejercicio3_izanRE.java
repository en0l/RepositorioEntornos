package entornos_ej;
import java.util.*;
public class ejercicio3_izanRE {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int a, b, suma;
	System.out.println("Introduce un número: ");
	a = teclado.nextInt();
	System.out.println("Introduce otro número: ");
	b = teclado.nextInt();
	suma = (a*a) + (b*b);
	System.out.print("La suma de sus cuadrados es: "+suma);
	}

}
