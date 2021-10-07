package ex4_1;

public class Matrix {

	private int[][] data;


	public Matrix(int lines, int columns) {
		data = new int[lines][columns];
	}

	public Matrix(int side) {
		data = new int[side][side];
	}

	public int getLines() {
		return data.length;
	}

	public int getColumns() {
		return data[0].length;
	}

	public int get(int i, int j) {
		return data[i][j];
	}

	public void set(int i, int j, int val) {
		data[i][j] = val;
	}

	public void mult(int scale) {
		for(int i=0; i!=getLines();i++) {
			for (int j = 0; j != getColumns(); j++) {
				data[i][j] *= scale;
			}
		}
	}

	public boolean hasSameSize(Matrix other) {
		if (getColumns() == other.getColumns() && getLines()==other.getLines())
			return true;
		return false;
	}

	@Override
	public String toString() {
		String str =  "";
		
		for(int i=0; i!=getLines();i++) {
			for (int j = 0; j != getColumns(); j++) {
				str += data[i][j] + " ";
			}
			str += System.lineSeparator();
			
		}
			
		return str;
	}



}
