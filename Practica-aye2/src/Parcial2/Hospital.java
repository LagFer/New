package Parcial2;

import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Medico> medicos;
	private ArrayList<Paciente> pacientes;
	private ArrayList<Receta> recetas;
	
	public Hospital() {
		this.medicos = new ArrayList<Medico>();
		this.pacientes = new ArrayList<Paciente>();
		this.recetas = new ArrayList<Receta>();
	}
	
	public void incorporarMedico(Medico m) throws MedicoRepetidoException{
		for (Medico med: this.medicos) {
			if(med.getMatricula() == m.getMatricula()) {
				throw new MedicoRepetidoException();
			}
		}
		medicos.add(m);
	}
	
	public void incorporarPaciente(Paciente p) throws PacienteRegistradoException{
		for (Paciente pac: this.pacientes) {
			if(pac.getDni() == p.getDni()) {
				throw new PacienteRegistradoException();
			}
		}
		pacientes.add(p);
	}
	
	public void incorporarReceta(Receta r) throws RecetaExistenteException{
		for(Receta rec: this.recetas) {
			if(rec.getId() == r.getId()) {
				throw new RecetaExistenteException();
			}
		}
		recetas.add(r);
	}
	
	public void realizarEstudios(Paciente p) throws RecetaProcesadaException, RecetaInexistenteException{
		boolean esta = false;
		for(Receta res: p.getRecetas()) {
			for(Receta r: recetas) {
				if(r.equals(res)) {
					esta = true;
					if(r.isProcesada()) {
						throw new RecetaProcesadaException();
					}
					System.out.println("Se realizan los siguientes estudios del paciente: " + p.getNombre() + " recetado por: " + r.getFirmaMedico());
					for(Estudio e: r.getEstudios()) {
						System.out.println(e.getNombre());
					}
				}
			}
		}
		if(esta == false) {
			throw new RecetaInexistenteException();
		}
	}

	public static void main(String[] args) {
		Hospital h = new Hospital();
		Medico m = new Medico("Juana", 1111);
		Medico m2 = new Medico("Pedro", 2222);
		Medico m3 = new Medico("Julia", 3333);
		Paciente p1 = new Paciente("Pablo", 11111111);
		Paciente p2 = new Paciente("Laura", 22222222);
		Paciente p3 = new Paciente("Oscar", 333333333);
		Receta r1 = m.crearReceta(p1);
		Receta r2 = m.crearReceta(p1);
		Receta r3 = m3.crearReceta(p2);
		Receta r4 = m2.crearReceta(p3);
		Receta r5 = m3.crearReceta(p3);
		m.recetarEstImagenRX(r1,"Columna");
		m.recetarEstImagenRX(r2, "Tórax");
		m.recetarEstImagenRX(r3,"Abdomen");
		m.recetarEstImagenRX(r3,"Tórax");
		m2.recetarHepatograma(r4);
		m2.recetarEstImagenRX(r4, "Abdomen");
		m3.recetarEstImagenRX(r5, "Craneo");
		m3.recetarEstImagenRX(r5, "Tórax");
		m3.recetarEstImagenRX(r5, "Columna");
		try {
			h.incorporarMedico(m);
			h.incorporarMedico(m2);
			h.incorporarMedico(m3);
			h.incorporarPaciente(p1);
			h.incorporarPaciente(p2);
			h.incorporarPaciente(p3);
			for(Medico med: h.medicos) {
				System.out.println("Medico: " + med.getNombre());
			}
			for(Paciente pac: h.pacientes) {
				System.out.println("Paciente: " + pac.getNombre());
			}
		}catch(MedicoRepetidoException e) {
			System.out.println("El medico ya esta registrado");
		}catch(PacienteRegistradoException e) {
			System.out.println("El paciente ya está registrado");
		}
		
		try {
			m.recetarPaciente(p1,r1);
			h.incorporarReceta(r1);
			m.recetarPaciente(p1, r2);
			h.incorporarReceta(r2);
			m.recetarPaciente(p2, r3);
			h.incorporarReceta(r3);
			h.realizarEstudios(p1);
			h.realizarEstudios(p2);
			m2.recetarPaciente(p3, r4);
			h.incorporarReceta(r4);
			h.realizarEstudios(p3);
			m3.recetarPaciente(p3, r5);
			h.incorporarReceta(r5);
			h.realizarEstudios(p3);
		}catch(RecetaProcesadaException e) {
			System.out.println("La receta estaba procesada");
		}catch(RecetaInexistenteException e) {
			System.out.println("La receta no existe");
		}catch(RecetaExistenteException e) {
			System.out.println("La receta ya existe en el sistema");
		}catch(RecetaPacienteDistintosException e) {
			System.out.println("No coinciden la receta con el paciente");
		}
	}

}
