package aye2.practica7.Ej4;

import java.util.Scanner;

public class Persona {
	
	private String nombre;
	private String direccion;
	private String ciudad;
	
	public Persona() {
		nombre = new String("");
		direccion = new String("");
		ciudad = new String("");
	}
	
	public void leer() {
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese un nombre: ");
		nombre = s.nextLine();
		System.out.print("Ingrese una direccion: ");
		direccion = s.nextLine();
		System.out.print("Ingrese una ciudad: ");
		ciudad = s.nextLine();
	}
		
	public void mostrar() {
		System.out.println(nombre);
		System.out.println(direccion);
		System.out.println(ciudad);
	}
}
