package es.cursojava.inicio;

public class Variables {
	//Variables de instancia

	public static void main(String[] args) {
		//Variables locales
		
		// Tipos primitivos
		//Enteros
		byte num1 = 100;
		short num2 = 2;
		int num3 = 7;
		long num4 = 98437;
		
		//Decimales
		double decimal = 7.5;
		float decimal1 = 5.6f;
		
		char caracter = 'a';
		
		boolean esMayorEdad = true;
		
		//Tipo objeto
		String mensaje ="Hola Mundo"; 
		int [] números = {1,2,3}; 
		
		System.out.println(mensaje + num3 + 3);
		System.out.println(mensaje + (num3 + 3));
		System.out.println(num3 + 3 + mensaje);
		System.out.println(mensaje + (num3 + 3) + 6);

	}

}
