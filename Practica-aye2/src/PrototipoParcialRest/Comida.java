package PrototipoParcialRest;

public abstract class Comida extends Producto implements Enviable{

	public Comida() {
		super();
	}
	
	public Comida(double p) {
		this();
		this.setPrecio(p);
	}
}
