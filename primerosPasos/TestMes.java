package primerosPasos;

public class TestMes {
	public static void main(String[] args) {
		int mes = 10;

		switch (mes) {
		case 1:
			System.out.println("El mes es Enero, que caloor");
			break;
		case 2:
			System.out.println("Febrero, cuando termina este infierno?");
			break;
		case 3:
			System.out.println("Ya entedimos Marzo, sos un chicle");
			break;
		default:
			System.out.println("Se que quisiste probar otros meses, " + "pero te prometo que entendi el switch y case");
			break;
		}
	}
}
