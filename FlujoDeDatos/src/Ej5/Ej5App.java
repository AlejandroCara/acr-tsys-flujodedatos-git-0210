package Ej5;

import java.util.Scanner;

public class Ej5App {

	public static void main(String[] args) {
		
		//Declaración de variables
		Scanner teclado = new Scanner(System.in);
		String valorIntroducido = "";
		int num = 0;
		boolean valorValido = false;
		
		//Bloque iterativo para controlar que se introduce algún valor y que este sea válido
		do{
			System.out.print("Introduce un numero entero: ");
			valorIntroducido = teclado.nextLine();
			
			//Capturar el error al intentar parsear para que no pete el programa
			try {
				num = Integer.parseInt(valorIntroducido);
				valorValido = true;
			} catch (Exception e) {
				System.out.println("\nValor introducido no valido\n");
			}
		} while(!valorValido);
		
		//Cerrar el scanner
		teclado.close();
		
		//Comprobar si el valor introducido es divisible o no entre 2 y mostrarlo
		if(num % 2 == 0) {
			System.out.println("El valor introducido es divisible entre 2");
		} else {
			System.out.println("El valor introducido no es divisible entre 2");
		}
	}

}
