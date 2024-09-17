package es.cursojava.inicio.bucles;

public class EjemploFor {

	public static void main(String[] args) {
		// 1ª parte: inicialización de variables
				// 2ª parte: condición que se tiene que cumplir para que el bucle se ejecute 
				// 3ª parte: que cambio tiene la variable en cada iteración del bucle
				for (int i=0 ;i<100 ;i++ ) {
					//System.out.println("Hola"+i);
					if (i%2==0) {
						continue;
					}
					if (i%3==0) {
						continue;
					}
					System.out.println(i);
					if (i>=10) {
						break;
					}
				}

	}

}
