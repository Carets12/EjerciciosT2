package Temperatura;

public class TestDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] temperaturas = {11,12,-3,4,5.5,6,7};
		Datos d = new Datos(temperaturas);
		System.out.println(d);
		System.out.printf("Valor medio de las temperaturas"
				+ " %.2f%n", d.calcularValorMedio());
		System.out.printf("Desviacion típico de las temperaturas"
				+ " %.2f%n", d.calcularDesviacionTipica());
		System.out.printf("Valores de temperatura por debajo de la media"
				+ " %d%n", d.obtenerNumeroValoresPorDebajoMedia());
		System.out.printf("Temperatura máxima"
				+ " %.2f%n", d.obtenerMaximoTemperatura());
		System.out.printf("Temperatura minima"
				+ " %.2f%n", d.obtenerMinimoTemperatura());
	   }


	}


