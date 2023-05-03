package primerosPasos;

public class TestCondicional {
	public static void main(String[] args) {
		System.out.println("Pruebas condicionales");
		
		int edad = 20;
		int cantidadPersonas = 3;
		boolean acompaniado;
		
		if (cantidadPersonas >= 2) {
			acompaniado = true;
		} else {
			acompaniado = false;
		}
		if (edad >= 18 || acompaniado) {
			System.out.println("Bienvenido");
		} else {
			System.out.println("Desafortunadamente, a la gilada ni cabida");
		}
	}
}
