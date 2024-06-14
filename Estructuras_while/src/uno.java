import java.util.Scanner;

public class uno {
	public static void main(String[] args) {
		
		/** entrada de datos por consola*/
        Scanner entrada = new Scanner(System.in);
		
		/** menu de opciones*/
		while (true) {
            System.out.println("Calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            
            int opcion = entrada.nextInt();
            
            /**si seleccciona la opcion 5 sale del proceso*/
            if (opcion == 5) {
                System.out.println("proceso finalizado");
                break;
            }
            
            System.out.print("Ingrese el primer número: ");
            double numero1 = entrada.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double numero2 = entrada.nextDouble();
            
            double resultado = 0;
            
            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    continue;
            }
            
            System.out.println("El resultado es: " + resultado);
        }
		
		
		
		
	}
	
}
