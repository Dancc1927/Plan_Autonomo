import java.util.ArrayList;
import java.util.HashSet;

public class Segundo {

	public static void main(String[] args) {
		/**lista de arreglos con elementos*/
		ArrayList<String> palabras = new ArrayList<>();
        palabras.add("manzana");
        palabras.add("banana");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("banana");

        /** Elimino elementos que esten repetidos utilizando un HashSet*/
        HashSet<String> conjunto = new HashSet<>(palabras);
        palabras.clear();
        palabras.addAll(conjunto);

        /** Mostrar la lista resultante sin elementos duplicados*/
        System.out.println("Lista sin elementos duplicados:");
        for (String palabra : palabras) {
            System.out.println(palabra);
	}

}
}