import java.util.Scanner;

public class tres {

	public static void main(String[] args) {

		/** entrada de datos por consola*/
		 Scanner entrada = new Scanner(System.in);
	        
		 /**el numero ingresado se acumula en numero1,2,3*/
	        System.out.print("Ingrese el primer número: ");
	        int numero1 = entrada.nextInt();
	        System.out.print("Ingrese el segundo número: ");
	        int numero2 = entrada.nextInt();
	        System.out.print("Ingrese el tercer número: ");
	        int numero3 = entrada.nextInt();
	        
	        int mayor = numero1;
	        
	        if(numero2 > mayor) {
	            mayor = numero2;
	        }
	        if(numero3 > mayor) {
	            mayor = numero3;
	        }
	        
	        System.out.println("El mayor de los tres números es: " + mayor);
	}

}
