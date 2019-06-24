package PrototipoParcialRest;

public abstract class Producto implements IFacturable{
	
	private double precio;
	private String nombre;
	
	public Producto() {
		this.nombre = "";
	}
	
	public Producto(double p) {
		this();
		this.precio = p;
	}
	
	public void setPrecio(double p) {
		this.precio = p;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public double obtenerImporte() {
		return precio;
	}

}
