package example1;

import java.util.Random;
import java.util.ArrayList;
//object oriented programming
//hand eval?
public class DrawFromDeck {
	//instance variables
	//call in deck -- maybe call into class RepresentCard
	//method to draw 5 cards.
	//method to make evaluations
	
	
	private ArrayList<CardDeckConstructor> handEval;
	public DrawFromDeck() {
		handEval = new ArrayList<>();
		
	}
	//void because you're not returning anything, just displaying cards
	public void getCards() {
		Random rng = new Random();
		int RandomCardFromDeck = rng.nextInt(52);
		RepresentCard CardDeckConstructor.DrawFromDeck(RandomCardFromDeck);
	}
	//method to evaluate the cards based on certain condition
	
	

}
