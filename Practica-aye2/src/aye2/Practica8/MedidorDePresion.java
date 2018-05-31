package aye2.Practica8;

public class MedidorDePresion {
	
	private int cant;
	private int unidades;
	private boolean ultDec;
	
	public MedidorDePresion() {
		unidades = 0;
		cant = 0;
	}
	
	public float obtenerMedida() {
		return (float)unidades;
	}
	
	public void incrementar(float x) {
		unidades = unidades + (int)x;
		cant = cant ++;
		ultDec = false;
	}
	
	public void decrementar(float x,boolean error) {
		if(ultDec) {
			error = true;
		}else {
			unidades = (int)x/cant;
			cant = 0;
			ultDec = true;
			error=false;
		}
	}

}
