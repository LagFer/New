package aye2.practica9.exceptions.Ej6;

public class Test {
		 private boolean estado;
		 void on() {estado = true;}
		 void off() {estado = false;}
		 
		 public static void main(String[] args) {
		 Test switch = new Test();
		 try {
		 switch.on();
		 // alg�n c�digo
		 //switch.off();
		 } catch (NullPointerException e) {
		 System.out.println("Ocurri� un error de puntero");
		 //switch.off();
		 } catch (IllegalArgumentException e) {
		 System.out.println("Ocurri� un error de I/O");
		 //switch.off();
		 } finally {
			 switch.off();
		 }
		 }
}
