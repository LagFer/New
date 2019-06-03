package aye2.practica6.CuentaCorriente;

public class CuentaCorriente {
	private double saldo;
	private int operaciones;
	private int operacionesInvalidas = 0;
	private static int cuentasInstanciadas;
	
	public CuentaCorriente() {
		saldo = 0;
		operaciones = 0;
		operacionesInvalidas = 0;
		cuentasInstanciadas++;
	}
	
	public void setCuentasInstanciadas(int n) {
		cuentasInstanciadas = n;
	}
	
	public int getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(int operaciones) {
		this.operaciones = operaciones;
	}

	public int getOperacionesInvalidas() {
		return operacionesInvalidas;
	}

	public void setOperacionesInvalidas(int operacionesInvalidas) {
		this.operacionesInvalidas = operacionesInvalidas;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double d) {
		saldo += d; //saldo = saldo + d;
		operaciones += 1;
	}
	
	public void extracciones() {
		
	}
	
	public void cantidadExtraccionesInvalidas() {
		
	}
}
