import java.util.*;

public class Stock {

	//amount bought

	private long buyP;
	Scanner in = new Scanner(System.in);

	public Stock() {
	}

	public Stock( long price) {
		this.buyP = price;
	}

	public long getBuyP() {
		return buyP;
	}

	public void setBuyP(long x) {
		buyP = x;
	}
}
