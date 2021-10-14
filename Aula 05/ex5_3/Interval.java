package ex5_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Interval implements Iterable<Integer> {

	private final int max, min;

	public Interval(int min, int max) {
		this.min=min;
		this.max=max;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new IntervalIterator();
	}
	
	public boolean isEmpty() {
		return max<min;
	}

	public int size() {
		if(isEmpty())
			return 0;

		return max-min+1;
	}

	public static Interval naturals(int n) {
		return new Interval(1,n);
	}

	public static Interval arrayIndex(int[] v) {
		return new Interval(0, v.length-1);
	}

	public static Interval empty() {
		return new Interval (1,0);
	}


	private class IntervalIterator implements Iterator<Integer>{
		private int position = min;
		
		@Override
		public boolean hasNext() {
			return position <= max;
				
		}

		@Override
		public Integer next() {
			if(!hasNext())
				throw new NoSuchElementException();
			return position++;
		}

	}





	@Override
	public String toString() {
		if (isEmpty())
			return "{}";

		return "["+ min +", "+ max +"]";
	}



}
