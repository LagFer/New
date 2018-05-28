package aye2.practica6;

public class Polar extends Punto{
	
	private float radio;
	private float angulo;
	
	public Polar(float a, float b){
		
		super(a,b);
		radio = 0;
		angulo = 0;
		
	}
	
	public Polar(float a, float b, float r, float ang) {
		
		super(a,b);
		radio = r;
		angulo = ang;
	}
	
	public float getx(){
		
		x = (float) (radio * Math.sin(angulo));
		return x;
		
	}
	
	public float gety() {
		
		y = (float) (radio * Math.cos(angulo));
		return y;
	}
	
	public void PolarARect(Polar p) {
		
		x = 
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public float getAngulo() {
		return angulo;
	}

	public void setAngulo(float angulo) {
		this.angulo = angulo;
	}

}
