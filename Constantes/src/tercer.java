import java.util.Scanner;

public class tercer {
	public static void main(String[] args) {
		/** definicion de constantes 
		 * el equivalente es lo que equivale los celsius en fahrenheit 
		 * el puntoCong es el punto de congelacion del agua */
		final double equivalente = 9.0/5.0;
		final double puntoCong= 32.0;
		
		
		Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius:");
        double celsius = entrada.nextDouble();
		
        /**conversion de celcius a fahrenheit*/
        double gradosfahrenheit = (celsius * equivalente) + puntoCong;
        
        /** mostamos al usuario el resulltado */
        System.out.println("La temperatura en grados Fahrenheit es: " + gradosfahrenheit);
		
		
		
	}
}
