package main5;

public class Jaguar extends Animal {  
	
	
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
	
	// en esta funcion se hace polimorfismo
	// debido a que se le modifica el comportamiento
	// en ves de mostrar la direccion de memoria
	// imprime los objetos de la clase
	@Override
	public String toString() {
		return "Mi edad es " + this.getEdad() + "y Mi peso es " +this.getPeso(); 
	}
	//polimorfismo
	@Override
	public void dormir() {
		System.out.println("El jaguar duerme!");
	}
	//polimorfismo
	@Override
	public void comer() {
		System.out.println("El jaguar come!");
	}
	

}
