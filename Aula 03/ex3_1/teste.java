package ex3_1;

public class teste {
	public static void main(String[] args) {
		SortedIntArray array = new SortedIntArray(new ParesPrimeiro());
		array.add(5);
		array.add(8);
		array.add(6);
		array.add(3);
		array.add(9);
		
		System.out.println(array);
	}
}
