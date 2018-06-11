package aye2.practica6.EjMicroondas;

public class Puerta {
	enum estadoPuerta{ABIERTA, CERRADA};
	estadoPuerta puerta;
	
	public Puerta() {
		puerta = estadoPuerta.CERRADA;
	}
	
	public void Abrir() {
		puerta = estadoPuerta.ABIERTA;
	}
	
	public void Cerrar() {
		puerta = estadoPuerta.CERRADA;
	}
	
	public estadoPuerta getPuerta() {
		return puerta;
	}	
	
	public boolean estaAbierta() {
		return puerta == estadoPuerta.ABIERTA;
	}
}
