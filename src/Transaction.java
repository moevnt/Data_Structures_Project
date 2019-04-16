import java.util.*;

public class Transaction {

	//amount bought
	private int amount;
	private long buyP;
	Scanner in = new Scanner(System.in);

	public Transaction() {
	}

	public Transaction(int amount, long price) {
		this.buyP = price;
		this.amount = amount;
	}

	public long getBuyP() {
		return buyP;
	}

	public void setBuyP(long x) {
		buyP = x;
	}

	public void setAmount(int x) {
		amount = x;
	}

	public long getAmount() {
		return amount;
	}
}
