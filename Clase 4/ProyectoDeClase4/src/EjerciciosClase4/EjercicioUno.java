package EjerciciosClase4;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		System.out.println(imprimirNums(11, 12, 13, 'a'));
		
		System.out.println(imprimirNums());
	}

	public static String imprimirNums(int numA, int numB, int numC, char letra) {
		int max = 0;
		int med = 0;
		int min = 0;

		if (numA > numB && numA > numC) {
			max = numA;
			if (numB > numC) {
				med = numB;
				min = numC;
			} else {
				med = numC;
				min = numB;
			}

		} else if (numB > numA && numB > numC) {
			max = numB;
			if (numA > numC) {
				med = numA;
				min = numC;
			} else {
				med = numC;
				min = numA;
			}
		} else {
			max = numC;
			if (numB > numA) {
				med = numB;
				min = numA;
			} else {
				med = numA;
				min = numC;
			}
		}

		if (letra == 'a') {
			return min + " " + med + " " + max;
		} else if (letra == 'd') {
			return max + " " + med + " " + min;
		}
		return "Ingrese la letra 'a' para un orden ascendente o la letra 'd' para un orden descendente";
	}
	
	public static String imprimirNums() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el primer nummero: ");
		int numA = scan.nextInt();
		
		System.out.println("Ingrese el segundo nummero: ");
		int numB = scan.nextInt();
		
		System.out.println("Ingrese el tercer nummero: ");
		int numC = scan.nextInt();
		
		System.out.println("Ingrese la letra 'a' o 'd' para determinar un orden ascendente o descendente: ");
		char letra = scan.next().charAt(0);
		
		String result = imprimirNums(numA, numB, numC, letra);
		return result;
	}
}
