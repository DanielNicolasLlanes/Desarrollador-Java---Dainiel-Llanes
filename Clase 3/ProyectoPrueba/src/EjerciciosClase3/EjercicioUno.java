package EjerciciosClase3;

public class EjercicioUno {
	public static void main(String[] args) {
		String cadena = "Hola que tal";
		char letra = 'a';
		
		System.out.println("La cantidad de veces que aparece la letra '" + letra+ "' en la cadena '"+cadena+ "', es: "+ contarLetras(cadena, letra));
			
	}
	
	public static int contarLetras(String cadena, char letra) {
		int contador = 0;
		for (int x = 0; x < cadena.length(); x++) {
			if(cadena.charAt(x) == letra) {
				contador++;
			}
		}
		return contador;
	}
}
