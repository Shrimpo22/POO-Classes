package ex5_3;

import java.util.Iterator;

public class Teste {

	public static void main(String[] args) {

		Interval test=new Interval(5,10);
		Interval nat= Interval.naturals(10);
		Interval indexes=Interval.arrayIndex(new int[5]);
		Interval empty = Interval.empty();
		
//		for (Integer n : nat)
//			System.out.println(n);
		
		test.forEach( n -> System.out.println(n));
		
		Iterator<Integer> it = indexes.iterator();
		
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println(test);
		System.out.println(nat);
		System.out.println(indexes);
		System.out.println(empty);

	}
}
