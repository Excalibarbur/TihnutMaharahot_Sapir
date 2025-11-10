package HW1;

public class Player extends Character {

	private item[] inventory;
	public static final int CAPACITY = 10;
	
	
	// ****Builders *****
	// default builder 
	public Player() {
		super();
		this.inventory = new item[CAPACITY];
	}
	
	//parameter builder
	public Player(String name , int health , int level) {
		super(name , health , level);
		this.inventory = new item[CAPACITY];
	}
	
	//***Methods***
	//adding item function
	public boolean  addItem (item item) {
		if(item == null) return false;
		for(int i = 0; i < inventory.length; i++) {
			if(inventory[i] == null) {
				inventory[i] = item;
				return true;
				
			}
		}
		
		return false; //no room in inventory!
	}
	 
	//calculates amount of items in inventory
	public int calculateInventory() {
		int sum = 0;
		for(int i = 0; i < inventory.length; i++) {
			if(inventory[i] != null) {
				sum += inventory[i].getValue();
			}
		}
		return sum;
	}
	
	
	public boolean hasMagicItem() {
		
	}
	
	
	
	
	
	
	
	
}
