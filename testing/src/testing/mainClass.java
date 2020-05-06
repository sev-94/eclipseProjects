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
	
	static card[] tableCards1 = new card[7];
	static card[] tableCards2 = new card[7];
	
	static int cardQuadPP = 0;
	static int cardTriplePP = 0;
	static int cardPairPP = 0;
	
	
	static int numOfPairsCC = 0;
	static int numOfTriplesCC = 0;
	
	static int valOfPair1CC = 0;
	static int valOfPair2CC = 0;
	static int valOfPair3CC = 0;
	static int valOfTripleCC = 0;
	static int valOfQuadsCC = 0;
	
	static int pocketPairValue = 0;
	static int pairFlag = 0;
	static int twoPairFlag = 0;
	static int threeOfAKindFlag = 0;
	static int pairFlag1 = 0;
	static int pairFlag2 = 0;
	static int threeOfAKindFlag1 = 0;
	static int threeOfAKindFlag2 = 0;
	
	static int fullHouseFlag = 0;
	
	
	// ---- Shuffles cards in deck ---- //
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
	
	// ---- Create cards in deck ---- //
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
	
	// ---- Check for pocket pairs ---- //
	public static void pocketPair(card[] a)
	{
		// ---- If both cards in hand have equal number value, get number value ---- //
		if(a[0].returnValue() == a[1].returnValue())
		{
			pocketPairValue = a[0].returnValue();
		}
	}
	
	// ---- Check all multiples of cards ---- //
	public static void multiples(int a, card[] b, card[] c)
	{
		int count  = 1;
		int count2 = 0;
		int count3 = 0;
		
		// ---- If hand has pocket pairs ---- //
		if(a != 0)
		{
			for(int i = 0; i < b.length; i++)
			{
				if(a == b[i].returnValue())
				{
					count++;
				}
			}
			if(count == 3)
			{
				System.out.println("pocketPair: Four of a kind");
			}
			else if(count == 2)
			{
				System.out.println("pocketPair: Three of a kind");
			}
			else if(count == 1)
			{
				System.out.println("pocketPair: Pair");
			}
			else
			{
				System.out.println("pocketPair: No Multiples");
			}
		}
		
// ---- If hand doesn't have pocket pairs ---- //
		if(a == 0)
		{
			// ---- Check First Card Multiples ---- //
			for(int i = 0; i < b.length; i++)
			{
				if(c[0].returnValue() == b[i].returnValue())
				{
					count2++;
				}
			}
			if(count2 == 3)
			{
				System.out.println("Card 1: Four of a kind");
			}
			else if(count2 == 2)
			{
				threeOfAKindFlag++;
				System.out.println("Card 1: Three of a kind");
			}
			else if(count2 == 1)
			{
				pairFlag++;
				System.out.println("Card 1: Pair");
			}
			else
			{
				System.out.println("Card 1: No Multiples");
			}
			
// ---- Check Second Card Multiples ---- //
			for(int i = 0; i < b.length; i++)
			{
				if(c[1].returnValue() == b[i].returnValue())
				{
					count3++;
				}
			}
			if(count3 == 3)
			{
				System.out.println("Card 2: Four of a kind");
			}
			else if(count3 == 2)
			{
				threeOfAKindFlag++;
				System.out.println("Card 2: Three of a kind");
			}
			else if(count3 == 1)
			{
				pairFlag++;
				System.out.println("Card 2: Pair");
			}
			else
			{
				System.out.println("Card 2: No Multiples");
			}
		}
	}
	
  // ---- Check for all multiples of cards in Community Cards ---- //
	public static void communityCardMultiples(card[] a)
	{
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		
		int temp = 0;
		int temp2 = 0;
		
		// ---- Check Community Cards for all Pairs ---- //
		for(int i = 0; i < a.length; i++)
		{
			if(a[0].returnValue() == a[i].returnValue())
			{
				count++;
			}
			if(a[1].returnValue() == a[i].returnValue())
			{
				count2++;
			}
			if(a[2].returnValue() == a[i].returnValue())
			{
				count3++;
			}
			if(a[3].returnValue() == a[i].returnValue())
			{
				count4++;
			}
			if(a[4].returnValue() == a[i].returnValue())
			{
				count5++;
			}			
		}
		
		// ---- If any Community Card Pair(s) exist, get the number value(s) ---- //
		if(count == 2)
		{
			if(valOfPair1CC == 0)
			{
				valOfPair1CC = a[0].returnValue();
			}
			valOfPair2CC = a[0].returnValue();
		}
		if(count2 == 2)
		{
			if(valOfPair1CC == 0)
			{
				valOfPair1CC = a[1].returnValue();
			}
			valOfPair2CC = a[1].returnValue();
		}
		if(count3 == 2)
		{
			if(valOfPair1CC == 0)
			{
				valOfPair1CC = a[2].returnValue();
			}
			valOfPair2CC = a[2].returnValue();
		}
		if(count4 == 2)
		{
			if(valOfPair1CC == 0)
			{
				valOfPair1CC = a[3].returnValue();
			}
			valOfPair2CC = a[3].returnValue();
		}
		if(count5 == 2)
		{
			if(valOfPair1CC == 0)
			{
				valOfPair1CC = a[4].returnValue();
			}
			valOfPair2CC = a[4].returnValue();
		}
		
		// ---- Total number of Pairs in Community Cards ---- //
		numOfPairsCC = ((count + count2 + count3 + count4 + count5)-5)/2;
			
		// ---- If there's a Three-of-a-Kind in the Community Cards ---- //
		if((count == 3) || (count2 == 3) || (count3 == 3) || (count4 == 3) || (count5 == 3))
		{
			// ---- Get number value of Three of a Kind ---- //
			if(count == 3)
			{
				valOfTripleCC = a[0].returnValue();
			}
			if(count2 == 3)
			{
				valOfTripleCC = a[1].returnValue();
			}
			if(count3 == 3)
			{
				valOfTripleCC = a[2].returnValue();
			}
			if(count4 == 3)
			{
				valOfTripleCC = a[3].returnValue();
			}
			if(count5 == 3)
			{
				valOfTripleCC = a[4].returnValue();
			}
			
			// ---- Find the number values of the other two Community Cards ---- //
			for(int i = 0; i < a.length; i++)
			{
				if(a[i].returnValue() != valOfTripleCC)
				{
					if(temp == 0)
					{
						temp = a[i].returnValue();
					}
					temp2 = a[i].returnValue();						
				}
			}
			
		}			
		
		// ---- Check if the remaining two cards form a pair ---- //
		if(temp == temp2)
		{
			valOfPair3CC = temp;
		}
		
		// ---- If Four-of-a-Kind in the Community Cards, get the number value ---- //
		if((count == 4) || (count2 == 4) || (count3 == 4) || (count4 == 4) || (count5 == 4))
		{

			if(count != 1)
			{
				valOfQuadsCC = a[0].returnValue();
			}
			if(count2 != 1)
			{
				valOfQuadsCC = a[1].returnValue();
			}
			if(count3 != 1)
			{
				valOfQuadsCC = a[2].returnValue();
			}
			if(count4 != 1)
			{
				valOfQuadsCC = a[3].returnValue();
			}
			if(count5 != 1)
			{
				valOfQuadsCC = a[4].returnValue();
			}			
		}
	}	 
	
	public static void fullHouse()
	{
		// --- In the case of Pocket Pairs ---- //
		
	}
	
	public static void main(String[] args) 
	{
		createDeck();
		 
	    // Array from 0 to 51 
        int positions[] = {0, 1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11, 12, 
        		          13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
        		          26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        		          39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51}; 
       
        // ---- Deal Player 1 ---- //
        //hand1[0] = deck[positions[17]];        
        //hand1[1] = deck[positions[17]];
        
        // ---- Deal Player 2 ---- //
        //hand2[0] = deck[positions[0]];
        //hand2[1] = deck[positions[0]];
        
        hand1[0] = deck[1];
        hand1[1] = deck[1];
        
        hand2[0] = deck[5];
        hand2[1] = deck[6];

        communityCards[0] = deck[1];  //Flop
        communityCards[1] = deck[0];  //Flop
        communityCards[2] = deck[3];  //Flop
        communityCards[3] = deck[4];  //Turn
        communityCards[4] = deck[4];  //River

        communityCardMultiples(communityCards);  
        
        pocketPair(hand1);        
        multiples(pocketPairValue, communityCards, hand1);
        
      
        pocketPair(hand2);
        multiples(pocketPairValue, communityCards, hand2);
        
      
        
	}

}
