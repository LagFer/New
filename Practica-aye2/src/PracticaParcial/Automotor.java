package PracticaParcial;

public class Automotor extends Bien implements iGravable, iAsegurable, iTransferible {
	
	public void cambiarTitular(Titular tit) throws TransferenciaInvalidaException{
		if(this.getTitular() == tit) {
			throw new TransferenciaInvalidaException();
		}
		this.setTitular(tit);
	}

}
