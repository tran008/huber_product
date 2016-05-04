public class Product
{
	private String 	name;	// "Coca Cola"
	private boolean onStock; // true
	
	public Product ()
	{
	}
	
	public String getName ()
	{
		return this.name;
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public boolean getOnStock ()
	{
		return this.onStock;
	}
	
	public void setOnStock (boolean onStock)
	{
		this.onStock = onStock;
	}
}