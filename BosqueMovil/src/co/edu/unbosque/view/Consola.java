package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {

	private Scanner lector;

	public Consola() {
		lector = new Scanner(System.in);
		// leer datos por consola y leer de otros origenes de datos
	}

	// los nùmeros pueden tener diferentes bases numericas

	public int leerNumeroEntero() {
		return lector.nextInt(); // los manda al controlador, interaccion mas no controlar.
	}

	public float leerNumeroDecimal() {
		return lector.nextFloat();
	}

	public double leerNumeroDoble() {
		return lector.nextDouble();
	}

	public long leerNumeroEnteroLargo() {
		return lector.nextLong();
	}

	public boolean leerBooleano() {
		String entrada = lector.next();
		if (entrada.toLowerCase().contains("si")) { // mirar pa que lo vuelva a intentar, cositas de calidad de vida
			return true;
		} else {
			return false;
		}
	}

	public String leerLinea() {
		return lector.nextLine(); // hasta un enter.
	}

	public String leerPalabra() {
		return lector.nextLine(); // findInLine

	}

	public char leerCaracter() {
		return lector.next().charAt(0); // las cadenas de caracteres tienen indices, la posicion 0 sera la primera
										// posicion
	}

	public void escribirConSalto(String texto) {
		System.out.println(texto);
	}

	public void escribirSinSalto(String texto) {
		System.out.print(texto);
	}

	public void quemarLinea() {
		lector.nextLine();
	}

	public void escribirErro(String texto) {
		System.err.println(texto);
	}

}
