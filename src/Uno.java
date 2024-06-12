import java.util.Scanner;

public class Uno {
public static void main(String[]args) {

	   /** entrada de datos por consola */

	        Scanner edad = new Scanner(System.in);
	        System.out.println("Ingrese su año de nacimiento:");
	        int edadIn = edad.nextInt();
	        
	        System.out.println("Ingrese el año actual:");
	        int anoActual = edad.nextInt();
	     
	        /** operacion para saber la edad */
	        int edadActual = anoActual - edadIn;
	        
	        System.out.println("Tu edad es: " + edadActual +" años.");
	    }


}