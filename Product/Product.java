public class Product
{
	private String 	name;	// "Coca Cola"
<<<<<<< HEAD
	private float	price;	// 10
	private int 	id;
=======
	private boolean onStock; // true
>>>>>>> origin/master
	
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
	
	public int getId ()
	{
		return this.id;
	}
	
	public void setId (int id)
	{
		this.id = id;
	}
}