package ExceptionCustomizada;

import java.util.Arrays;

public class Excepcion_Ej2 extends Exception{

	public Excepcion_Ej2() {}
	
	public Excepcion_Ej2(String Mensaje) {
		super(Mensaje);
		
	}
	
	public String getMessage() {
		return "Esto es un objeto Exception";	
	}
}