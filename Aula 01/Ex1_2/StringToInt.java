package Ex1_2;

public class StringToInt{
	static boolean checkIfInteger(String word) {
		String integers = "0123456789";
		for(int i=0; i< word.length(); i++) {
			if(integers.contains(word.substring(i, i+1)) == false)
				return false;
		}
		return true;
	}

	public static int stringToInt(String word) {
		return Integer.parseInt(word);

	}

	public static void main(String[] args) {
		int intCounter = 0;
		int stringCounter = 0;
		int sum = 0;
		for (int i=0; i < args.length;i++) {
			boolean isInt = checkIfInteger(args[i]);
			System.out.println(args[i] + " isInteger?: " + isInt);
			if(isInt==true) {
				int number = stringToInt(args[i]);
				sum += number;
				stringCounter++;
			} else {
				intCounter++;
			}
		}
		System.out.println("Encontrei " + intCounter + " inteiros ");
		System.out.println("Encontrei " + stringCounter + " termos não inteiros ");
		System.out.println("Somatório dos inteiros: " + sum);

	}
}
