package Ej12;

import java.util.Scanner;

public class Ej12App {

	public static void main(String[] args) {

		//Declaración de variables
		Scanner teclado = new Scanner(System.in);
		String valorIntroducido = "";
		String password = "holakase";
		boolean passwordAcertada = false;
		int intentos = 3;
		
		//Bloque iterativo que pide que se introduzca la contraseña hasta quedarse sin intentos o que se acierte
		do {
			System.out.print("Introduce la contraseña (" + intentos + " intentos restantes): ");
			valorIntroducido = teclado.nextLine();
			
			if(valorIntroducido.equals(password)) {
				passwordAcertada = true;
			} else {
				intentos--;
			}
			
		} while(!passwordAcertada && intentos > 0);
		
		//Cerrar el scanner
		teclado.close();
		
		//Comprobar si ha salido del bucle por acertar la contraseña o por quedarse sin intentos
		if(passwordAcertada) {
			System.out.println("Enhorabuena has acertado la contraseña.");
		} else {
			System.out.println("Te has quedado sin intentos.");
		}
	}

}
