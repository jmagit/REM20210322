package com.examples.entidades;

public class Profesor extends Persona {
	private double salario = 0.0;

	public Profesor(int id, String nombre, String apellidos) {
		super(id, nombre, apellidos);
		setId(6660000 + id);
	}

	@Override
	public void pintate() {
		System.out.println("El profe");
		super.pintate();
	}

	@Override
	public String toString() {
		return "Profesor [Id=" + getId() + ", Nombre=" + getNombre() + ", Apellidos=" + getApellidos()
				+ "]";
	}

	@Override
	public void ponNota() {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
