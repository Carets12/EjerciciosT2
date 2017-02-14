package Clave;

public class ClaveSegura {
	private String clave;

	public ClaveSegura(String cl) {
		if ( esClaveSegura(cl) )
			this.clave = cl;
		else
			throw new RuntimeException("No es clave segura");
	}
	public static boolean esClaveSegura(String cl){
		return cl.length() >= 8 &&
				 cl.matches(".*[a-z].*")
				&& cl.matches(".*[A-Z].*") && 
				cl.matches(".*[\\d].*") && 
				cl.matches(".*[\\W_].*")
				;
	}
	@Override
	public String toString() {
		return "ClaveSegura [clave=" + clave + "]";
	}

}
