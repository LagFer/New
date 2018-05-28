package aye2.practica7;

public class pruebaPractica7 {
	public static void main(String[] args) {
		Publicacion lib1 = new Libro();
		lib1.setPrecio(100);
		lib1.setTitulo("Libro");
		Publicacion dis1 = new Disco();
		dis1.setPrecio(120);
		dis1.setTitulo("Disco");
		System.out.println(lib1.getPrecio());
		System.out.println(lib1.getTitulo());
		System.out.println(dis1.getPrecio());
		System.out.println(dis1.getTitulo());
	}
}
