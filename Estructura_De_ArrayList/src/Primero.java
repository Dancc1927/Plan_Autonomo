import java.util.ArrayList;

public class Primero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Número a buscar
        int numeroBuscar = 20;

        // Buscar el número en el ArrayList
        if (numeros.contains(numeroBuscar)) {
            System.out.println("El número " + numeroBuscar + " está presente en la lista.");
        } else {
            System.out.println("El número " + numeroBuscar + " no está presente en la lista.");
        }
	}

}
