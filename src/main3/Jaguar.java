package main3;

public class Jaguar extends Animal {  
	// Usamos extends para definir una herencia
	// la que podemos interpretar como
	// la clase Jaguar hereda de la clase Animal
	// por consecuencia, Jaguar es una clase hija
	// Animal, es una clase padre
	// Java no soporta la herencia multiple
	
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
	
	

}
