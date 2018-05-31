package aye2.Practica8;

public class Termometro implements Medible{
	private float temperatura;
	
	public Termometro(float x) {
		if(x > (-273)) {
			temperatura = x;
		}
	}
	
	public float obtenerMedida() {
		return temperatura;
	}
	
	public void incrementar(float x) {
		temperatura = temperatura + x;
	}
	
	public void decrementar(float x,boolean error) {
		if (temperatura - x == (-273)) {
			error = true;
		}else {
			temperatura = temperatura - x;
			error = false;
		}
	}
}
