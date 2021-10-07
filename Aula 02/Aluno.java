import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
	
	private int numero;
	private String nome;
	
	public Aluno(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	static ArrayList<Aluno> lerAlunos(String texto){
		
		// Criar lista vazia
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		// Abrir o ficheiro
		try {
			Scanner scanner = new Scanner(new File(texto));
			
			// Ler os alunos e ir criando os objetos correspondentes
			while (scanner.hasNextLine()){
				int numero = scanner.nextInt();
				String nome = scanner.nextLine().trim();
				Aluno a = new Aluno(numero, nome);
			
				// Ir juntando à lista
				alunos.add(a);
			}
			scanner.close();
			
		} catch (FileNotFoundException e) {
			
			System.err.println("Ganda burro pah, mandaste-me ir buscar algo que não existe...");
		}
		
		// Devolver à lista
		return alunos;
	}
	
	@Override
	
	public String toString() {
		return numero + ": " + nome ;
	}	
}
