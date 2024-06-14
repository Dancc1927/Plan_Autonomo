import java.util.ArrayList;

public class dos {

	public static void main(String[] args) {
		/** declaramos el array*/   
		 int[] numeros = {1, 2, 3, 4, 5};

	        /** Acceso a los  elementos del array*/
	        System.out.println("Primer elemento: " + numeros[0]);
	        System.out.println("Último elemento: " + numeros[numeros.length - 1]);

	        /** Modificación de los elementos del array*/
	        numeros[0] = 7;
	        System.out.println("Nuevo valor del primer elemento: " + numeros[0]);
	}

}
