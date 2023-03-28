import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IA_ContadorPalabrasRepetidas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una oración: ");
		String oracion = sc.nextLine().toUpperCase().replaceAll("[^A-Z ]", "");
		String[] palabras = oracion.split(" ");
		Map<String, Integer> contadorPalabras = new HashMap<>();
		for (String palabra : palabras) {
			if (!palabra.equals("")) {
				if (contadorPalabras.containsKey(palabra)) {
					contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
				} else {
					contadorPalabras.put(palabra, 1);
				}
			}
		}
		System.out.println("Palabras repetidas:");
		for (Map.Entry<String, Integer> entry : contadorPalabras.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " se repite " + entry.getValue() + " veces.");
			}
		}
	}
}
