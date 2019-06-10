package aye2.practica7.Empresa;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Area> areas;
	
	public Empresa() {
		areas = new ArrayList<Area>();
	}
	
	public Area obtenerArea(int n) {
		return areas.get(n);
	}
	
	public void nuevaArea(Area a) {
		areas.add(a);
	}

	public static void main(String[] args) {
		Empresa emp;
		Empleado e = new Empleado("Roberto", "Diaz", 1);
		Area a = new Area();
		a.añadirEmp(e);
		emp = new Empresa();
		emp.nuevaArea(a);
		
		for (int i=0; i < emp.areas.size(); i++) {
			a = emp.obtenerArea(i);
			a.tomarEmpleado(e);
			System.out.println(e.getNombre());
		}
	}
}
