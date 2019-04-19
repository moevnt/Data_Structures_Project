import java.util.*;

public class StockClient {

	//keep and eye on this line for bug testing--v
	static Gainz portfolio = new Gainz();
	Scanner in = new Scanner(System.in);
	static long totalCapitalGainz = 0;

	public static void main(String[] args) {
		int select;
		Scanner in = new Scanner(System.in);
		boolean go = true;
		System.out.println("-=PORTFOLIO MANAGER=-\n");
		while (go == true) {
			System.out.println("To add stocks enter 1\n"
					+ "To sell stocks enter 2\n"
					+ "To view the amount of transactions in the portfolio enter 3\n"
					+ "To exit enter 4");
			select = in.nextInt();
			switch (select) {
				case 1: {
					addTrans();
					break;
				}
				case 2: {
					System.out.println("Please enter the amount of transaction holdings to be sold");
					int number = in.nextInt();
					if (portfolio.getSize()+1 < number) {
						System.out.println("that is more transactions than recorded in the portfolio");
						break;
					}
					System.out.println("Please enter the selling price of the stocks");
					long sellP = in.nextLong();
					long capitalGainz = sell(number, sellP);
					totalCapitalGainz += capitalGainz;
					System.out.println("The capital gains from this sale are " + capitalGainz + "\n" + "The total capital gains from the portfolio are " + totalCapitalGainz);
					break;
				}
				case 3: {
					System.out.println("There are " + portfolio.getSize() + " transactions in the portfolio");
					break;
				}
				case 4: {
					go = false;
					break;
				}
			}
		}
	}

	public static void addTrans() {
		Scanner input = new Scanner(System.in);

		//get amount
		System.out.println("Please enter the amount of stocks purchased");
		int amount = input.nextInt();
		//get price per stock
		System.out.println("Please enter the buying price per stock");
		long buyP = input.nextLong();
		//make transaction
		Stock trans = new Stock( buyP);
		portfolio.enqueue(trans);
	}

	public static long sell(int number, long sellp) {
		Stock fo;
		long cg = 0;
		//check length in switch statement
		for (int i = 0; i < number; i++) {
			fo = portfolio.dequeue();
			//cg += fo.getAmount() * (sellp - fo.getBuyP());
		}
		return cg;
	}

	public int getSize() {
		return portfolio.getSize();
	}
}
