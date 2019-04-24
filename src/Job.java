import java.util.*;

public class Job {
	//between (-19 +) and (20 -)
	private int priority;
	//between 1-100
	private int length;
	private String name;
	private int time;

	public Job(int priority, int length, String name){
		this.priority = priority;
		this.length = length;
		this.name = name;
	}

	public Job( int length, String name,int time){
		this.time = time;
		this.length = length;
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public int getLength(){
		return length;
	}

	public int getPriority(){
		return priority;
	}

	public int getTime() {
		return time;
	}

}
