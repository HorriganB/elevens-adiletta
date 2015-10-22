
public class DeckTester {
	/**
	 * This is a class that tests the Deck class.
	 */

		/**
		 * The main method in this class checks the Deck operations for consistency.
		 *	@param args is not used.
		 */
		public static void main(String[] args) {
			String[] ranks = {"jacks","king","queen","ace"};
			int[] values = {1,2,3,4};
			String[] suits = {"Blue","Red"};
			Deck y = new Deck(ranks, suits, values);
			System.out.println("The deck is empty?" + y.isEmpty());
			y.deal().toString();
			y.toString();
		}
		
	

}
