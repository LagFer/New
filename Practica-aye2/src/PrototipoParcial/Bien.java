package PrototipoParcial;

public abstract class Bien{
	
	protected titular titular;
	protected float valorMercado;
	protected float valorFiscal;
	protected int codigo;
	protected static int proximoCodigo = 0;
	
	public Bien() {
		codigo = proximoCodigo;
		proximoCodigo++;
	}
	
	public Bien(titular titular) {
		this();
		this.titular = titular;
	}
	
	public void setValorMercado(float valor) throws valorMercadoInvalidoException{
		if (valor < 0) {
			throw new valorMercadoInvalidoException();
		}
		valorMercado = valor;
	}
	
	public void setValorFiscal(float valor) throws valorFiscalInvalidoException{
		if (valor < 0) {
			throw new valorFiscalInvalidoException();
		}
		valorFiscal = valor;
	}
	
	public float getValorMercado() {
		return valorMercado;
	}
	
	public float getValorFiscal() {
		return valorFiscal;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public Object getTitular() {
		return titular;
	}
	
	public void asignarTitular(titular titular) {
		this.titular = titular;
	}
	
	public boolean equals(Bien bien2) {
		return (codigo == bien2.getCodigo());
	}
	
}
