import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Disciplina {

	private final String nome;
	private final String sigla;
	private final int capacidade;
	private ArrayList<Inscricao> inscricoes = new ArrayList<>();

	public Disciplina(String nome, String sigla, int capacidade) {
		this.nome = nome;
		this.sigla = sigla;
		this.capacidade = capacidade;
	}

	public void inscrever(Aluno aluno) {
		if (inscricoes.size() < capacidade)
			inscricoes.add(new Inscricao(aluno));

		else
			System.err.println("Capacidade excedida em " + sigla + " - " + aluno + " n�o foi inscrito");
	}

	private Inscricao procurarInscricao(int numero) {

		for (Inscricao insc: inscricoes)
			if (insc.getAluno().getNumero() == numero) {
				return insc;
			}
		System.err.println("Aluno n� " + numero + " n�o est� inscrito a " + sigla);
		return null;
	}

	public void desinscreverAluno(int numero) {

		Inscricao aRemover = procurarInscricao(numero);
		inscricoes.remove(aRemover);
	}

	public void lancarNota(int numero, int nota) {

		Inscricao insc = procurarInscricao(numero);
		if (insc!=null)
			insc.setNota(nota);
	}

	public boolean temNota(int numero) {

		Inscricao insc = procurarInscricao(numero);
		if (insc!=null)
			return insc.temNota();

		return false;
	}

	public int obterNota(int numero) {

		Inscricao insc = procurarInscricao(numero);
		if (insc!=null)
			return insc.getNota();

		return Inscricao.NA;
	}
	
	private static String criarSigla(String texto) {
		String sigla = "";
		for(int i=0; i<texto.length(); i++) {

			if( texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
				sigla += texto.charAt(i);
			}
		}
		return sigla;
	}
	
	private static void inscreverAlunos(ArrayList<Aluno> alunos, Disciplina cadeira) {
		for(Aluno a : alunos) {
			cadeira.inscrever(a);
		}
		
	}

	public static Disciplina criarDisciplina(String nomecompleto, int capacidade, ArrayList<Aluno> alunos) {
		String sigla = criarSigla(nomecompleto);
		Disciplina cadeira = new Disciplina(nomecompleto, sigla, capacidade);
		inscreverAlunos(alunos, cadeira);
		return cadeira;
		
	}

	public void escreverDisciplina(String nomeFich) {
		try {
			PrintWriter pw = new PrintWriter(new File(nomeFich));
			
			pw.println(this.nome);
			pw.println(this.capacidade);
			for(Inscricao a : inscricoes) {
				pw.println(a.getAluno().getNumero() + " " + (a.getNota()==Inscricao.NA? "NA" : a.getNota()));
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String toString() {

		String str = nome + " (" + sigla + ") cap: " + capacidade + "\n";
		for (Inscricao insc: inscricoes)
			str+= insc + "\n";

		return str;
	}
} 