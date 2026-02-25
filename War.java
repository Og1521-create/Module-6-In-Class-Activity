import java.util.Random;
public class War {

    private static final char[] SUITS = {'s','h','d','c'};
    private static final Random RNG = new Random();

    private static char randomSuit() {
        return SUITS[RNG.nextInt(SUITS.length)];
    }

    private static int randomValue() {
        return RNG.nextInt(13) + 1; // 1..13 (Ace = 1 low)
    }

    /**
     * TODO 4 (helper): Return a suit different from the current suit.
     */
//    private static char differentSuit(char current) {
//        // TODO: loop until you pick a suit that's not current
//        return current;
//    }
        private static char randomDifferentSuit(char suit){
        char s;
        do{
            s = randomSuit();
        } while(s == suit);
        return s;
        }
    public static void main(String[] args) {

        // TODO 1: Create two cards (player and computer) with random suit/value
        // Card player = new Card(randomSuit(), randomValue());
        // Card computer = new Card(randomSuit(), randomValue());

        Card player = new Card(randomSuit(), randomValue());
        Card computer = new Card(randomSuit(), randomValue());
        // TODO 2: Ensure the two cards are not exactly the same (same suit AND value)
        // If they are the same, change the suit of ONE card to a different suit.
        if(player.getSuit() == computer.getSuit() && player.getValue() == computer.getValue()){
            computer.setSuit(randomDifferentSuit(computer.getSuit()));
        }

        // TODO 3: Print both cards using toString()
        // System.out.println("Player card: " + player);
        // System.out.println("Computer card: " + computer);

        // TODO 5: Compare values only (suits do NOT break ties)
        // - If values are equal => tie
        // - If player value > computer value => player wins
        // - Else computer wins

        // NOTE: Card.java must be in the same folder/project.

        System.out.println("Player: " + player );
        System.out.println("Computer: " + computer );
        if (player.getValue() == computer.getValue()) {
            System.out.println("Result: It's a tie!");
        }else if (player.getValue() > computer.getValue()){
            System.out.println("Player wins!");
        } else {
            System.out.println("Result: Computer wins!");
        }

    }
}
