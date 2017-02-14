package Hexadecimal;

import java.util.Scanner;

public class TestNumeroHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un valor en hexadecimal:");
		Scanner in = new Scanner(System.in);
		String numero = in.next();
		try {
			NumeroHexadecimal nHexadecimal = new NumeroHexadecimal(numero);
			System.out.printf("%s su valor en decimal es %d%n",
					nHexadecimal, nHexadecimal.obtenerValorEnDecimal());
		} catch (NumeroHexadecimalException e) {
			// TODO Auto-generated catch block
			System.out.println("No es un n�mero hexadecimal");
		} finally {
			in.close();
		}

	}

}
