import java.util.Hashtable;
import java.util.Map;

public class uno {

	public static void main(String[] args) {
		/**Creacion da lista*/
		Hashtable<String, Integer> tabla = new Hashtable<>();

        /** Agregar algunos elementos al Hashtable*/
        tabla.put("Juan", 30);
        tabla.put("María", 25);
        tabla.put("Pedro", 35);

        /** Mostrar todos los elementos en el Hashtable*/
        System.out.println("Elementos en el Hashtable:");
        for (Map.Entry<String, Integer> entry : tabla.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }

	}

}
