package Colecion;

import java.util.Arrays;

public class TestColecion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//almacenamos los 12 valores
		//creamos el vector
		
		double[] numeros = new double[12];
         Arrays.fill(numeros, 0); //rellena de 0 el array de numeros
         Coleciones1 c1 =  new Coleciones1(numeros);
         //inicializo el array a 0
         System.out.println("Array inicializado a 0" +c1);
         //establecemos el valor 5 al ultimo valor
         c1.getDatos()[c1.getDatos().length-1]=5;
         System.out.println("Array con el ultimo valor 5" + "elemento"+ c1);
         //añade la secuencia 3 6 12...
         c1.getDatos()[0]=3;
            for(int i =1; i<c1.getDatos().length-1; i++){
            	c1.getDatos()[i]=c1.getDatos()[i - 1]*2; //cambiado
            	}
            System.out.println(c1);
            //sumamos los valores del array
            double suma = 0;
            for(double d: c1.getDatos()){
            	suma += d;
            	System.out.printf("La suma de los valores del array "
        				+ "vale %.2f%n",suma);
        		//modificamos los 5 últimos valores
        		for (int i = c1.getDatos().length - 5; i < c1.getDatos().length; i++) {
        			c1.getDatos()[i] = c1.getDatos()[i] / 3.0;
        		}
        		System.out.println(c1);
        		//obtener el valor mas pequeño
        		double menor = c1.getDatos()[0];
        		for (double d2: numeros) {
        			if (d2 < menor)
        				menor = d2;
        		}
        		System.out.printf("El elemento mas pequeño es %f%n",menor);
        		System.out.println(c1);
        		//ordeno el array
        		//primero guardo una copia del array original, pues va a cambiar
        		//double[] copia = c1.getDatos(); no funciona
        		//tanto copia como c1.getDatos() apunta al mismo sitio
        		double[] copia = c1.getDatos().clone();
        		Arrays.sort(c1.getDatos());
        		System.out.printf("El elemento mas pequeño es %f%n",
        				c1.getDatos()[0]);
        		//imprimir el array original en cuatro columnas
        		int contador = 1;
        		for (double d3 : copia) {
        			System.out.printf("%8.2f",d3);
        			if (contador % 4 == 0)
        				System.out.println();
        			contador++;
        		}		

            }
	}

}
