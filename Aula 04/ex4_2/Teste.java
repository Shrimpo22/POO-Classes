package ex4_2;

public class Teste {
	public static void main(String[] args) {
		Time tempo = new Time("08:10");
		Time tempo2 = new Time(9, 60);
		
		System.out.println(tempo);
		System.out.println(tempo2);
		Time tempo3 = tempo.add(tempo2);
		System.out.println(tempo3);
		Time tempo4 = tempo2.sub(tempo);
		System.out.println(tempo4);
		System.out.println(tempo.isGreater(tempo3));
		System.out.println(tempo.isSmaller(tempo3));
	}
}
