
public class Player 
{
	public String name;
	public int ticket_number;
	public String payment_made;
	
	Player()
	{
		this.name = "Dorel";
	}
	
	public Player(String name) 
	{ 
		this.name = name; 
	}
	
	public Player(String name, int ticket_number, String payment_made) 
	{ 
		this.name = name; 
		this.ticket_number = ticket_number;
		this.payment_made = payment_made;
	}
	
	public String getName() 
	{ 
		return this.name; 
	}
	
	public void setName(String newName) 
	{ 
		this.name = newName; 
	}

}
