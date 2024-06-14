import java.util.ArrayList;

public class tres {

	public static void main(String[] args) {
		/** creacion de la lista array*/
		ArrayList<String> nombres = new ArrayList<>();

        /** Agregar algunos nombres a la lista*/
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        /** Mostrar la lista de nombres*/
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        /** Obtener el tamaño de la lista*/
        int tamaño = nombres.size();
        System.out.println("Tamaño de la lista: " + tamaño);

        // Eliminar un nombre de la lista
        nombres.remove("María");

        // Mostrar la lista actualizada
        System.out.println("Lista de nombres después de eliminar a María:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
	}

}
