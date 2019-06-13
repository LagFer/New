package aye2.practica9.exceptions.Matricula;

/**
 * Implemente una clase MatriculaAuto (matr�cula de autom�vil) que va a estar
formada por dos atributos letra y n�mero. En el m�todo main se deber�n crear
objetos matr�culas, a partir de sus componentes. La matr�cula se considerar�
valida si la letra introducida es igual a la letra �A� o �B�, y si el n�mero tiene
ocho d�gitos. Si la matr�cula fuera correcta se crear� un objeto matr�cula y se
mostrar�n por pantalla los valores de sus atributos. En caso de que la letra sea
incorrecta o el n�mero de matr�cula no tuviera ocho d�gitos, se lanzar� una
excepci�n. El m�todo llamador deber� mostrar un mensaje ante la excepci�n
recibida indicando que la letra es err�nea o el formato es err�neo, dependiendo
de la situaci�n ocurrida.

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
