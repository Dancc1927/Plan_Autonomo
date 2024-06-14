
public class tres {

	public static void main(String[] args) {

		/** Definicion del arreglo de números enteros*/
        int[] arreglo = {10, 20, 30, 40, 50};

        /** variable para almacenar la suma*/
        int suma = 0;

        /**Iterar el arreglo y sumar los elementos*/
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        /** Mostrar el resultado*/
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}
