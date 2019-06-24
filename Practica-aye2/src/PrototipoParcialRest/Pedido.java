package PrototipoParcialRest;

import java.util.ArrayList;

public class Pedido {
	protected ArrayList<IFacturable> contenido;
	private boolean esCancelable;
	
	public Pedido() {
		contenido = new ArrayList<>();
		esCancelable = true;
	}
	
	public void agregarProducto(IFacturable prod) {
		contenido.add(prod);
	}
	
	public void removerProducto(IFacturable prod) {
		contenido.remove(prod);
	}

}
