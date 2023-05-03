package primerosPasos;
//Multiplos de 3 usando for
public class MultiploDe3b {
public static void main(String[] args) {
	for(int i = 0; i < 100; i += 3) {
		if(i == 0) continue;
		System.out.println(i);
	}
}
}
