package PracticaParcial;

public class CuentaBanc extends Bien implements iTransferible {

	public void cambiarTitular(Titular tit) {
		this.setTitular(tit);
	}
}
