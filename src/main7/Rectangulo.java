package main7;

// que se debe de mostrar
public class Rectangulo {
	
	private float base;
	private float altura;
	public float getBase() {
		return base;
	}
	
	public Rectangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void setBase(float base) {
		this.base = base;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [base=" + this.getBase() + ", altura=" + this.getAltura() + "]";
	}

	public float area() {
		return this.getBase()*this.getAltura();
	}
	
	/*
	 * Este codigo no se debe de poner aca, porque rompe con el principio SOLID
	 * y este debe estar en la capa de presentacion
	 * 
	 * esta carga solo se encarga que datos debe de mostrar, NO COMO LOS VA A MOSTRAR
	public void imprimir() {
		System.out.println(this);
	}
	*/

}
