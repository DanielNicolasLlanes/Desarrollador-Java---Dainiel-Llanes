package EjerciciosClase5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import EjercicioUno.Carrito;
import EjercicioUno.ItemCarrito;
import EjercicioUno.Producto;


public class main {

	public static void main(String[] args) {
		
		 Carrito carrito = new Carrito();
		 
		 try (BufferedReader br = new BufferedReader(new FileReader("src/EjercicioUno/productos.txt"))) {
			 	
	            String line;
	            while ((line = br.readLine()) != null) {
	            	
	                String[] fields = line.split("\t"); //Separador por tabulación
	                
	                int cantidad = Integer.parseInt(fields[0]);
	                int precio = Integer.parseInt(fields[1]);
	                String nombre = fields[2];
	                
	                Producto producto = new Producto(nombre, precio);
	                ItemCarrito item = new ItemCarrito(producto, cantidad);
	                carrito.agregarItem(item);
	            } 
		 } catch (IOException e) {
			 System.out.println("Error al leer el archivo");
    }
		 System.out.println(carrito.toString());
		 System.out.println("Precio total: " + carrito.precio());

	}
}