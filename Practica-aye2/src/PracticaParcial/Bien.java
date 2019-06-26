package PracticaParcial;

public abstract class Bien {
	private Titular titular;
	private float valorMerc;
	private float valorFisc;
	private int id;
	
	public Titular getTitular() {
		return titular;
	}
	
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
	public float getValorMerc() {
		return valorMerc;
	}
	
	public void setValorMerc(float valorMerc) {
		this.valorMerc = valorMerc;
	}
	
	public float getValorFisc() {
		return valorFisc;
	}
	
	public void setValorFisc(float valorFisc) {
		this.valorFisc = valorFisc;
	}
	
	public void setId(int i) {
		this.id = i;
	}
	
	public int getId() {
		return id;
	}
	
}
