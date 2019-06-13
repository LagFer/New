package aye2.practica9.exceptions.Matricula;

/**
 * Implemente una clase MatriculaAuto (matrícula de automóvil) que va a estar
formada por dos atributos letra y número. En el método main se deberán crear
objetos matrículas, a partir de sus componentes. La matrícula se considerará
valida si la letra introducida es igual a la letra ‘A’ o ‘B’, y si el número tiene
ocho dígitos. Si la matrícula fuera correcta se creará un objeto matrícula y se
mostrarán por pantalla los valores de sus atributos. En caso de que la letra sea
incorrecta o el número de matrícula no tuviera ocho dígitos, se lanzará una
excepción. El método llamador deberá mostrar un mensaje ante la excepción
recibida indicando que la letra es errónea o el formato es erróneo, dependiendo
de la situación ocurrida.

 * @author LagFer
 *
 */

public class MatriculaAuto {
	
	private char letra;
	private int numero;

	public MatriculaAuto(char letra, String digitos) throws MatriculaAutoException {
		if (letra != 'A' && letra != 'B') {
			throw new LetraInvalidaException("La letra (" + letra + ") es invalida");
			
			if (digitos.length() != 8) {
				throw new CantidadDigitosInvalida("La cantidad de digitos (" + digitos.length() + ") es invalida");
			}
			
			numero = Integer.parseInt(digitos);
			
			letra = letra;
		}
	}
	
	public String toString() {
		return "Matricula Auto: " + letra + "-" + numero;
	}
	
	public static void main(String[] args) {
		
		MatriculaAuto mat;
		
		try {
			mat = new MatriculaAuto('A', "12345678");
			System.out.println(mat);
		}catch(MatriculaAutoException e) {
			System.out.println("Error de instanciacion: " + e);
		}catch(NumberFormatException e) {
			System.out.println("Error en el formato del numero");
			System.out.println(e);
		}
		System.out.println("Termino OK");
	}
	
	public MatriculaAuto() {
		
	}
	
	public void setLetra(char letra) {
		try{
			if (letra != 'A' && letra != 'B') {
				throw new LetraInvalidaException("La letra (" + letra + ") es invalida");
			}
		}
	}

}
