package aye2.practica6;

public class Punto {

	
	protected float x;
	protected float y;
	
	/*public Punto() {
		
		x = 0;
		y = 0;
		
	}
	*/
	public float getx() {
		
		return x;
	}
	
	public float gety() {
		
		return y;
	}
	public Punto(float a, float b){
		
		x = a;
		y = b;
		
	}
	
	public float sumarPuntos() {
		
		return x+y;
		
	}
	
	public float sumarPuntos(float a, float b) {
		
		Punto z = new Punto(0,0);
		z.x = a;
		z.y = b;
		return z.x+z.y;
		
	}
	
	public boolean igualdad(Punto b) {
		
		return x==b.x && y==b.y;
	}
	
}
