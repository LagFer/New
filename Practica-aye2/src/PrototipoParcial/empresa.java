package PrototipoParcial;

import java.util.List;
import java.util.ArrayList;


public class empresa {
	
	private String nombre;
	private List<Bien> bienes;
	private static empresa instancia = null;
	
	private empresa() {
		nombre = "Empresa Única";
		bienes = new ArrayList<>();
	}
	
	public static empresa getInstancia() {
		if (instancia == null) {
			instancia = new empresa();
		}
		return instancia;
	}
	
	public void agregarBien(Bien b) throws bienExistenteException{
		for(Bien x : bienes) {
			if(x.equals(b)) {
				throw new bienExistenteException();
			}
		}
		bienes.add(b);
	}
	
	public void quitarBien(Bien b) throws bienExistenteException{
		boolean encontrado = false;
		if(! bienes.remove(b)) {
			throw new bienExistenteException();
		}
	}
	
	public static void main(String[] args) {
		
	}

	public static void notificarTransferencia(titular titular, int codigo) throws emailNotSentException{
		
		System.out.println("Se envia un email a " + titular.getNombre() + " por la transferencia de");
	}
	
	public void mostrarBienes(titular titular) {
		for(Bien x : bienes) {
			if(x.getTitular().equals(titular)) {
				System.out.println(" - " + x);

			}
		}
	}
	
	public static void main(String[] args) {
		empresa empresa;
		empresa empresa2;
		
		empresa = empresa.getInstancia();
		empresa = empresa2.getInstancia();
		System.out.println(x);
		titular titular1 = new titular("Juan", "Perez");
		titular titular2 = new titular("Laura", "Lopez");
		
		automotor auto = new automotor();
		auto.asignarTitular(titular1);
		cuentaBancaria cuenta = new cuentaBancaria(titular2);
		
		try {
			auto.setAlicuota((float) 1.5);
			
			empresa.agregarBien(auto);
			empresa.agregarBien(cuenta);
			auto.transferir(titular1);
			auto.transferir(titular2);
			
			System.out.println("El impuesto del " + auto + " es: " + auto.calcularImpuesto());
		}catch (bienExistenteException e) {
			System.out.println("El bien ya existe");
		}catch (transferenciaInvalidaException e) {
			System.out.println("La transferencia fue invalida");
		}
		
		empresa.mostrarBienes(titular2);
	}
}
