package ex6_2;

public class Time {
	
	private final int totalSeconds;
	
	public static final int SECINMIN = 60;
	
	public Time(int mm, int ss) {
		
		checkArguments(mm,ss);
		totalSeconds = computeTotalSeconds(mm,ss);
	}
	
	public Time(String timeText) {
		
		String[] fields = timeText.split(":");
		
		if (fields.length != 2)
			throw new IllegalArgumentException();
		
		int mm = Integer.parseInt(fields[0]);
		int ss = Integer.parseInt(fields[1]);
		
		checkArguments(mm,ss);
		totalSeconds = computeTotalSeconds(mm,ss);
	}
	
	private Time(int totalSeconds) {
		if (totalSeconds < 0)
			throw new IllegalArgumentException();
		this.totalSeconds = totalSeconds;
	}
	
	private void checkArguments(int mm, int ss) {
		if (mm < 0  ||  ss < 0 || ss >= SECINMIN) 
			throw new IllegalArgumentException();
	}
	
	private int computeTotalSeconds(int mm, int ss) {
		return mm*SECINMIN + ss;
	}
	
	public int getSeconds() {
		return totalSeconds % SECINMIN;
	}
	
	public int getMinutes() {
		return totalSeconds / SECINMIN;
	}
	
	public int getTotalSeconds() {
		return totalSeconds;
	}
		
	@Override
	public String toString() {
		return String.format("%d:%02d", getMinutes(), getSeconds());
	}
	
	public Time add(Time t) {
		return new Time(totalSeconds + t.totalSeconds);
	}
	
	public Time sub(Time t) {
		return new Time(totalSeconds - t.totalSeconds);
	}
	
	public boolean isLessThan(Time t) {
		return totalSeconds < t.totalSeconds;
	}
	
	public boolean isGreaterThan(Time t) {
		return totalSeconds > t.totalSeconds;
	}
}