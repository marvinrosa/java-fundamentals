package main8;

public class Main8 {

	/*
	 * 2 - OPEN/CLOSED
	 * 
	 *  Objects or entities should be open for extension
	 *  but closed for modification
	 * 
	 * Si se desea extender la app, debe ser posible pero sin modificar el codigo
	 * existente, normalmente para resolver se usa la herencia pero no siempre
	 * 
	 * */
	public static void main(String[] args) {
		
		Rectangulo rectangulo = new Rectangulo(10,20);
		Triangulo triangulo = new Triangulo(10,5);
		
		Imprimir presentacion = new Imprimir();
		presentacion.area(rectangulo);
		presentacion.area(triangulo);
		
		
		
		
	}

}
