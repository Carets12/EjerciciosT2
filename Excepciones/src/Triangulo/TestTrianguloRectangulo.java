package Triangulo;

import java.util.Scanner;

public class TestTrianguloRectangulo {
	public static void main(String[] args){
		//creamos clase scanner
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce los lados de los catetos 1 y 2 y despues la hipotenusa");
		double cateto1= teclado.nextDouble();
		double cateto2=teclado.nextDouble();
		double hipotenusa=teclado.nextDouble();
		
		try {
			TrianguloRectangulo t = new TrianguloRectangulo
					(cateto1, cateto2, hipotenusa);
			System.out.println(t);
		} catch (TrianguloRectanguloException e) {
			// TODO Auto-generated catch block
			System.out.println("Eso no es un triangulo rectángulo");
		} finally {
			teclado.close();
		}

	}
		
		
	}

