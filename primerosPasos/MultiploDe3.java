package primerosPasos;
//Practicando multiplos de 3 con while
public class MultiploDe3 {
	public static void main(String[] args) {
		int numero = 1;
		while (numero < 100) {
			if (numero % 3 == 0) {
				System.out.println(numero);
				numero++;
			} else {
				numero++;
			}
		}
	}
}
