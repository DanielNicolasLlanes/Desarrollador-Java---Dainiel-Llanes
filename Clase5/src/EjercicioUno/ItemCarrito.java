package EjercicioUno;

public class ItemCarrito {
	
	private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public int getPrecio() {
    	return producto.getPrecio();
    }
    
    public int getCantidad() {
    	return cantidad;
    }

}
