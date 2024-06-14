import java.util.Scanner;

public class dos {

	public static void main(String[] args) {
		/** entrada de datos por consola*/
        Scanner entrada = new Scanner(System.in);
        
        /**el numero ingresado se acumula en num*/
        System.out.print("Ingrese un número: ");
        int num = entrada.nextInt();
        
        if(num % 2 == 0) {
            System.out.println("El número es par: "+ num);
        } else {
            System.out.println("El número es impar: "+ num);
        }
        

	}

}
