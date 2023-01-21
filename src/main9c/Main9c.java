package main9c;

public class Main9c {

	/*
	 * Inversion de dependencias
	 * 
	 * Entities must depend on abstractions not on concretions.
	 * it states that the high level module must not depend on the
	 * low level module, but they should depend on abstractions
	 * 
	 * 
	 * las entidades deben depender de abstracciones no de concreciones
	 * Los modulos de alto nivel no debe depender de un modulo de bajo nivel
	 * sino que debe de depender de abstracciones
	 * 
	 * */
	public static void main(String[] args) {
		Teclado teclado = new Teclado();
		Mouse mouse = new Mouse();
		
		Computadora computadora = new Computadora(teclado, mouse);
		computadora.encender();
	}

}
