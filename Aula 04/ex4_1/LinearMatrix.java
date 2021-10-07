package ex4_1;

public class LinearMatrix {

	private int[] data;
	private int columns;

	public LinearMatrix(int lines, int columns) {
		data = new int[lines*columns];
		this.columns=columns;
	}

	public LinearMatrix(int side) {
		data = new int[side*side];
	}

	public int getLines() {
		return data.length;
	}

	public int getColumns() {
		return columns;
	}

	public int get(int i, int j) {
		return data[i*columns + j];
	}

	public void set(int i, int j, int val) {
		data[i*columns + j] = val;
	}

	public void mult(int scale) {
		for(int n=0; n!=data.length;n++) {
				data[n] *= scale;
		}
	}

	public boolean hasSameSize(LinearMatrix other) {
		if (getColumns() == other.getColumns() && getLines()==other.getLines())
			return true;
		return false;
	}

	@Override
	public String toString() {
		String str =  "";
		
		for(int i=0; i!=getLines();i++) {
			for (int j = 0; j != getColumns(); j++) {
				str += data[i*columns + j] + " ";
			}
			str += System.lineSeparator();
			
		}
			
		return str;
	}



}
