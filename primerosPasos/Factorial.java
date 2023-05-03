package primerosPasos;

public class Factorial {
	public static void main(String[] args) {
		int factorial = 1;
		for (int i = 0; i <= 10; i++) {
			if (i == 0) {
				System.out.println("Factorial de " + i + "!" + " es " + factorial);
			} else {
				factorial *= i;
				System.out.println("Factorial de " + i + "!" + " es " + factorial);
			}
		}
	}
}
