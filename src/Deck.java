import java.util.*;


public class Deck {
	private final static String[] SUITS = {"hearts","diamonds","spades","clubs"};
	private final static int[] VALUES = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	private static Queue<Card> deck;
	private static List<Card> fulldeck;
	public int size;
	
	
	public Deck(){
		fulldeck = new ArrayList<Card>();
		for(String suit : SUITS){
			for(int value : VALUES){
				fulldeck.add(new Card(suit,value));
			}
		}
		deck = new LinkedList<Card>();
		newDeck();
		size = deck.size();
	}
	
	public static void newDeck(){
		deck.clear();
		Collections.shuffle(fulldeck);
		deck.addAll(fulldeck);
	}
	public void shuffle(){
		newDeck();
	}
	public Card drawCard(){
		Card temp = deck.remove();
		size = deck.size();
		return temp;
	}
	public static void listDeck(){
		for(Card card : deck){
			System.out.println(card.toString());
		}
	}
	
}
