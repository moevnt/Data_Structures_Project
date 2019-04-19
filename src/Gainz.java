import java.util.*;
//this is a queue
public class Gainz {
	private LinkedList<Stock> stocks = new LinkedList<>();

	public Gainz(){
	}

	public Stock dequeue(){
		return (Stock) stocks.removeFirst();
	}

	public void enqueue(Stock x){
		stocks.addLast(x);
	}

	public int getSize(){
		Object[] butt = stocks.toArray();
		return butt.length;
	}
}
