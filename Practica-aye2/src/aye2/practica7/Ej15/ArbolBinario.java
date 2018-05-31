package aye2.practica7.Ej15;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinario<T extends Comparable<T>> implements Comparable<ArbolBinario<T>> { //Extiende Comparable<T> para poder comparar nodos
	
	private T raiz;
	private ArbolBinario<T> si;
	private ArbolBinario<T> sd;
	int alturaArbol;
	private static List<Object> lista;
	
	public ArbolBinario(T dato) {
		raiz = dato;
	}

	public T getRaiz() {
		return raiz;
	}

	public void setRaiz(T raiz) {
		this.raiz = raiz;
	}

	public ArbolBinario<T> getSi() {
		return si;
	}

	public void setSi(ArbolBinario<T> si) {
		this.si = si;
	}

	public ArbolBinario<T> getSd() {
		return sd;
	}

	public void setSd(ArbolBinario<T> sd) {
		this.sd = sd;
	}

	public void insertar(T dato) {
		int comparacion = raiz.compareTo(dato);
		
		if (comparacion > 0) {
			//caso base
			if (si == null) {
				si = new ArbolBinario<T>(dato);
			}else {
				//caso recursivo
				si.insertar(dato);
			}
		}else {
			if (comparacion < 0) {
				//caso base
				if (sd == null) {
					sd = new ArbolBinario<T>(dato);
				}else {
					sd.insertar(dato);
				}
			}
		}
	}
	
	public boolean esHoja() {
		return si==null && sd==null;
	}
	
	public int altura() {
		//caso base
		if (esHoja()) {
			return 1;
		}else {
				int alturaI = 0;
				int alturaD = 0;
				if (si != null) {
					alturaI = si.altura();
				}
				if (sd != null) {
					alturaD = sd.altura();
				}
			return 1+Math.max(alturaI, alturaD);
		}
	}
	
	public List<Object> inOrder(){
		lista = new ArrayList<Object>();
		inOrder2();
		return lista;
	}
	
	public void inOrder2(){
		if (si != null) {
			si.inOrder2();
		}
		
		lista.add(getRaiz());
		
		if (sd != null) {
			sd.inOrder2();
		}
	}
	
	public void mostrarInOrder() {
		if(si != null) {
			si.mostrarInOrder();
		}
		System.out.println(getRaiz());
		
		if(sd != null) {
			sd.mostrarInOrder();
		}
	}

	@Override
	public int compareTo(ArbolBinario<T> o) {
		return raiz.compareTo(o.getRaiz());
	}
	
	public static void main(String args[]) {
		ArbolBinario<Integer> arbol = new ArbolBinario<>(10);
		arbol.insertar(4);
		arbol.insertar(8);
		arbol.insertar(15);
		arbol.insertar(11);
		arbol.insertar(1);
		arbol.insertar(3);
		arbol.insertar(9);
		arbol.insertar(10);
		
		List<Object> lista = arbol.inOrder();
		
		System.out.println("Listado InOrder: ");
		for(Object x: lista) {
			System.out.println((Integer) x);
		}
		
		System.out.println("Altura: " + arbol.altura());
	}
}
