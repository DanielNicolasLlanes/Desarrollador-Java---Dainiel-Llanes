package EjerciciosClaseSeis;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	

	@Test
	void testSumar() {
		double total = Calculadora.multiplicar(80, 3);
		double totalEsperado = 240.0;
		boolean result = (total == totalEsperado);
		assertTrue(result);
	}
	@Test
	void testDividir() {
		double suma = Calculadora.sumar(180, 150);
		double total = Calculadora.dividir(suma, 3);
		double totalEsperado = 110.0;
		boolean result = total == totalEsperado;
		assertTrue(result);
	}
	@Test
	void testFallaMultiplicar() {
		double resta = Calculadora.restar(90, 50);
		double total = Calculadora.multiplicar(resta, 15);
		double totalInesperado = 605.0;
		boolean result = total == totalInesperado;
		assertFalse(result);
	}
	@Test
	void testFallaMultiplicar2() {
		double suma = Calculadora.sumar(70, 40);
		double total = Calculadora.multiplicar(suma, 25);
		double totalInesperado = 2700.0;
		boolean result = total == totalInesperado;
		assertFalse(result);
	}
}
