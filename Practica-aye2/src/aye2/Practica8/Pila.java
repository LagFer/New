package aye2.Practica8;

import java.util.List;;

public class Pila<A> implements iPila<A>{
	private List<A> pila;
	
	public void apilar(A n) {
		pila.add(n);
	}

	public Boolean pilaVacia() {
		return pila.isEmpty();
	}
	
	public A desapilar() {
			return pila.get(0);
	}
	
	public Pila() {
	}
}
