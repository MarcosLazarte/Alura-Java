package primerosPasos;

public class TestBucles {
	public static void main(String[] args) {
		for ( int multiplicador = 1; multiplicador < 11; multiplicador++) {
			for ( int contador = 0; contador < 11; contador++) {
				System.out.println(multiplicador + "x" + contador + " = " + multiplicador * contador);
			}
			System.out.println();
		}
	}
}
