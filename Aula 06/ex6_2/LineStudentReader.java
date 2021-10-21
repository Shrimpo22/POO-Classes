package ex6_2;

import java.io.File;

public class LineStudentReader extends LineObjectReader<Aluno>{
	
	public LineStudentReader(File file) {
		super(file);
	}
	
	@Override
	public Aluno readLine(String str) {
		
		
		String[] data = str.split(" ", 2);
		int numero = Integer.parseInt(data[0]);
		String nome = data[1];
		return new Aluno(nome, numero);
	}

}
