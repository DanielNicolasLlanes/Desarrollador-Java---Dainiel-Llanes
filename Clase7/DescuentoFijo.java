package EjercicioUno;

public class DescuentoFijo extends Descuento {
	
	private int monto;

	public DescuentoFijo() {
		
	}

	public DescuentoFijo(int monto) {
		this.monto = monto;
	}



	@Override
	public int calcularDescuento(int precioTotal) {
	       return precioTotal - monto;
	    }

}
