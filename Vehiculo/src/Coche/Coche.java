package Coche;

public class Coche {
	
	//atributos para la clase
	
	private double cantidadCombustible = 5;
	private double consumoCombustible = 7; //a los 100 km
	
	//metodos
	//metodo añadir combustible
	public void addCombustible(double cantidad){
	     cantidadCombustible += cantidad;
	     
	}
     //get de combustible

	public double getCantidadCombustible() {
		return cantidadCombustible;
	}
	
	//metodo de la autonomia del coche
	public double  conocerAutonomia(){
		return cantidadCombustible / consumoCombustible * 100;
	}
	
	
}
