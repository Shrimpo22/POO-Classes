package ex6_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class LineObjectReader<T> {
	
	private File file;
	
	public LineObjectReader(File file) {
		this.file=file;
	}

	public List<T> read() throws FileNotFoundException{
		List<T> lista = new ArrayList<>();
		Scanner s = new Scanner(file);
		
		while (s.hasNextLine()) {
			T obj = readLine(s.nextLine());
			lista.add(obj);
		}
		
		s.close();
		return lista;
	}
	
	public abstract T readLine(String str);
}
