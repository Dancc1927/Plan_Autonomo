import java.util.Scanner;

public class dos {
	public static void main(String[] args) {
		
		/**ingreso datos por consola*/
		Scanner datos = new Scanner(System.in);
        System.out.print("Ingrese un número para obtener su tabla de multiplicar: ");
        int numero = datos.nextInt();
/**el numero ingresado lo multiplica por la variable partiendo de 1 hasta 10*/
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
	}
	}}
