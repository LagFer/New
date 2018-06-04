package aye2.practica9.exceptions;

public class MiappException extends Exception{

	public MiappException(String nsg, Throwable e) {
		super("MiappException" + nsg,e);
	}
}
