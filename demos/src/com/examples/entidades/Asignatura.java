package com.examples.entidades;

public class Asignatura implements Grafico, Entidad {
	double dameNota() { return 0.0; }

	@Override
	public void pintate() {
		System.out.println("Soy una asignatura");
	}

	@Override
	public void test() {
		
	}
}
