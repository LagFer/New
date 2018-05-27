/**
 * @author LagFer
 * @version 1.0
 * 
 * Practica 6 de AyEII
 */

package aye2.practica6;

public class pruebaPractica6 {

	public static void main(String[] args) {
		
		Lamparita lam1 = new Lamparita();
		
		Punto p = new Punto(0,0);
		
		Punto p1 = new Punto(0,0);
		
		if (p.igualdad(p1)) {
			System.out.println("Son iguales");}
			else {System.out.println("No son iguales");
		}
		
		
		Vector3D v1 = new Vector3D(0,0,0);
		
		Vector3D v2 = new Vector3D(0,0,0);
		
		Vector3D v = new Vector3D(0,0,0);

		System.out.println("La lamparita esta " + lam1.getEstado().toString());
	
		lam1.encender();
		
		System.out.println("La lamparita esta " + lam1.getEstado());
		
		System.out.println("Valores del punto: x: " + p.getx() + "y: " + p.gety());
		
		p.sumarPuntos();
		
		System.out.println("Valor suma: " + p.sumarPuntos());
		
		v = Vector3D.sumar(v1, v2);

		System.out.println("Valor vector: " + v.getx() + " y: " + v.gety() + " z: " + v.getz());
		if (v.igualdadVectores(v1)) {
			System.out.println("Vectores Iguales");
		}else {
			System.out.println("Vectores distintos");
		}
		
	}
}
