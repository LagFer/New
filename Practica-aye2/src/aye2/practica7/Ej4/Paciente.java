package aye2.practica7.Ej4;

import java.util.Date;

public class Paciente extends Persona{
	private int codigoDiagnostico;
	private String telefono;
	private Date fechaNacimiento;
	
	public Paciente() {
		super();
		codigoDiagnostico = 0;
		telefono = new String("");
		fechaNacimiento = new Date();
	}
	
	public void mostrar() {
		System.out.println(codigoDiagnostico);
		System.out.println(telefono);
		System.out.println(fechaNacimiento);
	}
}
