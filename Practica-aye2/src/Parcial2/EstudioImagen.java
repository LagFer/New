package Parcial2;

public class EstudioImagen extends Estudio {
	private int tamañoImg;
	
	public int getTamaño() {
		return this.tamañoImg;
	}
	
	public void setTamaño(int t) {
		this.tamañoImg = t;
	}
	
	public EstudioImagen() {
		this.setTamaño(0);
	}
	
	public EstudioImagen(int t) {
		this.setTamaño(t);
		this.setRealizado(false);
		this.setNombre("Imagen");
	}
}
