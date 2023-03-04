package EjerciciosClase3;
import java.util.Arrays;

public class EjercicioUnoB {
	public static void main(String[] args) {
		int resultado[] = ordenarNumeros(41,12,5, "ascendente");
		int resultadoB[] = ordenarNumeros(8,20,3,"descendente");
		
		System.out.println(Arrays.toString(resultado));
		System.out.println(Arrays.toString(resultadoB));
	}
	
	public static int[] ordenarNumeros(int a, int b, int c, String cadena) {
		int numeros[] = {a, b, c};
		int auxiliar;
		
		for (int  x = 0; x < numeros.length; x++) {
			
				for (int y = 0; y < numeros.length - 1; y++) {
					if(cadena.equals("ascendente")) {
						if (numeros[y] > numeros[y + 1]) {
							auxiliar = numeros[y];
							numeros[y] = numeros[y + 1];
							numeros[y + 1] = auxiliar;
						}
						
					}else if(cadena.equals("descendente")) {
						if(numeros[y] < numeros[y + 1]) {
							auxiliar = numeros[y];
							numeros[y] = numeros[y + 1];
							numeros[y + 1] = auxiliar;
						}
						
					}
					
				}
			}
		
			return numeros;
		}
	}

