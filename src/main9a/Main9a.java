package main9a;

import main9a.IFelino;
import main9a.Jaguar;
import main9a.Gato;

public class Main9a {

	/*
	 * Segregacion de interfaces
	 * 
	 * A client should never be forced to implement an interface that it doesnt use
	 * or clients shouldnt be forced to depend on methods they do not use
	 * 
	 * 
	 * Interfaces definen comportamiento, que se va a hacer
	 * debemos asegurarnos que las clases que implementen las interfaces, todos los
	 * metodos seran implementados es decir, ej, caso del felino que no puede maullar
	 * por lo que se debe seguir abstrayendo el modelado pensando en crear nuevas interfaces
	 * 
	 * Las interfaces que poseen metodos extras que al momento de implementar la interfaz en la 
	 * clase no se van a usar(metodos), se le llaman interfaces gordas 
	 *  
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		/*
		 * Aplicando la segregacion de interfaces fue posible
		 * poder implementar todos los metodos de la interfaz IFelino
		 *  es decir se abstrajo mas, y se crearon dos nuevas interfaces
		 * 
		 * */
		
		
		 Gato gato = new Gato(5,5f);	 
		 gato.maullar();
		 
		 IFelinoDomestico gato1 = new Gato(5,12f);

		 gato1.maullar();
		 
		 Jaguar jaguar = new Jaguar(10,50f);
		 jaguar.cazar();
		 
		 IFelinoSalvaje jaguar1 = new Jaguar(14,58f);
		 jaguar1.cazar();
		 
		
		
		// Concepto pendiente de revisar...
		 IFelino gato2 = new Gato(14,10f);
		 gato2.cazar();
		 
		 IFelino jaguar2 = new Jaguar(14,58f);
		 jaguar2.cazar();
		 
		 
		
		
	}

}
