package Exercicio;

public class Ex01 {
	public static void main(String[] args) {
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int i = 1; i <= numeros.length; i++) {

			if (i % 3 == 0) {
				System.out.println("Os n�meros dividido por 3 s�o: " + i);
			}
		}
	}
}
