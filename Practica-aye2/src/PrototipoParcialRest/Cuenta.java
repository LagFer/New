package PrototipoParcialRest;

import java.util.ArrayList;

enum EstadoCuenta {ABIERTA, CERRADA}


public class Cuenta {
	
	private ArrayList<Mesa> mesasAsignadas;
	private boolean estado;
	private ArrayList<Pedido> pedidos;
	private static int ultimoId = 0;
	private int id;
	
	public Cuenta() {
		this.id = ultimoId + 1;
		ultimoId++;
	}
	
	public void generarTicket() {
		
	}
	
	public void abrirCuenta() {
		
	}
	
	public void cerrarCuenta() {
		if(estado == EstadoCuenta.CERRADA) {
			throw new CuentaCerradaException();
		}
		estado = EstadoCuenta
	}

	public Pedido nuevoPedido() {
		Pedido p = new Pedido();
		pedidos.add(p);
		return p;
	}

}
