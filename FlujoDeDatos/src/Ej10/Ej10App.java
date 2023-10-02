package Ej10;

import java.util.Scanner;

public class Ej10App {

	public static void main(String[] args) {
		
		//Declaración de variables
		Scanner teclado = new Scanner(System.in);
		String valorIntroducido = "";
		int numVentas = 0;
		double precioVenta = 0;
		double precioTotal = 0;
		boolean valorValido = false;
		
		
		//Bloque iterativo para asegurar que se introduce algún valor y que este sea válido
		do {
			System.out.print("Introduce el precio del producto: ");
			valorIntroducido = teclado.nextLine();
			
			try {
				numVentas = Integer.parseInt(valorIntroducido);
				valorValido = true;
			} catch (Exception e) {
				System.out.print("\nValor no válido\n");
			}
		} while(!valorValido);
		
		//Cerrar el scanner
		teclado.close();
		
		for(int i = 0; i < numVentas; i++) {
			
			//Reiniciar el valor de la variable para utilizarlo a continuación
			valorValido = false;
			
			//Bloque iterativo para asegurar que se introduce algún valor y que este sea válido
			do {
				System.out.print("Introduce el precio de la venta: ");
				valorIntroducido = teclado.nextLine();
				
				//Probar a parsear el valor introducido, si no se puede indicar que es un valor no válido y controlar el error
				try {
					precioVenta = Double.parseDouble(valorIntroducido);
					precioTotal += precioVenta; //Acumular el valor introducido al total
					valorValido = true;
				} catch (Exception e) {
					System.out.print("\nValor no válido\n");
				}
			} while(!valorValido);
		}
		
		//Mostrar la suma total de ventas
		System.out.println("El precio total es " + precioTotal);
	}

}
