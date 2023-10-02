package Ej13;

import java.util.Scanner;

public class Ej13App {

	public static void main(String[] args) {
		
		//Declaración de variables
		Scanner teclado = new Scanner(System.in);
		String valorIntroducido = "";
		boolean valorValido = false;
		int numOperador = 1;
		int operador1 = 0;
		int operador2 = 0;
		
		for(int i = 0; i < 2; i++) {
			//Bloque iterativo para asegurar que se introduce algún valor y que este sea válido
			do {

				System.out.print("Introduce el operador "+numOperador+": ");
				valorIntroducido = teclado.nextLine();
				
				//Probar a parsear el valor introducido, si no se puede indicar que es un valor no válido y controlar el error
				try {
					//Asignar el valor introducido a uno u otro operador
					if(numOperador == 1) {
						operador1 = Integer.parseInt(valorIntroducido);
					} else {
						operador2 = Integer.parseInt(valorIntroducido);
					}
					valorValido = true;
				} catch (Exception e) {
					System.out.print("\nValor no válido\n");
				}
			} while(!valorValido);
			
			//Incrementar el contador para mostrar y asignar operador
			numOperador++;
			
			//Reinicializar la puerta del bucle
			valorValido = false;
		}
		
		//Bloque iterativo para asegurar que se introduce algún operador válido
		do {

			System.out.print("Introduce el operador: ");
			valorIntroducido = teclado.nextLine();
			
			//Si el operador es uno de los válidos hacer y mostrar el calculo, si no mostrar mensaje de error
			switch (valorIntroducido) {
			case "+":
				System.out.println("El resultado es: " + (operador1 + operador2));
				valorValido = true;
				break;
			case "-":
				System.out.println("El resultado es: " + (operador1 - operador2));
				valorValido = true;
				break;
			case "*":
				System.out.println("El resultado es: " + (operador1 * operador2));
				valorValido = true;
				break;
			case "/":
				System.out.println("El resultado es: " + (operador1 / operador2));
				valorValido = true;
				break;
			case "^":
				System.out.println("El resultado es: " + Math.pow(operador1, operador2));
				valorValido = true;
				break;
			case "%":
				System.out.println("El resultado es: " + (operador1 % operador2));
				valorValido = true;
				break;
			default:
				System.out.println("\nOperador no válido");
				break;
			}
			
		} while(!valorValido);
		
		//Cerrar el scanner
		teclado.close();
	}
	
}
