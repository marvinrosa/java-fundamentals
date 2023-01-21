package main9c;

public class Teclado implements ITeclado {
	
	@Override
	public void conectar() {
		System.out.println("Teclado Conexion via USB!");
	}
}
