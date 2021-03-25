package com.indra;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		juego();
		// calcula("3+4+3,4-7*1=");
	}

	private static java.util.Scanner teclado = new java.util.Scanner(System.in);

	private static String leer() {
		return teclado.nextLine();
	}

	public static void juego() {
		do {
			var rnd = new Random();
			int numeroBuscado = rnd.nextInt(100);
			int numeroIntroducido;
			int intentos = 0;
			boolean encontrado = false;
			// System.out.print("El numero: " + numeroBuscado);
			do {
				try {
					System.out.print("Dame tu numero (" + (intentos + 1) + " de 10): ");
					numeroIntroducido = Integer.parseInt(leer());
					intentos += 1;
					if (numeroBuscado == numeroIntroducido) {
						encontrado = true;
					} else if (numeroBuscado > numeroIntroducido) {
						System.out.println("Mi número es mayor.");
					} else {
						System.out.println("Mi número es menor.");
					}
				} catch (Exception ex) {
					//System.out.println("No es un número valido.");
				}
			} while (intentos < 10 && !encontrado);

			if (encontrado) {
				System.out.println("Bieeen!!! Acertaste.");
			} else {
				System.out.println("Upsss! Se acabaron los intentos, el número era el " + numeroBuscado);
			}
			System.out.println("¿Otra? [S/N]");
		} while ("s".compareToIgnoreCase(leer()) == 0);
	}

	public static double calcula(String expresion) {
		String operando = "";
		for (int i = 0; i < expresion.length(); i++) {
			char ch = expresion.charAt(i);
			if (Character.isDigit(ch)) {
				operando += ch;
			} else if (ch == ',') {
				if (operando.indexOf(ch) == -1) {
					operando += ch;
				} else {
					// throw new Exception("Ya existe separador decimal.");
				}
			} else if ("+-*/%=".indexOf(ch) >= 0) {
				if (operando.endsWith(",")) {
					operando += "0";
				}
				System.out.println(operando + " " + ch);
				if (ch == '=') {
					break;
				}
				operando = "";
			} else if (ch != ' ') {
//				throw new Exception("Caracter no valido.");
			}
		}
		return 0;
	}

}
