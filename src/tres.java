import java.util.Scanner;

public class tres {
 public static void main(String[]args) {
	double pi=3.1416;
	/** entrada de datos por consola */
	 Scanner entrada = new Scanner(System.in);
     System.out.println("Ingrese el radio del círculo:");
     double radio = entrada.nextDouble();
     
     /** operacion para calcular el área del círculo*/
     double area = pi * Math.pow(radio, 2);
     
     System.out.println("El área del círculo es: " + area);
	 
 }
}
