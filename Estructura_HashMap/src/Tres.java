import java.util.HashMap;

public class Tres {

	public static void main(String[] args) {
		/** Crear un HashMap para almacenar nombres y números de teléfono*/
        HashMap<String, String> telefonos = new HashMap<>();

        /**Agregar algunos elementos al HashMap*/
        telefonos.put("Juan", "123456789");
        telefonos.put("María", "987654321");
        telefonos.put("Pedro", "456789123");

        /** Nombre a buscar*/
        String nombreBuscar = "María";

        /**Buscar el nombre en el HashMap y mostrar su número de teléfono*/
        if (telefonos.containsKey(nombreBuscar)) {
            System.out.println("Número de teléfono de " + nombreBuscar + ": " + telefonos.get(nombreBuscar));
        } else {
            System.out.println("No se encontró el nombre " + nombreBuscar + " en el HashMap.");
        }

	}

}
