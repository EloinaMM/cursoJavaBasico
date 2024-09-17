package es.cursojava.inicio.bucles;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Pintar los 10 primeros de la serie de fibonacci 
		// 1,1,2,3,5,8,13
		int num1 = 0;
		int num2 = 1;
		for (int i=1;i<8;i++) {
			int suma = num1 + num2;
			System.out.print(suma + ", ");
			num1=num2;
			num2=suma;
		}

	}

}
