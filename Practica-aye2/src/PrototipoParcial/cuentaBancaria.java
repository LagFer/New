package PrototipoParcial;

public class cuentaBancaria extends Bien implements iTransferible{

	public cuentaBancaria(titular titular) {
		super(titular);
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
}
