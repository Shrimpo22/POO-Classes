package revisoes;

// Acrescentar o que for necessario, incluindo atributos e codigo no construtor
//
public class MusicaComVariosAutores extends Musica {
	
	private String[] autores;
	
	public MusicaComVariosAutores(String titulo, String[] autores, Time duracao) {
		super(titulo, autores[0], duracao);
		this.autores = autores;
	}

	@Override
	public String getAutor() {
		return autores[0] + " et al.";
	}
}
