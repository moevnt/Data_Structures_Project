package CIS313_01.Teacher.Andrew_Evan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
import java.util.*;

public class Job implements Comparable<Job> {
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
        
        // compares jobs based on priority
        public int compareTo(Job j) {
                    
                if(this.priority < j.priority)
                    return -1;
                else if (this.priority > j.priority)
                    return 1;
                else 
                    return 0;
        }

}


 
