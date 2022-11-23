package BasicPrograms;

class Rohith {
	public void Rohith(String s) {
		System.out.println("he take only one run");
	}

	public void Rohith(String s, int a) {
		System.out.println("he takes two runs");
	}

	public void Rohith(String s, int a, int b) {
		System.out.println("he hit six");
	}

	public static void Rohith(Double d) {
		System.out.println("hello hai m4");
	}
}

public class MethodOverLoadig {

	public static void main(String[] args) {
		Rohith r1 = new Rohith();
		r1.Rohith("vijay");
		r1.Rohith("Kumar", 6);
		r1.Rohith("Avulasetty", 6, 4);
		r1.Rohith(44.4);

	}
}
