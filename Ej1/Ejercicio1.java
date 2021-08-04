package Ej1;
import javax.swing.JOptionPane;
public class Ejercicio1 {

	public static void main(String[] args) {
		int Aleatorio=GenerarNumAleatorio();
		AdivinarNumAleatorio(Aleatorio);

	}
	
	public static int GenerarNumAleatorio() {
		int num1=1;
		int num2=500;
		int Aleatorio=(int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
		return Aleatorio;
	}
	
	public static void AdivinarNumAleatorio(int Aleatorio) {
		int Intentos = 0;
				boolean salir = false;
		
		while (salir == false) {
			try {
				String Adivina= JOptionPane.showInputDialog("Intenta adivinar el numero entre 1 y 500");
				int Adivinar = Integer.parseInt(Adivina);
				
				if (Adivinar<Aleatorio) {
					JOptionPane.showMessageDialog(null, "El numero Aleatorio es más grande");
					Intentos+=1;
					//System.out.println(Aleatorio);
				}else if (Adivinar>Aleatorio) {
					JOptionPane.showMessageDialog(null, "El numero Aleatorio es más pequeño");
					Intentos+=1;
					//System.out.println(Aleatorio);
				}else {
					JOptionPane.showMessageDialog(null, "Correcto"+" lo has intentado "+Intentos+" veces");
					salir = true;
				}
			}catch(Exception e){
				
				JOptionPane.showMessageDialog(null, "Solo necesito numeros");
				Intentos+=1;
			}
			
		}
		
	}

}
