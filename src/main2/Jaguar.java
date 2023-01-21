package main2;

//nombre de archivo y nombre de clase deben ser iguales
public class Jaguar {
	
	private int edad;    // accedidos y modificados desde la propia clase
	private float peso;
	
	//constructor de clase, es el primero que se ejecuta al tener una instancia
	// public o private 
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
		return "Mi edad es " + this.getEdad() + " Mi peso es " +this.getPeso(); 
	}
	
	

}
