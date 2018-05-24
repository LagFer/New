package aye2.practica6;

public class Vector3D extends Punto{
	
	private float z;
	
	/*public Vector3D() {
		
		x = 0;
		y = 0;
		z = 0;
		
	}
	*/
	public Vector3D(float a,float b,float c) {
		
		super(a,b);
		z = c;
		
	}
	
	/*public float getx() {
		return x;
	}
	public float gety() {
		return y;		
	}
	*/
	public float getz() {
		return z;
	}
	
	private void clone(Vector3D v) {
		
		x = v.x;
		y = v.y;
		z = v.z;
		
	}
	
	private void sumar(Vector3D v) {
		
		x += v.x;
		y += v.y;
		z += v.z;
	}
	
	public static Vector3D sumar(Vector3D v1, Vector3D v2) {
		
		Vector3D v3 = new Vector3D(0,0,0);
		v3.clone(v1);
		v3.sumar(v2);
		return v3;
	}
	
	public boolean igualdadVectores(Vector3D v) {
		
		return igualdad(v) && z==v.z;
	}
}
