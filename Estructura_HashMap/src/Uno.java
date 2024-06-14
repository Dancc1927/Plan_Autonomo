import java.util.HashMap;

public class Uno {

	public static void main(String[] args) {
		/** Creacion de lista*/
		HashMap<String, Integer> mapa = new HashMap<>();
		mapa.put("Juan", 30);
		mapa.put("María", 25);
		mapa.put("Pedro", 35);

		/** Mostrar elementos en el HashMap */
		System.out.println("Elementos en el HashMap:");
		for (String nombre : mapa.keySet()) {
		    int edad = mapa.get(nombre);
		    System.out.println("Nombre: " + nombre + ", Edad: " + edad);
		}
	}

}
