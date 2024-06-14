import java.util.Scanner;

public class uno {

	public static void main(String[] args) {
		
		/**ingreso datos por consola*/
		Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese un número : ");
        int num1 = dato.nextInt();
      
        int suma = 0;
        for (int i = 1; i <= num1; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + num1 + " números naturales es: " + suma);

	}

}
