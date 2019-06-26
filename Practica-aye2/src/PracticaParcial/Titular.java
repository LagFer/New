package PracticaParcial;

public class Titular {
	private String nombre;
	private String apellido;
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String a) {
		this.apellido = a;
	}
	
	public Titular() {
		this.setApellido("");
		this.setNombre("");
	}
	
	public Titular(String a, String n) {
		this.setApellido(a);
		this.setNombre(n);
	}
}
