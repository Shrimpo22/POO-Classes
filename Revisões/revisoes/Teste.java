package revisoes;

import java.io.File;

public class Teste {

	public static void main(String[] args) {
		
		Musica m1 = new Musica("Jolas e Bola", "Serafim", new Time("3:35"));
		Musica m2 = new Musica("Amor de Mae", "Rubi", new Time("4:35"));
		
		String[] autores_m3= {"Quim da Bairrada", "Nando"};
		Musica m3 = new MusicaComVariosAutores("De Burrico para Lisboa", autores_m3, new Time("6:05"));
		
		Playlist p1 = new Playlist("Pimbalhada");
		
		// Testar o codigo desenvolvido em todas as questoes
		
		// Exerc 1
		p1.addMusic(m1);
		p1.addMusic(m2);
		//System.out.println(p1);
		
		// Exerc 2
		
		Playlist p2 = new Playlist("Pimbalhada aos Molhos");
		p2.addMusic(m3);
		//System.out.println(p2);

		
		// Exerc 3
		
		File e = new File("musicas.txt");
		Playlist p3 = new Playlist("Pimbalhada é intemporal");
		p3.lerMusicas(e);
		System.out.println(p3);
		
		// Exerc 4
		// TODO
		
		// Exerc 5
		// TODO
		
		// Exerc 6
		// TODO
	}	
}
