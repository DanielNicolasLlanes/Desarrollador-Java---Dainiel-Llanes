package EjerciciosClase4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioTres {

	public static void main(String[] args) {
		String entradaFile = "D:\\Documentos\\Eclipse\\ProyectoDeClase4\\src\\EjerciciosClase4\\archivoEntrada";
		String salidaFile = "D:\\Documentos\\Eclipse\\ProyectoDeClase4\\src\\EjerciciosClase4\\archivoSalida";
		
		System.out.println(cifrado("codificar", 3, entradaFile, salidaFile));

	}

	public static boolean cifrado(String modo, int desplazamiento, String entrada, String salida) {

		try {
			FileReader leer = new FileReader(new File(entrada));
			FileWriter escribir = new FileWriter(new File(salida));

			int caracter;

			while ((caracter = leer.read()) != -1) {
				if (modo.equals("codificar")) {
					caracter = codificar((char) caracter, desplazamiento);
				} else if (modo.equals("decodificar")) {
					caracter = decodificar((char) caracter, desplazamiento);
				} else {
					System.out.println("Modo inválido: " + modo);
				}
				escribir.write(caracter);
			}
			
			
			leer.close();
			escribir.close();
			return true;
			
		} catch (IOException e) {
			System.out.println("Error ");
			return false;
		}
		

	}
	
	
	public static char codificar(char letra, int desplazamiento) {
		letra = Character.toUpperCase(letra);
		return (char) ('A' + (letra - 'A' + desplazamiento) % 26);
	}
	
	public static char decodificar(char letra, int desplazamiento) {
		letra = Character.toUpperCase(letra);
		return (char) ('A' + (letra - 'A' - desplazamiento + 26) % 26);
	}

}
