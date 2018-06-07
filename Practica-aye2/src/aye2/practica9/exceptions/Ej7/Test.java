package aye2.practica9.exceptions.Ej7;

public class Test {
		 public static void main(String[] args) {
			 System.out.println("Test3");
		 try {
			 System.out.println("Primer try");
			 try {
				 throw new Ex();
			 } finally {
				 System.out.println("Finally del Segundo try");
			 }
		 }
		 catch(Ex e) {
			 System.out.println("Se capturó la Excepción Ex del Primer try");
		 } finally {
			 System.out.println("Finally del Primer try");
		 }
	 }
}
