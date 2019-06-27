package Parcial2;

public class Medico {
	private String nombre;
	private int Matricula;
	private int id;
	private static int ultimoId = 0;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMatricula() {
		return Matricula;
	}
	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	public int getId() {
		return id;
	}
	
	public Medico() {
		this.nombre = "";
		this.Matricula = 0;
		this.id = ultimoId + 1;
		ultimoId++;
	}
	
	public Medico(String n, int m) {
		this();
		this.setNombre(n);
		this.setMatricula(m);
	}
	
	public Receta crearReceta(Paciente p) {
		Receta r = new Receta(this.getNombre(), p.getId());
		return r;
	}
	
	public void recetarEstImagenRX(Receta r, String p) {
		EstudioImagenRX e = new EstudioImagenRX(p, 10);
		r.agregarEstudio(e);
	}
	
	public void recetarEstImagen(Receta r) {
		EstudioImagen e = new EstudioImagen(11);
		r.agregarEstudio(e);
	}
	
	public void recetarHepatograma(Receta r) {
		EstudioLaboratorio e = new Hepatograma();
		r.agregarEstudio(e);
	}
	
	public void recetarPaciente(Paciente p, Receta r) throws RecetaPacienteDistintosException{
		if(p.getId() == r.getIdPaciente()) {
			p.agregarRecetas(r);
		}else {
			throw new RecetaPacienteDistintosException();
		}
	}
}
