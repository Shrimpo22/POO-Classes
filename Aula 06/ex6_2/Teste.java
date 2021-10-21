package ex6_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Teste {
	public static void main(String[] args) throws FileNotFoundException {
		LineStudentReader leitorAlunos = new LineStudentReader(new File("Estudantes.txt"));
		List<Aluno> alunos = leitorAlunos.read();
		alunos.forEach(a-> System.out.println(a));
	}
}
