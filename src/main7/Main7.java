package main7;

public class Main7 {
	/*
	 * La cohesion es una medida de cuanto una unidad tiene relacion consigo mismas
	 * En la como una entidad,modulo o una clase tiene relacion consigo misma
	 * cohesion baja, realiza diversas tareas string, int, flotantes
	 * cohesion alta, realiza una sola tarea especifica
	 * 
	 * SOLID : 1 - Responsabilidad Simple
	 * 
	 * a class should have one and only one reason to change, meaning that a class
	 * should have only one job
	 * 
	 * tener cohesion alta
	 * */
	public static void main(String[] args) {
		//litle pojo
		Rectangulo rectangulo = new Rectangulo(10,20);
		
		// cohesion alta
		Imprimir presentacion = new Imprimir();
		presentacion.imprimir(rectangulo);
	}

}
