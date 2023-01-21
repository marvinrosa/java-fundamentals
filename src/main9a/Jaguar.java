package main9a;

public class Jaguar extends Animal implements IFelinoSalvaje {
	private int edad;   
	private float peso;
	
	public Jaguar(int edad, float peso) {
		super(edad,peso);
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
		return "Mi edad es " + this.getEdad() + " y Mi peso es " +this.getPeso(); 
	}
	
	@Override
	public void cazar() {
		System.out.println("el jaguar caza");
	}

	@Override
	public void rugir() {
		System.out.println("el jaguar ruge");
	}

	

	

	
}
