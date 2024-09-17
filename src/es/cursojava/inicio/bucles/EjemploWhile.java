package es.cursojava.inicio.bucles;

public class EjemploWhile {

	public static void main(String[] args) {
		
		// solo tiene una parte que contiene la condición que permite la ejecución
		// por lo que dentro del bucle siempre tiene que cambiar algo para que no sea infinito
		int numero = 3;
		
		while (7>numero) {
			System.out.println("Hola" + numero);
			numero++;
		}
		
		System.out.println("FIN");
	}

}
