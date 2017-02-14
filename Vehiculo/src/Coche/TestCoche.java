package Coche;

public class TestCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos un objeto de clase coche
		
		Coche  coche1 = new Coche();
		Coche  coche2=  new Coche();
		coche1.addCombustible(5); // le añadimos 5 litros de combustible
		
		System.out.println("El coche tiene un combustible de:"+coche1.getCantidadCombustible()+"Y una autonomia de:" + coche1.conocerAutonomia());
		

	}

}
