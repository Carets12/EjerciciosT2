package Oficina;

import java.util.Scanner;

public class TestTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tienda tienda = new Tienda();
        
        //CLASE SCANNER
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un producto , para finalizar el programa usamos un identificador negativo");
        while(true){
        	  int id=teclado.nextInt();
        	  if(id<0)
        		  break;
             String nombreProducto =teclado.next();
             double precioProducto=teclado.nextDouble();
             
             tienda.addProducto(new Producto(id,nombreProducto,precioProducto));
        }
        teclado.close();
      
        System.out.println(tienda);
        
        //buscamos el producto mas barato
        
        System.out.println("El producto mas barato es:" + tienda.masBarato());
        
        //buscamos producto mas caro
        
        Producto p = tienda.masCaro();
        System.out.println("El producto mas caro es: " + p.getNombreProducto()+ p.getPrecioProducto());
        
        //eliminar producto mas caro
        
        
        if(tienda.eliminaProducto(p));
              System.out.println("Eliminado prodcuto" + p.getNombreProducto());
              System.out.println(tienda);
              
             }
	
	}


