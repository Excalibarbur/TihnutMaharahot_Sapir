package HW1;

public class item
{
	private String name;
	private int value;
	private boolean isMagical;
	
	// default builder
	public item ()
	{
		this.name = "unkwon";
		this.value = 0;
		this.isMagical = false;
	}
	
	// parameter builder
	public item(String name , int value , boolean isMagical)
	{
		this.name = name;
		this.value = value;
		this.isMagical = isMagical;
	}
	
	//prints all item details
	public String toString() {
		return "Item name : " + name + "\n" + 
				"Item value : " + value + "\n" + 
				"is magical ? " + isMagical;
	}
	
	//returns value of an item
	public int getValue ()
	{
		return value;
	}
	
	//sets the value of selected item
	public void setValue(int value)
	{
		if(value < 0 ) {
			this.value = 0;
		}
	}
	
	//Check if the item has some magic in it
	public boolean checkForMagicItem()
	{
		if(isMagical == false)
			return this.isMagical = false;
		return this.isMagical = true;
	}
	
	//sets the name for each item
	public void setName (String name) {
		this.name = name; 
	}
	
	// return item's name
	public String getName() {
		return name;
	}

}
