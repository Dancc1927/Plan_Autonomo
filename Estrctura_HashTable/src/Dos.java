import java.util.Hashtable;

public class Dos {

	public static void main(String[] args) {
		/**Creacion da lista*/
		Hashtable<String, String> telefonos = new Hashtable<>();

        /**Agregar algunos elementos al Hashtable*/
        telefonos.put("Juan", "123456789");
        telefonos.put("María", "987654321");
        telefonos.put("Pedro", "456789123");

        /** Nombre a buscar*/
        String nombreBuscar = "María";

        /** Buscar el nombre en el Hashtable y mostrar su número de teléfono*/
        if (telefonos.containsKey(nombreBuscar)) {
            System.out.println("Número de teléfono de " + nombreBuscar + ": " + telefonos.get(nombreBuscar));
        } else {
            System.out.println("No se encontró el nombre " + nombreBuscar + " en el Hashtable.");
        }
	}

}
