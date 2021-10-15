package ex5_5;
public class Teste {
	public static void main(String[] args) {
		String[] flaivo = {"r", "o","c","k","e","t"};
		Integer[] dainel = {1,2,3,4,5,6,7,8,9,10};
		ArrayIterator<String> fi = new ArrayIterator<>(flaivo);
		ArrayIterator<Integer> di = new ArrayIterator<>(dainel);

		int numLetters = 1;
		System.out.println("");
		while(fi.hasNext()) {
			System.out.print("|"+fi.next()+"|");
			numLetters+=3;
		}
		String repeated=new String(new char[numLetters]).replace("\0","-");
		System.out.println("\n"+repeated);

		numLetters = 1;
		while(di.hasNext()) {
			System.out.print("|"+di.next()+"|");
			numLetters+=3;
		}
		
		repeated=new String(new char[numLetters]).replace("\0","-");
		System.out.println("\n"+repeated);

	}
}
