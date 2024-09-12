package es.cursojava.inicio.condicionales;

public class EjemploIf {

	public static void main(String[] args) {

		int numero = 2;
		int nota = 6; 
		
		// operador mod %, me da el resultado de una división. 
		if (numero%2==0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El numero es impar");
		}
		
		if (nota<5) {
			System.out.println("Suspenso");
		}else if (nota<6) {
			System.out.println("Aprobado");
		}else if (nota<9) {
			System.out.println("Notable");
		}else {
			System.out.println("Sobresaliente");
		}
		// Partimos del valor nota = 6
		System.out.println(nota++);//pinta 6 y luego la incrementa a 7
		System.out.println(++nota);//incrementa y luego pinta 8
		System.out.println(nota+=3);//ejecuta la operación y luego pinta 11
		nota = nota +3;
		System.out.println(nota);//14

		System.out.println("Fin");
	}

}
