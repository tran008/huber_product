public class Product
{
	private String 	name;	// "Coca Cola"
	private float	price;	// 10
	private int 	id;
	
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
	
	public String getPrice ()
	{
		return this.price;
	}
	
	public void setPrice (float price)
	{
		this.price = price;
	}
	
	public int getId ()
	{
		return this.id;
	}
	
	public void setId (int id)
	{
		this.id = id;
	}
}