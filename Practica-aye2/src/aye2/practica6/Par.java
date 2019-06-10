package aye2.practica6;

public class Par<A,B> {
	private A x;
	private B y;
	
	public A getPrimero() {
		return x;
	}
	
	public B getSegundo() {
		return y;
	}
	
	public void setPrimero(A n) {
		x=n;
	}
	
	public void setSegundo(B n) {
		y=n;
	}
	
	public Par(A n1, B n2){
		this.setPrimero(n1);
		this.setSegundo(n2);
	}

	public static void main(String[] args) {
		Par p = new Par(0,1);
		System.out.println(p.getPrimero());
		System.out.println(p.getSegundo());
	}
}
