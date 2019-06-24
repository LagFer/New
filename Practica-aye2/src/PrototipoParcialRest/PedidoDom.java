package PrototipoParcialRest;

import java.util.ArrayList;

public class PedidoDom extends Pedido {
	
	private ArrayList<Enviable> contenido;
	private String domicilio;
	
	public PedidoDom() {
		contenido = new ArrayList<>();
		domicilio = "";
	}
	
	public void agregarProducto(Enviable prod) {
		contenido.add(prod);
	}
	
	public void removerProducto(Enviable prod) {
		contenido.remove(prod);
	}

}
