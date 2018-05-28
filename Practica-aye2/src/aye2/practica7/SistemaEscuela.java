package aye2.practica7;

import java.util.ArrayList;

public class SistemaEscuela {
	
	private final static int LONGITUD_ARREGLO=5;
	
	public static void main(String[]args) {
		//arreglo estatico de personas
		Persona[] aPersona = new Persona[LONGITUD_ARREGLO];
		aPersona[0] = new Empleado();
		aPersona[1] = new Alumno();
		for (int i = 0; i < aPersona.length; i++) {
			System.out.println(i + ": " + aPersona[i]);
		}
		//arreglo dinamico
		ArrayList<Persona> aPersona2 = new ArrayList<>();
		aPersona2.add(new Empleado());
		aPersona2.add(new Empleado());
		aPersona2.add(new Alumno());
		
		for (int i = 0; i < aPersona2.size(); i++) {
			System.out.println(i + ": " + aPersona2.get(i));
		}
		//Muestra lo mismo
		for (Persona p: aPersona2) {
			System.out.println(p);
		}
		
		//Covarianza
		ArrayList<Empleado> emp1 = new ArrayList<>();
		//ArrayList<Persona> per1;
		// no se puede porque el arraylist empleado no desciende de Persona
		//per1=emp1;
		ArrayList<? extends Persona> per1;
		per1=emp1; //ArrayList<Empleado> es SUBTIPO de ArrayList<? extends Persona>
	}
}
