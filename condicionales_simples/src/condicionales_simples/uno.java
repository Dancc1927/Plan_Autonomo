package condicionales_simples;

import java.util.Scanner;

public class uno {

	public static void main(String[] args) {
       /** defino el tipo de dato*/
		int edad=18;
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese su edad");
		int edadI=entrada.nextInt();
		
		/** condicion si el valor ingresado por el usuario es mayor e igual a la edad(18)*/
		if(edadI>=edad) {
			System.out.println("Usted es mayor de edad");
			
		}/** si no es mayor e igual a 18 es menor */
		else {
			System.out.println("Usted NO es mayor de edad");
		}
	}

}
