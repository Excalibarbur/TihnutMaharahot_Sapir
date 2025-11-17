 
package HW1;

public class Enemy extends Character
{
	private int damage = 1; // 1 - 5, default: 1.
	
	public Enemy(String name, int health, int level, int damage)
	{
		super(name, health, level);
		
		if(damage >= 1 && damage <= 5)
			this.damage = damage;
	}
	
	public int getDamage() { return this.damage; }
	
	@Override
	public String toString()
	{
		return (super.toString() + ("Damage: " + damage + "\n"));
	}
}
