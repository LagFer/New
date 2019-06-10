package aye2.practica7.Empresa;

public class Empleado {
	private String nombre;
	private String apellido;
	private int numEmp;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String ape) {
		this.apellido = ape;
	}
	
	public int getNumEmpleado() {
		return this.numEmp;
	}
	
	public void setNumEmpleado(int num) {
		this.numEmp = num;
	}
	
	public Empleado(String nom, String ape, int num) {
		setNombre(nom);
		setApellido(ape);
		setNumEmpleado(num);
	}
}
