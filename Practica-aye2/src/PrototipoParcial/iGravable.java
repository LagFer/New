package PrototipoParcial;

public interface iGravable {

	void setAlicuota(float alicuota) throws alicuotaInvalidaException;
	
	float getAlicuota();
	
	float calcularImpuesto();
}
