package coin;

public class FlipRace {
	// -----------------------------------------------------------------
	// Flips two coins until one of them comes up heads three times in a row.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
	
			// Create two separate coin objects
		Coin one = new Coin();
		Coin two = new Coin();
		int count1 = 0;
		int count2 = 0;
			// Print the flip results (uses Coin's toString method)
			//stop the flipping once one of the coins gets to heads, 3 times in a row
		while (count1 < 3 || count2 < 3) {
			one = new Coin();
			two = new Coin();
			System.out.println("1:" + one);
			System.out.println("2:" + two);
			if (one.isHeads()) {
				count1++;
			} else if (two.isHeads()) {
				count2++;
			} else if (!two.isHeads()) {
				count2 = 0;
			} else {
				count1 = 0;
			}
		}
		if (count2 == 3) {
			System.out.println("Coin 2 wins.");
		} else {
			System.out.println("Coin 1 wins.");
		}
	
	}
}