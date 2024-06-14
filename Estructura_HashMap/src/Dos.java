import java.util.HashMap;
import java.util.Map;

public class Dos {
	public static void main(String[] args) {
		
		/** Crear un HashMap para almacenar nombres y correos electrónicos*/
        HashMap<String, String> correos = new HashMap<>();

        /** Agregar algunos elementos al HashMap*/
        correos.put("Juan", "juan@example.com");
        correos.put("María", "maria@example.com");
        correos.put("Pedro", "pedro@example.com");

        /** Eliminar un nombre específico del HashMap*/
        String nombreEliminar = "María";
        correos.remove(nombreEliminar);

        /** Mostrar los elementos restantes en el HashMap*/
        System.out.println("Elementos restantes en el HashMap:");
        for (Map.Entry<String, String> entry : correos.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Correo electrónico: " + entry.getValue());
        }
		
		
		
	}
}
