package main6;

public class Main6 {
	// #6 Sobrecarga de metodos
	//
	public static void main(String[] args) {
		//la sobrecarga no es esclusiva de los constructores
	
		Jaguar jaguar = new Jaguar(51,155f);
		System.out.println(jaguar); 
		
		//Llmando al 1er contructor sobrecargado
		Jaguar jaguar2 = new Jaguar();
		System.out.println(jaguar2);
		
		//Llmando al 2do contructor sobrecargado
		Jaguar jaguar3 = new Jaguar(5);
		System.out.println(jaguar3);
		
		//Llmando al 3er contructor sobrecargado
		Jaguar jaguar4 = new Jaguar(52f);
		System.out.println(jaguar4);
	}

}
