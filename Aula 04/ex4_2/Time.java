package ex4_2;

//import java.util.Comparator;

public class Time {
	private int total;

	private Time(int total) {
		this.total=total;
	}
	
	public Time(int mm, int ss){
		this.total = mm * 60;
		this.total += ss;
	}

	public Time(String time) {
		String[]splittime = time.split(":");
		int mm = Integer.parseInt(splittime[0]);
		int ss = Integer.parseInt(splittime[1]);

		this.total = mm * 60;
		this.total += ss;

	}

	public int getMinutes() {
		return total/60;
	}
	
	public int getSeconds() {
		return total%60;
	}
	
	public int getTotal() {
		
		return total;
	}
	
	public boolean isGreater(Time other) {
		//Comparator<Integer> comp = (getTotal(), other.getTotal()) -> getTotal() - other.getTotal();
		return getTotal() - other.getTotal() > 0;
	}
	
	public boolean isSmaller(Time other) {
		//Comparator<Integer> comp = (getTotal(), other.getTotal()) -> getTotal() - other.getTotal();
		return getTotal() - other.getTotal() < 0;
	}
	
	public Time add(Time other) {
		int totalresult = getTotal() + other.getTotal();
		Time result = new Time(totalresult);
		return result;
	}
	
	public Time sub(Time other) {
		int totalresult = getTotal() - other.getTotal();
		Time result = new Time(totalresult);
		return result;
	}
	
	
	@Override
	public String toString() {
		return "time["+ getMinutes() +":"+ getSeconds()+"]";
	}
}
