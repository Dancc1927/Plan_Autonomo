package condicionales_simples;

import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		/** */
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese un valor");
		int numero=entrada.nextInt();
		
         if(numero%2 ==0) {
        	 System.out.println("El numero :"+numero+"es par");
        	 if(numero==2){
        		 System.out.println("El numero que ingreso es 2");
        	 }else {
        		 System.out.println("El numero no es 2");
        	 }
         }else {
        	 System.out.println("El numero : " +numero+ " NO es par");
         }
	}

}
