import java.util.ArrayList;
import java.util.Arrays;

public class dos {

	public static void main(String[] args) {
		
	
		/**definicion de datos*/
		String[] nombres = {"Ana", "Juan", "María", "Pedro", "Sofía"};
        String nombreBuscar = "María";
        
        /** Convertir el array a una lista ArrayList*/
        ArrayList<String> listaNombres = new ArrayList<>(Arrays.asList(nombres));

        /**Verificar si el nombre está presente en la lista*/
        if (listaNombres.contains(nombreBuscar)) {
            System.out.println("El nombre de '" + nombreBuscar + "' fue encontrado en el arreglo.");
        } else {
            System.out.println("El nombre de '" + nombreBuscar + "' no fue encontrado en el arreglo.");
        }

        
        
        
        
	}}
   