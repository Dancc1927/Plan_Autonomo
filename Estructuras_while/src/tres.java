
public class tres {
	public static void main(String[] args) {
		
		/** definicion de datos*/
		int contadorAscendente = 1;
        int contadorDescendente = 10;

        /** muestra el orden de los numero del 1-10 de manera ascendente*/
        System.out.println("Contador ascendente: ");
        while (contadorAscendente <= 10) {
            System.out.print(contadorAscendente + " ");
            contadorAscendente++;
        }
        /** muestra el orden de los numero del 1-10 de manera descendente*/

        System.out.println("\nContador descendente:");
        while (contadorDescendente >= 1) {
            System.out.print(contadorDescendente + " ");
            contadorDescendente--;}
		
		
		
	}
}
