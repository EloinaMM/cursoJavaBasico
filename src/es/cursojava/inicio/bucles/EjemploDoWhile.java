package es.cursojava.inicio.bucles;

public class EjemploDoWhile {

	public static void main(String[] args) {
		// En este tipo de bucle, primero ejecuta y luego evalua la condición, al contrario 
		// a lo que hacen For o While
		int numero = 11;
		do {
			System.out.println("Hola"+numero);
			
		}while(numero<10);

	}

}
