package main8;

public class Rectangulo extends AreaFiguras implements IFigura{
	private float base;
	private float altura;
	
	public Rectangulo(float base, float altura) {
		super(base,altura);
		this.base = base;
		this.altura = altura;
	}
	
	public float getBase() {
		return base;
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

	@Override
	public float area() {
		return this.getBase()*this.getAltura();
	}
	
	
}
