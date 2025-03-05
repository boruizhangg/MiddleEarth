package lotrcharacters;

public class Human extends MiddleEarthCharacter{
	// declare damage
	public double totalDamage; 
	public double baseDamage = 2;
	
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
	 * 		The character being attacked
	 * @return 
	 * 		True if the attack is successful, false otherwise
	 */
	@Override
	public Boolean attack(MiddleEarthCharacter target) 
	{
		double targetHealth = target.getHealth();
		if(target.getRace().equals(null))
		{
			return false;
		}
		else if(target.getRace().equals("Wizard") || target.getRace().equals("wizard") )
		{
			totalDamage = baseDamage * 1.5;
			targetHealth = targetHealth - totalDamage;
			return true;
		}
		else if(target.getRace().equals( "Orc") || target.getRace().equals("orc"))
		{
			return false;
		}
		else if(target.getRace().equals("Human") || target.getRace().equals("human"))
		{
			return false;
		}
		else
		{
			targetHealth = targetHealth - baseDamage;
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
