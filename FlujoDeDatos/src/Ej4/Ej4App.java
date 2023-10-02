package Ej4;

import javax.swing.JOptionPane;

public class Ej4App {

	public static void main(String[] args) {
		
		//Declaración de variable
		String valorIntroducido = null;
		
		//Bloque interativo para comprobar que se introduce algún valor
		do {
			valorIntroducido = JOptionPane.showInputDialog("Introduce el radio");
		} while(valorIntroducido.length() < 1);
		
		//Parsear el valor introducido a double
		double radio = Double.parseDouble(valorIntroducido);
		
		//Calcular el area y mostrar el restulado
		JOptionPane.showMessageDialog(null, "El area del circulo es " + Math.PI * Math.pow(radio, 2));
		
	}

}
