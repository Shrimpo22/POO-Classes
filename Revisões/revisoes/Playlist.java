package revisoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Playlist {

	private List<Musica> musicas;
	private final String nome;

	public Playlist(String nome) {
		this.nome = nome;
		musicas = new ArrayList<>();
	}

	public void addMusic(Musica babushka) {
		musicas.add(babushka);
	}

	public String getNome() {
		return nome;
	}

	public void lerMusicas(File fichLeitura) {
		try {
			Scanner sc = new Scanner(fichLeitura);
			while(sc.hasNextLine()) {
				Musica m;
				String temp = sc.nextLine();
				String[]titdur = temp.split(";");

				Time dur = new Time(titdur[1]);
				temp = sc.nextLine();

				String[] autores = temp.split(";");

				if(autores.length > 1) {
					m = new MusicaComVariosAutores(titdur[0], autores, dur);
					addMusic(m);
				}else {
					m = new Musica(titdur[0], autores[0], dur);
					addMusic(m);
				}	
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}


	@Override
	public String toString() {
		String temp = "Playlist: "+ nome + "\n";
		int i = 1;
		for(Musica m : musicas) {
			temp += i + ": " + m + "\n";
			i ++;
		}
		return temp;
	}



	// TODO
}
