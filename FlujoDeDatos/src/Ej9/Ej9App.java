package Ej9;

public class Ej9App {

	public static void main(String[] args) {
		
		/*Bloque iterativo que muestra los valores del 1 al 100 que
		  son divisibles entre 2 y 3 */
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
