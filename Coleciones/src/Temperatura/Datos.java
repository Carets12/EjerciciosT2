package Temperatura;

import java.util.Arrays;

public class Datos {
	//atributo con Array
	private double[] temperaturas;
     //constructor
	public Datos(double[] temperaturas) {
		this.temperaturas = temperaturas;
	}
	//método que devuelve el valor  medio
		public double calcularValorMedio(){
			double suma = 0;
			for (double d : temperaturas) {
				suma += d;
			}
			double valorMedio = suma / (temperaturas.length * 1.0);
			return valorMedio;
		}
		//metodo desviacion tipica
		public double calcularDesviacionTipica(){
			//suma (x - valorMedio)^2
			double suma = 0;
			for (double d : temperaturas) {
				suma += Math.pow(d - calcularValorMedio(), 2);
			}
			double desviacionTipica = Math.sqrt(suma / temperaturas.length);
			return desviacionTipica;
		}
		//metodo obtener numeros que tenga valores por deajo de la media
		public int obtenerNumeroValoresPorDebajoMedia(){
			int contador = 0;
			//código
			for (double d : temperaturas) {
				if (d < calcularValorMedio())
					contador++;
			}
			return contador;
		}
		// metodo obtenr maxima temperatura
		public double obtenerMaximoTemperatura(){
			double maximo = temperaturas[0];
			for (double d : temperaturas) {
				if (d > maximo)
					maximo = d;
			}
			return maximo;
		}
		//metodo obtener minima temperatura
		public double obtenerMinimoTemperatura(){
			double minimo = temperaturas[0];
			for (double d : temperaturas) {
				if (d < minimo)
					minimo = d;
			}
			return minimo;
		}
		@Override
		public String toString() {
			return Arrays.toString(temperaturas);
		}
		
		
	}
	
	
	


