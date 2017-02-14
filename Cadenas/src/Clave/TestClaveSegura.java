package Clave;

public class TestClaveSegura {

	public static void main(String[] args) {
		final String  FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIj"
				+ "JkKlLmMnN��oOpPqQrRsStTuUvVwW"
				+ "xXyYzZ0123456789�?()=@.:,;!�&{}";
		//generamos el tama�o de la clave
		int tamano = (int) (Math.random() * 
				FUENTE_CARACTERES.length());
		System.out.println("Tama�o: " + tamano);
		//generamos la clave
		String clave = "";
		for (int i = 0; i < tamano ; i++ ){
			int posicion = (int) (Math.random() * 
					FUENTE_CARACTERES.length());
			clave += FUENTE_CARACTERES.charAt(posicion);
		}
		System.out.println("CLAVE GENERADA: " + clave);
		ClaveSegura claveSegura = new ClaveSegura(clave);
		System.out.println(claveSegura);
		// TODO Auto-generated method stub

	}

}
