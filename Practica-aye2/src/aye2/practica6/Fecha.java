package aye2.practica6;

public class Fecha {

	int dia, mes, anio;
	
	public Fecha() {
		
		dia = 1;
		mes = 1;
		anio = 2018;
		
	}
	
	public Fecha(int a, int b, int c) {
		
		if ((a < 32 && (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12)) || (a < 31 && (b == 4 || b == 6 || b == 9 || b == 11)) || (a < 29 && b == 2 && !esBisiesto(c)) || (a < 30 && b == 2 && esBisiesto(c))){
			dia = a;
			mes = b;
			anio = c;
		}else {
			System.out.println("Error en fecha ingresada");
		}
	}
	
	private boolean esBisiesto(int a) {
		return ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0);
	}
	
	public boolean esMayor(Fecha a, Fecha b) {
		
		if ((a.anio < b.anio) || (a.anio == b.anio && a.mes < b.mes) || (a.anio == b.anio && a.mes == b.mes && (a.dia < b.dia || a.dia == b.dia))) {
			return false;
		}else {
			return true;
		}
	}
	
	public String toString() {
		
		return "Fecha " + String.format("%02d", dia) + "/" + mes + "/" + String.format("%04d", anio);
	}
}
