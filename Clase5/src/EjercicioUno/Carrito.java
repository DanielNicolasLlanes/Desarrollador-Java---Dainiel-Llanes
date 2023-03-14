package EjercicioUno;

public class Carrito {

	private ItemCarrito item1;
	private ItemCarrito item2;
	private ItemCarrito item3;
	
	public void agregarItem(ItemCarrito item) {
        if (item1 == null) {
            item1 = item;
        } else if (item2 == null) {
            item2 = item;
        } else if (item3 == null) {
            item3 = item;
        } else {
            System.out.println("El carrito ya tiene 3 items.");
        }
    }
	
	public int precio() {
		int total =  item1.getPrecio() * item1.getCantidad() + item2.getPrecio() * item2.getCantidad() + item3.getPrecio() * item3.getCantidad();
		return total;
	}
}
