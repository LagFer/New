package aye2.practica7;

import java.util.Date;

public class Libro extends Publicacion{
	private int nroPags;
	private Date anioPublicacion;
	private int precio;
	
	public int getNroPags() {
		return nroPags;
	}
	public void setNroPags(int nroPags) {
		this.nroPags = nroPags;
	}
	public Date getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(Date anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
