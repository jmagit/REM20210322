package com.indra;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		juego();
	}

	public static void juego() {
		System.out.println("estoy jugando");
		Scanner teclado = new Scanner(System.in);
		var cad = teclado.nextLine();
		var rnd = new Random();
		var num = rnd.nextInt(10);
		System.out.println(Integer.parseInt(cad));
		System.out.println(cad);
	}

}
