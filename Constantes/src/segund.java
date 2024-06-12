import java.util.Scanner;

public class segund {
	public static void main(String[] args) {
		
		
	/** definicion de constante Pi ya se es un valor definido*/
		final double pi = 3.14159;
		
		/** pide el radio al usuario */
		Scanner radio = new Scanner(System.in);
		System.out.println("Ingrese el radio:");
		int radioR = radio.nextInt();
		
     /** Calcular el área del círculo utilizando la constante para Pi*/
		
        double area = pi * radioR * radioR;
        System.out.println("El área del círculo es: " + area);
		
	}
}
