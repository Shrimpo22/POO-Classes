package ex3_1;

public class ParesPrimeiro implements SortingPolicy{

	@Override
	public boolean isBefore(int a, int b) {
		return a%2==0;
	}
	
 
}
