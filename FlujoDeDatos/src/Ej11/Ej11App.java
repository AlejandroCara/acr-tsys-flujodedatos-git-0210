package Ej11;

import java.util.Scanner;

public class Ej11App {

	public static void main(String[] args) {
		
		//Declaración de variables
		Scanner teclado = new Scanner(System.in);
		String valorIntroducido = "";
		boolean valorValido = false;
		
		//Bloque iterativo para asegurar que se introduce algún valor y que este sea válido
		do {
			System.out.print("Introduce el precio del producto: ");
			valorIntroducido = teclado.nextLine();
			
			switch (valorIntroducido.toLowerCase()) {
			case "lunes":
				System.out.println("Lunes es dia laboral");
				valorValido = true;
				break;
			case "martes":
				System.out.println("Martes es dia laboral");
				valorValido = true;
				break;
			case "miercoles":
				System.out.println("Miércoles es dia laboral");
				valorValido = true;
			case "miércoles":
				System.out.println("Miércoles es dia laboral");
				valorValido = true;
				break;
			case "jueves":
				System.out.println("Jueves es dia laboral");
				valorValido = true;
				break;
			case "viernes":
				System.out.println("viernes es dia laboral");
				valorValido = true;
				break;
			case "sabado":
				System.out.println("Sábado es dia laboral");
				valorValido = true;
			case "sábado":
				System.out.println("Sábado es dia laboral");
				valorValido = true;
				break;
			case "domingo":
				System.out.println("Domingo es dia laboral");
				valorValido = true;
				break;
			default:
				System.out.println("Eso no es un día de la semana");
				break;
			}
			
		} while(!valorValido);
		
		//Cerrar el scanner
		teclado.close();
	}

}
