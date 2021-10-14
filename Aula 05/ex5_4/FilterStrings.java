package ex5_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterStrings {
	public static void main(String[] args) {
		List<String> flaivo = new ArrayList<>();
		flaivo.add("f");
		flaivo.add("v");
		flaivo.add("g");
		flaivo.add("");
		flaivo.add("");
		
		List<Integer> dainel = new ArrayList<>();
		dainel.add(1);
		dainel.add(2);
		dainel.add(3);
		dainel.add(4);
		dainel.add(5);
		dainel.add(6);
		dainel.add(7);
		
		Iterable<String> lixo = select(flaivo, p-> p=="f");
		lixo.forEach(n->System.out.println(n));
		
		Iterable<Integer> dainelcomlixo = select(dainel, p -> p==1);
		dainelcomlixo.forEach(n->System.out.println(n));
		
	}
	
	static <T> Iterable<T> select(Iterable<T> it, Predicate<T> pred){
		List<T> list = new ArrayList<>();
		it.forEach(n -> {if(pred.test(n))list.add(n);});
		return list;
	}
}
