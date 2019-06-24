package PrototipoParcialRest;

import java.util.ArrayList;

public class Restaurante {
	
	private ArrayList<Mesa> mesas; //Mesas disponibles
	private ArrayList<Cuenta> cuentas;
	
	public Restaurante() {
		this.inicializarMesas();
		this.cuentas = new ArrayList<Cuenta>();
	}
	
	private void inicializarMesas() {
		MesaInt m1 = new MesaInt(10);
		MesaInt m2 = new MesaInt(8);
		MesaExt m3 = new MesaExt(5);
		mesas = new ArrayList<>();
		mesas.add(m1);
		mesas.add(m2);
		mesas.add(m3);
	}
	
	public ArrayList<Mesa> mesasLibres(){
		return mesas;
	}
	
	public void asignarMesa(Cuenta c1, int idMesa) throws MesaNoDisponibleException {
		boolean asignada = false;
		for (Mesa m : this.mesas) {
			if(m.getId() == idMesa) {
				c1.asignarMesa(m);
				asignada = true;
			}
		}
		if(asignada) {
			throw new MesaNoDisponibleException();
		}
	}
	
	public void asignarMesa(Mesa m) {
		mesas.add(m);
	}
	
	public void agregarCuenta(Cuenta c1) {
		cuentas.add(c1);
	}
	
	public static void main(String[] args) {
		Restaurante r = new Restaurante();
		Cuenta cuenta1 = new Cuenta();
		try {
			r.asignarMesa(cuenta1,1);
			r.asignarMesa(cuenta1,2);
			r.asignarMesa(cuenta1,3);
			IFacturable coca = new Gaseosa();
			Enviable hamb = new Hamburguesa();
			Pedido p1 = cuenta1.nuevoPedido();
			cuenta1.nuevoPedido();
			cuenta1.cerrarCuenta();
		}catch(MesaNoDisponibleException e) {
			System.out.println("Mesa no disponible");
		}catch(CuentaCerradaException e) {
			System.out.println("Cuenta cerrada");
		}
	}

}
