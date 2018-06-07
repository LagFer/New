package aye2.practica9.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class pruebaExcepciones {

	private static final int SIZE_ARREGLO = 10;
	private static Integer[] arregloInt;
	private static Scanner teclado; 
	
	public static void ingresarDatoArray(int indice) {
		try {
			arregloInt[indice] = 15;
		} catch (ArrayIndexOutOfBoundsException e) { //si el error "e" es de el tipo arrayindex... se hara lo sig.
			System.out.println("El indice está fuera de rango");
			System.out.println(" - Mensaje de la excepcion: " + e.getMessage());
			System.out.println(" - Clase de la excepcion: " + e.getClass());
			System.out.println(" - Detalles de la pila de ejecucion: ");
			for (int i=0; i<e.getStackTrace().length; i++) {
				System.out.println("	*Elemento de la pila: " + i);
				System.out.println("	- Clase: " + e.getStackTrace()[i].getClassName());
				System.out.println("	- Metodo: " + e.getStackTrace()[i].getMethodName());
				System.out.println("	- Archivo: " + e.getStackTrace()[i].getFileName());
				System.out.println("	- Linea de error: " + e.getStackTrace()[i].getLineNumber());
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
			} catch (NoSuchElementException e) {
				System.out.println("No se recibió ingreso. Intente nuevamente");
				teclado.next();
			}
		}
		return indice;
	}
	
	public static int leerIndice2() throws InputMismatchException, MiappException {
		System.out.println("Ingrese el indice ");
		return teclado.nextInt();
	}
	
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		arregloInt = new Integer[SIZE_ARREGLO];
		int indice = 0;
		indice = leerIndice();
		ingresarDatoArray(indice);
		try {
			indice = leerIndice2();
			ingresarDatoArray2(indice);
		} catch (MiappException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println("Error en ingreso numerico");
		} finally {
			teclado.close();
		}
		System.out.println("Termina OK");
		System.exit(0);
	}
}
