package main9a;

public class Animal {
	private int edad;   
	private float peso;
	
	public Animal(int edad, float peso) {
		this.edad = edad;
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Animal [edad=" + edad + ", peso=" + peso + "]";
	}


	public void dormir() {
		System.out.println("El animal duerme!");
	}
	
	public void comer() {
		System.out.println("El animal come!");
	}
}
