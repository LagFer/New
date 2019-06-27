package Parcial2;

public class EstudioImagenRX extends EstudioImagen {
	private String parteCuerpo;
	
	public String getParteCuerpo() {
		return this.parteCuerpo;
	}
	
	public void setParteCuerpo(String p) {
		this.parteCuerpo = p;
	}
	
	public EstudioImagenRX(String parte,int t) {
		super(t);
		this.setNombre("Imagen RX " + parte);
		this.setParteCuerpo(parte);
		this.setRealizado(false);
	}
}
