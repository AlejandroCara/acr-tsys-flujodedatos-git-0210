package Ej6;

import java.util.Scanner;

public class Ej6App {

	public static void main(String[] args) {

		//Declaradción de constantes
		final double IVA = 0.21;
		
		//Declaración de variables
		Scanner teclado = new Scanner(System.in);
		String valorIntroducido = "";
		double precioIntroducido = 0;
		boolean valorValido = false;
		
		//Bloque iterativo para asegurar que se introduce algún valor y que este sea válido
		do {
			System.out.print("Introduce el precio del producto: ");
			valorIntroducido = teclado.nextLine();
			
			//Probar a parsear el valor introducido, si no se puede indicar que es un valor no válido y controlar el error
			try {
				precioIntroducido = Double.parseDouble(valorIntroducido);
				valorValido = true;
			} catch (Exception e) {
				System.out.print("\nValor no válido\n");
			}
		} while(!valorValido);
		
		//Calcular y mostrar el precio con iva
		System.out.println("El precio con iva es " + (precioIntroducido + (precioIntroducido * IVA)));
	}

}
