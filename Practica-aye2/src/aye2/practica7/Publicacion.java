package aye2.practica7;

public class Publicacion {
	private String titulo;
	private int precio;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public Publicacion() {
		titulo = new String("");
		precio = 0;
	}
}
