import java.util.Scanner;

public class dos {
	public static void main(String[]args) {
		
		/** entrada de datos por consola */

		Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius:");
        double celsius = entrada.nextDouble();
		
        /**conversion 32- es grado de congelacion en fahrenheit*/
        double gradosfahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("La temperatura en grados Fahrenheit es: " + gradosfahrenheit);
		
		
	}
}
