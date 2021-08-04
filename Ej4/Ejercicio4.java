package Ej4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		boolean salir = false;
		while (salir == false) {
			try {
				String eleccion = "Elija una accion:\n1 - Sumar\n2 - Restar\n3 - Multiplicar\n4 - Potencia\n5 - Raiz Cuadrada \n6 - Division \n7 - Raiz Cubica\n0 - Salir";
				Integer menu=Integer.parseInt(JOptionPane.showInputDialog(eleccion));
				
				if (menu == 0) {
					salir = true;
				}else if (menu == 1){
					int SeRepite =Pasar_La_Cantidad_De_Veces();
					sumar(SeRepite);
				}else if(menu == 2) {
					int SeRepite =Pasar_La_Cantidad_De_Veces();
					resta(SeRepite);
				}else if (menu == 3) {
					int SeRepite =Pasar_La_Cantidad_De_Veces();
					multipli(SeRepite);
				}else if (menu == 4) {
					potencia();
				}else if (menu == 5) {
					RaizCuadrada();
				}else if (menu == 6) {
					int SeRepite =Pasar_La_Cantidad_De_Veces();
					Division(SeRepite);
				}else if (menu==7) {
					Raiz_Cubica();
				}
				
			}catch(Exception e) {
				JOptionPane.showInternalMessageDialog(null, "Error solo necesito numeros");
			}
			
		}

	}
	
	public static void sumar(int SeRepite) {
		
		
		int sum = 0;
		for (int i = 0; i<SeRepite;i++) {
			try {
				String operacionS = JOptionPane.showInputDialog("Dame los numero para poder hacer la suma");
				int OperacionS = Integer.parseInt(operacionS);
				sum += OperacionS;
			}catch(Exception e) {
				JOptionPane.showInternalMessageDialog(null, "Error solo necesito numeros");
			}
			
		}
		JOptionPane.showInternalMessageDialog(null, "La suma de todos los valores es: "+ sum);
		
	}
	
	public static void resta(int SeRepite) {
		
		int resta = 0;
		
		for (int x=0; x < SeRepite; x++ ) {
			try {
				String restaN = JOptionPane.showInputDialog("Dame los numeros para poder hacer la operacion");
				int restaO = Integer.parseInt(restaN);
				resta = restaO - resta;
			}catch(Exception e) {
				JOptionPane.showInternalMessageDialog(null, "Error solo necesito numeros");
			}
			
		}
		
		JOptionPane.showInternalMessageDialog(null, "La resta de todos los valores es: "+ resta);
		
	}
	
	public static void multipli(int SeRepite) {
		
		int multi=1;
		for (int z = 0; z<SeRepite; z++) {
			try {
				String MultiO = JOptionPane.showInputDialog("Cuantos numeros tendra tu operacion?");
				int multiO = Integer.parseInt(MultiO);
				multi = multi*multiO;
			}catch(Exception e) {
				JOptionPane.showInternalMessageDialog(null, "Error solo necesito numeros");
			}
			
		}
		JOptionPane.showInternalMessageDialog(null, "La multi de todos los valores es: "+ multi);
	}
	
	public static void potencia() {
		double Potencia = 0;
		try {
			String DameLaBase = JOptionPane.showInputDialog("Dame la base para calcular la potencia");
			int a = Integer.parseInt(DameLaBase);
			String DameElExponente = JOptionPane.showInputDialog("Dame el exponente para calcular la potencia");
			int b = Integer.parseInt(DameElExponente);
			Potencia = Math.pow(a,b);
		}catch(Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Error solo necesito numeros");
		}
		
		JOptionPane.showInternalMessageDialog(null, "La potencia es: "+ Potencia);
	}
	
	public static void RaizCuadrada() {
		try {
			String num = JOptionPane.showInputDialog("Dame le numero para poder hacer la raiz cuadrada");
			int Numero = Integer.parseInt(num);
			double result = Math.sqrt(Numero);
			JOptionPane.showInternalMessageDialog(null, "La raiz cuadrada de "+ Numero +" es: "+ result);
			
		}catch(Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Error solo necesito numeros");
		}
		
	}
	
	public static void Division(int SeRepite) {
		try {
			String numPrin = JOptionPane.showInputDialog("Dame le numero para poder hacer la division");
			int NumeroP = Integer.parseInt(numPrin);
			double result = NumeroP;
			for(int i = 0; i < SeRepite;i++) {
				try {
					String num = JOptionPane.showInputDialog("Dame le numero para poder hacer la division");
					int Numero = Integer.parseInt(num);
					try {
						result = result/Numero;
					}catch(Exception e) {
						JOptionPane.showInternalMessageDialog(null, "No se puede dividir un numero entre 0");
					}
					
				}catch(Exception e) {
					JOptionPane.showInternalMessageDialog(null, "Solo numeros");
				}
				
				
			}
			JOptionPane.showInternalMessageDialog(null, "El resultado de la division es: "+result);		
		} catch(Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Error solo necesito numeros");
		}
		
	}
	
	public static void Raiz_Cubica() {
		try {
			String num = JOptionPane.showInputDialog("Dame le numero para poder hacer la raiz cuadrada");
			int Numero = Integer.parseInt(num);
			double result = Math.cbrt(Numero);
			JOptionPane.showInternalMessageDialog(null, "La raiz cubica de "+ Numero +" es: "+ result);
			
		}catch(Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Error solo necesito numeros");
		}
		
	}
	
	public static int Pasar_La_Cantidad_De_Veces() {
		//LE PEDIMOS AL USUARIO QUE NOS DIGA CUANTOS NUMEROS TENDRA SU OPERACION
		int SeRepite=0;
		try {
			String vecesO = JOptionPane.showInputDialog("Cuantos numeros tendra tu operacion. Si es una division sera un numero menos?");
			int VecesO = Integer.parseInt(vecesO);
			SeRepite=VecesO;
		}catch(Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Error ese parametro no me sirve");
		}
		return SeRepite; 
	}

}
