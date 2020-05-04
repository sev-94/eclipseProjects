package testing;

public class card 
{
	
	static card[] cardArray = new card[52];
	char suit;
	char colour;
	int position;
	int numValue;
	String tag;
	
	public void createDeck()
	{
		for(int i = 0; i < 52; i++)
		{
			
		}
	}

	public card(int pos, int val, char s, char c, String t)
	{
		this.position = pos;
		this.numValue = val;
		this.suit = s;
		this.colour = c;
		this.tag = t;
	}
	
	public card()
	{
	}
	
	public void setPosition(int a)
	{
		this.position = a;
	}
	
	public int returnPosition()
	{
		return this.position;
	}
	
	public String returnTag()
	{
		return this.tag;
	}
	
	public int returnValue()
	{
		return this.numValue;
	}
	
	public char returnSuit()
	{
		return this.suit;
	}
	
	public char returnColour()
	{
		return this.colour;
	}
	
}
