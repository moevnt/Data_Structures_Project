import java.util.*;

public class Stock {

	//amount bought

	private long buyP;
	private int amount;
	Scanner in = new Scanner(System.in);

	public Stock() {
	}

	public Stock( long price) {
		this.buyP = price;
	}

	public int getAmount(){
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public long getBuyP() {
		return buyP;
	}

	public void setBuyP(long x) {
		buyP = x;
	}
}
