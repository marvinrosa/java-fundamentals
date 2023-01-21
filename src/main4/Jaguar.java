package main4;

public class Jaguar extends Animal implements IFelino{  
	// Usamos implements para definir la implementacion de una interfaz
	// asi mismo es obligatorio hacer la implmentacion de c/u de los metodos
	// la clase Jaguar implementa la interfaz IFelino
	
	private int edad;   
	private float peso;
	
	
	public Jaguar(int edad, float peso) {
		this.edad = edad;
		this.peso = peso;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Mi edad es " + this.getEdad() + "y Mi peso es " +this.getPeso(); 
	}
	
	//Pendiente por ver mas adelante
	public void dormir() {
		System.out.println("El jaguar duerme!");
	}
	
	public void comer() {
		System.out.println("El jaguar come!");
	}

	@Override
	public void rugir() {
		System.out.println("el jaguar ruge");
		
	}

	@Override
	public void maullar() {
		throw new UnsupportedOperationException("El jaguar no maulla!");
		
	}

	@Override
	public void cazar() {
		System.out.println("el jaguar caza");
		
	}
	
	

}
