package EjerciciosClase4;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EjercicioDos {

	public static void main(String[] args) {
		System.out.println(sumarNumeros("D:\\Documentos\\Eclipse\\ProyectoDeClase4\\src\\texto.txt", "sumar"));
	}
	
	public static int sumarNumeros(String ruta, String operacion) {
		int resultado = 1;
		
		
		try {
			for ( String linea : Files.readAllLines(Paths.get(ruta),StandardCharsets.ISO_8859_1)) {
				if (operacion.equals("sumar")) {
				resultado += Integer.parseInt(linea.trim());
				}else if (operacion.equals("multiplicar")) {
				resultado *= Integer.parseInt(linea.trim());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en la lectura del archivo");
		}
		return resultado;
	}

}
