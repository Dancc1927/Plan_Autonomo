import java.util.Scanner;


public class uno {

	public static void main(String[] args) {
    
		/** entrada de datos por consola*/
       Scanner entrada = new Scanner(System.in);
        
       /**el numero ingresado se acumula en numero*/
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        
        /** si el numero es mayor a 0 sera positivo, de lo contrario sera negativo*/
        if(numero > 0) {
            System.out.println("El número es positivo: "+numero);
        } else if(numero < 0) {
            System.out.println("El número inresado es negativo: "+numero);
        } else {
            System.out.println("El número es cero.");
        }
	}
}

