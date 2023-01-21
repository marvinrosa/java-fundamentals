package main6;

public class Jaguar extends Animal implements IFelino{  
	
	//sobrecarga, la habilidad de tener uno o mas metodos
	// con el mismo nombre
	private int edad;   
	private float peso;
	
	
	public Jaguar(int edad, float peso) {
		this.edad = edad;
		this.peso = peso;
	}
	
	// 1ra sobrecarga de constructor
	public Jaguar() {
		this.setEdad(0);
		this.setPeso(0);
	}
	
	//2da sobrecarga de constructor
	public Jaguar(int edad) {
		this.edad = edad;
		this.setPeso(0);
	}
	
	//3er sobrecarga de constructor
	public Jaguar(float peso) {
		this.setEdad(0);
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
		return "Mi edad es " + this.getEdad() + " y Mi peso es " +this.getPeso(); 
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
	public void cazar() {
		System.out.println("el jaguar caza");
		
	}
	
	

}
