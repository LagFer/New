package aye2.practica6;

public class Monedero {

	float dinero;
	
	public Monedero() {
		dinero = 0;
	}
	
	public Monedero(float a) {
		dinero = a;
	}

	public float getDinero() {
		return dinero;
	}
	
	public void agregarDinero(float a) {
		dinero = dinero + a;
	}
	
	public void extraerDinero(float a) {
		if (dinero-a>=0){
			dinero = dinero - a;
		}else {
			System.out.println("No hay fondos");
		}
	}
}
