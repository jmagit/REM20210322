package com.examples;

/**
 * Primera clase de ejemplo
 * @author Javier
 *
 */
public class Principal {

	/**
	 * M�todo principal
	 * @param args Linea de argumentos del comando
	 */
	public static void main(String[] args) {
		System.out.println("Hola mundo");
	}

	/**
	 * Divisi�n real de dos n�meros
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
