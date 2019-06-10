package aye2.Practica8;

import java.util.ArrayList;

public class PruebaPractica8 {
	public static void main(String arg[]) {
		//ArrayList<Medible> lista = new ArrayList<Medible>();
		//for(Medible l: lista) {
		//	System.out.println((Integer) l);
		Pila p = new Pila();
		int n = 10;
		p.apilar(n);
		System.out.println(p.desapilar());
		}
}
