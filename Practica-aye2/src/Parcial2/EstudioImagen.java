package Parcial2;

public class EstudioImagen extends Estudio {
	private int tama�oImg;
	
	public int getTama�o() {
		return this.tama�oImg;
	}
	
	public void setTama�o(int t) {
		this.tama�oImg = t;
	}
	
	public EstudioImagen() {
		this.setTama�o(0);
	}
	
	public EstudioImagen(int t) {
		this.setTama�o(t);
		this.setRealizado(false);
		this.setNombre("Imagen");
	}
}
