package Farmacie;

public class IncompleteDataException extends Exception{
	private String msg;
	IncompleteDataException(String msg){
		super(msg);
		this.msg=msg;
	}
}
