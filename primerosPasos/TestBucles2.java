package primerosPasos;

public class TestBucles2 {
	public static void main(String[] args) {
		for (int fila = 0; fila < 11; fila++) {
			for (int col = 0; col <= fila; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
