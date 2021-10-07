package ex3_1;

import java.util.ArrayList;
import java.util.List;

public class SortedIntArray {
	private List<Integer> lista = new ArrayList<>();
	private SortingPolicy policy;


	public SortedIntArray(SortingPolicy policy) {
		this.policy = policy;
	}

	public int size() {
		return lista.size();
	}

	public int get(int index) {
		return lista.get(index);
	}

	private int findInsertionPosition(int n) {
		for (Integer m : lista)
			if (policy.isBefore(n, m)) {
				return lista.indexOf(m);
			}
		return lista.size();
	}

	public void add(int n) {
		int index = findInsertionPosition(n);
		lista.add(index,n);
	}
	
	@Override
	public String toString() {
		String str ="";
		for (Integer m : lista)
			str += " -> " +m;
		return str;
	}



}
