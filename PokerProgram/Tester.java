package example1;
// this is DrawFromDeck
public class Tester {
public static void main(String[] args) {
	//used to play the game by calling into classes and methods
	
	for (int i = 1; i < 6; i++) { //this will draw 5 cards
	CardDeckConstructor deck = new CardDeckConstructor();
	//CardDeckConstructor deck = new CardDeckConstructor();
	int cardsss; //initialize variable
	cardsss = deck.CardDeckConstructor(); //sets variable to deck constructor's random card
	RepresentCard card = new RepresentCard(cardsss); //uses deck constructor's random card and names it
	
}}}


