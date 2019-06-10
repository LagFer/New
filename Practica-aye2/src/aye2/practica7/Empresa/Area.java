package aye2.practica7.Empresa;

import java.util.ArrayList;

public class Area {
	private ArrayList<Empleado> empleados;
	
	public Area() {
		empleados = new ArrayList<Empleado>();
	}
	
	public void añadirEmp(Empleado e) {
		empleados.add(e);
	}
	
	public void tomarEmpleado(Empleado e) {
		for (int i = 0; i< empleados.size(); i++) { 
			e = empleados.get(i);
		}
	}
}
