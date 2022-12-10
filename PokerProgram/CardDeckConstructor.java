package example1;
import java.util.ArrayList;
import java.util.Random;

public class CardDeckConstructor {

	//public CardDeckConstructor(String cards) {
		//monte-carlo simulation
		//program
	/*
		private ArrayList<RepresentCard> cards; // = new ArrayList <>();
		public CardDeckConstructor() {
			cards = new ArrayList<>();
			for(int i = 1; i <= 13; i++) { //for rank
				for(int j = 1; j <= 4; j++) { //for suit
					cards.add(new RepresentCard(i, j));
				}
			}
		}
		
		public RepresentCard draw(int index ) {
			return cards.get(index);
		}
		
		*/
	int[] cards = new int[53]; //makes an array of 0's to determine which cards are available
	
	Random rng = new Random(); //makes  a random number
	int RandomCardFromDeck = rng.nextInt(52) + 1;

	
	public int CardDeckConstructor () {
		for (int i = 0; i < 1; i++) { //loop incase of a duplicate card
			Random rng = new Random(); //re randomizes variable each loop
			RandomCardFromDeck = rng.nextInt(52) + 1;
			
		if (cards[RandomCardFromDeck] == 1) { // if card is duplicate, rerun the loop
			i = i - 1;
		}
		else { //if card is not duplicate, remove the card from the deck (change array index to 1 instead of 0)
			cards[RandomCardFromDeck] = 1;
			return RandomCardFromDeck; //returns the card number


		}
		
	
		}
		return RandomCardFromDeck;
	}
		
	}
		
		
	//}

