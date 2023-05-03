package primerosPasos;

public class EjercicioMatriz2 {
	public static void main(String[] args) {
		for (int fila = 1; fila <= 10; fila++) {
			for (int col = 10; col >= fila; col--) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
