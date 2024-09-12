package es.cursojava.inicio.condicionales;

public class EjemploSwitch {

	public static void main(String[] args) {
		// 
		String mes = "Febrero"; 
		//solo se puede hacer con una variable
		switch(mes) {
			case "Enero":System.out.println("Invierno");
			case "Febrero":System.out.println("Invierno");
			case "Marzo":System.out.println("Invierno");
			case "Abril":System.out.println("Primavera");
			case "Mayo":System.out.println("Primavera");
			case "Junio":System.out.println("Primavera");
			case "Julio":System.out.println("Verano");
			case "Agosto":System.out.println("verano");
			case "Septiembre":System.out.println("Verano");
			case "Octubre":System.out.println("Otoño");
			case "Noviembre":System.out.println("Otoño");
			case "Diciembre":System.out.println("Otoño");
		}; 
		switch(mes) {
		case "Enero": 
		case "Febrero": 
		case "Marzo":System.out.println("Invierno"); break;
		case "Abril": 
		case "Mayo": 
		case "Junio":System.out.println("Primavera");break;
		case "Julio": 
		case "Agosto": 
		case "Septiembre":System.out.println("Verano");break;
		case "Octubre": 
		case "Noviembre": 
		case "Diciembre":System.out.println("Otoño");break;
		default:System.out.println("Mes incorrecto");
	}

	}

}
