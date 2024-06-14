import java.util.Hashtable;
import java.util.Map.Entry;

public class Tres {

	public static void main(String[] args) {
		/**Crear un Hashtable para almacenar nombres y correos electrónicos*/
        Hashtable<String, String> correos = new Hashtable<>();

        /**Agregar algunos elementos al Hashtable*/
        correos.put("Juan", "juan@example.com");
        correos.put("María", "maria@example.com");
        correos.put("Pedro", "pedro@example.com");

        /**Eliminar un nombre específico del Hashtable*/
        String nombreEliminar = "María";
        correos.remove(nombreEliminar);

        /** Mostrar los elementos restantes en el Hashtable*/
        System.out.println("Elementos restantes en el Hashtable:");
        for (Entry<String, String> entry : correos.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Correo electrónico: " + entry.getValue());
        }
	}

}
