import javax.swing.JOptionPane;
import java.util.*;

public class CantPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oracion = JOptionPane.showInputDialog("Ingrese la linea que desea contar").toUpperCase();
		// LA PAMPA TIENE EL OMBU EL OMBU LA LA CARRETERA LAS 123 LINEAS LOS EMAILS LOS
		String[] palabras = oracion.split(" ");

		ArrayList<String> Palabras = new ArrayList<String>();
		for (int i = 0; i < palabras.length; i++) {
			if (!palabras[i].equals("") || !palabras[i].equals(",")) {
				Palabras.add(palabras[i]);
			}
		}

		int contPalabrasRep = 0;

		for (int i = 0; i < palabras.length; i++) {
			int contadortmp = 0;
			for (int j = i; j < palabras.length; j++) {
				if (palabras[i].equals(palabras[j])) {
					contadortmp++;
				}
			}
			if (contadortmp > 1) {
				System.out.println("palabra: " + palabras[i] + " repeticiones " + contadortmp);
				contPalabrasRep++;
			}

		}
		if (contPalabrasRep > 0) {
			System.out.println("cantidad de palabras duplicadas es " + contPalabrasRep);
		}

	}

	private void Borrado() {

		/*
		 * int[] contadores = PalabrasDuplicadas(linea); for (int i = 0; i <
		 * contadores.length; i++) { if (contadores[i] > 1) {
		 * System.out.println("palabra: " + contadores[i]); } }
		 */

		///

		/*
		 * int[] contador = new int[cadena.length()];
		 * 
		 * for (int i = 0; i < campos.length; i++) { String item = campos[i]; if (item
		 * != " ") for (int j = 0; j < campos.length; j++) { if (item.equals(campos[j]))
		 * { contador[i]++; } } }
		 */
	}
}
