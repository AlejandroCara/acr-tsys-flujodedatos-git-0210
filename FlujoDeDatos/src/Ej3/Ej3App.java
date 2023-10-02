package Ej3;

import javax.swing.JOptionPane;

public class Ej3App {

	public static void main(String[] args) {

		//Declaración de variables y recogida del valor escrito en el input del joptionpane
		String nombre = null;
		
		//Bloque iterativo para controlar que se introduce algún valor
		do {
			nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		} while(nombre.length() < 1);
		
		//Usar joptionpane para mostrar el mensaje concatenado con el valor recogido previamente
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
	}

}
