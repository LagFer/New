package aye2.Practica8;

public class CuentaBancaria implements Medible{
	private int saldo;
	
	public CuentaBancaria() {
		saldo = 0;
	}
	
	public float obtenerMedida() {
		return (float)saldo;
	}
	
	public void incrementar(float x) {
		saldo = saldo + (int)x;
	}
	
	public void decrementar(float x, boolean error) {
		if(saldo - (int)x < 0) {
			error = true;
		}else {
			saldo = saldo - (int)x;
			error = false;
		}
	}
}
