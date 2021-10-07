package ex4_1;

public class Teste {
	public static void main(String[] args) { 
		Matrix m1 = new Matrix (2);
		Matrix m2 = new Matrix(2);

		m1.set(0, 0, 4);
		m1.set(0, 1, 3);
		m1.set(1, 0, 2);
		m1.set(1, 1, 1);
		
		
		m2.set(0, 0, 2);
		m2.set(0, 1, 4);
		m2.set(1, 0, 8);
		m2.set(1, 1, 10);

		Matrix m3 = sumAndScale(m1, m2, 2);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}

	public static Matrix sumAndScale(Matrix a, Matrix b, int scale) {
		if(!a.hasSameSize(b))
			return null;

		Matrix result = new Matrix(a.getLines(), a.getColumns());

		for (int i = 0; i != a.getLines(); i++) 
			for (int j = 0; j != a.getColumns(); j++) 
				result.set(i, j, a.get(i, j) + b.get(i, j));

		result.mult(scale);		

		return result;
	}
}
