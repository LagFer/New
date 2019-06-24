package PrototipoParcialRest;

public class Hamburguesa extends Comida implements Enviable {
	
	public Hamburguesa() {
		this.setNombre("Hamburguesa");
		//super(10,"Hamburguesa");
	}
	
	public Hamburguesa(double p) {
		super(p);
		this.setNombre("Hamburguesa");
	}
	
	public void empaquetar() {
		System.out.println("Se empaqueta la hamburguesa");
	}

}
