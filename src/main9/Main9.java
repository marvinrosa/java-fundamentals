package main9;

public class Main9 {

	/*
	 * 3 - Liskov
	 * 
	 *  Let q(x) be a property provable about objects of x of type T
	 *  then q(y) should be provable for objects y of type S where S is 
	 * a subtype of T
	 * 
	 * Nos dice que los subtipos deben ser sustituibles por los tipos base
	 * 
	 * */
	public static void main(String[] args) {
		
		Jaguar jaguar = new Jaguar(5,10f);
		jaguar.cazar();
		
		
		IFelino felino = new Jaguar(10,5f); // hasta ese punto se cumple si se 
		felino.cazar();   // se puden implementar todos los metodos
		
		felino.maullar();  // este ultimo rompe con liskov, ya que debe poder implementar
		// todos los metodos de la interfaz
		
		  
	}

}
