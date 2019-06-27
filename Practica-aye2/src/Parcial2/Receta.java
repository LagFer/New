package Parcial2;

import java.util.ArrayList;

public class Receta {
	private int id;
	private int idPaciente;
	private static int ultimoId = 0;
	private boolean procesada;
	private ArrayList<Estudio> estudios;
	private String firmaMedico;
	
	public int getId() {
		return this.id;
	}
	
	public boolean isProcesada() {
		return procesada;
	}
	public void setProcesada(boolean procesada) {
		this.procesada = procesada;
	}
	public ArrayList<Estudio> getEstudios() {
		return estudios;
	}
	public void setEstudios(ArrayList<Estudio> estudios) {
		this.estudios = estudios;
	}
	
	public String getFirmaMedico() {
		return firmaMedico;
	}
	
	public int getIdPaciente() {
		return idPaciente;
	}
	
	public Receta() {
		this.estudios = new ArrayList<Estudio>();
		this.id = ultimoId +1;
		ultimoId++;
		this.procesada = false;
	}
	
	public Receta(String firma, int idPac) {
		this();
		this.firmaMedico = firma;
		this.idPaciente = idPac;
	}
	
	public void agregarEstudio(Estudio e) {
		estudios.add(e);
	}
	
}
