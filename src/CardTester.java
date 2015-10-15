/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card aceDiamonds1 = new Card("ace", "diamonds", 1);
		Card aceDiamonds2 = new Card("ace", "diamonds", 1);
		Card kingDiamonds = new Card("king", "diamonds", 1);
		
		System.out.println("Test for Ace of Diamonds #1");
		System.out.println("  rank: " + aceDiamonds1.rank());
		System.out.println("  suit: " + aceDiamonds1.suit());
		System.out.println("  pointValue: " + aceDiamonds1.pointValue());
		System.out.println("  toString: " + aceDiamonds1.toString());
		System.out.println();
		
		System.out.println("Test for Ace of Diamonds #2");
		System.out.println("  rank: " + aceDiamonds2.)
		
	}
}
