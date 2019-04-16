import java.util.*;
//this is a queue
public class Gainz {
	private LinkedList<Transaction> stocks = new LinkedList<>();

	public Gainz(){
	}

	public Transaction dequeue(){
		return (Transaction) stocks.removeFirst();
	}

	public void enqueue(Transaction x){
		stocks.addLast(x);
	}

	public int getSize(){
		Object[] butt = stocks.toArray();
		return butt.length;
	}
}
