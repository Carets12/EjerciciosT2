package Oficina;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	
	//atributos
	
	private List<Producto> listaProductos;
	
	//constructor genera una clase vacia puesto que el vector de la lista al principio esta vacio 
	
	public Tienda(){
		this.listaProductos=new ArrayList<Producto>();
		}
     // get
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
      //funciones 
	
	//funcion añadir producto
	
	public void addProducto(Producto p){
		listaProductos.add(p);
		
	}
	
	//funcion eliminar producto
	
	public boolean eliminaProducto(Producto p){
		return listaProductos.remove(p);
	}
	
	//funcion producto mas caro
	public Producto masCaro() {
		//empezamos con el 0 ya que es el primero a comparar
		double mayor=listaProductos.get(0).getPrecioProducto();
		int pos=0;
		for(int i=0; i<listaProductos.size(); i++){
			if(mayor<listaProductos.get(i).getPrecioProducto()){
				mayor=listaProductos.get(i).getPrecioProducto();
				pos=i;
				
			}
			
			
		}
		return listaProductos.get(pos);
		
	}
	
	//funcion producto mas barato
	
	public Producto masBarato(){
		double menor=listaProductos.get(0).getPrecioProducto();
		//posicion de inicio que es 0
		int pos=0;
		for(int i=0; i<listaProductos.size(); i++){
			if(menor>listaProductos.get(i).getPrecioProducto()){
				menor=listaProductos.get(i).getPrecioProducto();
				pos=i;
			}
		}
		return listaProductos.get(pos);
	}
	//funcion de listar los todos los productos
	
	public String obtenerProductos(){
		//cadena vacia ya que partimosd euna cadena vacia
		
		String cadena="";
		for(int i=0; i<listaProductos.size(); i++){
			cadena+=listaProductos.get(i).toString();
			
		}
		return cadena;
		
	}
	

}
