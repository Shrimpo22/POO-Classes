package ex3_2;

import java.util.Comparator;

public class ComparadorNum implements Comparator<Aluno>{

	@Override
	public int compare(Aluno o1, Aluno o2) {
		return o1.getNumero()-o2.getNumero();
	}



}
