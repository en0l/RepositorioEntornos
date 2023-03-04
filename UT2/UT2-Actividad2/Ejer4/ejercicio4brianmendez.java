package entornos;
import java.util.*;
public class ejercicio4brianmendez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado= new Scanner(System.in);
double cant, proc;
System.out.println("introduce una cantidad: ");
cant = teclado.nextDouble();
proc = (cant*10)/100;
System.out.println("El 10% de "+cant+ " es: " +proc);
	}

}
