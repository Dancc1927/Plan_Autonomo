
public class uno {

	public static void main(String[] args) {
		/**definicion del dato del arreglo tipo entero*/
		int[] numeros = {5, 10, 15, 20, 25};
        int suma = 0;

          /**imcremento de los argumentos del arreglo*/
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
  /**mostramos la suma*/ 
        System.out.println("La suma de los elementos en el arreglo es: " + suma);
    
	}

}
