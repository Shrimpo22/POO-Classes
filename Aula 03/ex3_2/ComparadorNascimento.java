package ex3_2;

import java.util.Comparator;

public class ComparadorNascimento implements Comparator<Aluno>{

	@Override
	public int compare(Aluno o1, Aluno o2) {
		if (o1.getAnoNascimento() == o2.getAnoNascimento()) {
			if(o1.getAnoMatricula() == o2.getAnoMatricula()) {
				Comparator<Aluno> c = new ComparadorNome();
				c.compare(o1, o2);
			}
			return o1.getAnoMatricula()-o2.getAnoMatricula();
		}
		return o2.getAnoNascimento()-o1.getAnoNascimento();

	}


}
