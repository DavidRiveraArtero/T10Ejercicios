package Ej3;


import ExceptionCustomizada.Excepcion_Ej3;

public class Ejercicio3 {
	public static void main(String[] args) throws Excepcion_Ej3 {
		int Aleatorio=GenerarNum ();
		Par(Aleatorio);
		
		
	}
	
	public static int GenerarNum () {
		int num1=1;
		int num2=500;
		int Aleatorio=(int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
		
		return Aleatorio;	
	}
	
	public static void Par(int aleatorio) throws Excepcion_Ej3 {
		String es="";
		try {
			System.out.println("Generando numero Aleatorio...");
			
			if (aleatorio % 2 == 0) {
				es="par";
				throw new Excepcion_Ej3(es);
					
			}else {
				es="inpar";
				throw new Excepcion_Ej3(es);
			}
		}catch(Exception e) {
			
			System.out.println("El numero Aleatorio es:" + aleatorio + "\n" + e.getMessage());
		}
		
	}
}
