package com.examples.entidades;

public abstract class Persona implements Grafico {
	private static int cont = 0;
	public static final int MAXLENG_NOMBRE = 50;
	
	private int id = 0;
	private String nombre = "";
	private String apellidos;
	
	static {
		cont = 0;
	}
	
	// public Persona() { }
	
	public Persona(int id, String nombre) {
		this(id, nombre, null);
	}
	public Persona(int id, String nombre, String apellidos) {
		cont++;
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public int getId() {
		return id;
	}
	protected void setId(int id) {
		if(id < 0) return;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(this.nombre.equals(nombre)) return;
		if(nombre == null) return; // Error
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		if(this.apellidos != null && this.apellidos.equals(apellidos)) return;
		this.apellidos = apellidos;
	}
	
	public final void comer() {
		// ...
		nombre = nombre.toUpperCase();
		duermete();		
	}

	private void duermete() {
		System.out.println("ZZZZZ");
	}
	

	public void pintate () {
		System.out.println("Soy " + nombre);
	}
	
	public static void dimeCuantos() { System.out.println("Personas " + cont); }
	
	@Override
	protected void finalize() throws Throwable {
		cont--;
		super.finalize();
	}
	
	public abstract void ponNota();
}
