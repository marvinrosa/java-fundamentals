package main5;

public class Main5 {
	// #5 Polimorfismo
	// se le conoce tambiem como la sobre escritura de metodos
	public static void main(String[] args) {

		Jaguar jaguar = new Jaguar(51,155f);
		
		System.out.println(jaguar); 
		
		jaguar.comer();
		jaguar.dormir();

	}

}
