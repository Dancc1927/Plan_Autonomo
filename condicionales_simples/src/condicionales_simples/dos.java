package condicionales_simples;

import java.util.Scanner;

public class dos {
	public static void main(String[] args) {
		
		/** pido un dato por consola*/
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese un valor");
		int valor=entrada.nextInt();
		
		
	if(valor<100) {
		System.out.println("El numero es menor de cien");
	}
	else {
		System.out.println("El numero es mayor de cien");
	}
	}
}
