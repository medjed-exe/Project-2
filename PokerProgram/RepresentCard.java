package example1;

public class RepresentCard {

	//main method shouldn't have more than 3 lines of code in it.
	
	//String suit = "hearts clubs spades diamonds";

	//might need to add more here
	public RepresentCard(int k) {
		int i = 1;
		int j = 1;
		i = (k + 3) / 4; //finds rank(number) of the card
		j = k % 4; //finds the suit of the card
		
		int rank = i;
	    String rankString = null; 
	    switch (rank) { //switch statement for the rank
	        case 1:  rankString = "1";
	                 break;
	        case 2:  rankString = "2";
	                 break;
	        case 3:  rankString = "3";
	                 break;
	        case 4:  rankString = "4";
	                 break;
	        case 5:  rankString = "5";
                     break;
            case 6:  rankString = "6";
                     break;
            case 7:  rankString = "7";
                     break;
            case 8:  rankString = "8";
	                 break;
	        case 9:  rankString = "9";
	                 break;
	        case 10:  rankString = "10";
                     break;
            case 11:  rankString = "J";
                     break;
            case 12:  rankString = "Q";
                     break;
            case 13:  rankString = "K";
                     break;             
	    }
	    System.out.print(rankString);
	    
		int suit = j;
	    String suitString = null; 
	    switch (suit) { //switch statement for the suit
	        case 1:  suitString = "diamonds";
	                 break;
	        case 2:  suitString = "clubs";
	                 break;
	        case 3:  suitString = "hearts";
	                 break;
	        case 0:  suitString = "spades";
	                 break;
	    }
	    
		System.out.print("_" + suitString + " "); //prints the rank and suit
	}
}
