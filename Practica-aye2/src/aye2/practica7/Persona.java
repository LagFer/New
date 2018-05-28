package aye2.practica7;
import java.util.Date;
import java.util.Optional;

public abstract class Persona {
	protected String nombre;	//inicializa en null
	protected int dni;	//inicializa en 0
	protected Date fechaNacimiento;
	protected Persona pareja;
	protected Optional<Persona> pareja2; //Maybe(Persona)
	
	public Persona() {
		nombre = new String("");
		fechaNacimiento = new Date();
		pareja2 = Optional.empty();
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Persona getPareja() {
		return pareja;
	}
	/** Similar a getPareja
	public boolean getPareja(Persona p) {
		if (tienePareja()) {
			//p.clone(pareja);
			p = pareja2.get();
			return true;
		}else {
			return false;
		}
	}
	**/
	
	/** no se puede instanciar persona por ser abstract
	public Persona clone(Persona p) {
		Persona p2 = new Persona();
		p.dni = dni;
		p.nombre = nombre;
		return p2;
	}
	 **/
	
	public void setPareja(Persona pareja) {
		this.pareja = pareja;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean tienePareja() {
		return pareja != null;
	}
	
	/**
	public boolean tienePareja() {
		return pareja2.isPresent();
	}
	**/
	
	public abstract int getIngreso();
}
