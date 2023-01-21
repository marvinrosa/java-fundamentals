package main3;

public class Main3 {
	// #3 Herencia
	// Reducimos lineas de codigo
	// Reutilizar funcionalidades
	// Se debe abstraer en la manera como se piensa
	// Se va a crear una clase animal que permita crear n cantidad de animales
	
	public static void main(String[] args) {

		 //instancia = a crear un objeto
		
		Jaguar jaguar = new Jaguar(51,155f);
		
		System.out.println(jaguar); //objeto devuelve el metodo toString si es declarado
		
		// haciendo uso de  la herencia
		jaguar.comer();
		jaguar.dormir();
		
		
	}

}
