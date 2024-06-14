import java.util.ArrayList;

public class uno {

	public static void main(String[] args) {
		
	
		/**creamos una lista array*/
		ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
  /**mostramos los elementos de la lista*/
        System.out.println("Lista de números:");
        for (int num : numeros) {
            System.out.println(num);
	}

}
}