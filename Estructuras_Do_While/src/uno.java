import java.util.Scanner;

public class uno {
	public static void main(String[] args) {
		
		
		/** definicion de tipo de dato e ingrespor consola*/
		Scanner dato = new Scanner(System.in);
        int numero1=0;
        int numero2=0;
        int suma = 0;

   /**acumularlos en dato*/
        do {
            System.out.print("Ingrese un número :\n ");
            numero1 = dato.nextInt();
            System.out.print("Ingrese otro número : ");
            numero2 = dato.nextInt();
            
            /** si el numero es mayor e igual a cero realiza la suma*/
            if (numero1 >= 0) {
            	if(numero2 >=0) {
               suma= numero1+ numero2;
               System.out.print("La suma es : \n"+suma);}
               /**el numero sera negativo*/
            }else {
            	System.out.println("El numero es negativo");
            }
        } while (numero1 >= 0);

        System.out.println("La suma de los números ingresados es: " + suma);
	}
}
