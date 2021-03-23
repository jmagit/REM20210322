package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Primera clase de ejemplo
 * @author Javier
 *
 */
public class Principal {

	/**
	 * Método principal
	 * @param args Linea de argumentos del comando
	 */
	public static void main(String[] args) {
		tipos();
		
	}

	public static void tipos() {
		System.out.println("Hola mundo");
		long a = 0b1001_0011_1010_1111;
		var s = "12";
		var p = new Principal();
		List<String> list = new ArrayList<>();
		short c = (short)a;
		c = Short.parseShort(s);
		s = Short.toString(c);
		s = s + "3";
		
		int[] t = new int[10];
		int[][] m;
		m = new int[2][3];
		
		m = new int[2][];
		m[0] = new int[3];
		m[1] = new int[2];
		
		var aux = m[1];
		m[1] = m[0];
		m[0] = aux;
		s += "s";
		s = s + "s";
		if(s != null && s.length() > 0) {
			
		}
		if(a > c++) {
			
		}
		System.out.println("Elemento" + (c > 1 ? "s " : " "));
		
		Object object = new Principal();
		// ...
//		if(object instanceof Principal otra) {
//			// var otra = (Principal)object;
//			var r = otra.divide(2, 2);
//			((Principal)object).divide(2, 3);
//		}
	}


	/**
	 * División real de dos números
	 * @param a Primer operando 
	 * @param b Segundo operando, no puede ser 0
	 * @return Resultado de la division real
	 * @throws ArithmeticException No se puede dividir por 0
	 */
	public double divide(double a, double b) throws ArithmeticException  {
		if(b == 0)
			throw new ArithmeticException();
		return a / b;
		
	}
}
