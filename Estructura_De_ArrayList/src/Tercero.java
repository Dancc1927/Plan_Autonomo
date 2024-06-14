import java.util.ArrayList;

public class Tercero {

	public static void main(String[] args) {
		
		/**Crear una lista de números enteros desordenados*/
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(30);
        numeros.add(10);
        numeros.add(50);
        numeros.add(20);
        numeros.add(40);

        /**sort es para Ordenar la lista de números*/
        numeros.sort(null);

        /** Mostrar la lista ordenada*/
        System.out.println("Lista de números ordenada:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
	
}
