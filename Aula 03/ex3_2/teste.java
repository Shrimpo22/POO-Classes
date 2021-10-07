package ex3_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class teste {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		Comparator<Aluno> comp = new ComparadorNum();
		//public Aluno(int numero, String nome, int anoMatricula, int anoNascimento)
		
		Aluno beterraba=new Aluno(98654, "Beterraba", 2020, 2002 );
		Aluno courgete=new Aluno(98434, "Courgete", 2019, 2001 );
		Aluno alface=new Aluno(12632, "Alface", 2018, 2004 );
		Aluno risotto=new Aluno(12300, "Risotto", 2016, 2007 );
		Aluno feijãofrade=new Aluno(12349, "Feijão Frade", 2005, 2015 );
		alunos.add(beterraba);
		alunos.add(courgete);
		alunos.add(alface);
		alunos.add(risotto);
		alunos.add(feijãofrade);
		
		alunos.sort(comp);
		System.out.println(alunos);

	}
}
