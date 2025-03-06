package lotrcharacters;

public class Human extends MiddleEarthCharacter{
	// declare damage
	public double totalDamage; 
	
	/**
	 * Constructor for human
	 * @param name
	 * 		Name of the human
	 * @param health
	 * 		Health points of the human
	 * @param power
	 * 		Attack Power of the human
	 */
	public Human(String name, double health, double power) 
	{
		super(name, health, power);
	}
	
	/**
	 * Parameterized method that performs and attack on a target character.
	 * Human deal 1.5x damage to Wizard, normal damage to Elf and Dwarf, 
	 * and no damage to Orc or Human.
	 * @param target
	 * 		The character being attacked.
	 * @return 
	 * 		True if the attack is successful, false otherwise
	 */
	@Override
	public Boolean attack(MiddleEarthCharacter target) 
	{
	
		if(target.getRace().equals(null))
		{
			return false;
		}
		else if(target.getRace().equals("Wizard"))
		{
			target.setHealth(Math.max(0, target.getHealth()-(1.5 * this.getPower())));
			return true;
		}
		else if(target.getRace().equals( "Orc"))
		{
			return false;
		}
		else if(target.getRace().equals("Human"))
		{
			return false;
		}
		else
		{
			target.setHealth(Math.max(0, target.getHealth()-this.getPower()));
			return true;
		}
	}
	
	/**
	 *  method use to return the race of character
	 */

	@Override
	public String getRace() 
	{
		return "Human";
	}

	
}
