package PrototipoParcial;

public class automotor extends Bien implements iAsegurable, iTransferible, iGravable{
	
	private float prima;
	private float alicuota;

	public void setAlicuota(float alicuota) throws alicuotaInvalidaException{
		
		if (alicuota <= 0) {
			throw new alicuotaInvalidaException();
		}
		this.alicuota = alicuota;
	}

	public float getAlicuota() {
		
		return alicuota;
	}

	public float calcularImpuesto() {
		
		return alicuota * valorFiscal;
	}

	public void transferir(PrototipoParcial.titular nuevoTitular) throws transferenciaInvalidaException{
		if (titular.equals(nuevoTitular)) {
			throw new transferenciaInvalidaException();
		}
		try {
			empresa.notificarTransferencia(titular, codigo);

		}catch(emailNotSentException e) {
			System.out.println("Email no enviado");
		}
		titular = nuevoTitular;
	}

	public void setPrima(float prima) throws primaInvalidaException{
		if (prima < 0 || prima > valorMercado) {
			throw new primaInvalidaException();
		}
		this.prima = prima;
	}

	public float getPrima() {
		
		return 0;
	}

	
}
