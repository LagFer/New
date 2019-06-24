package PrototipoParcialRest;

public abstract class Mesa {
	
	private int id;
	private int capacidad;
	private static int ultimoId = 0;
	//private Cuenta cuenta;
	protected double comision;
	
	public Mesa() {
		this.comision = 0;
		this.capacidad = 0;
		this.id = ultimoId +1;
		ultimoId++;
	}
	
	public Mesa(int cap) {
		this();
		this.capacidad = cap;
	}

}
