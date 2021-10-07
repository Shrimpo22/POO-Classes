package ex1_3;

import java.util.Scanner;

public class FilterWords {

	public static String FilterWord(String og, String filters) {
		Scanner ScannerO = new Scanner(og);
		String filtered = "";
		while(ScannerO.hasNext()) {
			String token = ScannerO.next();
			if(!filters.contains(token)) {
				filtered = filtered.concat(" " + token);
			}
		}
		ScannerO.close();
		return filtered;
	}



	public static void main(String[] args) {
		String filter = "";
		for (int i = 0; i < args.length; i++) {
			filter += args[i] + " ";
		}
		System.out.println(filter);
		Scanner scanner = new Scanner(System.in);
		String line = "a";
		while(!line.equals("")) {
			line = scanner.nextLine();
			System.out.println("frase: "+ line);
			String filtered = FilterWord(line, filter);
			System.out.println("filtrada: "+ filtered);
		}
		scanner.close();
		

	}

}
