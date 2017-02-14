package Colecion;

import java.util.Arrays;

public class Coleciones1 {
    //atributo con array
	private double[] datos;
     //constructor
	public Coleciones1(double[] datos) {
		this.datos = datos;
	}
	//get del atributo
	public double[] getDatos() {
		return datos;
	}
	// hacemos el to String
	@Override
	public String toString() {
		return "Coleciones1 [datos=" + Arrays.toString(datos) + "]";
	}
	
	
	
	
	
}
