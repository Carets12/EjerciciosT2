package PalabraLeida;

import java.util.Scanner;

public class TestPalabra {

	public static void main(String[] args) {
		System.out.println("introduce una palabra:");
		Scanner in = new Scanner(System.in);
		String palabra = in.next();
		PalabraLeida p = new PalabraLeida(palabra);
		System.out.printf("%s tiene %d letras%n", 
				p, p.obtenerNumeroLetras());
		System.out.printf("%s empieza por vocal: %b, "
				+ "acaba en vocal: %b%n", 
				p, p.empiezaPorVocal(), p.terminaPorVocal());
		System.out.printf("%s contiene h o H: %b, y n� vocales %d%n", 
				p, p.contieneH(), p.contarNumeroVocales());
		System.out.printf("%s es pal�ndromo:  %B%n", 
				p, p.esPalindromo());
		System.out.printf("%s es igual a %s: %b%n", 
				p, "estafa", p.sonIguales("estafa"));
		// TODO Auto-generated method stub

	}

}
