package es.cursojava.inicio.condicionales.ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Crear una variable con un nombre de un mes. Condicional 
		// si mes ener, feb o marzo decimos que estamos en invierno
		// si mes abri, may, juno --> primavera
		// si jul,agos,sep --> verano 
		// Si octubre, nov, dic --> Otoño
		
		String mes = "Noviembre"; 
		if (mes=="Enero"||mes=="Febrero"||mes=="Marzo") {
			System.out.println(mes + " es Invierno");
		}else if (mes=="Abril"||mes=="Mayo"||mes=="Junio") {
			System.out.println(mes + " es Primavera");
		}else if (mes=="Julio"||mes=="Agosto"||mes=="Septiembre") {
			System.out.println(mes + " es Verano");
		}else if (mes=="Octubre"||mes=="Noviembre"||mes=="Diciembre") {
			System.out.println(mes + " es Otoño");
		}else 
			System.out.println("Ese mes no existe");
	}

}
