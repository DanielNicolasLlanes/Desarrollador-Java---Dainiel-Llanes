package EjerciciosClase3;


public class EjercicioUnoC {
	public static void main(String[] args) {
		int vectorA[] = {5, 5, 5, 5, 2, 5};
		int vectorB[] = {8, 22, 45, 35, 7, 2, 10};
		
		System.out.println(sumarEn(vectorA, 5));
		System.out.println(sumarEn(vectorB, 7));
		
	}
	public static int sumarEn(int[] vector, int x) {
		int result = 0;
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > x) {
				result += vector[i];
			}
		}
		
		return result;
	}

}
