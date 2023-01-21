package main;

public class Main {
	// #1 Clases y Objetos
	public static void main(String[] args) {

		 //instancia = a crear un objeto
		
		Jaguar jaguar = new Jaguar();
		
		jaguar.setEdad(5);
		jaguar.setPeso(155.5f);
		
		System.out.println(jaguar); //objeto devuelve el metodo toString si es declarado
	}

}
