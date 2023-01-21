package main8;

public class Imprimir {
	
	/*
	 * Esta clase se va a ver modificada y rompe con el principio de abierto/cerrado
	public void area(Rectangulo rectangulo) {
		System.out.println(rectangulo.area());
	}
	
	public void area(Triangulo triangulo) {
		System.out.println(triangulo.area());
	}
	
	*/
	
	/*
	 * La clase rectangulo y triangulo son clases hijas de la clase Figura??
	 * 
	 * */
	
	public void area(IFigura figura) {
		System.out.println(figura.area());
	}

}
