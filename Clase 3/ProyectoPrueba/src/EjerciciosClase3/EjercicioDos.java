package EjerciciosClase3;

public class EjercicioDos {
	public static void main(String[] args) {
		String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String desabecedario = "UVWXYZABCDEFGHIJKLMNOPQRST";
		
		System.out.println(codificacion(abecedario, 20));
		System.out.println(decodificacion(desabecedario));

	}
	
	public static String codificacion(String cadena, int desplazamiento) {
		cadena = cadena.toUpperCase();
		
		String result = "";
		
		for(int x = 0; x < cadena.length(); x++) {
			char caracter = cadena.charAt(x);
			int valorAscii = (int) caracter;
			
			if (valorAscii + desplazamiento > 90) {
				
				result += (char) ((valorAscii - 65 + desplazamiento) % 26 + 65);
				
			}else {
			result += (char) (valorAscii + desplazamiento);
			}
		}
		
		return result.toLowerCase();
	}
	
	public static String decodificacion(String cadena) {
		
		cadena = cadena.toUpperCase();
		String result = "";
		int referencia = cadena.charAt(0);
		int desplazamiento = referencia - 65;
		
		for (int y = 0; y < cadena.length(); y++) {
			char caracter = cadena.charAt(y);
			int valorAscii = (int) caracter;
			char caracterF = (char) ((valorAscii - desplazamiento + 65 + 26) % 26 + 65);
			result += caracterF;
		}
		return result.toLowerCase();
	}

}
