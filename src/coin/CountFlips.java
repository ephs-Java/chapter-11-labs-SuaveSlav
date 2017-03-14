package coin;

public class CountFlips {
	// -----------------------------------------------------------------
	// Flips a coin multiple times and counts the number of heads
	// and tails that result.
	//		Output:
	//			The number flips: 1000
	//			The number of heads: 493
	//			The number of tails: 507
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Coin coin = new Coin();
		int HEADS = 0;
		int TAILS = 0;
		int count = 1000;
		for(int i = 1; i <= count; i++) {
			coin = new Coin();
			System.out.println(coin);
			if (coin.isHeads()) {
				HEADS++;
			} else {
				TAILS++;
			}
		}
		System.out.println("The number of flips: " + count);
		System.out.println("The number of heads: " + HEADS);
		System.out.println("The number of tails: " + TAILS);
	}
}
