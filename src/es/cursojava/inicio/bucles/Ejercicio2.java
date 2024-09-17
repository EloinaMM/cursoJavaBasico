package es.cursojava.inicio.bucles;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Pintar las tablas de multiplicar de los números del 1-10
		for (int num=1;num<=10;num++) { 
			for (int i=1;i<=10;i++) {
				System.out.println(num + " x " + i + " ="+ num*i);
			}
		}

	}

}
