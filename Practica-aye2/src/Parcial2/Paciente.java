package Parcial2;

import java.util.ArrayList;

public class Paciente {
	private String nombre;
	private int dni;
	private int id;
	private static int ultimoId = 0;
	private ArrayList<Receta> recetas;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Receta> getRecetas() {
		return recetas;
	}
	
	public void agregarRecetas(Receta r) {
		recetas.add(r);
	}

	public Paciente() {
		this.dni = 0;
		this.nombre = "";
		this.id = ultimoId +1;
		ultimoId++;
		this.recetas = new ArrayList<Receta>();
	}
	
	public Paciente(String n, int d) {
		this();
		this.setNombre(n);
		this.setDni(d);
	}
}
