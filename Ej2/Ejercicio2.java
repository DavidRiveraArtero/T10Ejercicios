package Ej2;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import ExceptionCustomizada.Excepcion_Ej2;
public class Ejercicio2 {
	public static void main(String[] args) throws Excepcion_Ej2 {

		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new Excepcion_Ej2();
		}catch(Exception e){
			System.out.println("Excepcion capturada con mensaje:" + e.getMessage());
			System.out.println("Programa terminado");
			
		}
		
	}
	
				
}
