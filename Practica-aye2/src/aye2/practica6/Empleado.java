package aye2.practica6;

public class Empleado {
	
	private int numero;
	private String nombre;
	
	public Empleado() {
		numero = 0;
		nombre = "";
	}
	
	public Empleado(String nom, int num) {
		
		numero = num;
		this.nombre = nom;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void verDatos() {
		System.out.println("Empleado nro " + numero + "; " + nombre);
	}
}
