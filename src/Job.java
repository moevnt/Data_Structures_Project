import java.util.*;

public class Job {
	//between (-19 +) and (20 -)
	private int priority;
	//between 1-100
	private int length;
	private String name;
	private int timeSlice;

	public Job(int priority, int length, String name){
		this.priority = priority;
		this.length = length;
		this.name = name;
	}

	public Job( int length, String name,int timeSlice){
		this.timeSlice = timeSlice;
		this.length = length;
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public int getLength(){
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getPriority(){
		return priority;
	}

	public int getTimeSlice() {
		return timeSlice;
	}

	public void setTimeSlice(int time) {
		this.timeSlice = time;
	}
}
