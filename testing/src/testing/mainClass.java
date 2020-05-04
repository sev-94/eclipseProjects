package testing;

import java.util.Random;

public class mainClass 
{
	static card[] deck = new card[52];
	
	static card[] hand1 = new card[2];
	static card[] hand2 = new card[2];
	
	static card[] communityCards = new card[5];
	
	static int deckPosition = 0;
	
	static int communityCardPosition = 0;
	
	
	public static void shuffle(int card[], int n) 
	    { 
	        Random rand = new Random(); 
	          
	        for (int i = 0; i < n; i++) 
	        { 
	            // Random for remaining positions. 
	            int r = i + rand.nextInt(52 - i); 
	              
	             //swapping the elements 
	             int temp = card[r]; 
	             card[r] = card[i]; 
	             card[i] = temp;  	               
	        }
	    } 
	
	public static void createDeck()
	{		
		card aceOfSpades   = new card(1, 1, 'S', 'B', "Ace of Spades");
		card twoOfSpades   = new card(2, 2, 'S', 'B', "Two of Spades");
		card threeOfSpades = new card(3, 3, 'S', 'B', "Three of Spades");
		card fourOfSpades  = new card(4, 4, 'S', 'B', "Four of Spades");
		card fiveOfSpades  = new card(5, 5, 'S', 'B', "Five of Spades");
		card sixOfSpades   = new card(6, 6, 'S', 'B', "Six of Spades");
		card sevenOfSpades = new card(7, 7, 'S', 'B', "Seven of Spades");
		card eightOfSpades = new card(8, 8, 'S', 'B', "Eight of Spades");
		card nineOfSpades  = new card(9, 9, 'S', 'B', "Nine of Spades");
		card tenOfSpades   = new card(10, 10, 'S', 'B', "Ten of Spades");
		card jackOfSpades  = new card(11, 11, 'S', 'B', "Jack of Spades");
		card queenOfSpades = new card(12, 12, 'S', 'B', "Queen of Spades");
		card kingOfSpades  = new card(13, 13, 'S', 'B', "King of Spades");
		
		card aceOfHearts   = new card(14, 1, 'H', 'R', "Ace of Hearts");
		card twoOfHearts   = new card(15, 2, 'H', 'R', "Two of Hearts");
		card threeOfHearts = new card(16, 3, 'H', 'R', "Three of Hearts");
		card fourOfHearts  = new card(17, 4, 'H', 'R', "Four of Hearts");
		card fiveOfHearts  = new card(18, 5, 'H', 'R', "Five of Hearts");
		card sixOfHearts   = new card(19, 6, 'H', 'R', "Six of Hearts");
		card sevenOfHearts = new card(20, 7, 'H', 'R', "Seven of Hearts");
		card eightOfHearts = new card(21, 8, 'H', 'R', "Eight of Hearts");
		card nineOfHearts  = new card(22, 9, 'H', 'R', "Nine of Hearts");
		card tenOfHearts   = new card(23, 10, 'H', 'R', "Ten of Hearts");
		card jackOfHearts  = new card(24, 11, 'H', 'R', "Jack of Hearts");
		card queenOfHearts = new card(25, 12, 'H', 'R', "Queen of Hearts");
		card kingOfHearts  = new card(26, 13, 'H', 'R', "King of Hearts");
		
		card aceOfClubs   = new card(27, 1, 'C', 'B', "Ace of Clubs");
		card twoOfClubs   = new card(28, 2, 'C', 'B', "Two of Clubs");
		card threeOfClubs = new card(29, 3, 'C', 'B', "Three of Clubs");
		card fourOfClubs  = new card(30, 4, 'C', 'B', "Four of Clubs");
		card fiveOfClubs  = new card(31, 5, 'C', 'B', "Five of Clubs");
		card sixOfClubs   = new card(32, 6, 'C', 'B', "Six of Clubs");
		card sevenOfClubs = new card(33, 7, 'C', 'B', "Seven of Clubs");
		card eightOfClubs = new card(34, 8, 'C', 'B', "Eight of Clubs");
		card nineOfClubs  = new card(35, 9, 'C', 'B', "Nine of Clubs");
		card tenOfClubs   = new card(36, 10, 'C', 'B', "Ten of Clubs");
		card jackOfClubs  = new card(37, 11, 'C', 'B', "Jack of Clubs");
		card queenOfClubs = new card(38, 12, 'C', 'B', "Queen of Clubs");
		card kingOfClubs  = new card(39, 13, 'C', 'B', "King of Clubs");
		
		card aceOfDiamonds   = new card(40, 1, 'D', 'R', "Ace of Diamonds");
		card twoOfDiamonds   = new card(41, 2, 'D', 'R', "Two of Diamonds");
		card threeOfDiamonds = new card(42, 3, 'D', 'R', "Three of Diamonds");
		card fourOfDiamonds  = new card(43, 4, 'D', 'R', "Four of Diamonds");
		card fiveOfDiamonds  = new card(44, 5, 'D', 'R', "Five of Diamonds");
		card sixOfDiamonds   = new card(45, 6, 'D', 'R', "Six of Diamonds");
		card sevenOfDiamonds = new card(46, 7, 'D', 'R', "Seven of Diamonds");
		card eightOfDiamonds = new card(47, 8, 'D', 'R', "Eight of Diamonds");
		card nineOfDiamonds  = new card(48, 9, 'D', 'R', "Nine of Diamonds");
		card tenOfDiamonds   = new card(49, 10, 'D', 'R', "Ten of Diamonds");
		card jackOfDiamonds  = new card(50, 11, 'D', 'R', "Jack of Diamonds");
		card queenOfDiamonds = new card(51, 12, 'D', 'R', "Queen of Diamonds");
		card kingOfDiamonds  = new card(52, 13, 'D', 'R', "King of Diamonds");
		
		deck[0] = aceOfSpades;
		deck[1] = twoOfSpades;
		deck[2] = threeOfSpades;
		deck[3] = fourOfSpades;
		deck[4] = fiveOfSpades;
		deck[5] = sixOfSpades;
		deck[6] = sevenOfSpades;
		deck[7] = eightOfSpades;
		deck[8] = nineOfSpades;
		deck[9] = tenOfSpades;
		deck[10] = jackOfSpades;
		deck[11] = queenOfSpades;
		deck[12] = kingOfSpades;
		
		deck[13] = aceOfHearts;
		deck[14] = twoOfHearts;
		deck[15] = threeOfHearts;
		deck[16] = fourOfHearts;
		deck[17] = fiveOfHearts;
		deck[18] = sixOfHearts;
		deck[19] = sevenOfHearts;
		deck[20] = eightOfHearts;
		deck[21] = nineOfHearts;
		deck[22] = tenOfHearts;
		deck[23] = jackOfHearts;
		deck[24] = queenOfHearts;
		deck[25] = kingOfHearts;
		
		deck[26] = aceOfClubs;
		deck[27] = twoOfClubs;
		deck[28] = threeOfClubs;
		deck[29] = fourOfClubs;
		deck[30] = fiveOfClubs;
		deck[31] = sixOfClubs;
		deck[32] = sevenOfClubs;
		deck[33] = eightOfClubs;
		deck[34] = nineOfClubs;
		deck[35] = tenOfClubs;
		deck[36] = jackOfClubs;
		deck[37] = queenOfClubs;
		deck[38] = kingOfClubs;
		
		deck[39] = aceOfDiamonds;
		deck[40] = twoOfDiamonds;
		deck[41] = threeOfDiamonds;
		deck[42] = fourOfDiamonds;
		deck[43] = fiveOfDiamonds;
		deck[44] = sixOfDiamonds;
		deck[45] = sevenOfDiamonds;
		deck[46] = eightOfDiamonds;
		deck[47] = nineOfDiamonds;
		deck[48] = tenOfDiamonds;
		deck[49] = jackOfDiamonds;
		deck[50] = queenOfDiamonds;
		deck[51] = kingOfDiamonds;
	}
	
	
	public static void getNumValues(card[] a, card[] b) 
	{
		System.out.println(a[0].returnValue());
		System.out.println(a[1].returnValue());	
		
		System.out.println(a[0].returnTag());
		System.out.println(a[1].returnTag());
		
		
		for(int i = 0; i < communityCardPosition; i++)
		{
			System.out.println(b[i].returnValue());
			System.out.println(b[i].returnTag());
		}
	}
	 
	public static void main(String[] args) 
	{
		createDeck();
		 
	    // Array from 0 to 51 
        int positions[] = {0, 1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11, 12, 
        		          13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
        		          26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        		          39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51}; 
       
        //Deal
        hand1[0] = deck[positions[0]];        
        hand2[0] = deck[positions[1]];
        hand1[1] = deck[positions[13]];        
        hand2[1] = deck[positions[14]];
        
        communityCards[0] = deck[positions[26]];
        communityCardPosition++;
        communityCards[1] = deck[positions[39]];
        communityCardPosition++;
        communityCards[2] = deck[positions[27]];
        communityCardPosition++;
        
        
        getNumValues(hand1, communityCards);
        
/*      //Flop
        communityCards[0] = deck[positions[4]];
        communityCards[1] = deck[positions[5]];
        communityCards[2] = deck[positions[6]];
        //Turn
        communityCards[3] = deck[positions[7]];
        //River
        communityCards[4] = deck[positions[8]];
*/        
	}

}
