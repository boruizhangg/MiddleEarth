package lotrcharacters;

public class Orc extends MiddleEarthCharacter{

	
	/**
	 * Constructor for Orc
	 * @param name
	 * 		Name of the Orc
	 * @param health
	 * 		Health points of the Orc
	 * @param power
	 * 		Attack Power of the Orc
	 */
	public Orc(String name, double health, double power) 
	{
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Parameterized method that performs and attack on a target character.
	 * Human deal 1.5x damage to Human, normal damage to Wizard and Dwarf, 
	 * and no damage to Elf or Orc.
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
		else if(target.getRace().equals("Human"))
		{
			target.setHealth(target.getHealth() - (1.5 * this.getPower()));
			return true;
		}
		else if(target.getRace().equals( "Orc"))
		{
			return false;
		}
		else if(target.getRace().equals("Elf") )
		{
			return false;
		}
		else 
		{
			target.setHealth(target.getHealth() - this.getPower());
			return true;
		}

	}
	
	/**
	 *  method use to return the race of character
	 */

	@Override
	public String getRace() 
	{
		return "Orc";
	}

}
