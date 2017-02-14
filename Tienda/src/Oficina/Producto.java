package Oficina;

public class Producto {
	//atributos
	
	 private int id;
	 private String nombreProducto;
	 private double precioProducto;
	 
	 //constructor
	 
	 public Producto(int id, String nombreProducto, double precioProducto){
		 this.id=id;
		 this.nombreProducto=nombreProducto;
		 this.precioProducto=precioProducto;
		  }
	 //getters 

	public int getId() {
		return id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}
     //to String
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + "]";
	}
}
