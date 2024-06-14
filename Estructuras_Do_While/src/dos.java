import java.util.Scanner;

public class dos {

	public static void main(String[] args) {
       /**ingreso por consola*/
		Scanner dato = new Scanner(System.in);
        int opcion;
  
        /** mostrar menu*/
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Saludo");
            System.out.println("2. Despedida");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = dato.nextInt();
 
            /**si es el caso muestrea el resulado*/
            switch (opcion) {
                case 1:
                    System.out.println("¡Hola!");
                    break;
                case 2:
                    System.out.println("¡Adiós!");
                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
            /**si la opcion ingresada es diferente a tres sale*/
        } while (opcion != 3);
	}

}
