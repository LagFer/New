package aye2.practica9.exceptions.Matricula2019;

public class MatriculaAuto {
	private int numero;
	private char letra;
	
	public int getNumero() {
		return this.numero;
	}
	
	public char getLetra() {
		return this.letra;
	}
	
	public MatriculaAuto() {
		numero = 0;
		letra = ' ';
	}
	
	public void setMatricula(char let, int num) {
		try {
			if(let != 'A' && let != 'B') {
				throw new LetraInvalidaException();
			}else {
				this.letra = let;
			}
			if(num < 10000000 || num > 99999999) {
				throw new NumeroInvalidoException();
			}else {
				this.numero = num;
			}
		}catch(LetraInvalidaException e) {
			System.out.println("La letra no es valida");
		}catch(NumeroInvalidoException e1) {
			System.out.println("Numero invalido");
		}
	}
	
	public static void main(String[] args) {
		MatriculaAuto m = new MatriculaAuto();
		m.setMatricula('A', 185855855);
		System.out.println(m.getLetra());
		System.out.println(m.getNumero());
	}
}
