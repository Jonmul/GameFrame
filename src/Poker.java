
import java.util.*;


public class Poker {
	
	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println("Welcome to Poker");
		System.out.println("-----------------------");
		Deck deck = new Deck();
		deck.listDeck();
		System.out.println("-----------------------");
		
		System.out.println(deck.drawCard().toString());
		System.out.println("-----------------------");
		deck.listDeck();
		System.out.println("-----------------------");
	}
	
	
	

}
