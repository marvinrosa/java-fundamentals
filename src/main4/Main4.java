package main4;

public class Main4 {
	// #4 Interfaces
    // es una coleccion de metodos abstractos
	// vamos especificar que se debe de hacer, NO COMO SE DEBE DE HACER
	public static void main(String[] args) {

	
		
		Jaguar jaguar = new Jaguar(51,155f);
		
		System.out.println(jaguar); //objeto devuelve el metodo toString si es declarado
		
		// haciendo uso de  la herencia
		jaguar.comer();
		jaguar.dormir();
		
		jaguar.cazar();
		//jaguar.maullar();  // esta funcion dentro de la interfaz es un error de disenio
		// ya que se crea una excepcion dado que el felino no maulla
		jaguar.rugir();
		
		
	}

}
