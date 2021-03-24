package com.examples.entidades;

public class Alumno extends Persona {
	private Asignatura[] asignaturas;
	
	public Alumno(int id, String nombre) {
		super(id, nombre);
	}

	public Alumno(int id, String nombre, String apellidos) {
		super(id, nombre, apellidos);
	}

	public void pintate(String algo) {
		System.out.println("Alumno");
		super.pintate();
	}

	public void duermete() {
		System.out.println("zzzzz");
	}

	@Override
	public String toString() {
		return "Alumno [Id=" + getId() + ", Nombre=" + getNombre() + ", Apellidos=" + getApellidos() + "]";
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
	
	public double dameNotas() {
		return asignaturas[0].dameNota();
	}
	public Asignatura dameAsignatura() {
		return asignaturas[0];
	}
}
