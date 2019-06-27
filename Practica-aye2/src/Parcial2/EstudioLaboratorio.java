package Parcial2;

public abstract class EstudioLaboratorio extends Estudio {
	private int cantItems;
	
	public void setItems(int i) {
		this.cantItems = i;
	}
	
	public int getItems() {
		return this.cantItems;
	}
	
}
