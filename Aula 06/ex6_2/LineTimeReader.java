package ex6_2;

import java.io.File;

public class LineTimeReader extends LineObjectReader<Time> {

	public LineTimeReader(File file) {
		super(file);
	}
	
	@Override
	public Time readLine(String str) {
		return new Time(str);
	}

}
