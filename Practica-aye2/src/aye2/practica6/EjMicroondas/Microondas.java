package aye2.practica6.EjMicroondas;

import java.util.*;

public class Microondas implements iMicroondas{

	enum estadoMicroondas {ENCENDIDO, STANDBY, APAGADO};
	private Puerta puerta;
	private estadoMicroondas estado;
	private Timer timer;
	
	
	public Microondas() {
		puerta = new Puerta();
	}
	
	public void setPuerta(estadoPuerta puerta) {
		this.puerta = puerta;
	}

	public hayAlimento getHay() {
		return hay;
	}

	public void setHay(hayAlimento hay) {
		this.hay = hay;
	}

	public void insertarComida() {
		if ((getPuerta() == puerta.ABIERTA) && (getHay() == hay.VACIO)) {
			
		}
	}
}
