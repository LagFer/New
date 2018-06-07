package aye2.practica9.exceptions;

public class MiappException extends Exception{

	public MiappException(String msg, Throwable e) {
		super("MiappException: " + msg,e);
	}
}
