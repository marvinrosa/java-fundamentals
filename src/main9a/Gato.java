package main9a;

public class Gato extends Animal implements IFelinoDomestico {

	private int edad;   
	private float peso;
	
	public Gato(int edad, float peso) {
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
	public void dormir() {
		System.out.println("El gato duerme!");
	}
	@Override
	public void comer() {
		System.out.println("El gato come!");
	}
	
	@Override
	public void cazar() {
		System.out.println("El gato caza");
		
	}

	@Override
	public void maullar() {
		System.out.println("El gato maulla");
		
	}



}
