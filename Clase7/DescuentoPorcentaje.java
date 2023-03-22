package EjercicioUno;

public class DescuentoPorcentaje extends Descuento{
	private int precioTotal;
	private int porcentaje;
	
	
	
	public DescuentoPorcentaje(int precioTotal, int porcentaje) {
		super();
		this.precioTotal = precioTotal;
		this.porcentaje = porcentaje;
	}
	

	public DescuentoPorcentaje() {

	}

	@Override
	public int calcularDescuento(int precioTotal) {
	       int descuento =  precioTotal * porcentaje / 100;
	       return precioTotal - descuento;
	    }
}
