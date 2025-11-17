//Roi Atia - 211633003
//Bar Afuta - 

package HW1;

public class Character
{
	protected String name = "Unknown";
	protected int health = 0;
	protected int level = 0;
	
	public static final int MAX_HEALTH = 10;
	public static final int MAX_LEVEL = 5;
	
	
	public Character()
	{
		// already defaulted in class init
	}
	
	public Character(String name, int health, int level)
	{
		if(name != null && !name.isEmpty())
			this.name = name;
		
		if(health >= 0 && health <= MAX_HEALTH)
			this.health = health;
		
		if(level >= 0 && level <= MAX_LEVEL)
			this.level = level;
	}
	
	public void levelUp()
	{
		// If the level smaller than the max -> increase by one
		if(this.level < MAX_LEVEL)
			this.level++;
	}
	
	public void heal(int health_points)
	{
		// Ignore invalid health points
		if(health_points <= 0)
			return;
		
		// Adds the health points to the current health
		this.health += health_points;
		
		// If the health is greater then the max -> set the health to the max
		if(this.health > MAX_HEALTH)
			this.health = MAX_HEALTH;
	}
	
	
	public String getName()   { return this.name;   }
	public int    getHealth() { return this.health; }
	public int    getLevel()  { return this.level;  }
	
	public String toString()
	{
		return String.format("Name: %s\nHealth: %d\nLevel: %d\n", this.name, this.health, this.level);
	}
}
