package aye2.practica6;

public class pruebaPractica6 {

	public static void main(String[] args) {
		
		Lamparita lam1 = new Lamparita();
		
		System.out.println("La lamparita esta " + lam1.getEstado().toString());
	
		lam1.encender();
		
		System.out.println("La lamparita esta " + lam1.getEstado());
		
	}
}
