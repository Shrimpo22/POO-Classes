import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {

		
		ArrayList<Aluno> alunos = Aluno.lerAlunos("Estudantes.txt");
		Disciplina d = Disciplina.criarDisciplina("Licenciatura em Engenharia Informática", 500, alunos);
//		System.out.println(d);
		d.escreverDisciplina("disciplina.txt");
//		for(Aluno a : alunos)
//				System.out.println(a);
//		
//		escreverAlunos(alunos, "output.txt");
//		// para desenvolver testes ao codigo desenvolvido nos exerc 
//		// 2.2, 2.3, 2.4 e 2.5
	}
	
	
	
	static void escreverAlunos(ArrayList<Aluno> alunos, String nomeFich) {
		try {
			PrintWriter pw = new PrintWriter(new File(nomeFich));
			
			for(Aluno a : alunos) {
				pw.println(a.getNome() + ", Nº "+ a.getNumero());
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
