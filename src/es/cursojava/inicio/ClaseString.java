package es.cursojava.inicio;

public class ClaseString {

	public static void main(String[] args) {
		// esta clase se puede declarar sin el new
		
		String texto1 = "hola";
		String texto2 = "hola"; 
		String texto3 = new String ("hola"); 
		
		System.out.println(texto1 == texto2); //true
		System.out.println(texto1 == texto3); //false
		System.out.println(texto1.equals(texto3)); //true
		
		texto1.toUpperCase(); //crea un nuevo espacio con el valor HOLA
		System.out.println(texto1); 
		texto1=texto1.toUpperCase();//ahora ya si que cambiamos el apuntamiento de texto1
		System.out.println(texto1); 
		System.out.println(texto2); // texto2 sigue apuntando al espacio inicial
		
		System.out.println(texto1 + " que tal?");
	}

}
