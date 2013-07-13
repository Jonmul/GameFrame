import java.util.*;


public class Card {
	//Declare the possible values of the card
	//This is to catch and throw exceptions in the event that
	//	an incorrect value is passed
	private final List<String> SUITVALUE = Arrays.asList("hearts","diamonds","spades","clubs");
	private final static String[] VALUESTR = {"Ace","Two","Three","Four","Five",
			"Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	private final int[] CARDVALUE={1,2,3,4,5,6,7,8,9,10};
	
	//Card attributes
	private String valuestr;
	private int value;
	private String suit;
	
	public Card(String suit, int value){
		suit = suit.toLowerCase();
		this.suit=(SUITVALUE.contains(suit) ? suit: invalidSuit());
		
		//try{
		valuestr=VALUESTR[value-1];
		this.value= (value <=10 ? value : 10); //If value is less than 10, value=10, else value=10
		//}catch(Exception e){
		//	System.out.println("Invalid Value has been passed");
		//	System.out.println("Setting default values for testing purposes");
		//	valuestr=VALUESTR[0];
		//	this.value=1;
		//}
		
		
	}
	
	public String toString(){
		return valuestr + "_of_" + suit;
	}
	public int getValue(){
		return value;
	}
	
	private static String invalidSuit(){
		System.out.println("Invalid Suit has been passed");
		System.out.println("Setting default values for testing purposes");
		return VALUESTR[0];
	}
	
}
