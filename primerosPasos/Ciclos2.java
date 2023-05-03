package primerosPasos;

public class Ciclos2 {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while (contador <= 10) {
			total = total + contador;
			contador++;
		}
		System.out.println("El numero total es: " + total);

	}
}
