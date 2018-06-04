package aye2.practica9.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pruebaExcepciones {

	private static final int SIZE_ARREGLO = 10;
	private static Integer[] arregloInt;
	
	public static void ingresarDatoArray(int indice) {
		try {
			arregloInt[indice] = 15;
		} catch (ArrayIndexOutOfBoundsException e) { //si el error "e" es de el tipo arrayindex... se hara lo sig.
			System.out.println("El indice está fuera de rango");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			for (StackTraceElement elemento: e.getStackTrace()) {
				System.out.println("Archivo: " + elemento.getFileName());
				System.out.println("Linea de error: " + elemento.getLineNumber());
				System.out.println("Clase: " + elemento.getClassName());
			}
		}
	}
	
	public static void ingresarDatoArray2(int indice) throws MiappException{
		
		try {
			arregloInt[indice] = 15;
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new MiappException("Nueva excepcion por indice fuera de rango", e);
		}
	}
	
	public static int leerIndice() {
		
		Scanner teclado = new Scanner(System.in);
		
		int indice = 0;
		boolean ingresoOK = false;
		while (!ingresoOK) {
			try {
				System.out.print("Ingrese el indice: ");
				indice = teclado.nextInt();
				ingresoOK = true;
			} catch (InputMismatchException e) {
				System.out.println("Error en ingreso numerico. Intente nuevamente");
				teclado.next();
			} /*finally {
				teclado.close();
			}*/
		}
		teclado.close();
		return indice;
	}
	
	public static int leerIndice2() throws InputMismatchException, MiappException {
		System.out.println("Ingrese el indice ");
		return tecladoMain.nextInt();
	}
	
	public static void main(String[] args) {
		tecladoMain = new Scanner(System.in);
		int indice = leerIndice();
		arregloInt = new Integer[SIZE_ARREGLO];
		//ingresarDatoArray(indice);
		try {
			ingresarDatoArray2(indice);
		} catch (MiappException e) {
			System.out.println(e);
		}
		System.out.println("Termina OK");
	}
}
