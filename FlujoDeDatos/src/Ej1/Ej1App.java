package Ej1;

public class Ej1App {

	public static void main(String[] args) {
		
		//Declaración de variables
		int num1 = 15;
		int num2 = 15;
		
		//Bloque condicional para ver que numero es mayor o si son iguales
		if(num1 > num2) {
			System.out.println("El num1 es mayor que el num2");
		} else if (num2 > num1) {
			System.out.println("El num2 es mayor que el num1");
		} else {
			System.out.println("Ambos valores son iguales");
		}
	}

}
